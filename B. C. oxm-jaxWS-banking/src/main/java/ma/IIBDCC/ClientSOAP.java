package ma.IIBDCC;

import proxy.ReleveServiceService;
import proxy.ReleveWS;

public class ClientSOAP {

	public static void main(String[] args) {

		ReleveWS stub =  new ReleveServiceService().getReleveWSPort();

		System.out.println(stub.getReleve());

	}
}
