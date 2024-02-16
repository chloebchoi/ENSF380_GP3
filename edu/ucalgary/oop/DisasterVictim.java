package edu.ucalgary.oop;
import java.util.Arrays;
import java.util.regex.*;;

public class DisasterVictim{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private int counter;
    private static final String regex = "(19|20)\\d{2}[-](0[1-9]|1[1,2])[-]/[1-31]/";
    private static final Pattern correctDateFormat = Pattern.compile(regex);


    // constructor
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        Matcher match = correctDateFormat.matcher(ENTRY_DATE);
        boolean isMatch = match.find();
        if (firstName == null){
            throw new IllegalArgumentException("Cannot have null firstName value.");
        } 
        else if (ENTRY_DATE == null) {
            throw new IllegalArgumentException("Cannot have null ENTRY_DATE value.");
        }
        else if (isMatch == false) {
            throw new IllegalArgumentException("Invalid ENTRY_DATE: " + ENTRY_DATE);
        }
        else {
            this.firstName = firstName;
            this. ENTRY_DATE = ENTRY_DATE;
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
    public void setDateOfBirth(String dateOfBirth) {
        Matcher match = correctDateFormat.matcher(ENTRY_DATE);
        boolean isMatch = match.find();

        if (isMatch == false) {
            throw new IllegalArgumentException("Invalid dateOfBirth: " + dateOfBirth);
        }
        else {
            this.dateOfBirth = dateOfBirth;
        }
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setComments(String comments){
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
        int x = personalBelongings.length;
        Supply[] temp = Arrays.copyOf(personalBelongings, x + 1);
        temp[x] = supply;
        this.personalBelongings = temp;
    }
    public void removePersonalBelonging(Supply supply) {
        int x = personalBelongings.length;
        Supply[] temp = Arrays.copyOf(personalBelongings, x - 1);
        for (int i = 0; i < (x-1); i++){
            temp[i] = personalBelongings[i];
        }
        this.personalBelongings = temp;
    }
    public void addFamilyConnection(FamilyRelation familyConnection) {
        int x = familyConnections.length;
        FamilyRelation[] temp = Arrays.copyOf(familyConnections, x + 1);
        temp[x] = familyConnection;
        this.familyConnections = temp;
    }
    public void removeFamilyConnection(FamilyRelation familyConnection) {
        int x = familyConnections.length;
        FamilyRelation[] temp = Arrays.copyOf(familyConnections, x - 1);
        for (int i = 0; i < (x-1); i++){
            temp[i] = familyConnections[i];
        }
        this.familyConnections = temp;
    }
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        int x = medicalRecords.length;
        MedicalRecord[] temp = Arrays.copyOf(medicalRecords, x + 1);
        temp[x] = medicalRecord;
        this.medicalRecords = temp;
    }
}