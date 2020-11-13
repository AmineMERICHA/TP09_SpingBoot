package dz.ibnrochd.master14.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "ligne_consultation")
public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "posologie", nullable = false, length = 255)
    private String posologie;

    @Column(name = "unite_temps", nullable = false, length = 255)
    private String unite_temps;
    
    @Column(name = "quantite", nullable = false, length = 255)
    private String quantites;

    @OneToOne  
	@JoinColumn(name="id_consultation")
	    private Consultation consultations;
    
    @OneToOne  
	@JoinColumn(name="id_traitement")
	    private Traitement traitements;

	public LigneConsultation(int id, String posologie, String unite_temps, String quantites, Consultation consultations,
			Traitement traitements) {
		super();
		this.id = id;
		this.posologie = posologie;
		this.unite_temps = unite_temps;
		this.quantites = quantites;
		this.consultations = consultations;
		this.traitements = traitements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosologie() {
		return posologie;
	}

	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}

	public String getUnite_temps() {
		return unite_temps;
	}

	public void setUnite_temps(String unite_temps) {
		this.unite_temps = unite_temps;
	}

	public String getQuantites() {
		return quantites;
	}

	public void setQuantites(String quantites) {
		this.quantites = quantites;
	}

	public Consultation getConsultations() {
		return consultations;
	}

	public void setConsultations(Consultation consultations) {
		this.consultations = consultations;
	}

	public Traitement getTraitements() {
		return traitements;
	}

	public void setTraitements(Traitement traitements) {
		this.traitements = traitements;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
               
}

