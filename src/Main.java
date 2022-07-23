public class Main {
    public static void main(String[] args) {
        homework_5();
    }

    public static void homework_5() {
//task1

        int[] firstArr = new int[3];
        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;

        double[] secondArr = {1.57, 7.654, 9.986};

        char[] thirdArr = {'a', 'b', 'c'};


//task 2

        for (int i = 0; i < 3; i++) {
            System.out.print(firstArr[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.print("   ");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(secondArr[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.print("   ");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(thirdArr[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
    }
}