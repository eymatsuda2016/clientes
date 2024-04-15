package com.eduardomatsuda.clientes;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Data
public class ClienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClienteApplication.class, args);
    }
}
