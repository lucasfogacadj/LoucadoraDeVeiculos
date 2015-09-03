
public class Aluguel {
	

	public Carro carro1;
	public Cliente cliente1;
	public int notaFiscal;
	
	public void alocar(){
		
		carro1 = new Carro();
		carro1.ler();
		
		cliente1 = new Cliente();
		cliente1.ler();
		
		System.out.println("");
		
		carro1.mostrar();
		cliente1.mostrar();
		
		
	}
	
	

}
