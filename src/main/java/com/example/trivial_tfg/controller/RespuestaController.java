package com.example.trivial_tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.trivial_tfg.services.RespuestaService;

@Controller
public class RespuestaController {
	@Autowired
	private  RespuestaService respuestaService;
	
	//NO SERÍA NECESARIO, LA MUESTRA DE RESPUESTA SALEN TAMBIÉN DEL CONTROLADOR DE LA MUESTRA DE PREGUNTAS
}
