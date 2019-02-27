package arr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;



public class Test {
	public static void main(String[] args) {
		Student s1=new Student("qwz1", 23, 33);
		Student s2=new Student("qwz1", 22, 77);
		Student s3=new Student("qwz1", 25, 56);
		Student s4=new Student("qwz1", 27, 74);
		Student s5=new Student("qwz1", 22, 94);
		//定义一个Student 范型的ARR
		ArrayList<Student> stude=new ArrayList<Student>();
		//定义一个String 形的Arr
		ArrayList<String> str=new ArrayList<String>();
		
		//给两个Arr赋值
		
		stude.add(s1);
		stude.add(s2);
		stude.add(s3);
		stude.add(s4);
		stude.add(s5);
		
		str.add("a");
		str.add("ab");
		str.add("abc");
		str.add("c");
		str.add("asdfasd");
		str.add("我");
		str.add("a好奇怪");
		str.add("who");
		str.add("is what？");

		
		//测试排序最大最小以及查找字符串位置等等
		//********************************
		//对象查找，最大最小值（这里边可以看到，如果调用Str就可以进行排序以及max，min但是stude就不行，因为对象在没有定义排序的方法时不能进行排序以及查找）
		System.out.println(Collections.max(str));
		//因为在Student的类中加入了并实现了接口Comparable的compareTo方法因此stude就可以用于排序了。
		System.out.println(Collections.min(stude));
		
		//其他的collections的方法。
		//排序、索引、乱序
		System.out.println("*******************楚河汉界：乱序*******************");
		System.out.println(str);
		System.out.println("*******************楚河汉界：顺序*******************");
		Collections.sort(str);
		System.out.println(str);
		System.out.println("*************************************************");
		System.out.println();
		
		System.out.println("*******************楚河汉界：乱序*******************");
		System.out.println(stude);
		System.out.println("*******************楚河汉界：顺序*******************");
		Collections.sort(stude);
		System.out.println(stude);
		System.out.println("*******************楚河汉界*******************");
		System.out.println();
		System.out.println("===================查询索引===================");
		System.out.println("=============================================");
		System.out.println(Collections.binarySearch(str,"c"));
		System.out.println(Collections.binarySearch(str,"2221"));
		System.out.println();
		System.out.println("*******************楚河汉界：顺序*******************");
		System.out.println(str);
		System.out.println("*******************楚河汉界：乱序*******************");
		Collections.shuffle(str);
		System.out.println(str);
		System.out.println("*************************************************");
		System.out.println();
		
		System.out.println("*******************楚河汉界：顺序*******************");
		System.out.println(stude);
		System.out.println("*******************楚河汉界：乱序*******************");
		Collections.shuffle(stude);
		System.out.println(stude);
		
		//集合的打印方式For遍历list 、增强for遍历对象、迭代器遍历
		//因为list有下标因此可以遍历但是对于Set和Map无下标因此只能使用增强for和迭代器
		//list方法依然使用stude这个集合
		//创建Set和Map
		HashSet<Student> hsStude ;
		hsStude=new HashSet<Student>();
		HashMap<String,Student> hmStude = new HashMap<String, Student>();
		
		hsStude.add(s1);
		hsStude.add(s2);
		hsStude.add(s3);
		hsStude.add(s4);
		hsStude.add(s5);
		
		hmStude.put("老大", s1);
		hmStude.put("老二", s2);
		hmStude.put("老三", s3);
		hmStude.put("老四", s4);
		hmStude.put("老五", s5);
		
		//list遍历
		System.out.println("***************");
		System.out.println("*List 遍历方法 *");
		System.out.println("***************");
		System.out.println("\n普通for遍历结果");
		for (int i = 0; i < stude.size(); i++) {
			System.out.println(stude.get(i));
		}
		System.out.println("\n增强for遍历结果");
		for (Student student : stude) {
			System.out.println(student);
		}
		System.out.println("\n迭代器遍历结果1，用迭代器效率更高");
		for (Iterator iterator = stude.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
			
		}
		System.out.println("\n迭代器遍历结果2，用迭代器效率更高");
		Iterator stuIte=stude.iterator();
		while (stuIte.hasNext()) {
			Student studen=(Student)stuIte.next();
			System.out.println(studen);
		}
		//Map遍历
				System.out.println("***************");
				System.out.println("*Map  遍历方法 *");
				System.out.println("***************");
				System.out.println("\nfor遍历结果");
				for (Student student : hsStude) {
					System.out.println(student);
				}
				System.out.println("\n迭代器遍历结果1，用迭代器效率更高");
				for (Iterator iterator = hsStude.iterator(); iterator.hasNext();) {
					Student student = (Student) iterator.next();
					System.out.println(student);
					
				}
				System.out.println("\n迭代器遍历结果2，用迭代器效率更高");
				stuIte=hsStude.iterator();
				while (stuIte.hasNext()) {
					Student studen=(Student)stuIte.next();
					System.out.println(studen);
				}
				//Map遍历
				System.out.println("***************");
				System.out.println("*Set  遍历方法 *");
				System.out.println("***************");
				System.out.println("\nfor遍历结果");
				for (String student : hmStude.keySet()) {
					System.out.println(student);
					System.out.println(hmStude.get(student));
				}
				System.out.println("\n迭代器遍历结果1，用迭代器效率更高");
				for (Iterator iterator = hmStude.keySet().iterator(); iterator.hasNext();) {
					String student = (String) iterator.next();
					System.out.println(student);
					System.out.println(hmStude.get(student));
					
				}
				System.out.println("\nMap.Entry方法");
				for (Map.Entry<String, Student> st: hmStude.entrySet()) {
					System.out.println(st.getKey());
					System.out.println(st.getValue());
					System.out.println(st);
				}
	}
	
}
