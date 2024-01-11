import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String date;

        System.out.print("Enter Date(YYYY-MM-dd) : ");
        date=input.next();

        String[] Array_date=date.split("-");

        switch(Array_date[1]) {
            case "01":
                Array_date[1]="January";
                break;
            case "02":
                Array_date[1]="Febury";
                break;
            case "03":
                Array_date[1]="March";
                break;
            case "04":
                Array_date[1]="April";
                break;
            case "05":
                Array_date[1]="May";
                break;
            case "06":
                Array_date[1]="June";
                break;
            case "07":
                Array_date[1]="July";
                break;
            case "08":
                Array_date[1]="August";
                break;
            case "09":
                Array_date[1]="September";
                break;
            case "10":
                Array_date[1]="October";
                break;
            case "11":
                Array_date[1]="November";
                break;
            case "12":
                Array_date[1]="December";
                break;
            default:
                System.out.println("Months Number only 01-12");

        }

        System.out.println("Output : " + Array_date[1]+" "+Array_date[2]+","+Array_date[0]);

    }
}