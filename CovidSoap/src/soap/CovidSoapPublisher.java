package soap;

import javax.xml.ws.Endpoint;

public class CovidSoapPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new CovidSoapImpl());
	}

}