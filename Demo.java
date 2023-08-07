import java.util.Scanner;

public class Demo {
    private static Scanner scanner=new Scanner (System.in);
    public static void main(String[] args) {
        String RED= "\033[31m";
        String RESET= "\033[0m";
        String BLUE="\033[34;1m";
        String YELLOW="\033[33m";
        String GREEN= "\033[32m";
 //--------------------(NAME)--------------------------------------------------------       
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        if (name.length()==0)  {
           System.out.printf("%sInvalid Name%s \n",RED,RESET);
           System.exit(0);
           
        }else if (name.contains("  ")){
             System.out.printf("%sInvalid Name%s \n",RED,RESET);
             System.exit(0);
        }

 //------------------------(AGE)---------------------------------------------------       
        
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age<10||age>18){
             System.out.printf("%sInvalid Age%s \n",RED,RESET);
             System.exit(0);
        }
//----------------------------(SUBJECT 1)----------------------------------------------------
        System.out.print("Enter subject 1 : ");
        String sub1 = scanner.nextLine();
        if (sub1.length()==0)  {
           System.out.printf("%sInvalid Subject%s \n",RED,RESET);
           System.exit(0);
        }else if (!(sub1.contains("SE-"))){
             System.out.printf("%sInvalid Subject%s \n",RED,RESET);
             System.exit(0);
        }
        System.out.print("Enter Marks for "+sub1+ " : ");
        Double mark1 = scanner.nextDouble();
        scanner.nextLine();
        if(mark1<0||mark1>100){
             System.out.printf("%sInvalid Marks%s \n",RED,RESET);
             System.exit(0);
        }


//-----------------------------(SUBJECT 2)-----------------------------------------------------
        System.out.print("Enter subject 2 : ");
        String sub2 = scanner.nextLine();
        if (sub2.length()==0)  {
           System.out.printf("%sInvalid Subject%s \n",RED,RESET);
           System.exit(0);
        }else if (!(sub2.contains("SE-"))){
             System.out.printf("%sInvalid Subject%s \n",RED,RESET);
             System.exit(0);
        }
        else if(sub2.equals(sub1)){
            System.out.printf("%sInvalid Subject.Subject All ready exists%s \n",RED,RESET); 
            System.exit(0);
        }

         System.out.print("Enter Marks for "+sub2+ " : ");
        Double mark2 = scanner.nextDouble();
        scanner.nextLine();
        if(mark2<0||mark2>100){
             System.out.printf("%sInvalid Marks%s \n",RED,RESET);
             System.exit(0);
        }

//-----------------------------(SUBJECT 3)-------------------------------------------------------
        System.out.print("Enter subject 3 : ");
        String sub3 = scanner.nextLine();
        if (sub3.length()==0)  {
           System.out.printf("%sInvalid Subject%s \n",RED,RESET);
           System.exit(0);
        }else if (!(sub3.contains("SE-"))){
             System.out.printf("%sInvalid Subject%s \n",RED,RESET);
             System.exit(0);
        }
        else if(sub3.equals(sub1)||sub3.equals(sub2)){
            System.out.printf("%sInvalid Subject.Subject All ready exists%s \n",RED,RESET); 
            System.exit(0);
        }

         System.out.print("Enter Marks for "+sub3+ " : ");
        Double mark3 = scanner.nextDouble();
        scanner.nextLine();
        if(mark3<0||mark3>100){
             System.out.printf("%sInvalid Marks%s \n",RED,RESET);
             System.exit(0);
        }
        System.out.println();
        Double total=(double)(mark1+mark2+mark3);
        double avg=total/3;
        String status=(avg>=75)?BLUE+"Distinguished Pass"+RESET:avg>=65?GREEN+"Credit Pass"+RESET:avg>=55?YELLOW+"Pass"+RESET:RED+"Fail"+RESET;
        String status1=(mark1>=75)?BLUE+"Distinguished Pass"+RESET:mark1>=65?GREEN+"Credit Pass"+RESET:mark1>=55?YELLOW+"Pass"+RESET:RED+"Fail"+RESET; 
        String status2=(mark2>=75)?BLUE+"Distinguished Pass"+RESET:mark2>=65?GREEN+"Credit Pass"+RESET:mark2>=55?YELLOW+"Pass"+RESET:RED+"Fail"+RESET; 
        String status3=(mark3>=75)?BLUE+"Distinguished Pass"+RESET:mark3>=65?GREEN+"Credit Pass"+RESET:mark3>=55?YELLOW+"Pass"+RESET:RED+"Fail"+RESET;                        

        System.out.printf("+%40s+\n","-----------------------------------------");
        System.out.printf("|%12s :%s%-27s%s|\n","Name",BLUE,name.toUpperCase(),RESET);
        System.out.printf("|%12s :%-27s|\n","Age",age+" years old");
        System.out.printf("|%12s :%-27s|\n","Status",status);
        System.out.printf("|%12s :%-5.2f%12s : %-5.2f |\n","Total Marks",total,"Average",avg);
        System.out.printf("+%40s+\n","-----------------------------------------");
        System.out.printf("|%13s|%8s|%18s|\n","Subject ","Marks ","Status ");
        System.out.printf("+%40s+\n","-----------------------------------------");
        System.out.printf("|%-13s|%8.2f|%18s|\n",sub1,mark1,status1);
        System.out.printf("|%-13s|%8.2f|%18s|\n",sub2,mark2,status2);
        System.out.printf("|%-13s|%8.2f|%18s|\n",sub3,mark3,status3);
        
    }
    
}
