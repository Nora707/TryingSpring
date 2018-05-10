package SpaceShipCompany.commons;

public enum Rank {
    Captain(1,1), Chief_Officer(2,2), Pilot(3,3), Navigator(4,4), Communication_Officer(4,5), Chief_Engineer(3,6), Engineering_Crewman(5,7), General(2,8), Chief_of_Security(2,9), Chief_Science_Officer(3,10), Scientis(5,11), Chief_Medical_Officer(3,12), Medic(5,13);

    private int inCommandLine;



    private int code;

    Rank(int inCommandLine, int code) {
        this.inCommandLine = inCommandLine;
        this.code = code;
    }

    public int getInCommandLine() {
        return inCommandLine;
    }

    public int getCode() {
        return code;
    }
}
