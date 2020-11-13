package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "cabinet", name = "consultation")
public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="motif", nullable=false, length = 255)
	private String motif;
		
	@Column(name="date_consultation",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date date_consultation;
	
	@OneToOne  
	@JoinColumn(name="id_patient")
	    private Patient patiens;

	public Consultation(int id, String motif, Date date_consultation, Patient patiens) {
		super();
		this.id = id;
		this.motif = motif;
		this.date_consultation = date_consultation;
		this.patiens = patiens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Date getDate_consultation() {
		return date_consultation;
	}

	public void setDate_consultation(Date date_consultation) {
		this.date_consultation = date_consultation;
	}

	public Patient getPatiens() {
		return patiens;
	}

	public void setPatiens(Patient patiens) {
		this.patiens = patiens;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	    
}
