package Collections2;

public class MainLottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(6, "Lotery names");

        Players players = new Players("Zenon",100);
        Players players1 = new Players("Zenon",80);
        Players players2 = new Players("Bogumił",88);
        Players players3 = new Players("Zdzisława",77);
        Players players4 = new Players("Janusz",99);

        lottery.addPlayers(players);
        lottery.addPlayers(players1);
        lottery.addPlayers(players3);
        lottery.addPlayers(players4);
        lottery.addPlayers(players2);
        lottery.addPlayers(new Players("Figo",55));


        System.out.println(lottery.randomPlayers().getName());

    }
}
