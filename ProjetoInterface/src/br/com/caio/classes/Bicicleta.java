package br.com.caio.classes;

import br.com.caio.interfaces.Transporte;

public class Bicicleta implements Transporte {
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("A bicicleta está sendo pedalada.");
	}
}
