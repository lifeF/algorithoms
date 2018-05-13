public class MinCost {
    static int [][] cost = {
                            {0, 3, 12, 23, 412},
                            {0, 0,  2,  4, 34},
                            {0, 0,  0,  12, 3},
                            {0, 0,  0,  0, 12},
                            {0, 0,  0,  0,  0}
                            };



    public static int findMinCost(int start, int end) {

        if(start==end-1) return cost[start][end];

        int min =cost[start][end];

        int value=0;
        for (int i =start+1 ; i<end ;i++){
            value = findMinCost(start,i)+findMinCost(i,end);
            if(value<min) min = value;
        }

        return  min;


    }

    public static void main(String [] args) {
        System.out.println("Min cost " + findMinCost(0, 4));
    }
}
