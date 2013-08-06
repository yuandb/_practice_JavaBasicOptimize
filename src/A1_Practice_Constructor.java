/**
 * 这个练习旨在练习构造函数的书写：
 * 要实现打印如下内容：
 * 
 * zs的姓名是:张三
 * jinYu1的颜色是:金黄色
 * jinYu2的颜色是:金黄色 种类是:金鱼
 * audiA81的颜色是:黑白色
 * audiA81的品牌是:奥迪
 * audiA81的型号是:A8
 * audiA82的品牌是:奥迪
 * audiA82的型号是:A8
 * 
 * @author Administrator
 *
 */
public class A1_Practice_Constructor{
	public static void main(String[] args){
		People zs=new People("张三");
		Fish jinYu1=new Fish("金黄色");
		Fish jinYu2=new Fish("金黄色", "金鱼");
		Car audiA81=new Car("A8", "奥迪", "黑白色");
		Car audiA82=new Car("A8", "奥迪");
		System.out.println("zs的姓名是:"+zs.name);
		System.out.println("jinYu1的颜色是:"+jinYu1.color);
		System.out.println("jinYu2的颜色是:"+jinYu2.color+" 种类是:"+jinYu2.type);
		System.out.println("audiA81的颜色是:"+audiA81.color);
		System.out.println("audiA81的品牌是:"+audiA81.brand);
		System.out.println("audiA81的型号是:"+audiA81.id);
		System.out.println("audiA82的品牌是:"+audiA82.brand);
		System.out.println("audiA82的型号是:"+audiA82.id);
	}
}


class People{
	String name;
	//写一个People类的构造函数,对name进行初始化
	public People(String name){
		this.name=name;
	}
}

class Fish{
	String color;
	String type;
	//写2个构造函数，第一个只对color进行初始化，第二个对color和type进行初始化

}

class Car{
	String id;
	String brand;
	String color;
	//写2个构造函数，第一个对所有变量初始化，第二个对id和brand初始化

	
}