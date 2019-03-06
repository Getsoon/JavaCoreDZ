package Lesson2Dz;

public class Conversion {
    public static int converter(String[][] array) throws MySizeArrayException, MyArrayDataException {
        int sum = 0;
        if(4 != array.length) throw new MySizeArrayException();
        for (int i = 0; i < array.length; i++){
            if(4 != array.length) throw new MySizeArrayException();
            for (int y = 0; y < array.length; y++){
                try {
                    sum += Integer.parseInt(array[i][y]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i,y);
                }
            }
        }
        return sum;
    }
}
