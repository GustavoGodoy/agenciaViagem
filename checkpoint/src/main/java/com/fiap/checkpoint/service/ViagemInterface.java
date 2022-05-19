package com.fiap.checkpoint.service;

import com.fiap.checkpoint.DTO.TempoDTO;
import com.fiap.checkpoint.DTO.ViagemDTO;

public interface ViagemInterface {

    public TempoDTO calculaTempoViagem(ViagemDTO viagemDTO);
}
