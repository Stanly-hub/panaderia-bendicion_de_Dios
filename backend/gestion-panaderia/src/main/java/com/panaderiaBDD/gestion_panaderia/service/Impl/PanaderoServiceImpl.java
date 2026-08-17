package com.panaderiaBDD.gestion_panaderia.service.Impl;

import com.panaderiaBDD.gestion_panaderia.dto.PanaderoResponseDTO;
import com.panaderiaBDD.gestion_panaderia.mapper.PanaderoMapper;
import com.panaderiaBDD.gestion_panaderia.repository.PanaderoRepository;
import com.panaderiaBDD.gestion_panaderia.service.PanaderoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PanaderoServiceImpl implements PanaderoService {

    private final PanaderoRepository repository;

    public PanaderoServiceImpl(PanaderoRepository repository){
        this.repository = repository;
    }

    @Override
    public List<PanaderoResponseDTO> listar() {
        return repository.findAll()
                .stream()
                .map(PanaderoMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
}
