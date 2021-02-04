package epamCourseTasks.Testing.firstTest.appliances;

public class productIron extends product{
	// Iron characteristics
	double	powerConsumption;
	double 	maxTemperature;
	double 	wireLenght;
	String 	material;
	double 	heatTime;

	public productIron() {
		super();
		powerConsumption 	= 0;
		maxTemperature		= 0;
		wireLenght 			= 0;
		material 			= "";
		heatTime 			= 0;
	}

	public productIron(String name, 
						double cost, 
						double powerConsumption, 
						double maxTemperature, 
						double wireLenght, 
						String material,
						double cordLenght) {
		super(name, cost);
		this.powerConsumption 	= powerConsumption;
		this.maxTemperature 	= maxTemperature;
		this.wireLenght 		= wireLenght;
		this.material 			= material;
		this.heatTime 			= cordLenght;
	}
	
	public void display() {
		System.out.print("��������: \t"+name+
						"\n���������: \t"+cost+
						"\n������-\n�����������: \t"+powerConsumption+
						"\n������������ \n�����������: \t"+maxTemperature+
						"\n����� \n�������: \t"+wireLenght+
						"\n��������: \t"+material+
						"\n����� \n�������: \t"+heatTime);
	}
	
	//����������� �������� �� ������ �������
	public void getDataFromString(String rawTextLine) {
		super.name 			= "Iron";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		powerConsumption 	= Double.parseDouble(getValueFromString("POWER_CONSUMPTION", rawTextLine));
		maxTemperature		= Double.parseDouble(getValueFromString("MAX_TEMPERATURE", rawTextLine));
		wireLenght 			= Double.parseDouble(getValueFromString("WIRE_LENGHT", rawTextLine));
		material			= getValueFromString("MATERIAL", rawTextLine);
		heatTime			= Double.parseDouble(getValueFromString("HEAT_TIME", rawTextLine));
	}
	
	//�������, ���� ����� ������� �������� � ������
	public String getValueFromString(String valueName, String rawTextLine) {
		int valueIndex = rawTextLine.indexOf(valueName);
		
		return rawTextLine.substring(	valueIndex + valueName.length() + 1,
										rawTextLine.indexOf(",", valueIndex));
	}
}
