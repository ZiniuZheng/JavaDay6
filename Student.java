package ArrayList;
/*
 * 自动生成构造方法：
 * 		代码区域右键 -- Source -- Generate Constructors from Superclass... 无参构造方法
 * 		代码区域右键 -- Source -- Generate Constructors using Fields... 带参构造方法
 * 自动生成getXxx()/setXxx()：
 * 		代码区域右键 -- Source -- Generate Getters and Setters...
 */
public class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		super(); //执行父类里面相对应的方法（构造方法）
		this.name = name;
		this.age = age;
	}
	public Student() {
		super(); //执行父类里面相对应的方法（构造方法）
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

}
