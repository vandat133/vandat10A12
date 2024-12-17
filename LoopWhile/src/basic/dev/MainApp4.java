package basic.dev;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int tong = 0;
		i++;
		tong +=i; // tong = tong + 1
		while (i<=100) {
			i++;
			tong += i; //tong = tong + i
			System.out.print(i);
		}
		System.out.println("tong: " + tong);
	}

}
