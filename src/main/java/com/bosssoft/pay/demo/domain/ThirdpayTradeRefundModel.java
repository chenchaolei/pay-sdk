package com.bosssoft.pay.demo.domain;

import com.bosssoft.pay.sdk.core.expose.ThirdpayRequestObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title 退付接口模型
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class ThirdpayTradeRefundModel extends ThirdpayRequestObject {

    /**
     * 商户订单号
     */
    @JsonProperty("out_trade_no")
    @NotBlank(message = "out_trade_no不能为空")
    private String outTradeNo;

    /**
     * 交易号
     */
    @JsonProperty("trade_no")
    private String tradeNo;

    /**
     * 退款金额
     */
    @JsonProperty("refund_amount")
    @NotBlank(message = "refund_amount不能为空")
    private String refundAmount;

    /**
     * 订单退款币种信息
     */
    @JsonProperty("refund_currency")
    private String refundCurrency;

    /**
     * 退款的原因说明
     */
    @JsonProperty("refund_reason")
    private String refundReason;

    /**
     * 退款请求号(标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。)
     */
    @JsonProperty("out_request_no")
    private String outRequestNo;

    /**
     * 退分账明细信息
     */
    @JsonProperty("refund_royalty_parameters")
    @Valid
    private List<RoyaltyDetailInfoPojo> refundRoyaltyParameters;


    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundCurrency() {
        return refundCurrency;
    }

    public void setRefundCurrency(String refundCurrency) {
        this.refundCurrency = refundCurrency;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    public List<RoyaltyDetailInfoPojo> getRefundRoyaltyParameters() {
        return refundRoyaltyParameters;
    }

    public void setRefundRoyaltyParameters(List<RoyaltyDetailInfoPojo> refundRoyaltyParameters) {
        this.refundRoyaltyParameters = refundRoyaltyParameters;
    }

    public static final class RoyaltyDetailInfoPojo {
        /**
         * 分账类型
         */
        @JsonProperty("royalty_type")
        private RoyaltyType royaltyType;

        /**
         * 支出方账户
         */
        @JsonProperty("trans_out")
        private String transOut;

        /**
         * 支出方账户类型
         */
        @JsonProperty("trans_out_type")
        private String transOutType;

        /**
         * 收入方账户账户类型
         */
        @JsonProperty("trans_in_type")
        private String transInType;

        /**
         * 收入方账户
         */
        @JsonProperty("trans_in")
        private String transIn;

        /**
         * 分账的金额
         */
        @JsonProperty("amount")
        private String amount;

        /**
         * 分账信息中分账百分比
         */
        @JsonProperty("amount_percentage")
        private String amountPercentage;

        /**
         * 分账描述
         */
        @JsonProperty("desc")
        private String desc;

        public RoyaltyType getRoyaltyType() {
            return royaltyType;
        }

        public void setRoyaltyType(RoyaltyType royaltyType) {
            this.royaltyType = royaltyType;
        }

        public String getTransOut() {
            return transOut;
        }

        public void setTransOut(String transOut) {
            this.transOut = transOut;
        }

        public String getTransOutType() {
            return transOutType;
        }

        public void setTransOutType(String transOutType) {
            this.transOutType = transOutType;
        }

        public String getTransInType() {
            return transInType;
        }

        public void setTransInType(String transInType) {
            this.transInType = transInType;
        }

        public String getTransIn() {
            return transIn;
        }

        public void setTransIn(String transIn) {
            this.transIn = transIn;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getAmountPercentage() {
            return amountPercentage;
        }

        public void setAmountPercentage(String amountPercentage) {
            this.amountPercentage = amountPercentage;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 分账类型
     */
    public static enum RoyaltyType {

        /**
         * 普通分账
         */
        transfer,

        /**
         * 补差
         */
        replenish
    }
}
