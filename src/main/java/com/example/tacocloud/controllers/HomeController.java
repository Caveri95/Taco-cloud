package com.example.tacocloud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Механизм сканирования в Spring автоматически обнаружит класс с @Controller и создаст экземпляр HomeController как bean-компонент(@Component,@Service и @Repository)
public class HomeController {

    @GetMapping("/") // Обрабатывает HTTP-запросы GET с корневым путем /
    public String home() {
        return "home";
    }
}
