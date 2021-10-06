package chapterThree;

public class HeartRate {
    private String firstName;
    private String lastName;
    private String dateOfBirt;
    private int maxHeartBeat;
    private int age;
    private int year;
    private int month;
    private int day;

    public HeartRate(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDateOfBirt(int year, int month, int day)
    {

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void calculateAge()
    {
        age = 2021 - year;
    }

    public void getAge() {
        System.out.println(age+" years");
    }

    public void displayDateOfBirth()
    {
        dateOfBirt = year + " / "+month+" / "+day;
        System.out.println(dateOfBirt);
        //return dateOfBirt;
    }

    private int calculateHeartRate()
    {
        int maxHeartRate = 220 - age;
        return maxHeartRate;
    }

    public void displayHeartBeatRange()
    {
        maxHeartBeat = calculateHeartRate();
        System.out.println(maxHeartBeat);
    }
    public void calculateHeartBeatRange()
    {
        int minRange = calculateHeartRate() / 2;
        double maxRange = (double) maxHeartBeat * 0.85;
        System.out.print("min: "+ minRange +" - "+ "Max: "+ maxRange);
    }

}

