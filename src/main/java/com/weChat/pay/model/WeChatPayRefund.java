package com.weChat.pay.model;

/**
 * 微信支付退款实体类
 * sqy 20210513
 */
public class WeChatPayRefund {
    //返回状态码  此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
    public String return_code;
    //返回信息 当return_code为FAIL时返回信息为错误原因 ，例如 签名失败 参数格式校验错误
    private String return_msg;
    //公众账号ID 调用接口提交的公众账号ID
    private String appid;
    //商户号 调用接口提交的商户号
    private String mch_id;
    //api密钥 详见：https://pay.weixin.qq.com/index.php/extend/employee
    private String api_key;
    //随机字符串	5K8264ILTKCH16CQ2502SI8ZNMTM67VS	微信返回的随机字符串
    private String nonce_str;
    //签名 微信返回的签名值，详见签名算法:https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_3
    private String sign;
    //业务结果 SUCCESS SUCCESS/FAIL
    private String result_code;
    //错误代码 当result_code为FAIL时返回错误代码，详细参见下文错误列表
    private String err_code;
    //错误代码描述 当result_code为FAIL时返回错误描述，详细参见下文错误列表
    private String err_code_des;
    //商家订单号 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|* 且在同一个商户号下唯一。详见商户订单号 https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2
    private String out_trade_no;
    //标价金额 订单总金额，单位为分，详见支付金额 https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2
    private String total_fee;
    //通知地址 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。公网域名必须为https，如果是走专线接入，使用专线NAT IP或者私有回调域名可使用http
    private String notify_url;
    //子商户号 sub_mch_id 非必填（商户不需要传入，服务商模式才需要传入） 微信支付分配的子商户号
    private String sub_mch_id;
    //商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。
    private String out_refund_no;
    //退款总金额，单位为分，只能为整数，可部分退款。详见支付金额 https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=4_2
    private String refund_fee;
    //退款原因 若商户传入，会在下发给用户的退款消息中体现退款原因 注意：若订单退款金额≤1元，且属于部分退款，则不会在退款消息中体现退款原因
    private String refund_desc;
    //API证书文件路径
    private String CertificatePath;


    public String getReturn_code() {
        return return_code;
    }

    public WeChatPayRefund setReturn_code(String return_code) {
        this.return_code = return_code;
        return this;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public WeChatPayRefund setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
        return this;
    }

    public String getAppid() {
        return appid;
    }

    public WeChatPayRefund setAppid(String appid) {
        this.appid = appid;
        return this;
    }

    public String getMch_id() {
        return mch_id;
    }

    public WeChatPayRefund setMch_id(String mch_id) {
        this.mch_id = mch_id;
        return this;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public WeChatPayRefund setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public WeChatPayRefund setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getResult_code() {
        return result_code;
    }

    public WeChatPayRefund setResult_code(String result_code) {
        this.result_code = result_code;
        return this;
    }

    public String getErr_code() {
        return err_code;
    }

    public WeChatPayRefund setErr_code(String err_code) {
        this.err_code = err_code;
        return this;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public WeChatPayRefund setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
        return this;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public WeChatPayRefund setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
        return this;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public WeChatPayRefund setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
        return this;
    }


    public String getNotify_url() {
        return notify_url;
    }

    public WeChatPayRefund setNotify_url(String notify_url) {
        this.notify_url = notify_url;
        return this;
    }

    public String getSub_mch_id() {
        return sub_mch_id;
    }

    public WeChatPayRefund setSub_mch_id(String sub_mch_id) {
        this.sub_mch_id = sub_mch_id;
        return this;
    }

    public String getApi_key() {
        return api_key;
    }

    public WeChatPayRefund setApi_key(String api_key) {
        this.api_key = api_key;
        return this;
    }

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public WeChatPayRefund setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
        return this;
    }

    public String getRefund_fee() {
        return refund_fee;
    }

    public WeChatPayRefund setRefund_fee(String refund_fee) {
        this.refund_fee = refund_fee;
        return this;
    }

    public String getRefund_desc() {
        return refund_desc;
    }

    public WeChatPayRefund setRefund_desc(String refund_desc) {
        this.refund_desc = refund_desc;
        return this;
    }

    public String getCertificatePath() {
        return CertificatePath;
    }

    public WeChatPayRefund setCertificatePath(String certificatePath) {
        CertificatePath = certificatePath;
        return this;
    }
}

