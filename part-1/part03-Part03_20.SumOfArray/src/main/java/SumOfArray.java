
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int index = 0;
        int ome = 0;
        while (index < array.length){
            int number = array[index];
            index++;
            ome = number + ome;
//            System.out.println(number);
            
        
        }
        return ome;
    }
}
