public class MlbTeamPayroll extends SportsData{
    // fields
    private int rank;
    private long payroll;
    private long injuredreserve;
    private long retained;


    //www.spotrac.com/mlb/payroll//;

    // constructors

    // setter/getters

    // methods
    public String toString() {
        String description = "Team named" + teamNames + " is ranked " + rank;
        return description;
    }

}
