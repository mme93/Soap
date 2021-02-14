package soap;



import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface CovidSoapInfo {

	@WebMethod
	public String getNewInfectionsLastDayJHU();

	@WebMethod
	public String getTotalInfectionsJHU(int rWerth);

	@WebMethod
	public String getIncreaseLasteDayJHU();

	@WebMethod
	public String getAverageIncreaseDayJHU(int days);

	@WebMethod
	private String getNewInfectionAtThisDay(int dayIndex) {
		return null;
	}

	@WebMethod
	public String getRWerthTotalGermanyRKI();

	@WebMethod
	public String getTotalTargetInfectionRKI(double rZiel);

	@WebMethod
	public String getTargetIncidenceForRWerthRKI(double rZiel, double totalTargetInfection, int nDay);

	@WebMethod
	private String getNDay(int nDay) {
		return null;
	}

}