
public class Student {
	private String name;
	private int Rollno;
	private String emailid;
	private int Phoneno;
	private int age;
	void setData(String a, int b, String c,int d, int e) {
		name=a;
		Rollno=b;
		emailid=c;
		Phoneno=d;
		age=e;
	}
	void getData() {
		System.out.println(name);
		System.out.println(Rollno);
		System.out.println(emailid);
		System.out.println(Phoneno);
		System.out.println(age);
	}
}

