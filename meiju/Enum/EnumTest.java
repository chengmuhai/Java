package meiju.Enum;

//这个枚举的例子走了很多弯路。也好弯路可以对概念更加理解，
//首先枚举并不是一个可以构造的类，所以也不能new对象，因此也不能进行赋值动作，所以之前想用Scanner来赋值的思路有问题。
//其次枚举本身就是判断。判断你输入的值是否是取值范围内的值，因此枚举也不能在用于if语句判断来使用。但是可以用for来循环，循环过后依然是枚举类型的不能做任何的类型转换动作。
//但是枚举中拿出的值可以做字符串拼接等动作如下面的例子。
public class EnumTest {
	Direction1 fw;
	String sum="";
	
	public String hdl(Direction1 d) {
			switch (d) {
			case 上:
				sum+=d;
				break;
			case 下:
				sum+=d;
				break;
			case 左:
				sum+=d;
				break;
			case 右:
				sum+=d;
				break;
			case BA:
				if (sum.equals("上上下下左右左右")) {
					System.out.println("魂斗罗1:30条命");
					return sum;
				}else {
					System.out.println(sum);
				}
				break;
			}
			return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("魂斗罗30条秘籍请输入(输入完毕后输入AB)");
		EnumTest hdl=new EnumTest();
		String tmp;
		System.out.println(hdl.hdl(hdl.fw.上));
		System.out.println(hdl.hdl(hdl.fw.上));
		System.out.println(hdl.hdl(hdl.fw.下));
		System.out.println(hdl.hdl(hdl.fw.下));
		System.out.println(hdl.hdl(hdl.fw.左));
		System.out.println(hdl.hdl(hdl.fw.右));
		System.out.println(hdl.hdl(hdl.fw.左));
		System.out.println(tmp=hdl.hdl(hdl.fw.右));
		System.out.println(tmp+"+BA");
		tmp=hdl.hdl(hdl.fw.BA);
	
		
	}

}
