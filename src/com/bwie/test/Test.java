package com.bwie.test;
//----------��һ�ּ̳�ʵ�ַ���---------------------------------------------------
/*//����һ������
class Fruit{
	public double weight;
	//����һ������
	public void info(){
		System.out.println("������: " +weight);
	}
}
//����̳и���
public class Test extends Fruit{
	public static void main(String[] args) {
		//ʵ��������
		Test test=new Test();
		//���ø���Ĳ������¸�ֵ
		test.weight=23;
		//���ø���ķ���������
		test.info();
	}


}*/
//-----------------------------------�ڶ���ʵ�ּ̳еķ���--------------------------------------
class Base{
	//��������
	public double size;
	public String name;
	//�����вκ���
	public Base(double size,String name){
		this.size=size;
		this.name=name;
	}
}
//����̳и���
public class Test extends Base{
	public String color;
	public Test(double size, String name,String color) {
		super(size, name);
		this.color=color;
	}
	public static void main(String[] args) {
		Test test=new Test(2.3, "����", "green");
		System.out.println(test.size+"------"+test.name+"------"+test.color);

	}
}










