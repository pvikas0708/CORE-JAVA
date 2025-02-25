package in.vikas;

public class Enum_Demo {

	enum WEEKDAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
	}

	enum WEEKENDDAYS {
		SATURDAY, SUNDAY;
	}

	public static void main(String[] args) throws Exception {

		Enum_Course[] values = Enum_Course.values();

		for (Enum_Course c : values) {
			System.out.println(c);
		}
		
		//For perticular value
		Enum_Course devops = Enum_Course.DevOps;
		
		System.out.println(devops);
	}

}
/*Output:
	Java
	DevOps
	Paython
	AWS
*/