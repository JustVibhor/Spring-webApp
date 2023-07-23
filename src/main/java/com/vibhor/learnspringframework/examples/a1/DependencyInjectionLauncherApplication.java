package com.vibhor.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

interface DataService {
	int[] retrieveData();
}

//@Component
//specialized component annotation which is used to manipulate data in database
@Repository
@Primary
class MongoDbDataService implements DataService {

	@Bean
	public int[] retrieveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}
}

//@Component
//specialized component annotation which is used to manipulate data in database
@Repository
class MySQLDataService implements DataService {

	@Bean
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}
}

//@Component
// specialized component annotation which contains business logic
@Service
class BusinessCalculationService {

	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	@Bean
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {

			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}
