package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperList <T> extends ListManager<T>{

    public SuperList(){
        super();
    }

    @Override
    public void addElement(T element) {
        this.list.add(element);
    }

    @Override
    public T removeElement(int position) {
        return this.list.remove(position);
    }

    @Override
    public void showElements() {
        printList(this.list);
    }

    @Override
    public void showReversedElements() {
        List<T> reversedList = reverseList(this.list);
        printList(reversedList);
    }

    private List<T> reverseList (List<T> listToReverse){
       List<T> newList = new ArrayList<T>(listToReverse);
       Collections.reverse(newList);
       return newList;
    }

    private void printList(List<T>listToPrint){
        listToPrint.stream().forEach(System.out::println);
    }
}
