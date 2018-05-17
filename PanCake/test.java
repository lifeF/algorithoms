
import java.util.Arrays;
import java.util.Random;

public class test {


    public static boolean filp(int [] data , int start , int end ){
        int [] tmp = new int [end -start+1];
        for(int i=0 ; i<tmp.length;i++){
            tmp[tmp.length-i-1]=data[i];
        }
        int i=0;
        for (int element:tmp) {
            data[i++]=element;

        }
        return true;
    }

    public static void pancake(int [] data ){
        int n =data.length;
        int max;
        int mx_index;
        while(n>0){
            mx_index=0;
            max=0;
            for (int i =0 ;i<n;i++){
                if(max<=data[i]){
                    max=data[i];
                    mx_index= i;
                }
            }
            test.filp(data,0,mx_index);
            test.filp(data,0,n-1);
            n--;
        }
    }

    public static int[] genarate(int stack_size ){
        Random random_genarator= new Random();
        int [] data = new int[stack_size];
        int pan_Cake_maxSize =1000;
        for (int i =0 ; i<stack_size;i++) {
            data[i]= random_genarator.nextInt(pan_Cake_maxSize);
        }
        return data;
    }

    public static void main(String [] args){
        int stack_size= 200;
        int [] data = genarate(stack_size);
        pancake(data);
        System.out.println(Arrays.toString(data));

    }


}
