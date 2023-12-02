package com.vibhor.learnspringframework.examples.ReviewBasics;

public class ImpAnnotations {

    /*

        @Configuration
            Basically creating java configuration class in which create multiple methods and
            declare them as beans and spring will create beans for all the values returned by
            those methods.
            Ex: GamingConfiguration {}

        @ComponentScan
            tells where components are present

        @Bean
            Method produces a bean and will be managed by spring container

        @Component
            class is a component, if is part of component scan spring bean will be created
            @Service    @Controller     @Repository
                Check info.java

        @Primary
            give preference to the bean

        @Qualifier
            specific bean to autowire

        @Lazy
            Initialized when called only

        @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
            new instance will create everytime you refer to the bean
            Default is singleton (one instance per IOC container)

        @PostConstruct
            Identifies the method that will be executed after dependency injection is done to perform
            any initialization
            Suppose u need retrieve some value from the database as soon as all the dependencies are
            ready

        @PreDestroy
            Just before a bean is removed by the container or spring ioc context, it will call the method
            with this annotation.
            Typically used to free up the resources

        @Named
            CDI similar to Component

        @Inject
            CDI similar to Autowired



     */

}
