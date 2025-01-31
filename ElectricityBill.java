import java.util.*;

Public class ElectricityBill
{
Public static void main(String[]args)
{
int units,charge,amount;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter meter number:");
int meterno = scanner.nextInt();

System.out.println("Enter previous reading");

int previous = scanner.nextInt();

System.out.println("Enter present reading");

int present = scanner.nent Int O

if (previous <present)
{
Units present-previous;

System.Out.println("Units is: "+units);

if (units > 0 && units <=100)
{
Charge=2;
}
else if (units > 101 && units <=200)
{
charge=4;
}
else
{
Charge=5;
}
System.out.println("charge is:"+charge);
amount=units*charge;
System.out.println("amount is:"+amount);
}
else
{
System.out.println("please Enter valid reading");
}
}
}