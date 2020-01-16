package com.bosssoft.pay.demo.response;

import com.bosssoft.pay.sdk.core.expose.ThirdpayResponseObject;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Title 下单接口响应(参考自https://docs.open.alipay.com/api_1/alipay.trade.page.pay/)
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class ThirdpayTradePagePayResponse extends ThirdpayResponseObject {

    /**
     * 交易号
     */
    @JsonProperty("trade_no")
    private String trade_no;

    /**
     * 商户订单号
     */
    @JsonProperty("out_trade_no")
    private String out_trade_no;

    /**
     * 唯一用户号
     */
    @JsonProperty("seller_id")
    private String seller_id;

    /**
     * 交易金额
     */
    @JsonProperty("total_amount")
    private String total_amount;

    /**
     * 商户原始订单号
     */
    @JsonProperty("merchant_order_no")
    private String merchant_order_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getMerchant_order_no() {
        return merchant_order_no;
    }

    public void setMerchant_order_no(String merchant_order_no) {
        this.merchant_order_no = merchant_order_no;
    }
}
