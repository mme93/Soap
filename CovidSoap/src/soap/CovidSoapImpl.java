package soap;

import javax.jws.WebService;


//Service Implementation
@WebService(endpointInterface = "soap.CovidSoapInfo")
public class CovidSoapImpl implements CovidSoapInfo {

	@Override
	public String getHelloWorldAsString(String name) {
		
			
		return "Hello World JAX-WS " + name;
	}

	@Override
	public String getTotalInfection() {
		
		return "Ihr werdet alle sterben";
	}

}

