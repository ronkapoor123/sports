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
        "the team name is" +getTeam() + "The goalie gets paid" +getGoalieCash() + "the forward players get paid" +getForwardCash() + "the defense players get paid" +getDefenseCash() +"all together the team gets paid" +getTotalMoney();
    }

    public static void readData() {

    }
}

