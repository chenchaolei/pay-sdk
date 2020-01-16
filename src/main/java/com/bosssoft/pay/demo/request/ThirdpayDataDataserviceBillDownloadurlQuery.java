package com.bosssoft.pay.demo.request;

import com.bosssoft.pay.demo.response.ThirdpayDataDataserviceBillDownloadurlQueryResponse;
import com.bosssoft.pay.sdk.core.ThirdpayRequest;
import com.bosssoft.pay.sdk.core.internal.mapping.ApiService;
import com.bosssoft.pay.demo.domain.ThirdpayDataDataserviceBillDownloadurlQueryModel;

/**
 * @Title 对账单下载地址查询请求
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
@ApiService("thirdpay.data.dataservice.bill.downloadurl.query")
public class ThirdpayDataDataserviceBillDownloadurlQuery extends ThirdpayRequest<ThirdpayDataDataserviceBillDownloadurlQueryModel, ThirdpayDataDataserviceBillDownloadurlQueryResponse> {
}
