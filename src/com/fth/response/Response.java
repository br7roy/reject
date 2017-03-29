package com.fth.response;

import com.ruim.ifsp.utils.message.IfspFastJsonUtil;
import com.ruim.ifsp.utils.message.IfspStringUtil;
import com.ruim.ifsp.utils.message.IfspXmlDataUtil;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
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
public class Response implements Serializable{
    /**
     */
    private static final long serialVersionUID = 2986430444724936512L;
    private String hostReturnCode;//返回码0000为成功，其他取值表示失败
    private String hostErrorMessage;//返回信息，可以为空
    private String outtransq;//可选字段。返回值为中台流水号，非核心账务/其他交易流水
    private String outtrandt;//可选字段。返回值为中台处理时间，非核心交易处理时间
    private String respcf;//自定义域(存放respcode)
    private String resultCode;//封装自定义域里的应答码,为空时放返回码
    private String resultMsg;//根据自定义域里的应答码获取应答信息
    private String respcd;//成功为0000
    private String resptx;//失败原因
    private String fcbpdt;//中台日期
    private String fcbpsq;//中台流水
    private String acctno;//开立的二类账户账号
    private String acctna;//开立的二类账户户名
    private String cnactp;//协议类型
    private String cnacct;//绑定账号
    private String cntrst;//协议状态    % --全部    1 --有效    0 --无效
    private String idtfno;//客户身份证号码
    private String onlnbl;//账户余额
    private String dbljbl;//借方日累计剩余额度
    private String dbNibl;//借方年累计剩余额度
    private String moblno;//预留手机号
    private String trandt;//主机日期(8)
    private String transq;//主机流水
    /**
     * @return the hostReturnCode
     */
    public String getHostReturnCode() {
        return hostReturnCode;
    }
    /**
     * @param hostReturnCode the hostReturnCode to set
     */
    public void setHostReturnCode(String hostReturnCode) {
        this.hostReturnCode = hostReturnCode;
    }
    /**
     * @return the hostErrorMessage
     */
    public String getHostErrorMessage() {
        return hostErrorMessage;
    }
    /**
     * @param hostErrorMessage the hostErrorMessage to set
     */
    public void setHostErrorMessage(String hostErrorMessage) {
        this.hostErrorMessage = hostErrorMessage;
    }
    /**
     * @return the outtransq
     */
    public String getOuttransq() {
        return outtransq;
    }
    /**
     * @param outtransq the outtransq to set
     */
    public void setOuttransq(String outtransq) {
        this.outtransq = outtransq;
    }
    /**
     * @return the outtrandt
     */
    public String getOuttrandt() {
        return outtrandt;
    }
    /**
     * @param outtrandt the outtrandt to set
     */
    public void setOuttrandt(String outtrandt) {
        this.outtrandt = outtrandt;
    }
    /**
     * @return the respcf
     */
    public String getRespcf() {
        return respcf;
    }
    /**
     * @param respcf the respcf to set
     */
    public void setRespcf(String respcf) {
        this.respcf = respcf;
    }
    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }
    /**
     * @param resultCode the resultCode to set
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    /**
     * @return the resultMsg
     */
    public String getResultMsg() {
        return resultMsg;
    }
    /**
     * @param resultMsg the resultMsg to set
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
    /**
     * @return the respcd
     */
    public String getRespcd() {
        return respcd;
    }
    /**
     * @param respcd the respcd to set
     */
    public void setRespcd(String respcd) {
        this.respcd = respcd;
    }
    /**
     * @return the resptx
     */
    public String getResptx() {
        return resptx;
    }
    /**
     * @param resptx the resptx to set
     */
    public void setResptx(String resptx) {
        this.resptx = resptx;
    }
    /**
     * @return the fcbpdt
     */
    public String getFcbpdt() {
        return fcbpdt;
    }
    /**
     * @param fcbpdt the fcbpdt to set
     */
    public void setFcbpdt(String fcbpdt) {
        this.fcbpdt = fcbpdt;
    }
    /**
     * @return the fcbpsq
     */
    public String getFcbpsq() {
        return fcbpsq;
    }
    /**
     * @param fcbpsq the fcbpsq to set
     */
    public void setFcbpsq(String fcbpsq) {
        this.fcbpsq = fcbpsq;
    }
    /**
     * @return the acctno
     */
    public String getAcctno() {
        return acctno;
    }
    /**
     * @param acctno the acctno to set
     */
    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }
    /**
     * @return the acctna
     */
    public String getAcctna() {
        return acctna;
    }
    /**
     * @param acctna the acctna to set
     */
    public void setAcctna(String acctna) {
        this.acctna = acctna;
    }
    /**
     * @return the cnactp
     */
    public String getCnactp() {
        return cnactp;
    }
    /**
     * @param cnactp the cnactp to set
     */
    public void setCnactp(String cnactp) {
        this.cnactp = cnactp;
    }
    /**
     * @return the cnacct
     */
    public String getCnacct() {
        return cnacct;
    }
    /**
     * @param cnacct the cnacct to set
     */
    public void setCnacct(String cnacct) {
        this.cnacct = cnacct;
    }
    /**
     * @return the cntrst
     */
    public String getCntrst() {
        return cntrst;
    }
    /**
     * @param cntrst the cntrst to set
     */
    public void setCntrst(String cntrst) {
        this.cntrst = cntrst;
    }
    /**
     * @return the idtfno
     */
    public String getIdtfno() {
        return idtfno;
    }
    /**
     * @param idtfno the idtfno to set
     */
    public void setIdtfno(String idtfno) {
        this.idtfno = idtfno;
    }
    /**
     * @return the onlnbl
     */
    public String getOnlnbl() {
        return onlnbl;
    }
    /**
     * @param onlnbl the onlnbl to set
     */
    public void setOnlnbl(String onlnbl) {
        this.onlnbl = onlnbl;
    }
    /**
     * @return the dbljbl
     */
    public String getDbljbl() {
        return dbljbl;
    }
    /**
     * @param dbljbl the dbljbl to set
     */
    public void setDbljbl(String dbljbl) {
        this.dbljbl = dbljbl;
    }
    /**
     * @return the dbNibl
     */
    public String getDbNibl() {
        return dbNibl;
    }
    /**
     * @param dbNibl the dbNibl to set
     */
    public void setDbNibl(String dbNibl) {
        this.dbNibl = dbNibl;
    }
    /**
     * @return the moblno
     */
    public String getMoblno() {
        return moblno;
    }
    /**
     * @param moblno the moblno to set
     */
    public void setMoblno(String moblno) {
        this.moblno = moblno;
    }
    /**
     * @return the trandt
     */
    public String getTrandt() {
        return trandt;
    }
    /**
     * @param trandt the trandt to set
     */
    public void setTrandt(String trandt) {
        this.trandt = trandt;
    }
    /**
     * @return the transq
     */
    public String getTransq() {
        return transq;
    }
    /**
     * @param transq the transq to set
     */
    public void setTransq(String transq) {
        this.transq = transq;
    }
    
    public String toXML() {
        Map<String, Object> map = IfspFastJsonUtil.objectTomap(this);
        String xml = "<?xml version=\"1.0\" encoding=\"GBK\"?>";
        xml += "<root>" + IfspXmlDataUtil.ObjMapToXML(map) + "</root>";
        int iXmlLen = 0;
        try {
            iXmlLen = xml.getBytes("GBK").length;
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        xml = IfspStringUtil.leftPad((iXmlLen + ""), 6, "0") + xml;// 报文长度
        return xml;
    }
}
