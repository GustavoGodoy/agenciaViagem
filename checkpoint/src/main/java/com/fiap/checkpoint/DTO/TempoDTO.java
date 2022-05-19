package com.fiap.checkpoint.DTO;

public class TempoDTO {

    public int horas;
    public int minuto;

    public TempoDTO() {
    }

    public TempoDTO(int horas, int minuto) {
        this.horas = horas;
        this.minuto = minuto;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
