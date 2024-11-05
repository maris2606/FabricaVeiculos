package br.com.fiap.fabricaVeiculos;

public class Veiculo {

	protected String marca;
	protected String modelo;
	protected String cor;
	protected String anofabrica;
	protected String anoModelo;
	protected String renavam;
	protected Motor motor;
	protected String tipocambio;
	protected String arosRodas;
	protected double velocidade;
	protected Condutor condutor;
	protected boolean ligado = false;
	protected double capacidadeDoTanque = 0;

	public Veiculo(String marca, String modelo, String cor, String anofabrica, String anoModelo, String renavam,
			Motor motor, String tipocambio, String arosRodas, double velocidade, Condutor condutor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anofabrica = anofabrica;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.tipocambio = tipocambio;
		this.arosRodas = arosRodas;
		this.velocidade = velocidade;
		this.condutor = condutor;
	}

	public void abastecer(Combustivel combustivel, double qtd) {

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
	
}
