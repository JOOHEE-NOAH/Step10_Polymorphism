package tv2;
//������(Polymorphism) : ��ü�� �پ��� ������� ��ȭ �� �� �ִ� ��   //��ü ������ ��ǥ.
//������ ��������(��), ���յ� �������� (��) ���� �ڵ� (���� ����) 

//�������� �̿��Ͽ� ���յ��� ���� �ڵ� ����
public class TvUser {


	public static void main(String[] args) {
		String com=args[0];
	    Tv tv=null; //tv������ null�� ����. // ������
	//	Tv tv=new LgTv();//-->��ġ �θ�Ŭ������ ���������� �ڽ� ��ü�� ����� �Ͱ� ���� ����.
		if(com.equals("lg")|| com.equals("LG")){// .equals()��ü��: �ԷµǾ��ִ� ���� lg�ΰ�?�� ����� ��
		 tv=new LgTv(); //if lg�� tv�� lgtv��
		
		}else if(com.equals("samsung")|| com.equals("SAMSUNG")) {
		tv=new SamsungTv();//if samsug�̸� tv�� samsungtv��
		
		}else {
			System.out.println("��� ȸ�� tv����??");
		}
		tv.powerOn();
		 tv.volumeUp();
		 tv.volumeDown();
		 tv.powerOff();
		
	}

}
