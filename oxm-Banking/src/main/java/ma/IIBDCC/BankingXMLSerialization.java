package ma.IIBDCC;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BankingXMLSerialization {

	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Releve.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

		List<Operation> operationList = List.of(
				new Operation(Type.CREDIT,10000.0,"encaissement de la part de Mohamed", LocalDate.of(2022, Month.FEBRUARY,1)),
				new Operation(Type.CREDIT,15000.0,"Salaire recu",LocalDate.of(2022, Month.MARCH,1)),
				new Operation(Type.DEBIT,1000.0,"Facture payée",LocalDate.of(2022, Month.APRIL,1)),
				new Operation(Type.DEBIT,1000.0,"Cotisation CNSS",LocalDate.of(2022, Month.AUGUST,1))
		);

		Operations operations = new Operations(LocalDate.of(2022, Month.JANUARY,1),LocalDate.of(2022, Month.DECEMBER,31),operationList);

		Releve releve = new Releve("112233445566778899001122",LocalDate.now(),23000.00,operations);

		marshaller.marshal(releve,System.out);
		marshaller.marshal(releve,new File("releve.xml"));

	}
}
