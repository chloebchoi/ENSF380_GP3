package edu.ucalgary.oop;

import java.util.Arrays;
import java.util.regex.*;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String comments;
    private final int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private final String ENTRY_DATE;
    private Supply[] personalBelongings;
    private static int counter = 0;
    private static final String regex = "(19|20)\\d{2}[-](0[1-9]|1[1,2])[-](0[1-9]|[12][0-9]|3[01])";
    private static final Pattern correctDateFormat = Pattern.compile(regex);

    // constructor
    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
        Matcher match = correctDateFormat.matcher(ENTRY_DATE);
        boolean isMatch = match.find();
        if (firstName == null) {
            throw new IllegalArgumentException("Cannot have null firstName value.");
        } else if (ENTRY_DATE == null) {
            throw new IllegalArgumentException("Cannot have null ENTRY_DATE value.");
        } else if (isMatch == false) {
            throw new IllegalArgumentException("Invalid ENTRY_DATE: " + ENTRY_DATE);
        } else {
            this.firstName = firstName;
            this.ENTRY_DATE = ENTRY_DATE;
            this.ASSIGNED_SOCIAL_ID = counter;
            counter += 1;
        }
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public String getGender() {
        return gender;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
        Matcher match = correctDateFormat.matcher(dateOfBirth);
        boolean isMatch = match.find();

        if (isMatch == false) {
            throw new IllegalArgumentException("Invalid dateOfBirth: " + dateOfBirth);
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setPersonalBelongings(Supply[] supplies) {
        this.personalBelongings = supplies;
    }

    public void setFamilyConnections(FamilyRelation[] relation) {
        this.familyConnections = relation;
    }

    // other methods
    public void addPersonalBelonging(Supply supply) {
        int x;
        if (personalBelongings == null) {
            x = 0;
            Supply[] temp = new Supply[1];
            temp[0] = supply;
            this.personalBelongings = temp;
        } else {
            x = personalBelongings.length;
            Supply[] temp = Arrays.copyOf(personalBelongings, x + 1);
            temp[x] = supply;
            this.personalBelongings = temp;
        }
    }

    public void removePersonalBelonging(Supply supply) {
        int x = personalBelongings.length;
        Supply[] temp = Arrays.copyOf(personalBelongings, x - 1);
        int j = 0;
        for (int i = 0; i < x; i++) {
            if (personalBelongings[i] != supply) {
                temp[j] = personalBelongings[i];
                j++;
            }
        }
        this.personalBelongings = temp;
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        int x;
        if (familyConnections == null) {
            x = 0;
            FamilyRelation[] temp = new FamilyRelation[1];
            temp[x] = familyConnection;
            this.familyConnections = temp;
        } else {
            x = familyConnections.length;
            FamilyRelation[] temp = Arrays.copyOf(familyConnections, x + 1);
            temp[x] = familyConnection;
            this.familyConnections = temp;
        }
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        if (familyConnections.length == 1) {
            familyConnections = null;
        } else {
            int x = familyConnections.length;
            FamilyRelation[] temp = Arrays.copyOf(familyConnections, x - 1);
            int j = 0;
            for (int i = 0; i < x; i++) {
                if (familyConnections[i] != familyConnection) {
                    temp[j] = familyConnections[i];
                    j++;
                }
            }
            this.familyConnections = temp;
        }

    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        int x;
        if (medicalRecords == null) {
            x = 0;
            MedicalRecord[] temp = new MedicalRecord[1];
            temp[0] = medicalRecord;
            this.medicalRecords = temp;
        } else {
            x = medicalRecords.length;
            MedicalRecord[] temp = Arrays.copyOf(medicalRecords, x + 1);
            temp[x] = medicalRecord;
            this.medicalRecords = temp;
        }
    }
}