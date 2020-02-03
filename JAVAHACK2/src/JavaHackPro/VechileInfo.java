package JavaHackPro;

public class VechileInfo implements Comparable<VechileInfo> {
	private	int number ;
	private String model;
	private	int  minutes;

	public VechileInfo(int carNum, String carModel, int Time) {
		this. number =carNum;
		this.model=carModel;
		this. minutes=Time;	
}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	@Override
	public String toString() {
		return "Student [ carNum= " + number + ", carModel = " + model + ",  Time= " + minutes+ "]";}
	@Override
	public int compareTo(VechileInfo vi) {
		if(this.getMinutes()>vi.getMinutes())
			return 1;
		return 0;
	}
}