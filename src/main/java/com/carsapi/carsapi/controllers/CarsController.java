package com.carsapi.carsapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.carsapi.dto.CarsDTO;

@RestController
@RequestMapping("/")
public class CarsController {

    @PostMapping
    public void create(@RequestBody CarsDTO req) {
        System.out.println("modelo: " + req.modelo() + "\nfabricante: " + req.fabricante() + "\ndata de Fabricação: "
                + req.dataFabricacao() + "\nvalor: " + req.valor() + "\nanoModelo: " + req.anoModelo());
    }
}
