package selenium;
import java.util.*;

public class Challenge2 {
    public static void main(String[] args) {

        List<Integer> inputNumbers = Arrays.asList(2,3,4,5,6,7,8);

        int sum = 10; 

        List<List> list = new ArrayList<>();

        for (int i=0; i<inputNumbers.size(); i++){
            List<Integer> tempList = new ArrayList<>();
            for (int j=0; j<inputNumbers.size(); j++){
                if (inputNumbers.get(i)+inputNumbers.get(j)==sum && !(inputNumbers.get(i)==inputNumbers.get(j))){
                    tempList.add(inputNumbers.get(i));
                    tempList.add(inputNumbers.get(j));
                    boolean condition = true;
                    for (int k=0; k<list.size(); k++){
                        if (list.get(k).containsAll(tempList)){
                            condition=false;
                        }
                    }
                    if (condition){
                        list.add(tempList);
                    }
                }
            }
        }

        System.out.println(list);

    }
}