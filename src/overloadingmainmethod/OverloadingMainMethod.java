package overloadingmainmethod;


public class OverloadingMainMethod {
	
	public static void main()
	{
		int a=10;
		
		System.out.println(a);
	}
	
	public static void main (int x, double y)
	{
		System.out.println(x+y);
	}
	
	public static void main (int m, double n,int o)
	{
		System.out.println(m+n+o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingMainMethod me = new OverloadingMainMethod();
		me.main();
	    me.main(20, 30.5);
	    me.main(5, 6.5, 10);
		 
		 
	}

}
