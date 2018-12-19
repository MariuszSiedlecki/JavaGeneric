package Task8;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2 , 7,3};
        GenericArray <Integer> genericArray = new GenericArray <Integer> (integerArray);
        MinMax <Integer> minMax = genericArray.getMinMax();
        System.out.println(minMax.getLast());
        System.out.printf(String.valueOf(minMax.getFirst()));

        }
    }

