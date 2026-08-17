package com.panaderiaBDD.gestion_panaderia.mapper;

import com.panaderiaBDD.gestion_panaderia.dto.PanaderoRequestDTO;
import com.panaderiaBDD.gestion_panaderia.dto.PanaderoResponseDTO;
import com.panaderiaBDD.gestion_panaderia.model.Panadero;

public class PanaderoMapper {

    //metodo para convertir a un Panadero a un PanaderoResponseDTO
    public static PanaderoResponseDTO toResponseDTO(Panadero panadero){
        if(panadero == null) return null;
        PanaderoResponseDTO dto = new PanaderoResponseDTO();
        dto.setNombre(panadero.getNombre());
        return dto;
    }

    public static Panadero toEntity(PanaderoRequestDTO dto){
        if(dto == null) return null;
        Panadero pana = new Panadero();
        pana.setId(dto.getId());
        pana.setNombre(dto.getNombre());
        return pana;
    }
}
