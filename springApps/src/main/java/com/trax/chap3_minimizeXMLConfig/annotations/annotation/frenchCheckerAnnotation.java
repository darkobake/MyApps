package com.trax.chap3_minimizeXMLConfig.annotations.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by SG0220142 on 8/8/2014.
 */
@Target({ElementType.FIELD,ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface frenchCheckerAnnotation {
}
