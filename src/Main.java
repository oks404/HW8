public class Main {
    public static void main(String[] args) {
//  Задание 1
        int[] wholeNumbers = new int[3];
        wholeNumbers[0] = 1;
        wholeNumbers[1] = 2;
        wholeNumbers[2] = 3;
        double[] fractionalNumbers = new double[3];
        fractionalNumbers[0] = 1.57;
        fractionalNumbers[1] = 7.654;
        fractionalNumbers[2] = 9.986;
        String[] words = {"один", "два", "три"};
//  Задание 2
        for (int i = 0; i < wholeNumbers.length; i++) {
            if (i != 2){
                System.out.print(wholeNumbers[i] + ", ");
            } else {
                System.out.print(wholeNumbers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (i != 2){
                System.out.print(fractionalNumbers[i] + ", ");
            } else {
                System.out.print(fractionalNumbers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            if (i != 2){
                System.out.print(words[i] + ", ");
            } else {
                System.out.print(words[i]);
            }
        }
//  Задание 3
        System.out.println();
        for (int i = wholeNumbers.length - 1; i >=0; i--) {
            if (i != 0){
                System.out.print(wholeNumbers[i] + ", ");
            } else {
                System.out.print(wholeNumbers[i]);
            }
        }
        System.out.println();
        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            if (i != 0){
                System.out.print(fractionalNumbers[i] + ", ");
            } else {
                System.out.print(fractionalNumbers[i]);
            }
        }
        System.out.println();
        for (int i = words.length - 1; i >= 0; i--) {
            if (i != 0){
                System.out.print(words[i] + ", ");
            } else {
                System.out.print(words[i]);
            }
        }
//  Задание 4
        System.out.println();
        for (int i = 0; i < wholeNumbers.length; i++) {
         if (wholeNumbers[i] % 2 == 0 && i !=2){
             System.out.print(wholeNumbers[i] + ", ");
         } else if (i != 2){
             wholeNumbers[i] = wholeNumbers[i] + 1;
             System.out.print(wholeNumbers[i] + ", ");
         } else {
             System.out.print(wholeNumbers[i] + 1);
         }
        }
    }
}