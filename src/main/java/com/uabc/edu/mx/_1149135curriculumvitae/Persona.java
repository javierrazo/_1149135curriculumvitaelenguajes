package com.uabc.edu.mx._1149135curriculumvitae;

import lombok.Data;

import java.util.List;

@Data
public class Persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private String telefono;
    private String correo;
    private String facebook;

    private String introduccion;
    private String dirFoto;

    private List<String> experiencia;
    private List<String> formacion;
    private List<String> otros;
    private List<String> idiomas;



}
