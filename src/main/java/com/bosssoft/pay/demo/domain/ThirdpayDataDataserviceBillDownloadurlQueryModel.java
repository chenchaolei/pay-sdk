package com.bosssoft.pay.demo.domain;

import com.bosssoft.pay.sdk.core.expose.ThirdpayRequestObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @Title 对账单下载地址查询接口模型
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class ThirdpayDataDataserviceBillDownloadurlQueryModel extends ThirdpayRequestObject {

    /**
     * 账单时间(日账单格式为yyyy-MM-dd)
     */
    @JsonProperty("bill_date")
    @NotBlank(message = "bill_date不能为空")
    private String billDate;

    /**
     * 账单类型
     */
    @JsonProperty("bill_type")
    private BillType billType;

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public enum BillType {

        /**
         * 商户基于交易收单的业务账单
         */
        trade,

        /**
         * 基于商户余额收入及支出等资金变动的帐务账单
         */
        signcustomer;
    }
}
