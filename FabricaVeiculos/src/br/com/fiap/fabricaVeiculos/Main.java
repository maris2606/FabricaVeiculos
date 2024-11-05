package br.com.fiap.fabricaVeiculos;

public class Main {

	public static void main(String[] args) {

		// instanciando Condutor
		Condutor condutor1 = new Condutor("Emerson", "1112223334-3", "991234567", "10/10/1990");
		Condutor condutor2 = new Condutor("Adriane Colossetti", "4445556667-4", "987886544", "08/08/1995");
		Condutor condutor3 = new Condutor("Joao da Silva ", "8889990102-3", "975443312", "17/08/1993");

		// instanciando Motor
		Motor motor1 = new Motor("A jato", 70);
		Motor motor2 = new Motor("A jato", 70);
		Motor motor3 = new Motor("Estacionário", 400);

		// instanciando Carro
		Carro carro1 = new Carro("Toyota", "Corolla", "Preto", "01/01/2022", "01/01/2023", "1234567890", motor1,
				"Automático", "17.0", 200, condutor1);
		Carro carro2 = new Carro("Renault", "Kwid", "Branco", "01/01/2020", "01/01/2023", "1234567908", motor2,
				"Manual", "17.0", 190, condutor2);

		// instanciando Combustiveis
		Alcool alcool = new Alcool();
		Gasolina gasolina = new Gasolina();

		// CARROS:
		System.out.println("\tCarro 1 antes do abastecimento:\n");
		carro1.exibirInformacoes();

		// abastecendo carro 1
		carro1.abastecimento(alcool, 20);
		carro1.abastecimento(gasolina, 29);

		System.out.println("\tCarro 1 depois do abastecimento:\n");
		carro1.exibirInformacoes();

		System.out.println("-----------------------------------------------");
		System.out.println("\tCarro 2 antes do abastecimento:\n");
		carro2.exibirInformacoes();

		// abastecendo carro 2
		carro2.abastecimento(gasolina, 15);
		carro2.abastecimento(alcool, 50);

		System.out.println("\tCarro 2 depois do abastecimento:\n");
		carro2.exibirInformacoes();

		// CAMINHÃO:
		// instanciando Carga
		Carga carga1 = new Carga(100, 0, "Granel");

		// instanciando Caminhao
		Caminhao caminhao1 = new Caminhao("Mercedes-Benz", "Actros", "Branco", "2020", "2021", "123456789-1", motor3,
				"Automático", "22.5", 90.0, condutor3, carga1, 4);
		
		System.out.println("-----------------------------------------------");
		// informacoes do caminhao
		System.out.println("\tInformacoes do caminhao:\n");
		caminhao1.exibirInformacoes();
	}

}
