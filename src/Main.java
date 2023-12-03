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
        System.out.println("Вопрос 1;если записать значение в маин 22 то значение останется 22. потому,что ");
        System.out.println("Вопрос 2;если записать значение в маин 22 то значение останется 22 ");
        System.out.println("Вопрос 3; если записать в маин значение массива 3,4 то останеться 3,4");
        System.out.println("Вопрос 4; если записать в маин Илья Лагутенко то при распечатки будет Илья Лагутенко");
    }


    }
