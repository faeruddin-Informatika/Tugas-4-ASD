import java.util.Arrays;

public class Shell_Sort {

	public static void sort(int[] array) {
	    int inner, outer;
	    int temp;

	    int h = 1;
	    while (h <= array.length / 3) {
	      h = h * 3 + 1;
	    }
	    while (h > 0) {
	      for (outer = h; outer < array.length; outer++) {
	        temp = array[outer];
	        inner = outer;

	        while (inner > h - 1 && array[inner - h] >= temp) {
	          array[inner] = array[inner - h];
	          inner -= h;
	        }
	        array[inner] = temp;
	      }
	      h = (h - 1) / 3;
	    }
	  }

	  public static void main(String[] args) {

	    int [] array = {6,2,1,3,7,0,1,8,7,4,0,8};
	    System.out.println("Before: " + Arrays.toString(array));
	    sort(array);
	    System.out.println("After:  " + Arrays.toString(array));

	  }

	}


