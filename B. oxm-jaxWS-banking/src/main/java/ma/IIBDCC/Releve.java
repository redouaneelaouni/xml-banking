package ma.IIBDCC;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDate;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {

	@XmlAttribute(name = "RIB  ")
	private String RIB;
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateReleve;
	private Double solde;

	public Releve(String RIB, LocalDate dateReleve, Double solde, Operations operations) {
		this.RIB = RIB;
		this.dateReleve = dateReleve;
		this.solde = solde;
		this.operations = operations;
	}

	private Operations operations;

	public Releve() {
	}

	public Double getSolde() {
		return solde;
	}

	public String getRIB() {
		return RIB;
	}

	public void setRIB(String RIB) {
		this.RIB = RIB;
	}

	public LocalDate getDateReleve() {
		return dateReleve;
	}

	public void setDateReleve(LocalDate dateReleve) {
		this.dateReleve = dateReleve;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Operations getOperations() {
		return operations;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}
}
