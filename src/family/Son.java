package family;

public class Son extends Family implements Job{
	public Son() {}
	public Son(String name) {
		super(name);
	}
	
	@Override
	public String work() {
		return "�Ƶ��� ���θ� �Ѵ�";
	}
	public String toString() {
		return super.toString();
	}
}
