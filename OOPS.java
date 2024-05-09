package Java_Practice;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing something");
	}
	
	public void printcolor() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
}
    class Student{
    	String name;
    	int age;
    	
    public void printinfo() {
    	//System.out.println(this.name);
    	//System.out.println(this.age);
    }
    //Constructor
       Student(Student s2){
    	   this.name=s2.name;
    	   this.age=s2.age;
       }
            Student(){
    	
    }
    }
public class OOPS {

	public static void main(String[] args) {
		
		Pen pen1=new Pen();
		pen1.color="Black";
		pen1.type="Gel";
		
		Student s1=new Student();
		s1.name="Anup";
	    s1.age=25;
		
	   Student s2= new Student(s1);
	   s2.printinfo();
	    //s1.printinfo();
	    //pen1.printcolor();

	}

}
