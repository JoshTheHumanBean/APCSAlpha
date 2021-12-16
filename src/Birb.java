public class Birb {
    private String species;
    private String politicalAffiliation;
    private String religiousAffiliation;
    private String color;
    private int age;
    private int flightSpeed;
    private int groundSpeed;
    private boolean whenActive;

    public Birb(){
        this.species = "null";
        this.politicalAffiliation = "null";
        this.religiousAffiliation = "null";
        this.color = "null";
        this.age = 0;
        this.flightSpeed = 0;
        this.groundSpeed = 0;
        this.whenActive = true;
    }

    public Birb (String s, String p, String r, String c, int a, int f, int g, boolean w){
        this.species = s;
        this.politicalAffiliation = p;
        this.religiousAffiliation = r;
        this.color = c;
        this.age = a;
        this.flightSpeed = f;
        this.groundSpeed = g;
        this.whenActive = w;
    }

    public void printInfo(){
        System.out.printf("Species: %s%nPolitical Affiliation: %s%nReligious Affiliation: %s%n" +
                "Color: %s%nAge: %s%nHighest Observed Flight Speed: %s%n" +
                "Highest Observed Ground Speed: %s%nTime of Day When Active: %s%n",
                species, politicalAffiliation, religiousAffiliation, color, age, flightSpeed, groundSpeed, whenBirdActive());
    }

    public void calculateFlightSpeed(int distance, int time){
        if (distance/time >= 0 && distance/time > flightSpeed){flightSpeed = distance/time;}
    }

    public String whenBirdActive(){
        String string;
        if(whenActive){string = "Day";}

        else {string = "Night";}

        return string;
    }


}
