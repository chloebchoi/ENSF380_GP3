package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicalRecord {
    // Member variables
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    private static final String regex = "(19|20)\\d{2}[-](0[1-9]|1[1,2])[-](0[1-9]|[12][0-9]|3[01])";
    private static final Pattern correctDateFormat = Pattern.compile(regex);

    // Constructor
    MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException {
        Matcher match = correctDateFormat.matcher(dateOfTreatment);
        boolean isMatch = match.find();
        if (isMatch == false) {
            throw new IllegalArgumentException("Date format is incorrect.");
        } else {
            this.setDateOfTreatment(dateOfTreatment);
        }

        this.setLocation(location);
        this.setTreatmentDetails(treatmentDetails);

    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException {
        Matcher match = correctDateFormat.matcher(dateOfTreatment);
        boolean isMatch = match.find();
        if (isMatch == false) {
            throw new IllegalArgumentException("Date format is incorrect.");
        } else {
            this.dateOfTreatment = dateOfTreatment;
        }

    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }
}
