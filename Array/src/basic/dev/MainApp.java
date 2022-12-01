package basic.dev;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		int a[] = new int[10];
		input(a);
		print(a);
		demChanLe(a);
		sapXep(a);
		print(a);
		demSoNguyenTo(a);
	}

	private static void demSoNguyenTo(int[] a) {
	int dem = 0;
	for (int i = 0; i < a.length; i++) {
		if(isPrimary(a[i]))
			dem++;
	}
	System.out.format("Mảng có %d số nguyên tố ", dem ).println();;	
	}

	private static void sapXep(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
	}

	private static void demChanLe(int[] a) {
		int demChan = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0)
				demChan++;
		}
		System.out.format("%d số chẳn ,%d số lẻ ", demChan,a.length - demChan);
	}

	private static void print(int[] a) {
		System.out.println("Mảng a");
		for (int i = 0; i < a.length; i++) {
			System.out.format("%d ",a[i]).print("\t");
		}
		System.out.println();
	}

	private static void input(int[] a) {
		int min = 1;
		int max = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = ramdomInteger(min, max);
		}
		
	}

	private static int ramdomInteger(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max + 1 - min)+min;
	}
	static boolean isPrimary(int n) {
		if(n == 1|| n == 2)return true;
		for (int i = 2; i <n; i++) {
			if(n % i == 0 )return false;
		}
		return true;
	}
}
