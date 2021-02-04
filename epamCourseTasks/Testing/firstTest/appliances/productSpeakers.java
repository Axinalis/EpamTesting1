package epamCourseTasks.Testing.firstTest.appliances;

public class productSpeakers extends product {
	// Speakers characteristics
	double	powerConsumption;
	double 	numberOfSpeakers;
	double 	minFrequency;
	double 	maxFrequency;
	double 	cordLenght;

	public productSpeakers() {
		super();
		powerConsumption 	= 0;
		numberOfSpeakers	= 0;
		minFrequency 		= 0;
		maxFrequency 		= 0;
		cordLenght 			= 0;
	}

	public productSpeakers(String name, 
						double cost, 
						double powerConsumption, 
						double numberOfSpeakers, 
						double minFrequency, 
						double maxFrequency,
						double cordLenght) {
		super(name, cost);
		this.powerConsumption 	= powerConsumption;
		this.numberOfSpeakers 	= numberOfSpeakers;
		this.minFrequency 		= minFrequency;
		this.maxFrequency 		= maxFrequency;
		this.cordLenght 		= cordLenght;
	}
	
	public void display() {
		System.out.print("��������: \t"+name+
						"\n���������: \t"+cost+
						"\n������-\n�����������: \t"+powerConsumption+
						"\n���������� \n���������: \t"+numberOfSpeakers+
						"\n������� ��: \t"+minFrequency+
						"\n� ��: \t"+maxFrequency+
						"\n����� \n�������: \t"+cordLenght);
	}
	
//����������� �������� �� ������ �������
	public void getDataFromString(String rawTextLine) {
		String buffer;
		super.name 			= "Speakers";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		powerConsumption 	= Double.parseDouble(getValueFromString("POWER_CONSUMPTION", rawTextLine));
		numberOfSpeakers	= Double.parseDouble(getValueFromString("NUMBER_OF_SPEAKERS", rawTextLine));
		buffer				= getValueFromString("FREQUENCY_RANGE", rawTextLine);
		minFrequency 		= Double.parseDouble(buffer.substring(0, buffer.indexOf('-')));
		maxFrequency 		= Double.parseDouble(buffer.substring(buffer.indexOf('-') + 1));
		cordLenght			= Double.parseDouble(getValueFromString("CORD_LENGTH", rawTextLine));
	}
		
	//�������, ���� ����� ������� �������� � ������
	public String getValueFromString(String valueName, String rawTextLine) {
		int valueIndex = rawTextLine.indexOf(valueName);
		
		return rawTextLine.substring(	valueIndex + valueName.length() + 1,
										rawTextLine.indexOf(",", valueIndex));
	}
}
