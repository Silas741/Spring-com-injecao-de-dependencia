package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Repository.VeiculosRepository;
import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.utils.Calculadora;

@Service
public class VeiculoService {

	@Autowired
	private VeiculosRepository VeiculoRepo;
	@Autowired
	private Calculadora calculadora;
	public void salvar (Veiculo veiculo) {
		VeiculoRepo.save(veiculo);
	}
	public List<Veiculo>ListarTodos(){
		List<Veiculo> lista = VeiculoRepo.findAll();
		for (Veiculo veiculo : lista) {
			veiculo.setAutonomia(calculadora.calculaTanque(veiculo.getKm(),veiculo.getLitros()));
		}
		return lista;
	}
}
