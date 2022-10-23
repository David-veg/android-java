package com.example.examen_2022.service;

public class apis {
    public static final String URL_001="http://192.168.16.1:3000/libro/";
    public static final String URL_002="http:// 192.168.16.1:3000/categoria/";

    public static com.example.examen_2022.service.LibroService getLibroService(){
        return  Cliente.getClient(URL_001).create(com.example.examen_2022.service.LibroService.class);
    }

}
