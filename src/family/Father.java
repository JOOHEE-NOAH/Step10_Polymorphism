package family;

public class Father extends Family implements Job {
	public Father() {
		
	}
	public Father(String name) {//�̹� �θ�Ŭ������ �������ִ� �Լ��̴� �������̵�
	super(name);
	}
	
	@Override
	public String work() {//�������̽����� ������ �����̶� �������̵�
		return "�ƺ��� ������ �����Ѵ�";
	}
	@Override
	public String toString() {//�̹� �θ�Ŭ������ �������ִ� �Լ��̴� �������̵�
		return super.toString()+work()+"\n";
	}
}
