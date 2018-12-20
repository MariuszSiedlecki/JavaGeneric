package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private List<Players> names;
    private String lottery;
    private Random random;


    public Lottery(int i, String lottery){
        this.names = new ArrayList<>();
        this.lottery = lottery;
        this.random = new Random();
    }
    public void addPlayers(Players playerss){
        names.add(playerss);
            }

    public Players randomPlayers(){
        return names.get(random.nextInt(names.size()));
    }


}
