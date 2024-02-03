package LearnJavaFromStarting;

public class Student {

	
	String name;
	String roll;
	String mob;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", mob=" + mob + "]";
	}
	
	
	
	
}
