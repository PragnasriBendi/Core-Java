package demopack;

public class Class2demo1 {
	
	int sid;
	String sname;
	char sgrade;
	
	public void display() {
		System.out.println(sid+" "+sname+" "+sgrade);
	}
	
	public void setData(int id, String name, char g) {
		sid=id;
		sname=name;
		sgrade=g;
	}

}
