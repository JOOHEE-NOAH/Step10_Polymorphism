package exception;
//����� ���� �ͼ���
class MyException extends Exception{//�ͼ��� ���
	public MyException() {
		System.out.println("�̼����� ���Ա���\n������ ����~\n");
	}
}
public class ExceptionEx4 {

	public static void main(String[] args)/* throws MyException */{//�̰� ��� ���ҰŸ� try-catch�� ������ ����
		int age=Integer.parseInt(args[0]);
		
		if(age<19)
			try {
		/*throws�ƴ�*/	throw new MyException(); //�ͼ��� ����� �޾ƾ� �ͼ��� ó�� ����
			}catch (Exception e) {
				// TODO: handle exception
			}
			else
			System.out.println("������� ����...");
		System.out.println("-------");
	}

}
