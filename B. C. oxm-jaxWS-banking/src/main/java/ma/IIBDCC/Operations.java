package ma.IIBDCC;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {

	@XmlAttribute
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)

	private LocalDate dateDebut;
	@XmlAttribute
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)

	private LocalDate dateFin;

	@XmlElement(name = "operation")
	private List<Operation> operations = new ArrayList<>();

	public Operations() {
	}

	public Operations(LocalDate dateDebut, LocalDate dateFin, List<Operation> operations) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.operations = operations;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
}
