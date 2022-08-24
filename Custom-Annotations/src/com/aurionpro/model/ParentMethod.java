package com.aurionpro.model;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

@Target(METHOD)
public @interface ParentMethod {
	int time();
}
