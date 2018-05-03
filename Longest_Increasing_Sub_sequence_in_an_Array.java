/*
    Rathnayake R.M.K.D
    Algorithums : Longest Increasing Sub-sequence in an Array
    Dynamic programing

    DEPARTMENT OF COMPUTER ENGINEERING
    UNIVERSITY OF PERADENIYA


*/

public class LIS {

    static  int max =1;
    static  int [] arr ={3, 10, 2, 1, 20,4,56,78,90};
    static  int [] memory = new int[arr.length];

    static int  LIS(int n){

        if(n==1){
            return 1;
        }
        if(memory[n-1]!=0)
            return memory[n-1];

        int tmp,max_value=1;

        for(int i =1; i<n ;i++){
            tmp= LIS(i);

            if((arr[i-1]<arr[n-1])&& tmp+1>max_value){
                max_value++;
            }
        }
        memory[n-1]=max_value;
        if(max<max_value)
            max=max_value;
        return max_value;
    }



    public static void main(String [] args){
        System.out.println(LIS(arr.length));
    }
}
