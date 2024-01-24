package demopack;

public class ClassDemo2 {
	
	public static void main(String[] args) {
		Classdemo1 cd1 = new Classdemo1();
		cd1.eid=111;
		cd1.ename="Pragna";
		cd1.esalary=100000;
		cd1.ejob= "QA";
		
		cd1.show();
		
		Classdemo1 cd2 = new Classdemo1();
		cd2.eid=112;
		cd2.ename="sri";
		cd2.esalary=200000;
		cd2.ejob="lead";
		
		cd2.show();
		
	}

}
