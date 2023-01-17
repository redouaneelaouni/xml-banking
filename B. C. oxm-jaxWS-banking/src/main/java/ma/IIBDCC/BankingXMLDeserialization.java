package ma.IIBDCC;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class BankingXMLDeserialization {

	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(Releve.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));

		for (Operation operation : releve.getOperations().getOperations()) {
			System.out.println(operation);
		}
	}
}
