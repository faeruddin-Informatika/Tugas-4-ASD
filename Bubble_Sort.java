import java.util.ArrayList;
import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		ArrayList<Double> container = new ArrayList<Double>();
		
		//	Variable
		double[] bilangan = {8, 11, 23, 25, 80, 88};
		
		//	Tampilkan bilangan
		System.out.println("Bilangan sebelum di sorting Bubble Sort : "+Arrays.toString(bilangan));
		
		//	Proses Bubble Sort
		System.out.println("\nProses Bubble Sort secara Ascending:");
		for(int a = 0; a < bilangan.length; a++) {
			//	Tampilkan proses Iterasi
			System.out.println("Iterasi "+(a+1));
			for(int b = 0; b < bilangan.length-1; b++) { if(bilangan[b] > bilangan[b+1]) {
					//	proses pertukaran bilangan
					double temp = bilangan[b];
					bilangan[b] = bilangan[b+1];
					bilangan[b+1] = temp;
				}
				
				//	Tampilkan proses pertukaran tiap iterasi
				System.out.println(Arrays.toString(bilangan));
			}
			System.out.println();
		}
		
		//	Tampilkan hasil akhir
		System.out.println("Hasil akhir setelah di sorting: "+Arrays.toString(bilangan));
	}

}


