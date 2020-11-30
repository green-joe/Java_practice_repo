import java.util.Scanner;
public class Factorio {
	public static double factorio(int f) {
	  double  eredmeny=1;
		for(int i=1;i<=f;i++) {
			eredmeny*=i;
		}
		return eredmeny;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f;
		Scanner in=new Scanner(System.in);
		System.out.println("Melyik szám faktoriálisát szeretnéd: ");
		f=in.nextInt();
		in.close();
		System.out.print(Math.round(factorio(f)));
		
	}

}
