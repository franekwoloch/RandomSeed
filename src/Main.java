import java.lang.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {
RandomDivider randomDivider=new RandomDivider();
TimeGrain timeGrain= new TimeGrain();
int randomGrain;
randomDivider.createDivider();
System.out.println(randomDivider.getDivider());
timeGrain.setGrain();
System.out.println("Grain of time:"+timeGrain.getGrain());
randomGrain=timeGrain.getGrain()/randomDivider.getDivider();
System.out.println("Random grain: "+randomGrain);


}
}
