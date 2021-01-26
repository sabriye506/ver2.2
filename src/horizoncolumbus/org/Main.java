package horizoncolumbus.org;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
        }
        int sum = 0;

            for (int i = 0; i < 5; i++){
                sum = sum+numbers[i];


            // fpr (int i; i < 5; i++)
                
            }
            for(int i = 0; i < 5; i++){
                if (i==4) {
                    System.out.print("= " + sum);
                }
                else {
                    System.out.print(numbers[i] + " + ");
                }
            }
            //System.out.println(sum);
        }
    }

