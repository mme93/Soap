package soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CovidSoapClient {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://localhost:9999/ws/hello?wsdl");
			// 1st argument service URI, refer to wsdl document above
			// 2nd argument is service name, refer to wsdl document above
			QName qname = new QName("http://soap/", "CovidSoapImplService");

			Service service = Service.create(url, qname);

			CovidSoapInfo info = service.getPort(CovidSoapInfo.class);

			System.out.println(info.getHelloWorldAsString("mkyong"));
			System.err.println(info.getTotalInfection());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
