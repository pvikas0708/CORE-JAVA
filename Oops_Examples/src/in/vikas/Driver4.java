package in.vikas;

public class Driver4 {

	public static void main(String[] args) {
		Driver4 d = new Driver4();

		Product p = new Product();
		p.productId = 101;
		p.productName = "Book";
		p.productPrice = 300.00;

		d.print(p);

	}

	void print(Product p) {
		System.out.println(p.productId + "--" + p.productName + "--" + p.productPrice);
	}
}

class Product {
	int productId;
	String productName;
	Double productPrice;
}
