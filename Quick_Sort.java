
public class Quick_Sort {

	public static void main(String[] args) {
	        int i;
	        int[] data = {40, 60, 43, 80, 02, 10, 23, 30};
	        quickSort(data, 0, data.length - 1);
	        System.out.println("Hasil pengurutan data:");
	        tampilkanLarik(data, data.length);

	    }

	    public static void tampilkanLarik(int[] data, int n) {
	        for (int i = 0; i < n; i++)
	            System.out.printf("%d ", data[i]);
	            System.out.println();
	    }   
	   
	    public static int partisi(int[] data, int m, int n) {
	        int x, i, j, tmp;
	       
	        x = data[m];
	        i = m;
	        j = n;
	       
	        while (true) {
	            while (data[j] > x)
	                j--;
	               
	            while (data[i] < x)
	                i++;

	            if (i < j) {
	                // Tukarkan data
	                tmp = data[i];
	                data[i] = data[j];
	                data[j] = tmp;
	            }           
	            else
	                return j;
	        }
	    }
	   
	    public static void quickSort(int[] data, int m, int n) {
	        int o;
	       
	        if (m < n) {
	            o = partisi(data, m, n);
	            quickSort(data, m, o);
	            quickSort(data, o+1, n);
	        }       
	    }
	

	}

