package outer;

public class BasicCalculation {

    
    public int add(int... n){
        int sum=0;
        for (int j:n){
            sum=sum+j;
        }
        return sum;
    }
}
