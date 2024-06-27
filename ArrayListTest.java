package ArrayList;

import java.util.ArrayList;
/*
 * 存储字符串并遍历
 * 
 * 分析：
 * 		A：创建集合对象
 * 		B：添加字符串元素
 * 		C：遍历集合
 */
public class ArrayListTest {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//添加字符串元素
		array.add("向问天");
		array.add("刘正风");
		array.add("左冷禅");
		array.add("风清扬");
		
		//遍历集合
		for(int i=0;i<array.size();i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}

}
