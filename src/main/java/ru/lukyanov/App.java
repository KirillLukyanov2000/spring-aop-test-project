package ru.lukyanov;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.lukyanov.config.AppConfig;
import ru.lukyanov.entity.Customer;
import ru.lukyanov.service.CustomerService;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService = context.getBean(CustomerService.class);
        Customer customer1 = customerService.get(1L);
        System.out.println(customer1);

        Customer customer2 = customerService.get(2L);

    }
}