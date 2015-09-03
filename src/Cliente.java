import java.util.Scanner;

public class Cliente {
	Scanner tc = new Scanner(System.in);

	public String nome;
	public String cpf;
	public String endereco;
	
	public void ler(){
		System.out.println("Informe o nome do Cliente:");
		this.nome=tc.next();
		System.out.println("Informe o CPF:");
		this.cpf=tc.next();
		System.out.println("Inform o endereço:");
		this.endereco=tc.next();
	}
	
	public void mostrar(){
		System.out.println("Nome do cliente:"+this.nome);
		System.out.println("CPF"+this.cpf);
		System.out.println("Endereço"+this.endereco);
		
	}

}
