import tools1.NewNewCar;
import tools1.NewNewFish;
import tools1.NewNewPeople;

/**
 * �����ϰּ����ϰ����ڲ�ͬ�İ��й�����ͬ�����ļ�
 * 
 * Ҫ�� 
 * *********************
 * ������tools1����д����������ļ��� 
 * NewNewPeople 
 * NewNewFish
 * NewNewCar 
 * 
 * *********************
 * Ҫʵ�ִ�ӡ�������ݣ�
 * 
 * zs��������:����
 * jinYu1����ɫ��:���ɫ
 * jinYu2����ɫ��:���ɫ ������:����
 * audiA81����ɫ��:�ڰ�ɫ
 * audiA81��Ʒ����:�µ�
 * audiA81���ͺ���:A8
 * audiA82��Ʒ����:�µ�
 * audiA82���ͺ���:A8
 * @author Administrator
 * 
 */
public class A3_Practice_package {
	public static void main(String[] args) {
		NewNewPeople zs = new NewNewPeople("����");
		NewNewFish jinYu1 = new NewNewFish("���ɫ");
		NewNewFish jinYu2 = new NewNewFish("���ɫ", "����");
		NewNewCar audiA81 = new NewNewCar("A8", "�µ�", "�ڰ�ɫ");
		NewNewCar audiA82 = new NewNewCar("A8", "�µ�");
		System.out.println("zs��������:"+zs.name);
		System.out.println("jinYu1����ɫ��:"+jinYu1.color);
		System.out.println("jinYu2����ɫ��:"+jinYu2.color+" ������:"+jinYu2.type);
		System.out.println("audiA81����ɫ��:"+audiA81.color);
		System.out.println("audiA81��Ʒ����:"+audiA81.brand);
		System.out.println("audiA81���ͺ���:"+audiA81.id);
		System.out.println("audiA82��Ʒ����:"+audiA82.brand);
		System.out.println("audiA82���ͺ���:"+audiA82.id);
	}
}
