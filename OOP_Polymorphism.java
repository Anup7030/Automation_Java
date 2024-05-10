package Java_Practice;
class Test{
	String name;
    int age;
    
    public void printinfo(String name) {
    	System.out.println(name);
    }
    public void printinfo(int age) {
    	System.out.println(age);
    }
    public void printinfo(String name, int age) {
    	System.out.println(name+" "+age);
    }
}

public class OOP_Polymorphism {

	public static void main(String[] args) {
		Test s1=new Test();
		s1.name="Anup";
		s1.age=25;
		
		s1.printinfo(s1.name,s1.age);
		
	}

}

