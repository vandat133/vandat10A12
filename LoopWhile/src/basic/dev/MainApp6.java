package basic.dev;

public class MainApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int tong = 0;
		do {
			i++;
			if(i % 3 == 0)
				break;
			if(i % 5 == 0)
				break;
			tong += i;
		}while(true);

		System.out.println("tong = " + tong);
		System.out.println("i = " + i);
	}

}
