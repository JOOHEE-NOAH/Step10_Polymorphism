package family;

public class Mother extends Family implements Job{
	public Mother() {
		
	}
	public Mother(String name) {//�̹� �θ�Ŭ������ �������ִ� �Լ��̴� �������̵�
	super(name);
	}
	
	@Override
	public String work() {//�������̽����� ������ �����̶� �������̵�
		return "������ ���������Ѵ�";
	}
	@Override
	public String toString() {//�̹� �θ�Ŭ������ �������ִ� �Լ��̴� �������̵�
		return super.toString()+work()+"\n";
	}
}
