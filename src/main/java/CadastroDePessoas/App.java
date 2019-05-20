package CadastroDePessoas;

public class App {
	
	public static void main(String[] args) {
		
		pFisica pessoa1 = new pFisica("Lucas Gafanhoto", "23432090675", "259372650");
		
		System.out.println ("id: " + pessoa1.getId() + ", nome: " + pessoa1.getNome() + ", RG: " + pessoa1.getRg() + ", CPF: " + pessoa1.getCpf());
		
		Juridica pessoaJuridica1 = new Juridica("Bruce Wayne", "4645434365746", 100);
		Juridica pessoaJuridica2 = new Juridica("Albert Hoffman", "64654344704", 450);
		
		pFisica pessoa2 = new pFisica("Enzo Gorlami", "324465452", "876543245");
		pFisica pessoa3 = new pFisica("Antonio Margarithi", "654376543333", "212256543569");

		pessoaJuridica1.adicionarSocio(pessoa1, 50);
		
		pessoaJuridica1.adicionarSocio(pessoa2, 20);
		
		pessoaJuridica1.adicionarSocio(pessoaJuridica2, 21);

		pessoaJuridica1.adicionarSocio(pessoaJuridica2, 90);
		
		pessoaJuridica1.removerSocio(pessoa3);
		
		
		
		
		
		
		
		
		
	}

}
