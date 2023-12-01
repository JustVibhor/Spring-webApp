package com.vibhor.learnspringframework.examples.LazyVsEager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

// without using lazy the component will be initialized eager
// which is preferred in most of the cases
// but for some special cases where u need to save the memory
// at startup u can use @Lazy on component or bean
// using lazy with component or bean will be initialized when the particular
// class is called, watch when we use @Lazy

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some initialization logic");
        this.classA = classA;
    }

    public void hadToMakeAMethod() {
        System.out.println("Do Something");
    }
}

@Configuration
@ComponentScan()
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (LazyInitializationLauncherApplication.class)) {

            System.out.println("Initialization context is finished");

            context.getBean(ClassB.class).hadToMakeAMethod();
        }

    }

}
