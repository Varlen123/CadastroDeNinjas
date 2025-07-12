package dev.java10x.CadastroDeNinjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class CadastroDeNinjasApplication {

    public static void main(String[] args) {
     
        //Criação de variavéis de ambiente usando a lib Dotenv
        Dotenv dotenv = Dotenv.load();
        System.setProperty("spring.datasource.url", dotenv.get("DATABASE_URL"));
        System.setProperty("spring.datasource.username", dotenv.get("DATABASE_USERNAME"));
        System.setProperty("spring.datasource.password", dotenv.get("DATABASE_PASSWORD"));


        SpringApplication.run(CadastroDeNinjasApplication.class, args);
    }
}

