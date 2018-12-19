package Task8;

public class GenericArray<T> {
    private T [] array;

    public GenericArray(T[] array) {

        this.array = array;
    }

    public MinMax <T> getMinMax(){
        return new MinMax<>(array[0],array[array.length -1]);

    }
}
