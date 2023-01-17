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

		ReleveService releveService = new ReleveService();
		Releve releve = releveService.getReleve();

		marshaller.marshal(releve,System.out);
		marshaller.marshal(releve,new File("releve.xml"));

	}

}
