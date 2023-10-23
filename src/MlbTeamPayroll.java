public class MlbTeamPayroll extends SportsData{
    public int rank() {
        return rank;
    }

    public MlbTeamPayroll setRank(int rank) {
        this.rank = rank;
        return this;
    }

    // fields
    private int rank;
    private long payroll;
    private long injuredreserve;
    private long retained;

    public baseball(String team, Long payroll, Long injuredreserve, Long retained);

    }


  //www.spotrac.com/mlb/payroll/2023/;

    // constructors

    // setter/getters

    // methods
    public String toString() {
        String description = "Team named" + Names + " is ranked " + rank;
        return description;
    }

}
