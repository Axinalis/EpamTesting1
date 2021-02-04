package epamCourseTasks.Testing.firstTest.appliances;

public class productKettle extends product{
	// Kettle characteristics
	double	powerConsumption;
	String 	material;
	double 	heatTime;
	double 	capacity;

	public productKettle() {
		super();
		powerConsumption 	= 0;
		material			= "";
		heatTime 			= 0;
		capacity 			= 0;
	}

	public productKettle(String name, 
						double cost, 
						double powerConsumption, 
						String material, 
						double heatTime, 
						double capacity) {
		super(name, cost);
		this.powerConsumption 	= powerConsumption;
		this.material 			= material;
		this.heatTime 			= heatTime;
		this.capacity 			= capacity;
	}
	
	public void display() {
		System.out.print("��������: \t"+name+
						"\n���������: \t"+cost+
						"\n������-\n�����������: \t"+powerConsumption+
						"\n��������: \t"+material+
						"\n����� \n�������: \t"+heatTime+
						"\n�����������: \t"+capacity);
	}
	
	//����������� �������� �� ������ �������
	public void getDataFromString(String rawTextLine) {
		super.name 			= "Kettle";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		powerConsumption 	= Double.parseDouble(getValueFromString("POWER_CONSUMPTION", rawTextLine));
		material			= getValueFromString("MATERIAL", rawTextLine);
		heatTime 			= Double.parseDouble(getValueFromString("HEAT_TIME", rawTextLine));
		capacity			= Double.parseDouble(getValueFromString("CAPACITY", rawTextLine));
	}
	
	//�������, ���� ����� ������� �������� � ������
	public String getValueFromString(String valueName, String rawTextLine) {
		int valueIndex = rawTextLine.indexOf(valueName);
		
		return rawTextLine.substring(	valueIndex + valueName.length() + 1,
										rawTextLine.indexOf(",", valueIndex));
	}
}
