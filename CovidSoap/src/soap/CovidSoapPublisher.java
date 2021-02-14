package soap;

import javax.xml.ws.Endpoint;

public class CovidSoapPublisher {

	public static void main(String[] args) {
		Endpoint.publish("https://covidsoap.herokuapp.com:9999/covid/info", new CovidSoapImpl());
	}

}