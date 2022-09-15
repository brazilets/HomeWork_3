package Task_2;

import java.util.ArrayList;

public class RunClass {

    public static void main(String[] args) {
        Orange[] oranges = new Orange[10];
        ArrayList<Orange> orangesList = new ArrayList<>(10);

        Orange orange0 = new Orange(1);
        Orange orange1 = new Orange(1);
        Orange orange2 = new Orange(1);
        Orange orange3 = new Orange(1);
        oranges[0] = orange0;
        orangesList.add(orange0);
        oranges[1] = orange1;
        orangesList.add(orange1);
        oranges[2] = orange2;
        orangesList.add(orange2);
        oranges[3] = orange3;
        orangesList.add(orange3);
        Box<Orange> box1 = new Box<>(oranges, orangesList);

        Orange[] oranges2 = new Orange[10];
        ArrayList<Orange> orangesList2 = new ArrayList<>();
        oranges2[0] = orange0;
        orangesList2.add(orange0);
        oranges2[1] = orange1;
        orangesList2.add(orange1);
        oranges2[2] = orange2;
        orangesList2.add(orange2);
        oranges2[3] = orange3;
        orangesList2.add(orange3);
        Orange orange4 = new Orange(1);
        Box<Orange> box2 = new Box<>(oranges2,orangesList2);

        System.out.println(box1.getWeightArray());
        System.out.println(box2.getWeightList());

        System.out.println(box1.compare(box2));
        System.out.println(box1.compareList(box2));

        box1.toEmptyArray(box2);
        box1.toEmptyList(box2);

        System.out.println(box2);

        Apple[] apples = new Apple[2];
        ArrayList<Apple> appleArrayList = new ArrayList<>(10);
        Box<Apple> box3 = new Box<>(apples,appleArrayList);
        box1.compare(box3);

    }
}
