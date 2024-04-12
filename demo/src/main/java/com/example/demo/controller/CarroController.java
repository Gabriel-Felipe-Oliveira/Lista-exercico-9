package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Carro;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarroController {

    @GetMapping("/carros")
    public String listarCarros(Model model) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Toyota Corolla", "Toyota", 2021));
        carros.add(new Carro("Volkswagen Golf", "Volkswagen", 2020));
        carros.add(new Carro("Ford Mustang", "Ford", 2019));

        model.addAttribute("carros", carros);

        return "carros";
    }
}