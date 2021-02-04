package epamCourseTasks.Testing.firstTest.appliances;

public class productVacuumCleaner extends product {
	// VacuumCleaner characteristics
	double	powerConsumption;
	String 	filterType;
	String 	bagType;
	String  wandType;
	double 	motorSpeed;
	double	cleaningWidth;

	public productVacuumCleaner() {
		super();
		powerConsumption 	= 0;
		filterType			= "";
		bagType 			= "";
		wandType 			= "";
		motorSpeed 			= 0;
		cleaningWidth		= 0;
	}

	public productVacuumCleaner(String name, 
						double cost, 
						double powerConsumption, 
						String filterType, 
						String bagType, 
						String wandType,
						double motorSpeed,
						double cleaningWidth) {
		super(name, cost);
		this.powerConsumption 	= powerConsumption;
		this.filterType 		= filterType;
		this.bagType 			= bagType;
		this.wandType 			= wandType;
		this.motorSpeed 		= motorSpeed;	
		this.cleaningWidth		= cleaningWidth;
	}
	
	public void display() {
		System.out.print("��������: \t"+name+
						"\n���������: \t"+cost+
						"\n������-\n�����������: \t"+powerConsumption+
						"\n��� �������: \t"+filterType+
						"\n��� �����: \t"+bagType+
						"\n��� \n���������: \t"+wandType+
						"\n�������� \n������: \t"+motorSpeed+
						"\n������ \n������� \n������: \t"+cleaningWidth);
	}
	
//����������� �������� �� ������ �������
	public void getDataFromString(String rawTextLine) {
		super.name 			= "VacuumCleaner";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		powerConsumption 	= Double.parseDouble(getValueFromString("POWER_CONSUMPTION", rawTextLine));
		filterType			= getValueFromString("FILTER_TYPE", rawTextLine);
		bagType				= getValueFromString("BAG_TYPE", rawTextLine);
		wandType			= getValueFromString("WAND_TYPE", rawTextLine);
		motorSpeed 			= Double.parseDouble(getValueFromString("MOTOR_SPEED_REGULATION", rawTextLine));
		cleaningWidth 		= Double.parseDouble(getValueFromString("CLEANING_WIDTH", rawTextLine));
	}
	
	//�������, ���� ����� ������� �������� � ������
	public String getValueFromString(String valueName, String rawTextLine) {
		int valueIndex = rawTextLine.indexOf(valueName);
		
		return rawTextLine.substring(	valueIndex + valueName.length() + 1,
										rawTextLine.indexOf(",", valueIndex));
	}
}
