package model;

import java.time.LocalDate;

public class Pessoa {
private String nome; 
private LocalDate dataNascimento  ; 	
private String profissao ; 	
	public Pessoa() {
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento( int ano, int mes, int dia) {
	    this.dataNascimento = LocalDate.of(ano, mes, dia);
	}

	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void getIdade() {
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int idade = anoAtual - dataNascimento.getYear();

        // Verifica se a idade é maior ou igual a 150 anos
        if (idade >= 150) {
            System.out.println("Este ser vivente não está mais entre nós.");
        } else {
            System.out.println("A idade da pessoa é " + idade + " anos.");
        }
    }
}
