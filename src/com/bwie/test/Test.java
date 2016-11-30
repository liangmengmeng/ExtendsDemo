package com.bwie.test;
//----------第一种继承实现方法---------------------------------------------------
/*//定义一个父类
class Fruit{
	public double weight;
	//定义一个方法
	public void info(){
		System.out.println("重量是: " +weight);
	}
}
//子类继承父类
public class Test extends Fruit{
	public static void main(String[] args) {
		//实例化对象
		Test test=new Test();
		//调用父类的参数重新赋值
		test.weight=23;
		//调用父类的方法输出结果
		test.info();
	}


}*/
//-----------------------------------第二种实现继承的方法--------------------------------------
class Base{
	//定义属性
	public double size;
	public String name;
	//构造有参函数
	public Base(double size,String name){
		this.size=size;
		this.name=name;
	}
}
//子类继承父类
public class Test extends Base{
	public String color;
	public Test(double size, String name,String color) {
		super(size, name);
		this.color=color;
	}
	public static void main(String[] args) {
		Test test=new Test(2.3, "二哈", "green");
		System.out.println(test.size+"------"+test.name+"------"+test.color);

	}
}










