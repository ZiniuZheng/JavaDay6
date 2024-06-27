package ArrayList;

import java.util.ArrayList;
/*
 * 存储自定义对象并遍历
 * 
 * 分析：
 * 		A：定义学生类
 * 		B：创建集合对象
 * 		C：创建学生对象
 * 		D：把学生对象作为元素添加到集合中
 * 		E：遍历集合
 */

public class ArrayListTest3 {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//创建学生对象
		Student s1 = new Student("林青霞",28);
		Student s2 = new Student("张曼玉",30);
		Student s3 = new Student("景甜",25);
		Student s4 = new Student("柳岩",18);
		
		//把学生对象作为元素添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		//遍历集合
		for(int i=0;i<array.size();i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
	}

}
