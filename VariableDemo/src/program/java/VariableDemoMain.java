package program.java;
//demo for variable main function
public class VariableDemoMain {
	public static void main(String[] args) {
		VariableDemo ob =new VariableDemo();
		System.out.println(ob.name="This is instance variable");
		ob.display();
		System.out.println(VariableDemo.college);//calling
	}
}
