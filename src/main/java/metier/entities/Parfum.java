package metier.entities;

import java.io.Serializable;
public class Parfum  implements Serializable
{
	private Long idParfum;
	private String nomParfum;
	private String marque;
	private double prix;
	public Parfum() 
	{
		super();
	}
	public Parfum(String nomParfum, String marque,double prix) 
	{
		super();
		this.nomParfum=nomParfum;
		this.marque=marque;
		this.prix = prix;
	}
	public Long getIdParfum() {
		return idParfum;
	}
	public void setIdParfum(Long idParfum) {
		this.idParfum = idParfum;
	}
	public String getNomParfum() {
		return nomParfum;
	}
	public void setNomParfum(String nomParfum) {
		this.nomParfum = nomParfum;
	}
	public String getMarque() {
		return marque;
	}
	@Override
	public String toString() {
		return "Parfum [idParfum=" + idParfum + ", nomParfum=" + nomParfum + ", marque=" + marque + ", prix=" + prix
				+ "]";
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}