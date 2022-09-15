package Task_2;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    T[] fruitArray;

    ArrayList<T> fruitList;

    public Box(T[] fruitArray, ArrayList<T> fruitList) {
        this.fruitArray = fruitArray;
        this.fruitList = fruitList;
    }

    public Integer getWeightArray(){
        Integer result = 0;
        for(T t: getFruitArray()){
            if(t!=null) {
                Integer value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Integer getWeightList(){
        Integer result = 0;
        for(T t: getFruitList()){
            if(t!=null) {
                Integer value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compare(Box<? extends Fruit> box){
        if(this.getWeightArray().intValue() == box.getWeightArray().intValue()) return true;
        return false;
    }

    public Boolean compareList(Box<T> box){
        if(this.getWeightList().intValue() == box.getWeightList().intValue()) return true;
        return false;
    }

    public void toEmptyArray(Box<T> box){
        System.out.println("Estimated box weight up to: " + this.getWeightArray());
        System.out.println("Current box weight up to: " + box.getWeightArray());
        for(int i = 0; i<box.getFruitArray().length;i++){
            if(box.getFruitArray()[i]!=null) {
                this.getFruitArray()[getSize()] = box.getFruitArray()[i];
                box.getFruitArray()[i] = null;
            }
        }
        System.out.println("Estimated weight of the box after: " + this.getWeightArray());
        System.out.println("Current box weight after: " + box.getWeightArray());
    }
    private int getSize(){
        int result = 0;
        for(T t: getFruitArray()){
            if(t!=null)result++;
        }
        return result;
    }

    public void toEmptyList(Box<T> box){
        System.out.println("Estimated box weight up to: " + this.getWeightList());
        System.out.println("Current box weight up to: " + box.getWeightList());
        for(T t: box.getFruitList()){
            this.getFruitList().add(t);
        }
        box.getFruitList().clear();
        System.out.println("Estimated weight of the box after: " + this.getWeightList());
        System.out.println("Current box weight after: " + box.getWeightList());
    }



    public T[] getFruitArray() {
        return fruitArray;
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }
}
