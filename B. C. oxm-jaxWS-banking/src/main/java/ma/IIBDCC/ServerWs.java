package ma.IIBDCC;

import jakarta.xml.ws.Endpoint;

public class ServerWs {

	public static void main(String[] args) {
		String address = "http://0.0.0.0:9191/";
		Endpoint.publish(address,new ReleveService());
		System.out.println("Server Deployed at : " +address);
	}
}
