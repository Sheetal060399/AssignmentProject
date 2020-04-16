package sheetal;
class Student{
public	int roll;
public String name;
Student(int roll , String name)
{
	this.roll= roll;
	this.name=name;
}
	
}

public class Elements {
	public static void main(String args[]) {
		Student arr[];
		arr=new Student[5];
		arr[0]=new Student(1,"aman");
		arr[1]=new Student(2,"vaibhav");
		arr[2]=new Student(3,"shaikhar");
		arr[3]=new Student(4,"simran");
		arr[4]=new Student(5,"ram");
		
		
		
				
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("elements of array" +i +":" + arr[i].roll+" "+arr[i].name);
		}
	}
}
