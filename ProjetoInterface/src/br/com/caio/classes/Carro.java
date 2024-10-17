package br.com.caio.classes;

import br.com.caio.interfaces.Transporte;

public class Carro implements Transporte{
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("O carro esta se movendo pelas estradas.");
	}	
}