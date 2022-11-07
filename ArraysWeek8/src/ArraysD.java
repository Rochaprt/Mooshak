import java.util.Scanner;

public class ArraysD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] studentGrades;
        int n;

        n = sc.nextInt();
        studentGrades = readAndStoreGrades(n);
        printArray(displayGeneralGradesArray(studentGrades));

    }

    public static int[] readAndStoreGrades(int arraySize) {
        int[] studentGrades = new int[arraySize];
        int numero;

        for (int i = 0; i < arraySize; i++) {
            numero = sc.nextInt();
            studentGrades[i] = numero;
        }
        return studentGrades;
    }

    public static int[][] displayGeneralGradesArray(int[] array) {
        int[][] generalArray = new int[21][2];

        for (int i = 0; i < 21; i++) {
            generalArray[i][0] = i;
            generalArray[i][1] = frequencyofGrades(array, i);
        }
        return generalArray;
    }

    public static int frequencyofGrades(int[] gradesArray, int number) {
        int countFrequency = 0;

        for (int i = 0; i < gradesArray.length; i++) {
            if (number == gradesArray[i]) {
                countFrequency++;
            }
        }
        return countFrequency;
    }

    public static void printArray(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < 2; i++) {
                System.out.printf("%d ", array[j][i]);
            }
            System.out.println();
        }
    }
}
