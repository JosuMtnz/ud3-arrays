package Solution;

public class ReportarTemperaturaAdapter extends CelciusReporter implements TemperatureInfo{
	
	public double getTemperature() {
		return temperatureInC;
	}
	
	public void setTemperature(double temperatureInC) {
		this.temperatureInC = temperatureInC;
	}
	
	@Override
	public double getTemperatureInF() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemperatureInF(double temperatureInF) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTemperatureInC() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemperatureInC(double temperatureInC) {
		// TODO Auto-generated method stub
		
	}

	
}
