public class Birb {
    private String politicalAffiliation;
    private String religiousAffiliation;
    private String color;
    private String age;
    private String species;
    private int flightSpeed;
    private int groundSpeed;
    private boolean whenActive;

    public void printInfo(){
        System.out.printf("Political Affiliation: %s%nReligious Affiliation: %s%n" +
                "Color: %s%nAge: %s%nHighest Observed Flight Speed: %s%n" +
                "Highest Observed Ground Speed: %s%nTime of Day When Active: %s%n",
                politicalAffiliation, religiousAffiliation, color, flightSpeed, groundSpeed, whenBirdActive());
    }

    public void calculateFlightSpeed(int distance, int time){
        if (distance/time >= 0 && distance/time > flightSpeed){flightSpeed = distance/time;}
    }

    public String whenBirdActive(){
        String string;
        if(whenActive = true){string = "Day";}

        else {string = "Night";}

        return string;
    }


}
