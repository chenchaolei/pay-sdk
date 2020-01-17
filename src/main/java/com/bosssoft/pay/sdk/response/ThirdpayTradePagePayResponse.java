package com.bosssoft.pay.sdk.response;

import com.bosssoft.pay.sdk.core.expose.ThirdpayResponseObject;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Title 下单接口响应(数据来源:https://docs.open.alipay.com/api_1/alipay.trade.page.pay/)
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class ThirdpayTradePagePayResponse extends ThirdpayResponseObject {

    /**
     * 交易号
     */
    @JsonProperty("trade_no")
    private String tradeNo;

    /**
     * 商户订单号
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 唯一用户号
     */
    @JsonProperty("seller_id")
    private String sellerId;

    /**
     * 交易金额
     */
    @JsonProperty("total_amount")
    private String totalAmount;

    /**
     * 商户原始订单号
     */
    @JsonProperty("merchant_order_no")
    private String merchantOrderNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }
}
