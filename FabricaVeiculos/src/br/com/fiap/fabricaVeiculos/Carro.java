package br.com.fiap.fabricaVeiculos;

public class Carro extends Veiculo {

	protected double capacidadeDeRodagem;

	public Carro(String marca, String modelo, String cor, String anofabrica, String anoModelo, String renavam,
			Motor motor, String tipocambio, String arosRodas, double velocidade, Condutor condutor) {
		super(marca, modelo, cor, anofabrica, anoModelo, renavam, motor, tipocambio, arosRodas, velocidade, condutor);
	}

	public void abastecimento(Combustivel combustivel, double qtd) {
		if (this.capacidadeDoTanque + qtd <= 50) {

			this.capacidadeDeRodagem += combustivel.abastecer(qtd);
			this.capacidadeDoTanque += qtd;
		} else {
			this.capacidadeDeRodagem += combustivel.abastecer(50 - this.capacidadeDoTanque);
			this.capacidadeDoTanque = 50.00;
		}

	}

	public void exibirInformacoes() {
		System.out.println("Modelo do carro: " + this.modelo);
		System.out.println("Marca do carro: " + this.marca);
		System.out.println("Cor do carro: " + this.cor);
		System.out.println("Renavam: " + this.renavam);
		System.out.println("Capacidade do tanque: " + this.capacidadeDoTanque);
		System.out.println("Capacidade de rodagem: " + this.capacidadeDeRodagem);
		System.out.println("Condutor do carro: " + this.condutor.getNome());
		System.out.println();
	}
	
	public void acelerar(double ace, int tempo, int limite) {
		if (this.ligado) {
			if (ace <= limite) {
				this.velocidade += ace * tempo;
				System.out.println("velocidade é" + this.velocidade);
			} else
				System.out.println("Aceleracao passada é maior que o limite suportado");
		}

		else
			System.out.println("Deligue o carrito");

	}

	public void ligar() {
		this.ligado = true;

	}

	public void desligar() {
		if (this.velocidade == 0)
			this.ligado = false;

	}

	public void frear(double v) {
		if (this.velocidade > 0 && this.ligado == true) {
			System.out.println("Carro freando");
			if (this.velocidade >= v)
				this.velocidade -= v;
			else {
				System.out.println("Impossível frear mais, carro parado");
				this.velocidade = 0;

			}

		} else
			System.out.println("carro parado, n da para acelerar");

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnofabrica() {
		return anofabrica;
	}

	public void setAnofabrica(String anofabrica) {
		this.anofabrica = anofabrica;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getTipocambio() {
		return tipocambio;
	}

	public void setTipocambio(String tipocambio) {
		this.tipocambio = tipocambio;
	}

	public String getArosRodas() {
		return arosRodas;
	}

	public void setArosRodas(String arosRodas) {
		this.arosRodas = arosRodas;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	@Override
	public String toString() {
		return "Carro [capacidadeDeRodagem=" + capacidadeDeRodagem + ", marca=" + marca + ", modelo=" + modelo
				+ ", cor=" + cor + ", anofabrica=" + anofabrica + ", anoModelo=" + anoModelo + ", renavam=" + renavam
				+ ", motor=" + motor + ", tipocambio=" + tipocambio + ", arosRodas=" + arosRodas + ", velocidade="
				+ velocidade + ", condutor=" + condutor.getNome() + ", ligado=" + ligado + ", capacidadeDoTanque="
				+ capacidadeDoTanque + "]";
	}

}
