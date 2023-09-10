package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configuration_Bean {

        @Bean

        public  Billi getbilli(){
            return  new Billi("black");
        }
        @Bean
        @Primary
        public  Billi getbilli0(){
            return  new Billi("white");
        }


        @Bean Billi getbilli2(){
            return new Billi("orage");
        }
    }
