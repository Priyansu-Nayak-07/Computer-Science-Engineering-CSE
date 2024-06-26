import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println("List before removing duplicates:");
        System.out.println(list);
        List<Integer> uniqueList = removeDuplicates(list);
        System.out.println("\nList after removing duplicates:");
        System.out.println(uniqueList);
    }
    public static List<Integer> removeDuplicates(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        List<Integer> leftHalf = removeDuplicates(new ArrayList<>(list.subList(0, mid)));
        List<Integer> rightHalf = removeDuplicates(new ArrayList<>(list.subList(mid, list.size())));
        return merge(leftHalf, rightHalf);
    }
    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else if (left.get(i) > right.get(j)) {
                merged.add(right.get(j));
                j++;
            } else {

                merged.add(left.get(i));
                i++;
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
}
