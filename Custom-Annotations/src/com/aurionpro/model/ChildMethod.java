package com.aurionpro.model;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( METHOD )
@Retention(RetentionPolicy.RUNTIME)
public @interface ChildMethod {

}
