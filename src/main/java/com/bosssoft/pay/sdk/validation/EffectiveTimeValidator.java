package com.bosssoft.pay.sdk.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @Title 有效期校验器
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
public class EffectiveTimeValidator implements ConstraintValidator<EffectiveTime, String> {

    // 支付宝订单有效期校验规则
    // 有效期规则: 1m～15d, d-天, h-小时, m-分钟;默认当天1c, 24点失效
    private static Pattern pattern = Pattern.compile("^(([1-9](\\d){0,})(d|h|m)$)|(^1c$)");

    @Override
    public void initialize(EffectiveTime constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 默认情况下, 有效期为1c
        if( value == null ){
            return true;
        }
        return pattern.matcher(value).matches();
    }
}
