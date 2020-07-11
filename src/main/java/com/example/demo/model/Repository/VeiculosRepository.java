package com.example.demo.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bean.Veiculo;



public interface VeiculosRepository  extends JpaRepository<Veiculo, Long>{

}
