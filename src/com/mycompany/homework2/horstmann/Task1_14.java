package com.mycompany.homework2.horstmann;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_14 {
    ArrayList<int[]> matrix;

    public Task1_14() {
        Scanner input = new Scanner(System.in);
        ArrayList<int[]> matrixList = new ArrayList<int[]>();
        System.out.print("Введите строку матрицы: ");
        String str = input.nextLine();
        while(!str.equals("")){
            String[] numbersString = str.split(" ");
            int n = numbersString.length;
            int[] numbersInt = new int[n];
            for (int i = 0; i < n; i++) {
                numbersInt[i] = Integer.parseInt(numbersString[i]);
            }
            matrixList.add(numbersInt);
            System.out.print("Введите строку матрицы: ");
            str = input.nextLine();
        }
        System.out.println("Ваша матрица: ");
        for (int[] ints : matrixList) {
            System.out.println(Arrays.toString(ints));
        }
        this.matrix = matrixList;
    }


    public boolean magicSquare(){
        for (int[] ints : matrix) {
            if (ints.length != matrix.size()) {
                System.out.println("Не квадрат");
                return false;
            }
        }
        int sum = 0;
        int sumRow = 0;
        int sumColumn = 0;
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for (int[] ints : matrix) {
            sum += ints[0];
        }
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).length; j++) {
                sumRow += matrix.get(i)[j];
                sumColumn += matrix.get(j)[i];
            }
            if (sumColumn!=sum || sumRow!=sum)
                return false;
            sumColumn = 0;
            sumRow = 0;
            sumDiag1 += matrix.get(i)[i];
            sumDiag2 += matrix.get(matrix.size()-1-i)[matrix.size()-1-i];
        }
        return sumDiag1 == sum && sumDiag2 == sum;

    }
}
