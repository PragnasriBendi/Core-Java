package demopack;

public class Class2demo1 {
	
	int sid;
	String sname;
	char sgrade;
	
	void display() {
		System.out.println(sid+" "+sname+" "+sgrade);
	}
	
	void setData(int id, String name, char g) {  //through method we are assigning data into variables
		sid=id;
		sname=name;
		sgrade=g;
	}

}
