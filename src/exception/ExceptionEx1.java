package exception;
/*����ó��: �������ٴ� ����.
 * �Է°��� �������� �˻��ϴ� ��� --->�Ǽ���ȯ �õ�
 * */
public class ExceptionEx1 {
	//� ������ ���ܰ� �߻��ص� Exception�ϳ��� ��ġ�� ���.
	public static void main(String[] args) {
		int var=5;
		try {
		int n=Integer.parseInt(args[0]);
		System.out.println(var/n);
		}catch (Exception e) {
			System.out.println("�Է°��� ���� ������ �ֽ��ϴ�.");
		}finally {//���ܰ� �߻��ص� ���� ó���� �ؾߵɰ� �ִٸ� ó��.
			System.out.println("�ͼ��ǰ� ���þ��� �׻� ����");//���ᰡ �ȴٸ� �ַ� ��ü�� �ݾ��ִ� �۾�.
		}
		
		
		
//===================1======================		
//try-catch:���������� ó��		
		/*$java ExceptionEx1 2--->2
		 **$java ExceptionEx1 0--->0���� ������ �����ϴ�
		 *$java ExceptionEx1 a--->0���� ������ �����ϴ�
		 *$java ExceptionEx1 --->0���� ������ �����ϴ�
		*/
//		int var=5;
//		try {
//		//exception�� �߻����� ��� ���� ���⼭ ��������� 
//							//����ó���� �ϸ� ����������� �ʰ� ��� ������ �� �ִ� ȯ�� ����.
//		}catch (ArithmeticException e) {
//			System.out.println("0���� ������ �����ϴ�");
//		}catch (NumberFormatException e) {
//			System.out.println("���ڷ� �ٲ� �� �����ϴ�");
//			
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�Էµ� ���� �����ϴ�");
//		}//���� �߻��� �� �������� �̷��� ������ �ִ°� best�̱� ��.
	//	finally {//���ܰ� �߻��ص� ���� ó���� �ؾߵɰ� �ִٸ� ó��.
			System.out.println("�ͼ��ǰ� ���þ��� �׻� ����");//���ᰡ �ȴٸ� �ַ� ��ü�� �ݾ��ִ� �۾�.
		}
//		System.out.println("-------");
	}


