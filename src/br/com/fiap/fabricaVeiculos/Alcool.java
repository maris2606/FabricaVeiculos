package br.com.fiap.fabricaVeiculos;

public class Alcool implements Combustivel{

    @Override
    public double abastecer(double qtd) {
        return 7.5*qtd;
    }
    
}
