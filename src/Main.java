import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
        Integer value2=33;
        changeValue(value2);
        System.out.println(value2);
        Integer[] array= new Integer[] {3,4};
        System.out.println(Arrays.toString(array));
        changeArrayValue(array);
        System.out.println(Arrays.toString(array));
        Person p= new Person("Lyapis", "Trubetskoy");
        p.changePerson(p);
        System.out.println(p);
        p.changePerson2(p);
        System.out.println(p);

    }
    private static void changeValue(int value) {

        value = 22;
    }
    private static void changeValue(Integer value) {

        value = 22;
    }
    private static void changeValue(Integer[] arr) {

        arr = new Integer[]{1, 2};
    }
    private static void changeArrayValue(Integer[] arr) {
        arr[0] = 99;
    }


    }
