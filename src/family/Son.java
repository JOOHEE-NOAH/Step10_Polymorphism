package family;

public class Son extends Family implements Job{
	public Son() {
		
	}
	public Son(String name) {//�̹� �θ�Ŭ������ �������ִ� �Լ��̴� �������̵�
	super(name);
	}
	
	@Override
	public String work() {//�������̽����� ������ �����̶� �������̵�
		return "�Ƶ��� ���θ� �Ѵ�";
	}
	@Override
	public String toString() {//�̹� �θ�Ŭ������ �������ִ� �Լ��̴� �������̵�
		return super.toString()+work()+"\n";
	}
}
