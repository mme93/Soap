package soap;

import javax.jws.WebService;

import org.json.JSONObject;

import covidInfo.CalculateCovidNumber;
import covidInfo.JHU;
import covidInfo.RKI;

//Service Implementation
@WebService(endpointInterface = "soap.CovidSoapInfo")
public class CovidSoapImpl implements CovidSoapInfo {
	CalculateCovidNumber calculateCovidNumber;

	public CovidSoapImpl() {
		super();
		calculateCovidNumber = new CalculateCovidNumber(new RKI().getRKICovidInfo(), new JHU().getJHUCovidInfo());
	}

	@Override
	public String getNewInfectionsLastDayJHU() {
		return new JSONObject().put("Wert", calculateCovidNumber.getRWerthTotalGermanyRKI()).toString();
	}

	@Override
	public String getTotalInfectionsJHU(int rWerth) {
		return new JSONObject().put("Wert", calculateCovidNumber.getTotalTargetInfectionRKI(rWerth)).toString();
	}

	@Override
	public String getIncreaseLasteDayJHU() {
		return new JSONObject().put("Wert", calculateCovidNumber.getTargetIncidenceForRWerthRKI(50,
				calculateCovidNumber.getTotalTargetInfectionRKI(50), 7)).toString();
	}

	@Override
	public String getAverageIncreaseDayJHU(int days) {
		return new JSONObject().put("Wert", calculateCovidNumber.getAverageIncreaseDayJHU(days)).toString();
	}

	@Override
	public String getRWerthTotalGermanyRKI() {
		return new JSONObject().put("Wert", calculateCovidNumber.getIncreaseLasteDayJHU()).toString();
	}

	@Override
	public String getTotalTargetInfectionRKI(double rZiel) {
		return new JSONObject().put("Wert", calculateCovidNumber.getTotalInfectionsJHU()).toString();
	}

	@Override
	public String getTargetIncidenceForRWerthRKI(double rZiel, double totalTargetInfection, int nDay) {
		return new JSONObject().put("Wert", calculateCovidNumber.getNewInfectionsLastDayJHU()).toString();
	}

}
