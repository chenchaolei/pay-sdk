package com.bosssoft.pay.demo.request;

import com.bosssoft.pay.demo.response.ThirdpayTradeRefundResponse;
import com.bosssoft.pay.sdk.core.ThirdpayRequest;
import com.bosssoft.pay.sdk.core.internal.mapping.ApiService;
import com.bosssoft.pay.demo.domain.ThirdpayTradeRefundModel;

/**
 * @Title 退付请求
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
@ApiService("thirdpay.trade.refund")
public class ThirdpayTradeRefundRequest extends ThirdpayRequest<ThirdpayTradeRefundModel, ThirdpayTradeRefundResponse> {
}