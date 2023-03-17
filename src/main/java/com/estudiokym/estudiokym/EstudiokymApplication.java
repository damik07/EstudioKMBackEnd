package com.estudiokym.estudiokym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



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
          /*System.getenv("JAVA_HOME")*/
        }

}
