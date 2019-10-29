package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.*;

//@Controller
//@RequestMapping("/ths/nuevo")
public class RegListController {
	
	/*@Autowired
	private RegistroService miRegistro;
	
	@GetMapping("")
	public ModelAndView lista() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("listUsuarios", miRegistro.getRegistro());
	    mav.addObject("miNombre", "Junior");
	    mav.setViewName("ths/nuevo/registrolista");
	    return mav;
	}
	@GetMapping("/registrolista")
	public String nuevo(Model modelo) {
		modelo.addAttribute("nusuario", new Usuario());
		return "ths/nuevo/registrolista";
	}

	@PostMapping("/crear")
	public String cargar(Usuario nusuario, Model m) {
		miRegistro.setRegistro(nusuario);
		m.addAttribute("usuario",nusuario);
		return "ths/nuevo/registrolista";
	}
	@PostMapping("/creado")
	public String creado(@RequestParam("nusuario")Usuario usuario) {
		return "ths/nuevo/creado";
	}*/
	
}