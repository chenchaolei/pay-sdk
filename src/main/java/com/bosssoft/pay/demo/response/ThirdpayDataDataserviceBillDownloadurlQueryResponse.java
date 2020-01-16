package com.bosssoft.pay.demo.response;

import com.bosssoft.pay.sdk.core.expose.ThirdpayResponseObject;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Title 对账单下载地址查询接口响应
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class ThirdpayDataDataserviceBillDownloadurlQueryResponse extends ThirdpayResponseObject {

    @JsonProperty("status")
    private String status;

    @JsonProperty("bill_download_url")
    private String billDownloadUrl;

    public String getStatus() {
        return status;
    }

    public enum Status {
        /**
         * 对账单未生成
         */
        WAITING,

        /**
         * 对账单已生成
         */
        FINISH
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getBillDownloadUrl() {
        return billDownloadUrl;
    }

    public void setBillDownloadUrl(String billDownloadUrl) {
        this.billDownloadUrl = billDownloadUrl;
    }
}
