package instance;
//instanceof�� �̿��� ������ ����� true�̸� �˻��� �ڷ������� ����ȯ ����.

class Family{}
class Father extends Family{}
class Mother extends Family{}
class Son extends Family{}
public class InstanceofEx1 {

	public static void main(String[] args) {
		Family family=new Family(); // �йи��� ������ ��ü����
		Father father=new Father(); //
		Son son=new Son();
		
		System.out.println(father instanceof Family); //�ַ� instanceof + Ŭ������ //true
		// true�̸� ����ȯ ����
		Family fm1=new Father();
		Family fm2=(Family)(new Father());// ����ȯ
		Family fm3=(Family)father;
		
		System.out.println(son instanceof Family);// true
		System.out.println(family instanceof Father);// false 
		
//		System.out.println(mother instanceof Son); //error
		
	}

}
