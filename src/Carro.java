import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Carro {
	
	Scanner tc = new Scanner(System.in);

	
	public String placa;
	public String tipo;
	public String modelo;
	public int ano;
	public String cor;
	public int km;
	public String chassi;
	public double v_Km;
	
	public void ler(){
		System.out.println("Informe a placa:");
		this.placa=tc.next();
		System.out.println("Informe o tipo do carro");
		this.tipo=tc.next();
		System.out.println("Informe o modelo:");
		this.modelo=tc.next();
		System.out.println("Informe o ano do carro:");
		this.ano=tc.nextInt();
		System.out.println("Informe o  KM:");
		this.km=tc.nextInt();
		System.out.println("Informe o chassi:");
		this.chassi=tc.next();
		System.out.println("Informe o valor do km rodado:");
		this.v_Km=tc.nextDouble();
	}
	
	public void mostrar(){
		System.out.println("Placa"+this.placa);
		System.out.println("Tipo"+this.tipo);
		System.out.println("Modelo"+this.modelo);
		System.out.println("Ano"+this.ano);
		System.out.println("KM"+this.km);
		System.out.println("Chassi"+this.chassi);
		System.out.println("Valor do km rodado"+this.v_Km);
	}
	
}
