package com.example.demo.model;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {
	
	public void setRegistro(Usuario nuevo) {
		Registro.setElemento(nuevo);
	}
	
	public ArrayList<Usuario> getRegistro() {
		return Registro.getElemento();
	}

}
