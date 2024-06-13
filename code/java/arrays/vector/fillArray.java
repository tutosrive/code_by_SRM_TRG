package code.java.arrays.vector;

public class fillArray {
    public static void main(String[] args) {
        int[] temperaturas = new int[20];
        

        for (int i = 0; i < temperaturas.length; i++){
            int number = 10 + (int) (Math.random() * (30 - 10 + 1));
            temperaturas[i] = number; 
        }
    }
}
