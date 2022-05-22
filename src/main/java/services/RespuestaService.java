package services;

import entity.Respuesta;

public interface RespuestaService{
	
	Respuesta crearRespuesta(Respuesta respuesta);
	
	Respuesta buscarRespuesta(Long id_respuesta);
	
	Respuesta actualizarRespuesta(Respuesta respuesta);
	
	void borrarRespuesta(Long id_respuesta);

}
