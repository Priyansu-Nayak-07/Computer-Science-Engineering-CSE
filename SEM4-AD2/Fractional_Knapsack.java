import java.util.*;
class Item implements Comparable<Item> {
    double weight;
    double cost;
    public Item(double weight, double cost) {
        this.weight = weight;
        this.cost = cost;
     }
    public int compareTo(Item other) {
        double r1 =  this.cost / this.weight;
        double r2 =  other.cost/ other.weight;
        if (r1 < r2)
            return 1;
        else if (r1 > r2)
            return -1;
        else
            return 0;
    } }
public class Fractional_Knapsack {
    public static double getMaxValue(int[] weights, int[] cost, int capacity) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < weights.length; i++) {
            items.add(new Item(weights[i], cost[i]));
        }
        Collections.sort(items);
        double totalValue = 0;
        int currentWeight = 0;
        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                totalValue += item.cost;
                currentWeight += item.weight;
            } else {
                int remainingCapacity = capacity - currentWeight;
                totalValue += item.cost* remainingCapacity / item.weight;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int[] costs = {300, 190, 180};
        int[] weights = {3, 2, 3};
        int capacity = 4;
        double maxValue = getMaxValue(weights, costs, capacity);
        System.out.println("Maximum cost = " + maxValue);
    }
}
