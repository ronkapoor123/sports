public class MlbTeamPayroll extends SportsData{

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

    public MlbteamPayroll setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public float getwin() {
        return win;
    }

    public MlbteamPayroll setWin(float win) {
        this.win = win;
        return this;
    }

    public int getroster() {
        return roster;
    }

    public MlbteamPayroll setRoster(int roster) {
        this.roster = roster;
        return this;
    }

    public long getpayroll() {
        return payroll;
    }

    public MlbteamPayroll setPayroll(long payroll) {
        this.payroll = payroll;
        return this;
    }

    public long getinjuredreserve() {
        return injuredreserve;
    }

    public MlbteamPayroll setInjuredreserve(long injuredreserve) {
        this.injuredreserve = injuredreserve;
        return this;
    }

    public long getretained() {
        return retained;
    }

    public MlbteamPayroll setRetained(long retained) {
        this.retained = retained;
        return this;
    }

    public long getburied() {
        return buried;
    }
    public long setburied() {
        this.buried = buried;
        return buried;
    }

    public MlbteamPayroll setBuried(long buried) {
        this.buried = buried;
        return this;
    }

    public long getsuspended() {
        return suspended;
    }

    public MlbteamPayroll setSuspended(long suspended) {
        this.suspended = suspended;
        return this;
    }

    // methods
    public String toString() {
        return "The team name is "+getTeam()+ " The win percentage is."+ getwin()
                + "The money in the injured reserve is"+getinjuredreserve()+ "The unspent money is"
                +getretained()+"The money for demoted people is"+getburied()+ "the money for suspended players is"
        ;

    }

    public static void readData() {

    }
}

