package com.lukediedrich.hospitality;

import com.lukediedrich.hospitality.Repository.StateRepositoy;
import com.lukediedrich.hospitality.Repository.StateRepositoyImpl;
import com.lukediedrich.hospitality.service.StateService;
import com.lukediedrich.hospitality.service.StateServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = "stateService")
    public StateService getStateService(){
        StateServiceImpl stateService = new StateServiceImpl(getStateRepository());
        return stateService;
    }

    @Bean(name = "stateRepository")
    public StateRepositoy getStateRepository(){
        return new StateRepositoyImpl();
    }
}
