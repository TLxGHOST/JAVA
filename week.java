import java.util.*;
public class week
{
 public static void main(String args[])
 {
  //considering month starts with monday
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter week day: ");
  int a = sc.nextInt();
 
  switch(a)
  {
   case 7:
   case 14:
    case 21:
     case 28:
     System.out.println("Monday");
     break;
   
   case 1:
    case 8:
     case 15:
      case 22:
   System.out.println("Tuesday");
     break;
   
   
   case 2:
    case 9:
     case 16:
      case 23:
      System.out.println("Wednesday");
     break;
      
       case 3:
        case 10:
         case 17:
          case 24:
           case 30:
           System.out.println("Thursday");
     break;
   
   case 4:
    case 11: case 18: case 25: case 31:
   System.out.println("Friday");
     break;
   case 5:
    case 12:
     case 19:
      case 26:
      System.out.println("Saturday");
     break;
   
   case 6:
    case 13:
    case 20:
     case 27:    
     System.out.println("Sunday");
     break;
     }
     }
     }
     //output:
        // Enter week day:
        // 1
        // Tuesday
        // Enter week day:
        // 2
        // Wednesday
        // Enter week day:
        // 3
        // Thursday
        // Enter week day:
        //23
        // Wednesday
        // Enter week day:
        // 30

        // Thursday