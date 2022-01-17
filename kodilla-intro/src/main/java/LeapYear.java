public class LeapYear {
    public static void main(String[] args) {

        int yearToCheck = 2000;
                System.out.println(yearToCheck);

        if (yearToCheck%4==0 && yearToCheck%100==0 && yearToCheck%400==0)
            System.out.println("jest rokiem przestępnym");
        else {
            System.out.println("nie jest rokiem przestępnym");}
        }
        }

