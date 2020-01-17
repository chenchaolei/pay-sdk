package com.bosssoft.pay.sdk.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Title 有效期
 * @Description
 * @Author 陈超雷(chenchaoleicn@gmail.com)
 * @Date 2020/1/16
 */
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EffectiveTimeValidator.class)
public @interface EffectiveTime {
    String message() default "{有效期不符合规范}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
