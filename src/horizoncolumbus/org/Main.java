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
                // above shows that if I do not initialize i, it will still show an error saying it is not initialized,
                //but when I do initialize it, it shows that it was already done before
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

