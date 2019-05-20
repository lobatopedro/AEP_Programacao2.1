package CadastroDePessoas;

import java.util.UUID;

public class pFisica extends Pessoa {
	
	private String cpf;
	private String rg;
	
	
	public pFisica(String nome, String cpf, String rg) {
		super(nome);
		
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public pFisica(UUID id, String nome, String cpf, String rg) {
		super(id, nome);
		
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
}