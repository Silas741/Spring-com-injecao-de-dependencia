package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.service.VeiculoService;

@Controller
public class VeiculosController {

	//@Autowired
	//private VeiculosRepository veiculosRepo;
	@Autowired
	private VeiculoService veiculoService;
	@GetMapping("/veiculos")
	public ModelAndView listarVeiculos() {
		ModelAndView mv = new ModelAndView("Lista_Veiculos");
		java.util.List<Veiculo> veiculos = veiculoService.ListarTodos();
		mv.addObject(new Veiculo());
		mv.addObject("veiculos", veiculos);

		return mv;
	}

	@PostMapping("/veiculos")
	public String salvar(Veiculo veiculo) {
		veiculoService.salvar(veiculo);
		return "redirect:/veiculos";
	}
}
