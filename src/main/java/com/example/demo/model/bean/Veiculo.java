package com.example.demo.model.bean;

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
public String ano_fabricacao;
public String cor;
public double litros;
public double km;
public double autonomia;

public long getId() {
	return id;
}
public double getLitros() {
	return litros;
}
public void setLitros(double litros) {
	this.litros = litros;
}
public double getKm() {
	return km;
}
public void setKm(double km) {
	this.km = km;
}
public double getAutonomia() {
	return autonomia;
}
public void setAutonomia(double autonomia) {
	this.autonomia = autonomia;
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
public String getAno_fabricacao() {
	return ano_fabricacao;
}
public void setAno_fabricacao(String ano_fabricacao) {
	this.ano_fabricacao = ano_fabricacao;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}

}
