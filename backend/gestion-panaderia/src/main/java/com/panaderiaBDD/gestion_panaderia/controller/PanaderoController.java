package com.panaderiaBDD.gestion_panaderia.controller;

import com.panaderiaBDD.gestion_panaderia.dto.PanaderoResponseDTO;
import com.panaderiaBDD.gestion_panaderia.service.PanaderoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/panaderos")
public class PanaderoController {

    private final PanaderoService panaderoService;

    public PanaderoController(PanaderoService panaService){
        this.panaderoService = panaService;
    }

    //Get - listar
    @GetMapping("/lista")
    public ResponseEntity<List<PanaderoResponseDTO>> listar(){
        return ResponseEntity.ok(panaderoService.listar());
    }
}
