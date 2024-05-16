package org.example.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProductConfig {
    @Bean
    public DataService dataService(){
        return new DataService("Product environment");
    }
}
