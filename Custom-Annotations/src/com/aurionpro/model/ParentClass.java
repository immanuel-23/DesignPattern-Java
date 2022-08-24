package com.aurionpro.model;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(TYPE) // this is only for class
@Retention(RetentionPolicy.RUNTIME)//IT tells java to keep this annotation while running
public @interface ParentClass {

}
