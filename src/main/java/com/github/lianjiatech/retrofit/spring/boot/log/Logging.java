package com.github.lianjiatech.retrofit.spring.boot.log;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 陈添明
 * @since 2022/4/30 9:47 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
@Inherited
public @interface Logging {

    /**
     * 是否启用日志打印，针对当前接口或者方法
     */
    boolean enable() default true;

    /**
     * 日志打印级别，支持的日志级别参见{@link LogLevel}
     * 如果为NULL，则取全局日志打印级别
     * Log printing level, see {@link LogLevel} for supported log levels
     *
     */
    LogLevel logLevel() default LogLevel.INFO;

    /**
     * 日志打印策略，支持的日志打印策略参见{@link LogStrategy}
     * 如果为NULL，则取全局日志打印策略
     * Log printing strategy, see {@link LogStrategy} for supported log printing strategies
     *
     */
    LogStrategy logStrategy() default LogStrategy.BASIC;
}
