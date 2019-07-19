package com.localhost.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/*
 * -1 :无权限
 * 0：root
 * 1：管理员权限
 * 2：收费员权限
 * 3：医生权限
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)
public @interface Jurisdiction {
	int jurisdiction() default -1;
}
