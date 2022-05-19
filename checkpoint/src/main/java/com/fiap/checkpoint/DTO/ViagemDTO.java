package com.fiap.checkpoint.DTO;

public class ViagemDTO {

    public String origem;
    public String destino;
    public double distancia;
    public double velocidadeMedia;

    public ViagemDTO() {
    }

    public ViagemDTO(String origem, String destino, double distancia, double velocidadeMedia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.velocidadeMedia = velocidadeMedia;
    }

    public double calculaTempo(){
        double tempo = 0;

        tempo = this.distancia / this.velocidadeMedia;

        return tempo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}


