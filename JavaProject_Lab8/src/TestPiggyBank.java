import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		inputCoin();
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal()); 
		pb.addFive(100);*/

	}
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank:");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank: "+ pb.getPiggyBank());
		MainMenu();
		
	}
	public static void MainMenu() {
		while (true) {
		System.out.println("===================================");
		System.out.println("Menu of PiggyBank");
		System.out.println("===================================");
		System.out.println("[1] one  baht.");
		System.out.println("[2] two  baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten  baht.");
		System.out.println("[5] Exit");
		System.out.println("===================================");
		System.out.print("Please Select Menu[1-5] : ");
		int insect = scan.nextInt();
		if (insect == 1 ) {
			System.out.print("Insert 1 Baht Money : ");
			int Coin = scan.nextInt();
			pb.addOne(Coin);
			System.out.println("Money Total : " +pb.getTotal());
		}
		else if (insect == 2 ) {
			System.out.print("Insert 2 Baht Money : ");
			int Coin = scan.nextInt();
			pb.addOne(Coin);
			System.out.println("Money Total : " +pb.getTotal());
		}else if (insect == 3 ) {
			System.out.print("Insert 5 Baht Money : ");
			int Coin = scan.nextInt();
			pb.addOne(Coin);
			System.out.println("Money Total : " +pb.getTotal());
		}else if (insect == 4 ) {
			System.out.print("Insert 10 Baht Money : ");
			int Coin = scan.nextInt();
			pb.addOne(Coin);
			System.out.println("Money Total : " +pb.getTotal());
		}else if (insect == 5 ) {
			System.out.println("bye bye");
			break;
		}
		}
		//pb.addOne(insect);
		//System.out.println("Money Total : " +pb.getTotal());
		
	}

}
