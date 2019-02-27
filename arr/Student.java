package arr;

public class Student implements Comparable {
	private String name;
	private int age,num;
	
	public Student(String name, int age, int num) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public int compareTo(Object o) {
		Student obj=(Student)o;
		if (this.num==obj.num) {
			return 0;
		}else if (this.num>obj.num) {
			return 1;
		}else {
			return -1;
		}
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", num=" + num + "]";
	}
	
	
	}
