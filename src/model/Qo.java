package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Qo extends Question implements Serializable{
	
	public Qo(String enonce) {
		super(enonce);
		// TODO Auto-generated constructor stub
	}
	private ArrayList<String> bonneReponsesPropos�;
	private String reponse;
	
	
	public float evaluer()
	{
		/**
		 * la redifinition que on doit devlopper selon 
		 * la notation d'une Question ouverte donn�e 
		 * dans le livrable
		 */
		if (bonneReponsesPropos�.contains(reponse))return 1;
		return 0;
	}
	public ArrayList<String> getBonneReponsesPropos�() {
		return bonneReponsesPropos�;
	}
	public void setBonneReponsesPropos�(ArrayList<String> bonneReponsesPropos�) {
		this.bonneReponsesPropos� = bonneReponsesPropos�;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public void ajoutProposition(String propo) {
		/**
		 * ajouter une propostion au tableau de propos 
		 */
		this.bonneReponsesPropos�.add(propo);
	}
	public void repondre(String rep) {
		// TODO Auto-generated method stub
		this.reponse=rep;
	}

	
}
