package interfaceex;
//�������̽��� �⺻����
interface Shape{
	final int r=10;
	abstract public void draw();
	abstract public void erase();
}
class Circle implements Shape{
	@Override
	public void draw() {//�������� ������ �ο�
		System.out.println("��������"+r+"�� ���� �׸���..");
	}
	@Override
	public void erase() {//�������� ������ �ο�
		System.out.println("���� �����..");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		Circle cir=new Circle();
		cir.draw();
		cir.erase();
		
	}

}
//----------abstract Ŭ�ν��� �ٲپ� �ֱ�---------

//abstract class Shape{
//	final int r=10;
//	abstract public void draw();
//	abstract public void erase();
//}
//abstract class Circle extends Shape{
//	@Override
//	public void draw() {//�������� ������ �ο�
//		System.out.println("��������"+r+"�� ���� �׸���..");
//	}
//	@Override
//	public void erase() {//�������� ������ �ο�
//		System.out.println("���� �����..");
//	}
//}
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//	}
//
//}
//






//--------------�Ϲ� Ŭ����-------------
//class Shape{
//	final int r=10;
//	public void draw() {}
//	public void erase() {}
//}
//class Circle extends Shape{
//	@Override
//	public void draw() {//������ ����.
//		System.out.println("��������"+r+"�� ���� �׸���..");
//	}
//	@Override
//	public void erase() {//������ ����.
//		System.out.println("���� �����..");
//	}
//}
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//	}
//
//}