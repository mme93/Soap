package soap;


import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class CovidSoapPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/covid", new CovidSoapImpl());
	}

}