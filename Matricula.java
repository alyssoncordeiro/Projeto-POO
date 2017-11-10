		/**
 * @(#)Matricula.java
 *
 *
 * @author Daniel Medeiros de Proença 
 * @version 1.00 2017/11/9
 */


public class Matricula {
	private int matriculaId;
	private Modalidade modalidade; //entender o gerenciamento
	private Calendar dataInicio;
	private Calendar dataTermino;

    public Matricula(int matriculaId, Modalidade modalidade, Calendar dataInicio, Calendar dataTermino) {
    	this.matriculaId = matriculaId;
    	this.modalidade = modalidade;
    	this.dataInicio = dataInicio;
    	this.dataTermino = dataTermino;
    }
    
//gets e sets
    //-----------
    public int getmatriculaId(){
    	return this.matriculaId;
    }
    public void setmatriculaId(){
    	this.matriculaId = matriculaId;
    }
    //-----------
    public Modalidade getmodalidade(){
    	return this.modalidade;
    }
    public void Modalidade setmodalidade(){
    	this.modalidade = modalidade;
    }
    //-----------
    public Calendar getdataInicio(){
    	return this.dataInicio;
    }
    public void setdataInicio(){
    	this.dataInicio = dataInicio;
    }
    //----------
    public Calendar getdataTermino(){
    	return this.dataTermino;
    }
    public void setdataTermo(){
    	this.dataTermino = dataTermino;
    }
    
//Métodos
	public String toString(){
		return this.matriculaId + " | " + this.modalidade + " | " + this.dataInicio + " | " + this.dataTermino + " | ";
	}
}