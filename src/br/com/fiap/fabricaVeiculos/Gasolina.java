package br.com.fiap.fabricaVeiculos;

public class Gasolina implements Combustivel{

    @Override
    public double abastecer(double qtd) {
        
        return 10.00*qtd;
       
    }
    
}
