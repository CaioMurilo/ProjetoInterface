package br.com.caio.principal;

import br.com.caio.classes.Carro;
import br.com.caio.classes.Bicicleta;
import br.com.caio.classes.Onibus;
import br.com.caio.interfaces.Transporte;

public class SistemaTransporte {
	public static void main(String[] args) {
        //polimorfismo
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();
        Transporte onibus = new Onibus();

        //todos os transportes chamam o metodo mover()
        carro.mover();
        bicicleta.mover();
        onibus.mover();
    }
}
