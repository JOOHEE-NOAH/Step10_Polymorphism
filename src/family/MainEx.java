package family;

public class MainEx extends Family implements Job{
	public MainEx(String name) {
		super(name);
	
	}
	@Override
	public String work() {
	return super.toString();
	}

	public static void main(String[] args) {
		String com=args[0];
	    Job fm=null; 
	
		if(com.equals("father")|| com.equals("FATHER")){
		 fm=new Father(); 
		
		}else if(com.equals("mother")|| com.equals("MOTHER")) {
		fm=new Mother();
		
		}else if(com.equals("son")|| com.equals("SON")) {
			fm=new Son();
		}
		fm.work();
		
	}

}
