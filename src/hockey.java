import java.io.File;
import java.util.Scanner;

public class hockey extends SportsData{

    private Long forwardCash;
    private Long defenseCash;
    private Long goalieCash;

    public hockey(String team, Long totalMoney, Long forwardCash, Long defenseCash, Long goalieCash) {
        super(team, totalMoney);
        this.forwardCash = forwardCash;
        this.defenseCash = defenseCash;
        this.goalieCash = goalieCash;
    }

    public Long getForwardCash() {
        return forwardCash;
    }

    public void setForwardCash(Long forwardCash) {
        this.forwardCash = forwardCash;
    }

    public Long getDefenseCash() {
        return defenseCash;
    }

    public void setDefenseCash(Long defenseCash) {
        this.defenseCash = defenseCash;
    }

    public Long getGoalieCash() {
        return goalieCash;
    }

    public void setGoalieCash(Long goalieCash) {
        this.goalieCash = goalieCash;
    }

    public String toString() {
        return
        "The team name is " +getTeam() + ". The goalie gets paid " +getGoalieCash() + ". The forward players get paid " +getForwardCash() + ". The defense players get paid " +getDefenseCash() +". All together the team gets paid " +getTotalMoney();
    }

    public static void readData() throws Exception{
        File dataFile = new File( "src/HockeyData");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t|\n") ;
        while (dataScanner.hasNext()){
            //get next chunk of data
            String data1 = dataScanner.next();
            System.out.println(data1);
            String data2S = dataScanner.next();
            System.out.println(data2S);
            Long data2 = Long.parseLong(data2S);
            long data3 = dataScanner.nextLong();
            long data4 = dataScanner.nextLong();
            long data5 = dataScanner.nextLong();

            hockey hockeyData = new hockey(data1, data4, data2, data3, data5);
            System.out.println(hockeyData);
        }

    }
}

