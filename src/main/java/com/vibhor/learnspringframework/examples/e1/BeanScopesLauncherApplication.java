package com.vibhor.learnspringframework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

// scope value are of 2 types
// 1. normal (singleton) #default scope
// 		returns only 1 object per spring ioc container
// 2. prototype
// 		returns as many object as you need per spring ioc container

// Specific scopes only for web-aware Spring Application Context
// 1. Request - one obj instance per single HTTP instance
// 2. Session - one obj instance per user HTTP session
// 3. Application - one obj instance per web application runtime
// 4. WebSocket - one obj instance per Web Socket Instance


// Java Singleton
//	one object instance per jvm
//		vs
// Spring Singleton
// 	one object instance per spring ioc container

// In 99% scenario one spring ioc container is running per jvm.


@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan()
public class BeanScopesLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);

			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));

			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}

	}

}
