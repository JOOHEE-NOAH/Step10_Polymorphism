package tv1;
//������(Polymorphism) : ��ü�� �پ��� ������� ��ȭ �� �� �ִ� ��   //��ü ������ ��ǥ.
//������ ��������(��), ���յ� �������� (��) ���� �ڵ� (���� ����) 

//���յ��� ���� �ڵ�
public class TvUser {


	public static void main(String[] args) {
		String com=args[0];
		
		if(com.equals("lg")|| com.equals("LG")){// .equals()��ü��: �ԷµǾ��ִ� ���� lg�ΰ�?�� ����� ��
		 LgTv tv=new LgTv();
		 tv.powerOn();
		 tv.volumUp();
		 tv.volumDown();
		 tv.powerOff();
		}else if(com.equals("samsung")|| com.equals("SAMSUNG")) {
		SamsungTv tv=new SamsungTv();
		 tv.turnOn();
		 tv.soundUp();
		 tv.soundDown();
		 tv.turnOff();
		}else {
			System.out.println("��� ȸ�� tv����??");
		}
		
	}

}
