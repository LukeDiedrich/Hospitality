package com.lukediedrich.hospitality;

import com.lukediedrich.hospitality.service.StateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class hospitalityApplication
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        StateService service = applicationContext.getBean("stateService", StateService.class);



        SpringApplication.run(hospitalityApplication.class, args);
    }

}
