package family;

public class MainEx {

	public static void main(String[] args) {
//		Father fa=new Father("ȫ�浿");
//		System.out.println(fa.toString());
		
	//	Family fa=new Father("ȫ�浿");
	//	System.out.println(fa.toString()); //�̰� �Ʒ�ó�� �迭�� �ٲ���
		
		Family [] family= new Family[]{
			new Father("ȫ�浿"),//�迭�� ���� �ڷ��� ����
			new Mother("��Ƽ"),
			new Son("�Ƿη�")
		}; //�迭�̴� �����ݷ�
		
		for(Family ob:family)//�йи� ��ü ����
			System.out.println(ob.toString());//System.out.println(ob); ������ ǥ��
		
		
		
		
		
		
//-------------�����Ѱ�---------------		
//		String com=args[0];
//	    Job fm=null; 
//	
//		if(com.equals("father")|| com.equals("FATHER")){
//		 fm=new Father(); 
//		
//		}else if(com.equals("mother")|| com.equals("MOTHER")) {
//		fm=new Mother();
//		
//		}else if(com.equals("son")|| com.equals("SON")) {
//			fm=new Son();
//		}
//		fm.work();
//		
	}

}
