package br.com.caio.classes;

import br.com.caio.interfaces.Transporte;

public class Onibus implements Transporte {
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("O ônibus está se movendo pela rota urbana.");
	}
}
