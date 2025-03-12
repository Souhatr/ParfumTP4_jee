package metier.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "parfums")
public class Parfum  implements Serializable
{
	@Id
	@Column (name="id_parfum")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idParfum;
	@Column (name="Nom_parfum")
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