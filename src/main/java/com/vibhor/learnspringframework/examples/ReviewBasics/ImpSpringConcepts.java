package com.vibhor.learnspringframework.examples.ReviewBasics;

public class ImpSpringConcepts {
    /*

        DependencyInjection
            Identifying beans and its dependencies and wiring them together also called
            Inversion of Control (IOC)
                as prog no need to create and wire objects

            Types
                Constructor Injection
                    calling constructor to create the beans

                Setter Injection
                    calling setter methods to create the beans

                Field Injection
                    No setter or constructor. Injected using reflection

        IOC Container
            Spring IOC context which manages spring beans and its life cycle

            Types
                Bean Factory
                    Basic spring ioc container, not used frequently

                ApplicationContext (FREQUENTLY USED)
                    Advanced Spring IOC Container with enterprise ready feature
                    Easy to use in web application with internationalization features
                    Good integration with spring aop

        Spring beans
            Objects managed by the spring

        Auto-wiring
            wiring right dependency with the bean

     */
}
