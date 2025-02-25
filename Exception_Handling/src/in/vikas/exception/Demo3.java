package in.vikas.exception;

public class Demo3 {

	private String getName(int id) {
		if (id == 100) {
			System.out.println("hello");
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else {
			throw new NoDataFoundException("Invalid Id");
		}
	}

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.getName(100);
	}

}
