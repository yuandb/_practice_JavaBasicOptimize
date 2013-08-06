/**
 * 这个练习旨在如何在同一个包中构建不同的类文件
 * 
 * 要求： 
 * *********************
 * 不能再在这个文件中写这三个类了，必须在缺省包中写清楚三个类文件： 
 * NewPeople 
 * NewFish
 * NewCar 
 * 
 * 其实这里New开头的3个类中的内容和A1_Practice_Constructor的3个类的内容是一样的
 * *********************
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
public class A2_Practice_ClassFile {
	public static void main(String[] args) {
		NewPeople zs = new NewPeople("张三");
		NewFish jinYu1 = new NewFish("金黄色");
		NewFish jinYu2 = new NewFish("金黄色", "金鱼");
		NewCar audiA81 = new NewCar("A8", "奥迪", "黑白色");
		NewCar audiA82 = new NewCar("A8", "奥迪");
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
