package company.Ajacs;

public class SingletonClass {
	private static SingletonClass stc=null;
	private String str;
	private SingletonClass() {
		str="this is a singleton class";
	}
	public static SingletonClass getInstance() {
		if(stc==null)
			stc=new SingletonClass();
		return stc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingletonClass s=SingletonClass.getInstance();
System.out.println(s.str);
SingletonClass st=SingletonClass.getInstance();
System.out.println(st.str);
	}

}
