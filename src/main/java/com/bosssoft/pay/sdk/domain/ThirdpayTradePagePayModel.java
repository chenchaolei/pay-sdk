package com.bosssoft.pay.sdk.domain;

import com.bosssoft.pay.sdk.core.expose.ThirdpayRequestObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import java.util.List;

/**
 * @Title 下单接口模型(数据来源:https://docs.open.alipay.com/api_1/alipay.trade.page.pay/)
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
    private String outTradeNo;

    /**
     * 产品码
     */
    @JsonProperty("product_code")
    @NotBlank(message = "product_code不能为空")
    private String productCode;

    /**
     * 订单总金额
     */
    @JsonProperty("total_amount")
    @NotBlank(message = "total_amount不能为空")
    private String totalAmount;

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
    private String timeoutExpress;

    /**
     * 前台回调地址
     */
    @JsonProperty("return_url")
    private String returnUrl;

    /**
     * 后台回调地址
     */
    @JsonProperty("notify_url")
    @NotBlank(message = "notify_url不能为空")
    private String notifyUrl;

    /**
     * 商户订单号
     */
    @JsonProperty("settle_info")
    @Valid
    private List<SettleDetail> settleInfo;

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
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

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
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
