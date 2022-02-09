package interfaceex;
//----------�������̽� ǥ��----------
interface Cryable{
   public void cry();
}
interface Flyable{
   public void fly();
}

class Eagle implements Cryable,Flyable { 
   
   @Override
   public void fly() {
   System.out.println("�������� ���ƴٳ��~");   
                  
   }
   @Override
   public void cry() {
   System.out.println("��Ǳ��");   
                  
   }

   
}
public class InterfaceEx2 {

   public static void main(String[] args) {
      Eagle eg=new Eagle();
      eg.cry();
      eg.fly();
   }

}



/*----------Ŭ������ ǥ��----------
abstract class Cryable{
   abstract public void cry();
}
abstract class Flyable{
   abstract public void fly();
}

class Eagle extends Flyable {   //Ŭ���� ���߻�� �Ұ�, but abstract ����ؼ� ������� ���������
   
   @Override
   public void fly() {
   System.out.println("�������� ���ƴٳ��~");   //2
   new CryableEx().cry();                //3
   }
   class CryableEx extends Cryable{
      
      @Override
      public void cry() {
      System.out.println("��Ǳ��~");      //4
      }
      
   }
   
}
public class InterfaceEx2 {

   public static void main(String[] args) {
      new Eagle().fly(); //1
   }

}
*/