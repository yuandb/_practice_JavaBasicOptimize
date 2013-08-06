import tools2.NewNewNewCar;
import tools2.NewNewNewFish;
import tools2.NewNewNewPeople;

/**
 * 这个练习旨在练习如何在不同的包中构建不同的类文件，然后用Setter和Getter方法进行调用
 * 
 * 要求： 
 * *********************
 * 必须在tools2包中写清楚三个类文件： 
 * NewNewPeople 
 * NewNewFish
 * NewNewCar 
 * 
 * 并对所有的类中的变量填上必要的Setter和Getter方法
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
public class A4_Practice_SetterGetter {
	public static void main(String[] args) {
		NewNewNewPeople zs = new NewNewNewPeople("张三");
		NewNewNewFish jinYu1 = new NewNewNewFish("金黄色");
		NewNewNewFish jinYu2 = new NewNewNewFish("金黄色", "金鱼");
		NewNewNewCar audiA81 = new NewNewNewCar("A8", "奥迪", "黑白色");
		NewNewNewCar audiA82 = new NewNewNewCar("A8", "奥迪");
		System.out.println("zs的姓名是:"+zs.getName());
		System.out.println("jinYu1的颜色是:"+jinYu1.getColor());
		System.out.println("jinYu2的颜色是:"+jinYu2.getColor()+" 种类是:"+jinYu2.getType());
		System.out.println("audiA81的颜色是:"+audiA81.getColor());
		System.out.println("audiA81的品牌是:"+audiA81.getBrand());
		System.out.println("audiA81的型号是:"+audiA81.getId());
		System.out.println("audiA82的品牌是:"+audiA82.getBrand());
		System.out.println("audiA82的型号是:"+audiA82.getId());
	}
}
