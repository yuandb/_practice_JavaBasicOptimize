import tools1.NewNewCar;
import tools1.NewNewFish;
import tools1.NewNewPeople;

/**
 * 这个练习旨在练习如何在不同的包中构建不同的类文件
 * 
 * 要求： 
 * *********************
 * 必须在tools1包中写清楚三个类文件： 
 * NewNewPeople 
 * NewNewFish
 * NewNewCar 
 * 
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
 * @author Administrator
 * 
 */
public class A3_Practice_package {
	public static void main(String[] args) {
		NewNewPeople zs = new NewNewPeople("张三");
		NewNewFish jinYu1 = new NewNewFish("金黄色");
		NewNewFish jinYu2 = new NewNewFish("金黄色", "金鱼");
		NewNewCar audiA81 = new NewNewCar("A8", "奥迪", "黑白色");
		NewNewCar audiA82 = new NewNewCar("A8", "奥迪");
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
