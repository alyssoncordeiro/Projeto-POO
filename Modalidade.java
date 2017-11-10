/**
 * @(#)Modalidade.java
 *
 *
 * @author 
 * @version 1.00 2017/11/9
 */


public class Modalidade extends Matricula{
	private int modalidadeId;
	private String nome;
	private float preco;
	private int frequenciaSemanal;

    public Modalidade(int modalidadeId, String nome, float preco, int frequenciaSemanal){
    	this.modalidadeId = modalidadeId;
    	this.nome = nome;
    	this.preco = preco;
    	this.frequenciaSemanal = frequenciaSemanal;
    }
    
// gets e sets 
	//-----------
	public int getmodalidadeId(){
		return this.modalidadeId;
	}
	public void setmodalidadeId(){
		this.modalidadeId = modalidadeId;
	}
	//-----------
	public String getnome(){
		return this.nome;
	}
	public void setnome(){
		this.nome = nome;
	}
	//----------
	public float getpreco(){
		return this.preco;
	}
	public void setpreco(){
		this.preco = preco;
	}
	//----------
	public int getfrequenciaSemanal(){
		return frequenciaSemanal;
	}
	public void setfrequencaSemanal(){
		this.frequenciaSemanal = frequenciaSemanal;
	}
	
//Metodos
	public String toString() {
		return super.toString() + this.modalidadeId + " | " + this.nome + " | " + this.preco + " | " + this.frequenciaSemanal + " | ";
	}
	
//falta criar
//falta pesquisar
    
}