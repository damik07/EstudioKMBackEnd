package com.estudiokym.estudiokym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudiokymApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiokymApplication.class, args);
	}

  @Bean
        public WebMvcConfigurer corsConfigurer(){
            return new WebMvcConfigurer(){
                @Override
                public void addCorsMappings(CorsRegistry registry){
                    registry.addMapping("/**")
                    .allowedMethods("*")
                    .allowedOrigins("*")
                    .allowedHeaders("*")
                    ;
        
                }
            };
        }

}
