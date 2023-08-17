package git.jd499.fmsquadbuilder;

public class PlayerContractInfo {
    private final String contractExpires;
    private final String salary;

    public PlayerContractInfo(String contractExpires, String salary) {
        this.contractExpires = contractExpires;
        this.salary = salary;
    }

    public String getContractExpires() {
        return contractExpires;
    }

    public String getSalary() {
        return salary;
    }
}

