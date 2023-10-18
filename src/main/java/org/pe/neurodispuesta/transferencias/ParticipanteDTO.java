package org.pe.neurodispuesta.transferencias;

import java.util.Date;

import lombok.Data;

@Data
public class ParticipanteDTO {
	private int participanteId;
	private String nmbrs;
	private String apllds;
	private String dni;
	private String correoE;
	private String telf;
	private Date fechaRegistro;
	private int cuidadorId;
}