package ma.IIBDCC;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class BankingGenerateXMLSchema {

	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Releve.class);
		context.generateSchema(new SchemaOutputResolver() {
			@Override
			public Result createOutput(String s, String s1) throws IOException {
				File file = new File("banking.xsd");

				return new StreamResult(file);
			}
		});

	}
}
