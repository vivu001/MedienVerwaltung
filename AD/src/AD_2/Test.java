package AD_2;

public class Test {

	public static void main(String[] args) {
		StopUhr su = new StopUhr();
		Zeitmessung zm = new Zeitmessung();
		
		su.start();
		zm.func1(1000);
		su.stop();
		System.out.println(su.getDuration());

		su.start();
		zm.func2(1000);
		su.stop();
		System.out.println(su.getDuration());
		
		su.start();
		zm.func6(1000);
		su.stop();
		System.out.println(su.getDuration());
	}

}
