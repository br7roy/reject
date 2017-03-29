package com.fth.server;

import com.alibaba.fastjson.JSON;
import com.fth.request.Request;
import com.fth.response.Response;
import com.fth.uitl.DateUtil;
import com.fth.uitl.StringUtil;
import com.ruim.ifsp.utils.id.IfspId;
import com.ruim.ifsp.utils.message.IfspXmlDataUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * 名称：〈一句话功能简述〉<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年2月8日 <br>
 * 作者：fth <br>
 * 说明：<br>
 */
public class Server {
    

    @SuppressWarnings("resource")
    public void service() {
        Socket socket = null;
        
        InputStream inputStream = null;
        
        OutputStream outputStream = null;
        System.out.println("--------本地socket拦截器启动---------");
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8111);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while (true) {
            try {
                System.out.println("---------监听等待------------");
                Response response = new Response();
                InputStreamReader reader = null;
                try {
                    assert serverSocket != null;
                    socket = serverSocket.accept();
                    outputStream = socket.getOutputStream();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String time = format.format(Calendar.getInstance().getTime());
                    System.out.println(time + "监听接收到通信");
                    inputStream = socket.getInputStream();
                    reader = new InputStreamReader(inputStream, "GBK");
                    char[] buffer = new char[1024];
                    StringBuffer bf = new StringBuffer();
                    int n = 0;
                    while((n = reader.read(buffer)) != -1){
                        bf.append(new String(buffer, 0, n));
                        if(n != 1024){
                            break;
                        }
                    }
                    String reqdata = bf.toString();
                    if (reqdata == null || "".equals(reqdata)) {
                        continue;
                    }
                    System.out.println("收到本行通道请求报文：" + reqdata);
                    String strCode =  reqdata.substring(0,12);
                    String reqdata2 = null;
                    if(strCode.contains("<?xml")){
                        reqdata2 = reqdata.substring(6);
                    }else {
                        reqdata2 = reqdata.substring(12);
                    }
                    Map<String, Object> map = IfspXmlDataUtil.WeCHantXMLToMap(reqdata2);
                    Request request = JSON.parseObject(JSON.toJSONString(map), Request.class);
                    
                    if (isReturn(request.getTranCode()) || isReturn(request.getHead().getPrcscd())) {
                        System.out.println("本地挡板处理");
                        response = makeResponse(request);
                        System.out.println("本地返回报文：" + response.toXML());
                        outputStream.write(response.toXML().getBytes("GBK"));
                        outputStream.flush();
                    } else {
                        String code = null;
                        if(StringUtil.isNotEmpty(request.getTranCode())){
                            code = request.getTranCode();
                        }else if(StringUtil.isNotEmpty(request.getPrcscd())){
                            code = request.getPrcscd();
                        }
                        System.out.println("发送中台处理[业务代码:" + code + "]");
                        Socket zt = new Socket("166.0.11.140", 7666);
                        zt.getOutputStream().write(reqdata.getBytes("GBK"));
                        zt.getOutputStream().flush();
                        String ztString = getreqData(zt.getInputStream());
                        System.out.println("收到中台报文：" + ztString);
                        outputStream.write(ztString.getBytes("GBK"));
                        outputStream.flush();
                        zt.close();
                    }
                    socket.close();
                    System.out.println("---------处理结束-------");
                } catch (IOException e) {
                    System.out.println("本地socket拦截器异常，原因：");
                    e.printStackTrace();
                }
            } catch (Exception e) {
                continue;
            }
        }
    }

    /**
     * 组装本地挡板报文
     * @param request
     * @return
     */
    private Response makeResponse(Request request) {
        Response response = new Response();
        if (isReturn(request.getTranCode())) {
            response.setHostReturnCode("0000");
            response.setHostErrorMessage("交易成功");
        }
//        if (isReturn(request.getHead().getPrcscd())) {
//            response.setRespcd("0000");
//            response.setResptx("交易成功");
//        }
        
        
        response.setRespcd("0000");
        response.setResptx("交易成功");
        
        response.setAcctno(IfspId.getUUID(20));
        response.setAcctna("小明");
        response.setFcbpdt(DateUtil.getYYYYMMDD());//中台日期
        response.setFcbpsq(DateUtil.getYYYYMMDDHHMMSS());//中台流水
        response.setResptx("哈哈，傻逼了吧");//开立的二类账户账号
        response.setCnactp("0");//协议类型
        response.setCnacct("132456798");//绑定账号
        response.setCntrst("%");//协议状态
        response.setIdtfno("41022219800715" + IfspId.getUUID(4));//身份证
        response.setOnlnbl("100");//账户余额
        response.setMoblno("12345678910");//预留手机号码
        response.setDbljbl("100");//借方日累计剩余额度
        response.setDbNibl("132");//借方年累计剩余额度
        response.setTrandt("1324564865");//主机日期
        response.setTransq("13215464");//主机流水
        response.setOuttransq(DateUtil.getYYYYMMDDHHMMSS());
        response.setOuttrandt(DateUtil.getYYYYMMDDHHMMSS());
        return response;
    }

    public boolean isReturn(String txnCode) {
        if (list.contains(txnCode)) {
            return true;
        } else {
            return false;
        }
//        return true;
    }

    public static List<String> list = new ArrayList<>();
    static {
        list.add("ufp001");//账户信息验证
        list.add("ufp002");//联网核查身份信息校验
        list.add("ufp003");//客户经理号码验证
        list.add("ufp004");//短信验证码发送
        list.add("ufp008");//重置支付密码
        list.add("ufp009");//统一转账接口（免密）
        list.add("ufp010");//交易状态查询
        list.add("elslkh");//三类账户开户
        list.add("elaccx");//电子账户信息查询
        list.add("elacmg");//电子账户绑定信息维护
        list.add("elkyrs");//电子账户密码重置
    }

    public String getreqData(InputStream inputStream) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream,"GBK");
        int c = 0;
        StringBuffer bf = new StringBuffer();
        while ((c = reader.read()) != -1) {
            bf.append((char) c);
        }
        String reqdata = bf.toString();
        return reqdata;
    }

}
