import tools2.NewNewNewCar;
import tools2.NewNewNewFish;
import tools2.NewNewNewPeople;

/**
 * �����ϰּ����ϰ����ڲ�ͬ�İ��й�����ͬ�����ļ���Ȼ����Setter��Getter�������е���
 * 
 * Ҫ�� 
 * *********************
 * ������tools2����д����������ļ��� 
 * NewNewPeople 
 * NewNewFish
 * NewNewCar 
 * 
 * �������е����еı������ϱ�Ҫ��Setter��Getter����
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
public class A4_Practice_SetterGetter {
	public static void main(String[] args) {
		NewNewNewPeople zs = new NewNewNewPeople("����");
		NewNewNewFish jinYu1 = new NewNewNewFish("���ɫ");
		NewNewNewFish jinYu2 = new NewNewNewFish("���ɫ", "����");
		NewNewNewCar audiA81 = new NewNewNewCar("A8", "�µ�", "�ڰ�ɫ");
		NewNewNewCar audiA82 = new NewNewNewCar("A8", "�µ�");
		System.out.println("zs��������:"+zs.getName());
		System.out.println("jinYu1����ɫ��:"+jinYu1.getColor());
		System.out.println("jinYu2����ɫ��:"+jinYu2.getColor()+" ������:"+jinYu2.getType());
		System.out.println("audiA81����ɫ��:"+audiA81.getColor());
		System.out.println("audiA81��Ʒ����:"+audiA81.getBrand());
		System.out.println("audiA81���ͺ���:"+audiA81.getId());
		System.out.println("audiA82��Ʒ����:"+audiA82.getBrand());
		System.out.println("audiA82���ͺ���:"+audiA82.getId());
	}
}
