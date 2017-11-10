/**
 * @(#)Socio.java
 *
 *
 * @author Alysson de Almeida Cordeiro
 * @version 1.00 2017/11/9
 */


public class Socio extends Matricula{
	private int socioId;
	private String cpf;
	private String nome;
	private Endereco endereco; //entender o gerenciamento
	private Calendar dataNasc;
	private Matricula matriculas[]; //entender o gerencimanto

    public Socio(int socioId, String cpf, String nome, Endeco endereco, Calendar dataNasc, Matricula matriculas[]){
    	this.socioId = socioId;
    	this.cpf = cpf;
    	this.nome = nome;
    	this.endereco = endereco;
    	this.dataNasc = dataNasc;
    	this.matriculas = matriculas;
    }
 
//gets e sets
	//---------
	public int getsocioId(){
		return this.socioId;
	}
	public void setsocioId(){
		this.socioId = socioId;
	}
	//---------
	public String getcpf(){
		return this.cpf;
	}
	public void setcpf(){
		this.cpf = cpf;
	}
	//---------
	public String getnome(){
		return this.nome;
	} 
	public void setnome(){
		this.nome = nome;
	}
	//---------
	public Endereco getendereco(){
		return this.endereco;
	}
	public void setendereco(){
		this.endereco = endereco;
	}
	public Calendar getdataNasc(){
		return this.dataNasc;
	}
	public void setdataNasc(){
		this.dataNasc = dataNasc;
	}
	public Matricula getmatriculas(){
		return this.matriculas;
	}
	public void setmatriculas(){
		this.matriculas = matriculas;
	}

//Métodos
    
}
