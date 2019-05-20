package CadastroDePessoas;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Juridica extends Pessoa {
	
	private String cnpj;
	private double capitalSocial;
	private Set<CotaSociedade> cotasSociedade = new HashSet<CotaSociedade>();
	
	public Juridica(String nome, String cnpj, double capitalSocial) {
		super(nome);
		
		this.capitalSocial = capitalSocial;
		this.cnpj = cnpj;
	}
	
	public Juridica(UUID id, String nome, String cnpj, double capitalSocial) {
		super(id, nome);
		
		this.capitalSocial = capitalSocial;
		this.cnpj = cnpj;
	}
	
	public double getCapitalSocial() {
		return capitalSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	public void adicionarSocio(Pessoa socio, double percentualParticipacao) {
		
		if (socio.id != this.id) {
			
			cotasSociedade.add
			(new CotaSociedade(socio, percentualParticipacao));
		} else {
			
			System.out.println(" Não é possível ser sócio de você mesmo");
		}
	}
	
	public void removerSocio(Pessoa socio) {
		
		boolean check = false;
		for (CotaSociedade cota : cotasSociedade) {
			
			if(cota.socio == socio) {
				
				cotasSociedade.remove(cota);
				check = true;
			}		
		}
		
		if (!check) {
			
			System.out.println(socio.getNome() + " Não é um sócio");
		}
		
	}
	
	
	private class CotaSociedade{
		
		private double percentualPartic;
		private Pessoa socio;
		
		public CotaSociedade(Pessoa socio, double percentualParticipacao) {
			
			this.percentualPartic = percentualParticipacao;
			this.socio = socio;
		}
	}
}