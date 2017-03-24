/*
 * Copyright (C), 2015-2017, 上海睿民互联网科技有限公司
 * Package com.ruim.ifsp.pafyhome.bean.request 
 * FileName: ZTRequest.java
 * Author:   维翔
 * Date:     2017年1月9日 下午4:39:56
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   维翔           2017年1月9日下午4:39:56                     1.0                  
 *===============================================================================================
 */
package com.kwxyzk.request;
import java.io.Serializable;

/**
 * 名称：中台请求报文<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年1月9日 <br>
 * 作者：维翔 <br>
 * 说明：<br>
 */
public class Request implements Serializable {
    /**
     */
    private static final long serialVersionUID = 4777547614613966770L;
    private String ufptransq;// 支付平台流水号
    private String chnltp; // 渠道
    private String tranCode; // 交易码
    private String elacctno;// 电子账户号
    private String snacno;// 卡号
    private String payacctno;// 支付账户号
    private String moblno;// 预留手机号
    private String idtfno;// 客户身份证号码
    private String custna;// 客户姓名
    private String smsMsg;// 短信内容
    private String userna;// 姓名
    private String snacpw;// 支付密码
    private String tranpw;// 新密码
    private String tranam;// 提现金额
    private String crcycd;// 币种
    private String outerflag;// 行外标志
    private String recvbrn;// 开户行(非必输)
    private String recvacctno;// 收款账户号
    private String recvacctna;// 收款户名
    private String paybrn;// 付款方开户行
    private String vcode;// 短信验证码
    private String payacctna;// 付款户名
    private String ctmgno;// 客户经理号（行员号）
    private String userid;// 交易柜员号
    private String brchno;// 交易机构号
    private String paycardtp;// 付款账户卡类型
    private String recvcardtp;// 收款账户卡类型
    private String tranam1;// 预留金额1
    private String tranam2;// 预留金额2
    private String servtp;// 渠道号
    private String prcscd;// 处理码
    private String idtftp;// 证件类型 A-- 身份证
    private String custno;// 客户号
    private String cnactp;// 协议类型
    private String cnacct;// 绑定账号
    private String custna_a;// 绑定客户名称
    private String limiam;// 单日累计支付限额
    private String acctbank;// 行外必传
    private String acctname;// 行外必传
    private String acctno;// 开立的二类账户账号
    private String qracno;// 二类/三类 账号
    private String subsac;// 子户号:00001
    private String cnactp_1;// 原绑定账户类型 0--行内 1--行外
    private String cnacct_1;// 原绑定账户
    private String drawfs;// 支取方式: A-密码
    private String newpwd;// 新密码
    private String cntrst;// 协议状态 % --全部 1 --有效 0 --无效
    private Head head;
    private Body body;
    
    /**
     * @return the head
     */
    public Head getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * @return the body
     */
    public Body getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(Body body) {
        this.body = body;
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
     * @return the qracno
     */
    public String getQracno() {
        return qracno;
    }

    /**
     * @param qracno the qracno to set
     */
    public void setQracno(String qracno) {
        this.qracno = qracno;
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
     * @return the servtp
     */
    public String getServtp() {
        return servtp;
    }

    /**
     * @param servtp the servtp to set
     */
    public void setServtp(String servtp) {
        this.servtp = servtp;
    }

    /**
     * @return the prcscd
     */
    public String getPrcscd() {
        return prcscd;
    }

    /**
     * @param prcscd the prcscd to set
     */
    public void setPrcscd(String prcscd) {
        this.prcscd = prcscd;
    }

    /**
     * @return the idtftp
     */
    public String getIdtftp() {
        return idtftp;
    }

    /**
     * @param idtftp the idtftp to set
     */
    public void setIdtftp(String idtftp) {
        this.idtftp = idtftp;
    }

    /**
     * @return the custno
     */
    public String getCustno() {
        return custno;
    }

    /**
     * @param custno the custno to set
     */
    public void setCustno(String custno) {
        this.custno = custno;
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
     * @return the custna_a
     */
    public String getCustna_a() {
        return custna_a;
    }

    /**
     * @param custna_a the custna_a to set
     */
    public void setCustna_a(String custna_a) {
        this.custna_a = custna_a;
    }

    /**
     * @return the limiam
     */
    public String getLimiam() {
        return limiam;
    }

    /**
     * @param limiam the limiam to set
     */
    public void setLimiam(String limiam) {
        this.limiam = limiam;
    }

    /**
     * @return the acctbank
     */
    public String getAcctbank() {
        return acctbank;
    }

    /**
     * @param acctbank the acctbank to set
     */
    public void setAcctbank(String acctbank) {
        this.acctbank = acctbank;
    }

    /**
     * @return the acctname
     */
    public String getAcctname() {
        return acctname;
    }

    /**
     * @param acctname the acctname to set
     */
    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    /**
     * @return the subsac
     */
    public String getSubsac() {
        return subsac;
    }

    /**
     * @param subsac the subsac to set
     */
    public void setSubsac(String subsac) {
        this.subsac = subsac;
    }

    /**
     * @return the cnactp_1
     */
    public String getCnactp_1() {
        return cnactp_1;
    }

    /**
     * @param cnactp_1 the cnactp_1 to set
     */
    public void setCnactp_1(String cnactp_1) {
        this.cnactp_1 = cnactp_1;
    }

    /**
     * @return the cnacct_1
     */
    public String getCnacct_1() {
        return cnacct_1;
    }

    /**
     * @param cnacct_1 the cnacct_1 to set
     */
    public void setCnacct_1(String cnacct_1) {
        this.cnacct_1 = cnacct_1;
    }

    /**
     * @return the drawfs
     */
    public String getDrawfs() {
        return drawfs;
    }

    /**
     * @param drawfs the drawfs to set
     */
    public void setDrawfs(String drawfs) {
        this.drawfs = drawfs;
    }

    /**
     * @return the newpwd
     */
    public String getNewpwd() {
        return newpwd;
    }

    /**
     * @param newpwd the newpwd to set
     */
    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd;
    }

    /**
     * @return the paycardtp
     */
    public String getPaycardtp() {
        return paycardtp;
    }

    /**
     * @param paycardtp the paycardtp to set
     */
    public void setPaycardtp(String paycardtp) {
        this.paycardtp = paycardtp;
    }

    /**
     * @return the paybrn
     */
    public String getPaybrn() {
        return paybrn;
    }

    /**
     * @param paybrn the paybrn to set
     */
    public void setPaybrn(String paybrn) {
        this.paybrn = paybrn;
    }

    /**
     * @return the tranam1
     */
    public String getTranam1() {
        return tranam1;
    }

    /**
     * @param tranam1 the tranam1 to set
     */
    public void setTranam1(String tranam1) {
        this.tranam1 = tranam1;
    }

    /**
     * @return the tranam2
     */
    public String getTranam2() {
        return tranam2;
    }

    /**
     * @param tranam2 the tranam2 to set
     */
    public void setTranam2(String tranam2) {
        this.tranam2 = tranam2;
    }

    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return the brchno
     */
    public String getBrchno() {
        return brchno;
    }

    /**
     * @param brchno the brchno to set
     */
    public void setBrchno(String brchno) {
        this.brchno = brchno;
    }

    /**
     * @return the recvcardtp
     */
    public String getRecvcardtp() {
        return recvcardtp;
    }

    /**
     * @param recvcardtp the recvcardtp to set
     */
    public void setRecvcardtp(String recvcardtp) {
        this.recvcardtp = recvcardtp;
    }

    /**
     * @return the ctmgno
     */
    public String getCtmgno() {
        return ctmgno;
    }

    /**
     * @param ctmgno the ctmgno to set
     */
    public void setCtmgno(String ctmgno) {
        this.ctmgno = ctmgno;
    }

    /**
     * @return the payacctno
     */
    public String getPayacctno() {
        return payacctno;
    }

    /**
     * @param payacctno the payacctno to set
     */
    public void setPayacctno(String payacctno) {
        this.payacctno = payacctno;
    }

    /**
     * @return the payacctna
     */
    public String getPayacctna() {
        return payacctna;
    }

    /**
     * @param payacctna the payacctna to set
     */
    public void setPayacctna(String payacctna) {
        this.payacctna = payacctna;
    }

    /**
     * @return the elacctno
     */
    public String getElacctno() {
        return elacctno;
    }

    /**
     * @param elacctno the elacctno to set
     */
    public void setElacctno(String elacctno) {
        this.elacctno = elacctno;
    }

    /**
     * @return the vcode
     */
    public String getVcode() {
        return vcode;
    }

    /**
     * @param vcode the vcode to set
     */
    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    /**
     * @return the chnltp
     */
    public String getChnltp() {
        return chnltp;
    }

    /**
     * @param chnltp the chnltp to set
     */
    public void setChnltp(String chnltp) {
        this.chnltp = chnltp;
    }

    /**
     * @return the tranCode
     */
    public String getTranCode() {
        return tranCode;
    }

    /**
     * @param tranCode the tranCode to set
     */
    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    /**
     * @return the snacno
     */
    public String getSnacno() {
        return snacno;
    }

    /**
     * @param snacno the snacno to set
     */
    public void setSnacno(String snacno) {
        this.snacno = snacno;
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
     * @return the custna
     */
    public String getCustna() {
        return custna;
    }

    /**
     * @param custna the custna to set
     */
    public void setCustna(String custna) {
        this.custna = custna;
    }

    /**
     * @return the ufptransq
     */
    public String getUfptransq() {
        return ufptransq;
    }

    /**
     * @param ufptransq the ufptransq to set
     */
    public void setUfptransq(String ufptransq) {
        this.ufptransq = ufptransq;
    }

    /**
     * @return the smsMsg
     */
    public String getSmsMsg() {
        return smsMsg;
    }

    /**
     * @param smsMsg the smsMsg to set
     */
    public void setSmsMsg(String smsMsg) {
        this.smsMsg = smsMsg;
    }

    /**
     * @return the userna
     */
    public String getUserna() {
        return userna;
    }

    /**
     * @param userna the userna to set
     */
    public void setUserna(String userna) {
        this.userna = userna;
    }

    /**
     * @return the snacpw
     */
    public String getSnacpw() {
        return snacpw;
    }

    /**
     * @param snacpw the snacpw to set
     */
    public void setSnacpw(String snacpw) {
        this.snacpw = snacpw;
    }

    /**
     * @return the tranpw
     */
    public String getTranpw() {
        return tranpw;
    }

    /**
     * @param tranpw the tranpw to set
     */
    public void setTranpw(String tranpw) {
        this.tranpw = tranpw;
    }

    /**
     * @return the tranam
     */
    public String getTranam() {
        return tranam;
    }

    /**
     * @param tranam the tranam to set
     */
    public void setTranam(String tranam) {
        this.tranam = tranam;
    }

    /**
     * @return the crcycd
     */
    public String getCrcycd() {
        return crcycd;
    }

    /**
     * @param crcycd the crcycd to set
     */
    public void setCrcycd(String crcycd) {
        this.crcycd = crcycd;
    }

    /**
     * @return the outerflag
     */
    public String getOuterflag() {
        return outerflag;
    }

    /**
     * @param outerflag the outerflag to set
     */
    public void setOuterflag(String outerflag) {
        this.outerflag = outerflag;
    }

    /**
     * @return the recvbrn
     */
    public String getRecvbrn() {
        return recvbrn;
    }

    /**
     * @param recvbrn the recvbrn to set
     */
    public void setRecvbrn(String recvbrn) {
        this.recvbrn = recvbrn;
    }

    /**
     * @return the recvacctno
     */
    public String getRecvacctno() {
        return recvacctno;
    }

    /**
     * @param recvacctno the recvacctno to set
     */
    public void setRecvacctno(String recvacctno) {
        this.recvacctno = recvacctno;
    }

    /**
     * @return the recvacctna
     */
    public String getRecvacctna() {
        return recvacctna;
    }

    /**
     * @param recvacctna the recvacctna to set
     */
    public void setRecvacctna(String recvacctna) {
        this.recvacctna = recvacctna;
    }


    public class Head {
        private String userid;
        private String brchno;
        private String servtp;
        private String prcscd;

        /**
         * @return the userid
         */
        public String getUserid() {
            return userid;
        }

        /**
         * @param userid the userid to set
         */
        public void setUserid(String userid) {
            this.userid = userid;
        }

        /**
         * @return the brchno
         */
        public String getBrchno() {
            return brchno;
        }

        /**
         * @param brchno the brchno to set
         */
        public void setBrchno(String brchno) {
            this.brchno = brchno;
        }

        /**
         * @return the servtp
         */
        public String getServtp() {
            return servtp;
        }

        /**
         * @param servtp the servtp to set
         */
        public void setServtp(String servtp) {
            this.servtp = servtp;
        }

        /**
         * @return the prcscd
         */
        public String getPrcscd() {
            return prcscd;
        }

        /**
         * @param prcscd the prcscd to set
         */
        public void setPrcscd(String prcscd) {
            this.prcscd = prcscd;
        }

    }

    public class Body {
        private String idtftp;
        private String idtfno;
        private String custno;
        private String tranpw;
        private String cnactp;
        private String cnacct;
        private String custna_a;
        private String limiam;
        private String acctbank;
        private String acctname;
        private String qracno;
        private String cntrst;
        private String subsac;
        private String cnactp_1;
        private String cnacct_1;
        private String acctno;
        private String drawfs;
        private String newpwd;

        /**
         * @return the idtftp
         */
        public String getIdtftp() {
            return idtftp;
        }

        /**
         * @param idtftp the idtftp to set
         */
        public void setIdtftp(String idtftp) {
            this.idtftp = idtftp;
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
         * @return the custno
         */
        public String getCustno() {
            return custno;
        }

        /**
         * @param custno the custno to set
         */
        public void setCustno(String custno) {
            this.custno = custno;
        }

        /**
         * @return the tranpw
         */
        public String getTranpw() {
            return tranpw;
        }

        /**
         * @param tranpw the tranpw to set
         */
        public void setTranpw(String tranpw) {
            this.tranpw = tranpw;
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
         * @return the custna_a
         */
        public String getCustna_a() {
            return custna_a;
        }

        /**
         * @param custna_a the custna_a to set
         */
        public void setCustna_a(String custna_a) {
            this.custna_a = custna_a;
        }

        /**
         * @return the limiam
         */
        public String getLimiam() {
            return limiam;
        }

        /**
         * @param limiam the limiam to set
         */
        public void setLimiam(String limiam) {
            this.limiam = limiam;
        }

        /**
         * @return the acctbank
         */
        public String getAcctbank() {
            return acctbank;
        }

        /**
         * @param acctbank the acctbank to set
         */
        public void setAcctbank(String acctbank) {
            this.acctbank = acctbank;
        }

        /**
         * @return the acctname
         */
        public String getAcctname() {
            return acctname;
        }

        /**
         * @param acctname the acctname to set
         */
        public void setAcctname(String acctname) {
            this.acctname = acctname;
        }

        /**
         * @return the qracno
         */
        public String getQracno() {
            return qracno;
        }

        /**
         * @param qracno the qracno to set
         */
        public void setQracno(String qracno) {
            this.qracno = qracno;
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
         * @return the subsac
         */
        public String getSubsac() {
            return subsac;
        }

        /**
         * @param subsac the subsac to set
         */
        public void setSubsac(String subsac) {
            this.subsac = subsac;
        }

        /**
         * @return the cnactp_1
         */
        public String getCnactp_1() {
            return cnactp_1;
        }

        /**
         * @param cnactp_1 the cnactp_1 to set
         */
        public void setCnactp_1(String cnactp_1) {
            this.cnactp_1 = cnactp_1;
        }

        /**
         * @return the cnacct_1
         */
        public String getCnacct_1() {
            return cnacct_1;
        }

        /**
         * @param cnacct_1 the cnacct_1 to set
         */
        public void setCnacct_1(String cnacct_1) {
            this.cnacct_1 = cnacct_1;
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
         * @return the drawfs
         */
        public String getDrawfs() {
            return drawfs;
        }

        /**
         * @param drawfs the drawfs to set
         */
        public void setDrawfs(String drawfs) {
            this.drawfs = drawfs;
        }

        /**
         * @return the newpwd
         */
        public String getNewpwd() {
            return newpwd;
        }

        /**
         * @param newpwd the newpwd to set
         */
        public void setNewpwd(String newpwd) {
            this.newpwd = newpwd;
        }

    }
}
