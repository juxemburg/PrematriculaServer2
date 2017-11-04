package com.aliance.model;

public class ProgramaModel {

    public String id;
    public String nombre;
    public String codigo;
    public String iniciales;

    public ProgramaModel() {

    }

    public ProgramaModel(String id, String nombre, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        iniciales = getIniciales(nombre);
    }

    private String getIniciales(String texto) {
        String[] palabras = texto.split(" ");
        String res = "";
        for(String palabra : palabras) {
            if(palabra.length() <= 3)
                continue;;
            res += Character.toUpperCase(palabra.charAt(0));
        }
        return res;
    }



}
