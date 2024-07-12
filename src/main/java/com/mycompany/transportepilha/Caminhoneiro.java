package com.mycompany.transportepilha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Caminhoneiro {
    private String nome;
    private String placa;
    private LocalDateTime horarioChegada;

    public Caminhoneiro(String nome, String placa) {
        this.nome = nome;
        this.placa = placa;
        this.horarioChegada = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String horarioFormatado = horarioChegada.format(formatter);
        return "Nome: " + nome + ", Placa: " + placa + ", Horário de Chegada: " + horarioFormatado;
    }
}