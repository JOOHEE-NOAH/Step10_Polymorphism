package family;

public class Mother extends Family implements Job{
	public Mother() {}
	public Mother(String name) {
		super(name);
	}
	@Override
	public String work() {
		return "엄마는 집안일을한다";
	}
	public String toString() {
		return super.toString();
	}
}
