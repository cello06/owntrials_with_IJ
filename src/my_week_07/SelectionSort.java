package my_week_07;

public class SelectionSort {
    public static double[] selectionSort(double [] list) {
        for (int i = 0; i <list.length ; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i+1; j <list.length ; j++) {
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        double [] list = {2.3,23,2,3,3.4,1.2,1.3};
        double [] sortedList = selectionSort(list);

        for (double a :
                sortedList) {
            System.out.println(a+" ");
        }
    }
}
