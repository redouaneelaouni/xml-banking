package ma.IIBDCC;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@WebService(name = "ReleveWS")
public class ReleveService {

	@WebMethod(operationName = "getReleve")
	public Releve getReleve(){

		List<Operation> operationList = List.of(
				new Operation(Type.CREDIT,10000.0,"encaissement de la part de Mohamed", LocalDate.of(2022, Month.FEBRUARY,1)),
				new Operation(Type.CREDIT,15000.0,"Salaire recu",LocalDate.of(2022, Month.MARCH,1)),
				new Operation(Type.DEBIT,1000.0,"Facture payée",LocalDate.of(2022, Month.APRIL,1)),
				new Operation(Type.DEBIT,1000.0,"Cotisation CNSS",LocalDate.of(2022, Month.AUGUST,1))
		);

		Operations operations = new Operations(LocalDate.of(2022, Month.JANUARY,1),LocalDate.of(2022, Month.DECEMBER,31),operationList);

		return new Releve("112233445566778899001122",LocalDate.now(),23000.00,operations);
	}
}
