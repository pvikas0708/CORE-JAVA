package in.vikas;

public class User_Demo_ThreadDetails extends Thread {

	public static void main(String[] args) {

		Thread currentThread = Thread.currentThread();

		System.out.println("Name::" + currentThread);
		System.out.println("Group::" + currentThread.getThreadGroup());
		System.out.println("Priority::" + currentThread.getPriority());
	}
}
/*
Name::Thread[main,5,main]
Group::java.lang.ThreadGroup[name=main,maxpri=10]
Priority::5
*/