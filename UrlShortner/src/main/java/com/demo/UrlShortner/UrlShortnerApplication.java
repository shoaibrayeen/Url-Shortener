package com.demo.UrlShortner;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
 
@SpringBootApplication

public class UrlShortnerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UrlShortnerApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
        
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
	}

}
