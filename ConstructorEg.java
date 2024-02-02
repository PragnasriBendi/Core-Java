package demopack;

public class ConstructorEg {
	
	int sid;
	String sname;
	char sgrade;
	
	void display() {
		System.out.println(sid+" "+sname+" "+sgrade);
	}
	
	ConstructorEg(int id, String name, char g){
		sid=id;
		sname=name;
		sgrade=g;
		
	}

}
