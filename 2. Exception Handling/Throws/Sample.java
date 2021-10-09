public class Sample {
	public static void main(String[] args) {
		try{
			foo();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void foo() throws Exception{
		System.out.println(3/0);
	}
}
