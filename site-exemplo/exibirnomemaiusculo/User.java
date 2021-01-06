package site-exemplo.exibirnomemaiusculo;

public class User {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastname(String LastName) {
        this.lastName = LastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

}
