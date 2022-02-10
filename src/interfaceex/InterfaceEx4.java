package interfaceex;
/*
 *Ŭ������ �������̽��� �̿��� ���� ó��
 *Ŭ���� �� :User
 *-name :String
 *+User()
 *+User(name: String)
 *+toString():String
 *
 *�������̽� ��: Score
 *+sol:int(�ʱⰪ:20)  <---����
 *+getScore():int  <----������*sol����
 *
 * �������̽� ��:Print
 * toPrint():String
 * 
 * ----InterfaceEx4���� User,Score,Print ��ӹ޾Ƽ� ó��
 * �̸� : ȫ�浿
 * ���� : 60�� 
 * */
//class User  {
//	private String name;
//	public User() {
//		
//	}
//	public User(String name) {
//		super();
//		this.name=name;
//	}
//	public String toString() { //toString()�� ���� : ���� ��ü�� ����(����)�� �����ϴ� ���ڿ� ����		
//		return "�̸� : "+name;
//	}
//}
//
//interface Score{
//	/*final*/public int sol=20;
//	public int getScore(); //�������̽��� ������ ����. �Լ��� ���ǳ� ������ ���� ����.
//}
//
//interface Print{
//	public String toPrint();//�������̽��� ������ ����. �Լ��� ���ǳ� ������ ���� ����.
//}
//
//public class InterfaceEx4 extends User implements Score, Print{
//	int n; //��������: Ŭ���� �������� �νĵɼ� �ִ� ����
//	public InterfaceEx4(String name, int n) {//�������� ����:��ü ����, ������� �ʱ�ȭ,����Ŭ������ ������ ȣ��
//	super(name);//�θ�Ŭ������ ������ �ִ� �����Ǹ� �������� ���� ���� ȣ��
//	this.n=n; //getScore()�� n�� ����Ҽ��ֵ��� ���������� ����.
//	}
//	
//	@Override
//	public int getScore() {
//	 return	Score.sol*n;
//	}
//	
//	@Override
//	public String toPrint() {
//		return super.toString()+"\n���� : "+getScore()+"��";
//	}
//	
//	public static void main(String[] args) {
//		InterfaceEx4 ob=new InterfaceEx4("ȫ�浿",3); // �ڵ��ϼ����� ������ ���� �����
//		System.out.println(ob.toPrint());
//	}
//
//}

//-------------���� ���� �ٸ��� ǥ��-------------
class User  {
private String name;
public User() {
	
}
public User(String name) {
	super();
	this.name=name;
}
public String toString() { //toString()�� ���� : ���� ��ü�� ����(����)�� �����ϴ� ���ڿ� ����		
	return "�̸� : "+name;
}
}

interface Score{
/*final*/public int sol=20;
public int getScore(); //�������̽��� ������ ����. �Լ��� ���ǳ� ������ ���� ����.
}

interface Print{
public String toPrint();//�������̽��� ������ ����. �Լ��� ���ǳ� ������ ���� ����.
}

public class InterfaceEx4 extends User implements Score, Print{
	int n;
	
	public InterfaceEx4(String string, int i) {
	super(string);//superŬ���� ������ ���� ��������
	n=i;//�� ����--->��� ������ ������ ��
	}

@Override
public String toPrint() {
	return super.toString()+"\n���� : "+getScore()+"��";
}

@Override
public int getScore() {
	return sol*n;
}
public static void main(String[] args) {
	InterfaceEx4 ob=new InterfaceEx4("ȫ�浿",3); // �ڵ��ϼ����� ������ ���� �����
	System.out.println(ob.toPrint());
}


}


