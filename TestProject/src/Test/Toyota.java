package Test;

public class Toyota extends Car {

    private String body = "150";

    public Toyota (){

    }

    public Toyota(String body) {
        this.body = body;
    }

    public Toyota(int maxSpeed, String model, String body) {
        super(maxSpeed, model);
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String driveForward() {
        return "Ползу за камри";
    }
}
