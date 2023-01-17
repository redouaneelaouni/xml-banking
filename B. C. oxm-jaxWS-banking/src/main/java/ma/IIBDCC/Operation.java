package ma.IIBDCC;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)

public class Operation {

	@XmlAttribute
	private Type type;
	@XmlAttribute
	private Double montant;
	@XmlAttribute
	private String description;
	@XmlAttribute
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)

	private LocalDate date;

	public Operation() {
	}

	public Operation(Type type, Double montant, String description, LocalDate date) {
		this.type = type;
		this.montant = montant;
		this.description = description;
		this.date = date;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Operation{" + "type=" + type + ", montant=" + montant + ", description='" + description + '\'' + ", date=" + date + '}';
	}
}
