package edu.ucalgary.oop;

public class Inquirer {
    private final String firstName;
    private final String lastName;
    private final String info;
    private final String servicesPhoneNum;

    public Inquirer(String firstName, String lastName, String servicesPhoneNum, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicesPhoneNum = servicesPhoneNum;
        this.info = info;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInfo() {
        return info;
    }

    public String getServicesPhoneNum() {
        return servicesPhoneNum;
    }
}
