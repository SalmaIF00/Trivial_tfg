package com.example.trivial_tfg.controller;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.trivial_tfg.entity.Asignatura;
import com.example.trivial_tfg.entity.Pregunta;
import com.example.trivial_tfg.services.AsignaturaService;
import com.example.trivial_tfg.services.PreguntaService;
import com.example.trivial_tfg.services.RespuestaService;

@Controller
public class PreguntaController {
	@Autowired
	private PreguntaService preguntaService;
	@Autowired
	private AsignaturaService asignaturaService;
	@Autowired
	private RespuestaService respuestaService;

	// CONTROLADOR MOSTRAR PREGUNTAS ALEATORIAS
	/**
	 * Guiarse con el springQuiz, cada muestra de pregunta era un controlador
	 * distinto Intentar hacer un controlador por pregunta, almacenando el
	 * id_pregunta en un array estático Dicho array no podrá repetirse (if
	 * id_pregunta != array) se almacena y se muestra.
	 * 
	 * @return
	 */
	// @GetMapping("/preguntas_opciones")
	// public String ranking() {
	//
	// return "html/preguntas_opciones";
	// }
	//
	// @ResponseBody
	// @RequestMapping(method = RequestMethod.POST, value =
	// "/{asignatura}/pregunta")
	// public Set<Pregunta> mostrarPregunta(Model model, HttpSession session,
	// @PathVariable(value = "id_asignatura") Long id_asignatura) {
	// Set<Pregunta> preguntas = preguntaService.listarPreguntas(id_asignatura);
	//
	// return preguntas;
	// }

	// CONTROLADOR PREGUNTA 1
//	@GetMapping("/pregunta/{id_asignatura}/{id_pregunta}" )
//	public String pregunta1(HttpSession session, @PathVariable("id_asignatura") Long id_asignatura, @PathVariable("id_pregunta") Long id_pregunta, Model model) {
//		//	Set<Long> id_preguntas = preguntaService.listarPreguntas(id_asignatura);
//		Pregunta preguntas1;
//		Asignatura asignatura;
//		
//		preguntas1 = preguntaService.buscarPregunta(id_pregunta);
//		asignatura = asignaturaService.buscarAsignatura(id_asignatura);
//		
//		preguntas1.setAsignatura(asignatura);
//
//		System.out.println(asignatura.getNombre_asignatura());
//
//		//id_asignatura = preguntas.getAsignatura().getId_asignatura();
//
//		model.addAttribute("id_asignatura", id_asignatura);
//		model.addAttribute("id_pregunta", id_pregunta);
//
//		model.addAttribute("respuesta", preguntas1.getRespuestas());
//		model.addAttribute("pregunta", preguntas1.getPregunta());
//
//
//
//		return "html/preguntas_opciones";
//	}

	// CÓDIGO JESS
	@GetMapping("/pregunta/{id_asignatura}")
	public String pregunta1(HttpSession session, @PathVariable("id_asignatura") Long id_asignatura, Model model) {
		Long[] id_preguntas = preguntaService.listarPreguntas(id_asignatura);
		Integer random =  (int) Math.floor(Math.random()*11+1);

		Long buscarID = null;
		for(int i=0; i<=id_preguntas.length;i++) {
			if(i==random) {
				buscarID = id_preguntas[i];
			}
		}
		
		Pregunta p = preguntaService.buscarPregunta(buscarID);

		model.addAttribute("id_asignatura", id_asignatura);
		model.addAttribute("respuesta", p.getRespuestas());
		model.addAttribute("pregunta", p.getPregunta());

		return "html/preguntas_opciones";
	}

//	@PostMapping("/pregunta/{id_asignatura}/{id_pregunta}")
//	public String persistPregunta1(@PathVariable("id_asignatura") Long id_asignatura, Model model) {
//
//		return "html/preguntas_opciones";
//	}
	
	@PostMapping("/pregunta/{id_asignatura}")
	public String persistPregunta1(@PathVariable("id_asignatura") Long id_asignatura, Model model) {
	
		return "redirect:/preguntas_opciones";
	}

	// // CONTROLADOR PREGUNTA 2
	// @GetMapping("/pregunta2")
	// public String pregunta2(@PathVariable("id_asignatura") Long id_asignatura,
	// Model model, HttpSession session) {
	// System.out.print(id_asignatura);
	// List<Pregunta> preguntas = (List<Pregunta>)
	// preguntaService.listarPreguntas(id_asignatura);
	//
	// Pregunta p = null;
	// String pregunta = null;
	//
	// for (int i = 0; i <= preguntas.size(); i++) {
	// p = preguntas.get(1);
	// pregunta = p.getPregunta();
	// }
	//
	// List<Respuesta> respuesta = (List<Respuesta>)
	// respuestaService.buscarIdPregunta(p.getId_pregunta());
	// model.addAttribute("respuesta", respuesta);
	// model.addAttribute("pregunta", pregunta);
	//
	// return "html/preguntas_opciones2";
	// }
	//
	// @PostMapping("/{id_asignatura}/2")
	// public String persistPregunta2(@PathVariable("id_asignatura") Long
	// id_asignatura, Model model,
	// HttpSession session) {
	//
	// return "redirect:/pregunta3";
	// }
	//
	// // CONTROLADOR PREGUNTA 3
	// @GetMapping("/pregunta3")
	// public String pregunta3(@PathVariable("id_asignatura") Long id_asignatura,
	// Model model, HttpSession session) {
	//
	// return "html/preguntas_opciones3";
	// }
	//
	// @PostMapping("/pregunta3")
	// public String persistPregunta3(@PathVariable("id_asignatura") Long
	// id_asignatura, Model model,
	// HttpSession session) {
	//
	// return "html/preguntas_opciones4";
	// }
	//
	// // CONTROLADOR PREGUNTA 4
	// @GetMapping("/pregunta4")
	// public String pregunta4(@PathVariable("id_asignatura") Long id_asignatura,
	// Model model, HttpSession session) {
	//
	// return "html/preguntas_opciones4";
	// }
	//
	// @PostMapping("/pregunta4")
	// public String persistPregunta4(@PathVariable("id_asignatura") Long
	// id_asignatura, Model model,
	// HttpSession session) {
	//
	// return "html/preguntas_opciones5";
	// }

	// CONTROLADOR PREGUNTA 5

	// CONTROLADOR PREGUNTA 6

	// CONTROLADOR PREGUNTA 7

	// CONTROLADOR PREGUNTA 8

	// CONTROLADOR PREGUNTA 9

	// CONTROLADOR PREGUNTA 10
}
