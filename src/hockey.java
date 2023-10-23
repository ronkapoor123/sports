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
}

