package family;

public class Father extends Family implements Job {
	public Father() {}
	public Father(String name) {
	}
	
	@Override
	public String work() {
		return super.toString();
	}
	
	public String toString() {
		return "�ƺ��� ������ �����Ѵ�";
	}
}
