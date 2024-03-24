package view;

import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("amos");
		p.setProfissao("developer");
		p.setDataNascimento(1850,01,24);
		
		
		
		System.out.println("o nome da pessoa é " + p.getNome() + " e a profissao é " + p.getProfissao() );
		p.getIdade();
	}

}
