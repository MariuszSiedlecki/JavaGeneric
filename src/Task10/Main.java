package Task10;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mariusz", "Ciekawy", 28);
        Person person1 = new Person("Mariusz", "Ciekawy", 28);

        if(person.equals(person1)){
            System.out.println("są takie same porównując .equls ");
        }else{
            System.out.println("są różne porównując .equls ");
        }
        if(person == person1){
            System.out.println("Są takie same porównując == ");
        }else {
            System.out.println("nie są takie same porównując == ");
        }
    }
}
