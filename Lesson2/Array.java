package Lesson2;

public class Array {
    public int arraySize (String [][] array) throws MyArraySizeException {

        int sum = 0;
        int size1 = array.length;
        int size2 = array[0].length;

        if (size1 != 4 || size2 != 4) {
            throw new MyArraySizeException("Array's length is not correct");
        }

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Unable to convert cell");
                }
            }
        }
        return sum;
    }
}
