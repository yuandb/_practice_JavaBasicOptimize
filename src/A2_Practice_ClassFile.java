/**
 * �����ϰּ�������ͬһ�����й�����ͬ�����ļ�
 * 
 * Ҫ�� 
 * *********************
 * ������������ļ���д���������ˣ�������ȱʡ����д����������ļ��� 
 * NewPeople 
 * NewFish
 * NewCar 
 * 
 * ��ʵ����New��ͷ��3�����е����ݺ�A1_Practice_Constructor��3�����������һ����
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
 * 
 * @author Administrator
 * 
 */
public class A2_Practice_ClassFile {
	public static void main(String[] args) {
		NewPeople zs = new NewPeople("����");
		NewFish jinYu1 = new NewFish("���ɫ");
		NewFish jinYu2 = new NewFish("���ɫ", "����");
		NewCar audiA81 = new NewCar("A8", "�µ�", "�ڰ�ɫ");
		NewCar audiA82 = new NewCar("A8", "�µ�");
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
