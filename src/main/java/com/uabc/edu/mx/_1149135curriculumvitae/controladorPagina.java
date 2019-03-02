package com.uabc.edu.mx._1149135curriculumvitae;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/app")
public class controladorPagina {
    @GetMapping(value = "/recurso")
    public String curriculumVitae(Model model){

        Persona javier = new Persona();
        javier.setNombre("Javier");
        javier.setApellidoP("Razo");
        javier.setApellidoM("Rosales");
        javier.setEdad(20);
        javier.setTelefono("(686)1276682");
        javier.setFacebook("facebook.com/Javier.razo");
        javier.setCorreo("javier.razo@uabc.edu.mx");
        javier.setDirFoto("/javierFoto.JPG");

        javier.setIdiomas(new ArrayList<>());

        javier.getIdiomas().add("Español");
        javier.getIdiomas().add("Inglés");
        javier.getIdiomas().add("Francés");


        javier.setIntroduccion("Actualmente me encuentro continuando el 6to. Semestre de mis " +
                "estudios superiores de Licenciatura en Sistemas Computacionales en " +
                "la Universidad Autónoma de Baja California; Hace un par de años " +
                "egrese de la preparatoria técnica Cecyte Compuertas donde obtuve mi " +
                "título de Técnico en Programación.\n" +
                "Siempre he sido un estudiante destacado, responsable y cumplido con " +
                "un gran gusto por las computadoras; Planeo concluir mis estudios y en " +
                "algún momento llegar a emprender como programador");

        javier.setExperiencia(new ArrayList<>());

        javier.getExperiencia().add("Python como herramienta para cómputo científico\n" +
                "Asistencia al taller dentro del marco del 8vo. Congreso Internacional de " +
                "Ciencias Computacionales del 9 al 11 de noviembre 2016.");
        javier.getExperiencia().add("Concurso regional de programación 2.0\n" +
                "Ganador del 3er. Lugar con el equipo “Renegades”, concurso realizado " +
                "por el Tecnológico Nacional de México en colaboración con el Instituto " +
                "Tecnológico de Mexicali.");
        javier.getExperiencia().add("Auxiliar de laboratorio (3 meses)\n" +
                "Mantenimiento preventivo al equipo de cómputo.\n" +
                "Formateo y clonación de discos duros.\n" +
                "Cableado.\n");

        javier.setFormacion(new ArrayList<>());

        javier.getFormacion().add("Técnico en programación\n" +
                "Cecyte Compuertas, Mexicali, Baja California\n" +
                "Cedula Profesional: 102774904\n" +
                "Desarrollo e instalación de software de aplicación utilizando " +
                "programación estructurada y orientada a objetos con persistencia de " +
                "datos." +
                "Desarrollo de aplicaciones web y móviles.");

        javier.getFormacion().add("Estudiante de Sistemas Computacionales\n" +
                "Universidad Autónoma de Baja California\n" +
                "Actualmente cursando el 3er. Semestre de mi carrera universitaria con " +
                "un promedio general de 94");

        javier.getFormacion().add("Preparatoria\n" +
                "Cecyte Compuertas, Mexicali, Baja California" +
                "Preparatoria técnica donde además de cursar mis estudios medios " +
                "superiores, lleve la carrera técnica de Programación de Software");


        model.addAttribute("javier", javier);

        return "curriculumVitae";
    }


}
