package instance;
//���� ���� �ٸ��� ���ʽ� ����
abstract class Employee{
	 String name;
	 int salary;
	 public Employee(){
		 
	 }
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	abstract public int getBonus();//���Ժ��ʽ�
	
	@Override
	public String toString() {
		return name+"\t"+salary;
	}
}
class Engineer extends Employee{

	public Engineer() {
		super();
		
	}

	public Engineer(String name, int salary) {
		super(name, salary);
		
	}

	@Override
	public int getBonus() {
		return 150000;
	}
	@Override
	public String toString() {
		return super.toString()+"\t\t"+getBonus();
	}
}
	class Developer extends Employee{

		public Developer() {
			super();
			
		}

		public Developer(String name, int salary) {
			super(name, salary);
			
		}

		@Override
		public int getBonus() {
			return 100000;
		}
		@Override
		public String toString() {
			return super.toString()+"\t\t"+getBonus();
		}
		
}

public class InstanceofEx2 {

	public static void main(String[] args) {
		Employee [] em=new  Employee[] {
				new Engineer("�Ƿη�",120000),
				new Developer("��Ƽ",1750000),
				new Engineer("ũ��",250000),
				new Developer("����",2350000)
			};
		/*�����Ͼ�� �޿��� 13%, �����ڴ� �޿��� 15%�� �߰� �������� ����*/
		System.out.println("�̸�	�޿�		���Ժ��ʽ�		�߰����ʽ�");
		System.out.println("-------------------------------------------");
		for(Employee ob:em) {
			if(ob instanceof Employee)
				System.out.println(ob.toString()+"\t\t"+(int)(ob.salary*0.13));
			else if(ob instanceof Developer)
				System.out.println(ob.toString()+"\t\t"+(int)(ob.salary*0.15));
		}
		
		}
}


