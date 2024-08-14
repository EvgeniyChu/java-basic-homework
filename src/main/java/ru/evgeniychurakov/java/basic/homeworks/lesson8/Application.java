package ru.evgeniychurakov.java.basic.homeworks.lesson8;

public class Application {
    public static int sumArrayElements(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr.length != 4 || arr[i].length != 4) {
                    throw new AppArraySizeException("Передан массив размером не 4х4");
                }
                try {
                    int intValue = Integer.parseInt(arr[i][j]);
                    sum += intValue;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверно записано число в ячейке ",arr[i][j]);
                }
            }

        }
        return sum;
    }
}
