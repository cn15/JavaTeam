package InterfaceTest;

public class Human {
private String Name;
private String Sex;
private int Age;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSex() {
	return Sex;
}
public void setSex(String sex) {
	Sex = sex;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public void Learn(){
		System.out.print("\nTen: " + getName());
		System.out.print("\nTuoi: " + getAge());
		System.out.print("\nGioi tinh: " + getSex());
}
}
