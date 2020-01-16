package com.bosssoft.pay.demo.response;

import com.bosssoft.pay.sdk.core.expose.ThirdpayResponseObject;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Title 退付接口响应
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class ThirdpayTradeRefundResponse extends ThirdpayResponseObject {

    /**
     * 商户退付订单号
     */
    @JsonProperty("refund_order_no")
    private String refundOrderNo;

    /**
     * 退付状态
     */
    @JsonProperty("status")
    private RefundStatus status;

    /**
     * 退款消息
     */
    @JsonProperty("refund_msg")
    private String refundMsg;

    /**
     * 退付金额
     */
    @JsonProperty("refund_amt")
    private String refundAmt;

    /**
     * 退付原因
     */
    @JsonProperty("refund_reason")
    private String refundReason;

    /**
     * 退付时间
     */
    @JsonProperty("refund_time")
    private String refundTime;

    /**
     * 退付状态
     */
    public static enum RefundStatus {
        SUCCESS, FAIL;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public RefundStatus getStatus() {
        return status;
    }

    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    public String getRefundMsg() {
        return refundMsg;
    }

    public void setRefundMsg(String refundMsg) {
        this.refundMsg = refundMsg;
    }

    public String getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(String refundAmt) {
        this.refundAmt = refundAmt;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }
}
