package com.fiap.checkpoint.service;

import com.fiap.checkpoint.DTO.TempoDTO;
import com.fiap.checkpoint.DTO.ViagemDTO;

public class ViagemService implements ViagemInterface {

    @Override
    public TempoDTO calculaTempoViagem(ViagemDTO viagemDTO) {
        int horas = (int) viagemDTO.calculaTempo();
        double minutos = (viagemDTO.calculaTempo() - horas) * 60;
        TempoDTO response = new TempoDTO(horas, (int) minutos);
        return response;
    }
}
