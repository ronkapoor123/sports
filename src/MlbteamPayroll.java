import java.io.File;
import java.util.Scanner;

public class MlbteamPayroll extends SportsData{

    // fields
    private int rank;
    private float win;
    private int roster;
    private long payroll;
    private long injuredreserve;
    private long retained;
    private long buried;
    private long suspended;
  //www.spotrac.com/mlb/payroll/2023/;

    // constructors

    public MlbteamPayroll(String team, Long totalMoney, int rank, float win, int roster, long payroll, long injuredreserve, long retained, long buried, long suspended) {
        super(team, totalMoney);
        this.rank = rank;
        this.win = win;
        this.roster = roster;
        this.payroll = payroll;
        this.injuredreserve = injuredreserve;
        this.retained = retained;
        this.buried = buried;
        this.suspended = suspended;
    }


    // setter/getters

    public int getrank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public float getwin() {
        return win;
    }

    public void setWin(float win) {
        this.win = win;
    }

    public int getroster() {
        return roster;
    }

    public void setRoster(int roster) {
        this.roster = roster;
    }

    public long getpayroll() {
        return payroll;
    }

    public void setPayroll(long payroll) {
        this.payroll = payroll;
    }

    public long getinjuredreserve() {
        return injuredreserve;
    }

    public void setInjuredreserve(long injuredreserve) {
        this.injuredreserve = injuredreserve;
    }

    public long getretained() {
        return retained;
    }

    public void setRetained(long retained) {
        this.retained = retained;
    }

    public long getburied() {
        return buried;
    }
    public long setburied() {
        this.buried = buried;
        return buried;
    }




    public long getsuspended() {
        return suspended;
    }

    public void setSuspended(long suspended) {
        this.suspended = suspended;
    }

    // methods
    public String toString() {
        return "The team name is "+getTeam()+ " The win percentage is."+ getwin()
                + "The money in the injured reserve is"+getinjuredreserve()+ "The unspent money is"
                +getretained()+"The money for demoted people is"+getburied()+ "the money for suspended players is"
        ;

    }

    public static void readData() throws Exception {
        File dataFile = new File( "srcMLB Team Payroll");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t|\n") ;
        while (dataScanner.hasNext()){
            //get next chunk of data
        }

    }
}

