package com.example;

import com.example.app.Argument;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
        System.out.print("Enter 2 numbers like 'a b' : ");
        ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
        Argument argument = argumentResolver.resolve(System.in);

        Calculator calculator = context.getBean(Calculator.class);
        int result = calculator.calc(argument.a(), argument.b());

        System.out.println("result = " + result);
    }

}
