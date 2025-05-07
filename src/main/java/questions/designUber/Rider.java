package questions.designUber;

import java.util.UUID;

public class Rider {
    private String riderId;
    private String riderName;
    private String rideremail;
    Rider(String riderName, String riderEmail){
        this.riderId = UUID.randomUUID().toString();
        this.riderName = riderName;
        this.rideremail = riderEmail;
    }
    public String getRidername(){return this.riderName;}
    public String getRiderId(){return this.riderId;}
    public String getRiderEmail(){return this.rideremail;}

}
