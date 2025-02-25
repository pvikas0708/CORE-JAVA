package in.vikas.exception;

public class Throwsdemo {

	public String getName(int id) throws Exception {
		if (id == 100) {
			return "raju";
		} else if (id == 101) {
			return "rani";
		} else {
			throw new Exception("Invalid Id");
		}
	}

	public static void main(String[] args) throws Exception {
		Throwsdemo d = new Throwsdemo();

		String name = d.getName(101);
		System.out.println(name);

		String name1 = d.getName(200);
		System.out.println(name1);
	}

}
