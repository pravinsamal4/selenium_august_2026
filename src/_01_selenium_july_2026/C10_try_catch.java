package _01_selenium_july_2026;


public class C10_try_catch {
	
	public void test(int a ,int b) {
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("wrong input");
		}
	}
	public static void main(String[] args) {
		C10_try_catch a=new C10_try_catch();
		a.test(1, 1);
		System.out.println("thank you for using later");

	}
	

}
