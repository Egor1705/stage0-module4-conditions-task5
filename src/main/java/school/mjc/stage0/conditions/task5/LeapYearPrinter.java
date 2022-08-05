package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int temp=0;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    temp=2;
                }
                else{
                    temp=1;
                }

            }
            else{
                temp = 2;
            }
        }
        else{
            temp = 1;
        }

        switch(temp){
            case 1:
                System.out.println("not leap");
                break;
            case 2:
                System.out.println("leap");
                break;
        }

        }
}
