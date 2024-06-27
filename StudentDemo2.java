package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后，遍历集合
 * 
 * 注意：为了方便使用，我把学生类中的所有成员定义为String类型
 * 
 * 分析：
 * 		A：定义学生类
 * 		B：创建集合对象
 * 		C：键盘录入数据，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
 * 		D：把学生对象作为元素存储到集合中
 * 		E：遍历集合
 */
public class StudentDemo2 {

	public static void main(String[] args) {
		/*//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//键盘录入数据，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		int age = sc.nextInt();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		//把学生对象作为元素存储到集合中
		array.add(s);
		*/
		ArrayList<Student> array = new ArrayList<Student>();
		//遍历集合
		/*addStudent(array);
		addStudent(array);
		addStudent(array);
		*/
		for(int i=0;i<3;i++) {
			addStudent(array);
		}
		for(int i=0;i<array.size();i++) {
			Student student = array.get(i);
			System.out.println(student.getName()+"---"+student.getAge());
		}
		
		/*
		 * 为了提高代码的复用性，我把键盘录入数据给学生对象，并存储到集合中的动作用一个方法来实现
		 * 
		 *调用方法
		 */
		
	}
	public static void addStudent(ArrayList<Student> array) {
		//键盘录入数据，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生姓名: ");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄: ");
		int age = sc.nextInt();
		
		Student s = new Student();
		s.setName(name);;
		s.setAge(age);
		
		array.add(s);
	}

}
