package baozhuang;

public class Baozhuang {
//包装类就是基本数据类型的一个类的形态，以此解决基本数据类型没有方法的弊端。基本数据类型和包装类在JAVA SE5.0版本之后不需要手动转换可以自动转换。
//定义包装类可以用到public type (type value) || public type (String value)这两种方式都可以但是对于char的包装类String的方式不行要用到单引号，下面举例子
	public static void main(String[] args) {
		// 定义包装类
		//整形
		Integer number=new Integer("123");
		System.out.println("Integer number=new Integer(\"123\")"+number+"可以带引号或者不带");
		Character cha =new Character('a');
		System.out.println("Character cha =new Character('a')，char类型的不能用双引号只能直接给char类型的值。");
		System.out.println("包装类只有这两种定义方式，Integer number=123;这样虽然也能过但是是系统自动做了数据类型转换的缘故。通常我们在定义数据类型的时候还是要以定义基本数据类型为主，因为那样定义出来的变量更加的高效不会额外增加资源负担。");
		//包装类的一些方法
		number.valueOf(cha); //返回整形。
		
	}

}
