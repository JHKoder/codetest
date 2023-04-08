package sample3;

public class Factor {
    public long factorial(long num) {
        return factorial(num,num);
    }
    private long factorial(long num,long sum){
        if(--num > 0){
            return factorial(num,sum*num);
        }else{
            return sum;
        }
    }
}
