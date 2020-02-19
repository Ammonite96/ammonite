package Test;

public class Toyota extends Car {

    private String body = "150";

    public String getBody() {
        return body;
    }

    @Override
    public String driveForward() {
        return "Ползу за камри";
    }
}
