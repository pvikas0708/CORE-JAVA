package in.vikas;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s);

		System.out.println(s.peek()); // for top element
		System.out.println(s.pop()); // remove top element and return that

		System.out.println(s);
	}

}
/*Output:
	[10, 20, 30]
			30
			30
			[10, 20]
*/
