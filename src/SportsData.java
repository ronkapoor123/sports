public class SportsData {

    private String Team;
    private Long totalMoney;

    public SportsData(String team, Long totalMoney) {
        Team = team;
        this.totalMoney = totalMoney;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }
}

