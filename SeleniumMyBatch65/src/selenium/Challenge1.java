package selenium;
import java.util.*;

public class Challenge1 {
    public static void main(String[] args) {
    	
        List<String> input = Arrays.asList("1", "5", null, "1", "2", "2", null, "3");
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();

        for (String inp: input) {
            if (inp != null) {
                tempList.add(Integer.valueOf(inp));
            } else {
                list.add(tempList);
                tempList = new ArrayList<>();
            }
        }
        list.add(tempList);
        System.out.println("Input:");
        System.out.println(input);
        System.out.println("maxSum output:");

        System.out.println(maxSum(list));
        System.out.println("minAvg output:");
        System.out.println(minAvg(list));

    }

    public static List<List<Integer>> transformList(List<List<Integer>> list) {
        List<List<Integer>> imwList = new ArrayList<>();
        for (List each: list) {
            imwList.add(each);
        }

        for (int i=0; i<list.size(); i++){
            for (int j=0; j<list.size(); j++){
                if ( (!list.get(i).equals(list.get(j)))  && list.get(i).containsAll(list.get(j)) ){
                    if (list.get(i).size()>list.get(j).size())
                        imwList.remove(list.get(j));
                }
            }
        }
        return imwList;
    }


    public static List<List> maxSum(List<List<Integer>> list) {
        List<List> tempList = new ArrayList<>();
        tempList.add(Collections.singletonList(0));

        int maxTotal = 0;
        int biggest = 0;
        List<List<Integer>> lists = transformList(list);
        for (int i=0; i<lists.size(); i++){
            int total = 0;
            for (int j=0; j<lists.get(i).size(); j++){
                total += lists.get(i).get(j);
                if (lists.get(i).get(j) > biggest){
                    biggest = lists.get(i).get(j);
                }
            }

            if (total>maxTotal){
                maxTotal = total;
                tempList.set(0,lists.get(i));
            }
            if (total==maxTotal){
                if (lists.get(i).contains(biggest)){
                    tempList.set(0,lists.get(i));
                }
            }

        }
        return tempList.get(0);

    }



    public static List<List> minAvg(List<List<Integer>> list) {
        List<List> tempList = new ArrayList<>();
        tempList.add(Collections.singletonList(0));
        List<List<Integer>> lists = transformList(list);

        double minAvg = 10;

        for (int i=0; i<lists.size(); i++){
            int total = 0;
            for (int j=0; j<lists.get(i).size(); j++){
                total += lists.get(i).get(j);
            }
            if (  total/(lists.get(i).size()) < minAvg ){
                minAvg = total/(lists.get(i).size());
                tempList.set(0,lists.get(i));
            }

        }
        return tempList.get(0);

    }

}