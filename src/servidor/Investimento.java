package servidor;

public class Investimento {
	
	private double saldo;
	private double rendimento;
	private int tipo;
	
	public Investimento(double saldo, int tipo) {
		switch (tipo) {
		case 1:
			setSaldo(saldo);
			setRendimento(0.5);
			break;
		case 2:
			setSaldo(saldo);
			setRendimento(1.5);
			break;
		default:
			System.out.println("Tipo de conta invalido");
			break;
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

}
