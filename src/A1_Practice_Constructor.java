/**
 * �����ϰּ����ϰ���캯������д��
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
public class A1_Practice_Constructor{
	public static void main(String[] args){
		People zs=new People("����");
		Fish jinYu1=new Fish("���ɫ");
		Fish jinYu2=new Fish("���ɫ", "����");
		Car audiA81=new Car("A8", "�µ�", "�ڰ�ɫ");
		Car audiA82=new Car("A8", "�µ�");
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


class People{
	String name;
	//дһ��People��Ĺ��캯��,��name���г�ʼ��
	public People(String name){
		this.name=name;
	}
}

class Fish{
	String color;
	String type;
	//д2�����캯������һ��ֻ��color���г�ʼ�����ڶ�����color��type���г�ʼ��

}

class Car{
	String id;
	String brand;
	String color;
	//д2�����캯������һ�������б�����ʼ�����ڶ�����id��brand��ʼ��

	
}