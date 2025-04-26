package outer;

public class BasicCalculation {

    public final String name;

    public BasicCalculation(){
        System.out.println("I am deafult constructor");
        name="default";
    }
    public BasicCalculation(String myname){
        this.name=myname;
    }

    public int add(int... n){
        int sum=0;
        for (int j:n){
            sum=sum+j;
        }
        return sum;
    }
}
