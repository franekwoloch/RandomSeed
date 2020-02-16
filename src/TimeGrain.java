import java.time.Instant;

public class TimeGrain {

    int grain=0;
    public int getGrain() {
        return grain;
    }

    public void setGrain() {
        this.grain = Instant.now().getNano();
    }



}
