package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;
    private static final String regex = "(19|20)\\d{2}[-](0[1-9]|1[1,2])[-](0[1-9]|[12][0-9]|3[01])";
    private static final Pattern correctDateFormat = Pattern.compile(regex);

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided,
            Location lastKnownLocation) {
        if (inquirer == null || missingPerson == null || dateOfInquiry == null ||
                infoProvided == null || lastKnownLocation == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException {
        Matcher match = correctDateFormat.matcher(dateOfInquiry);
        boolean isMatch = match.find();

        if (isMatch == false) {
            throw new IllegalArgumentException("Invalid dateOfInquiry: " + dateOfInquiry);
        } else {
            this.dateOfInquiry = dateOfInquiry;
        }
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getLogDetails() {
        // Assuming log details include all information
        return "Inquirer: " + this.inquirer.getFirstName() + ", " +
                "Missing Person: " + this.missingPerson.getFirstName() + ", " +
                "Date of Inquiry: " + this.dateOfInquiry + ", " +
                "Info Provided: " + this.infoProvided + ", " +
                "Last Known Location: " + this.lastKnownLocation.getName();
    }
}
