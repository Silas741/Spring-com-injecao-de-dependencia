package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
@Id
@GeneratedValue
private long id;
public String modelo;
public String marca;
public int ano_fabricacao;
public String cor;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getAno_fabricacao() {
	return ano_fabricacao;
}
public void setAno_fabricacao(int ano_fabricacao) {
	this.ano_fabricacao = ano_fabricacao;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}

}
