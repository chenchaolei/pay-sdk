package com.bosssoft.pay.demo.domain;

import com.bosssoft.pay.sdk.core.expose.ThirdpayRequestObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import java.util.List;

/**
 * @Title 下单接口模型(参考自https://docs.open.alipay.com/api_1/alipay.trade.page.pay/)
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class ThirdpayTradePagePayModel extends ThirdpayRequestObject {

    /**
     * 商户订单号
     */
    @JsonProperty("out_trade_no")
    @NotBlank(message = "out_trade_no不能为空")
    private String out_trade_no;

    /**
     * 产品码
     */
    @JsonProperty("product_code")
    @NotBlank(message = "product_code不能为空")
    private String product_code;

    /**
     * 订单总金额
     */
    @JsonProperty("total_amount")
    @NotBlank(message = "total_amount不能为空")
    private String total_amount;

    /**
     * 订单标题
     */
    @JsonProperty("subject")
    @NotBlank(message = "subject不能为空")
    private String subject;

    /**
     * 订单描述
     */
    @JsonProperty("body")
    private String body;

    /**
     * 订单有效期
     * 该笔订单允许的最晚付款时间，逾期将关闭交易。
     * 取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
     * 该参数数值不接受小数点， 如 1.5h，可转换为 90m
     */
    @JsonProperty("timeout_express")
    @NotBlank(message = "timeout_express不能为空")
    private String timeout_express;

    /**
     * 前台回调地址
     */
    @JsonProperty("return_url")
    private String return_url;

    /**
     * 后台回调地址
     */
    @JsonProperty("notify_url")
    @NotBlank(message = "notify_url不能为空")
    private String backUrl;

    /**
     * 商户订单号
     */
    @JsonProperty("settle_info")
    @Valid
    private List<SettleDetail> settleInfo;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public List<SettleDetail> getSettleInfo() {
        return settleInfo;
    }

    public void setSettleInfo(List<SettleDetail> settleInfo) {
        this.settleInfo = settleInfo;
    }

    public static final class SettleDetail {

        /**
         * 结算收款方
         */
        @JsonProperty("trans_in")
        @NotBlank(message = "trans_in不能为空")
        private String transIn;

        @JsonProperty("trans_in_type")
        @NotBlank(message = "trans_in_type不能为空")
        private String transInType;

        /**
         * 结算的金额
         */
        @JsonProperty("amount")
        @NotBlank(message = "amount不能为空")
        private String amount;

        public String getTransIn() {
            return transIn;
        }

        public void setTransIn(String transIn) {
            this.transIn = transIn;
        }

        public String getTransInType() {
            return transInType;
        }

        public void setTransInType(String transInType) {
            this.transInType = transInType;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }
    }

}
