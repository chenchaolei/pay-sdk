package com.bosssoft.pay.sdk.request;

import com.bosssoft.pay.sdk.core.ThirdpayRequest;
import com.bosssoft.pay.sdk.core.internal.mapping.ApiService;
import com.bosssoft.pay.sdk.domain.ThirdpayTradePagePayModel;
import com.bosssoft.pay.sdk.response.ThirdpayTradePagePayResponse;

/**
 * @Title 下单请求
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
@ApiService("thirdpay.trade.page.pay")
public class ThirdpayTradePagePayRequest extends ThirdpayRequest<ThirdpayTradePagePayModel, ThirdpayTradePagePayResponse> {
}
