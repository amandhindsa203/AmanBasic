package base;
import java.util.Arrays;
public class SortArrayExample {

	public static void main(String[] args) {
int[] arr = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
	}

}
