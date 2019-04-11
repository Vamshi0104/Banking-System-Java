import java.lang.*;
import java.util.*;
import java.io.*;
import java.text.*;
interface Bankapp
{
public void open();
public void deposit();
public void withdraw();
public void printstate();
}
class Bank implements Bankapp
{
int amount,bal,amount1,amount2,op;
String acc="3456867695754281";
static String endtag = "---------------------"
+"----------------------------------------"
  + "------------------------------------------";
static String name;
static long ph;
static int c;
Scanner d=new Scanner(System.in);
public void printstate()
{
System.out.print(endtag);
System.out.println("\t\t\t\t>>>SBI Personal Banking<<<");
System.out.println(endtag);
System.out.println("\n\t\t\t\t\t>>>>>TRANSACTION SLIP<<<<<");
Date d = new Date();
SimpleDateFormat ft = new SimpleDateFormat ("E dd.M.yyyy\thh:mm:ss a");
System.out.println("\n\n" + ft.format(d));
System.out.println("\n\t\t\t\t\t\t\t\t\t\tUSERNAME:"+name+"\n\t\t\t\t\t\t\t\t\t\tPhN.o:"+ph);
System.out.println("\n\n\tCard N.o:"+acc);
int bal2=amount+amount1-amount2;
System.out.println("\n\tLedger Balance :"+bal2);
System.out.println("\n\tAvailable Balance :"+bal2);
System.out.println("\n\t\t\t\t\t\t!!HURRY UP!!\n\n\t\t\t\t\tVISIT YOUR BRANCH TODAY\n\n\n\t\t\t\t>>>Please Visit Again<<<");
System.out.println(endtag);
}
public void open()
{ 
System.out.println("\n\t\t\t\tEnter Amount to Open:");
amount =d.nextInt();
if(amount>500)
{
System.out.println("\t\t\t\tStatus:Account opened");
bal=amount;
System.out.println("\n\t\t\t\t\tBalance:"+bal);
System.out.println(endtag);
}
else
{
System.out.println("insuffient to open :(");
System.out.println("\t\t\t\t>>THANK YOU AND VISIT AGAIN<<");
System.out.println(endtag);
System.exit(0);
}
}
public void deposit()
{
System.out.println("\t\t\t\tEnter Amount to Deposit:");
amount1=d.nextInt();
if(amount1>0)
{
System.out.println("\t\t\t\tAmount to Deposit :"+amount);
bal=bal+amount1;
System.out.println("\n\t\t\t\tBalance after Depositing:"+bal);
}
else
{
System.out.println("insuffient to deposit");
System.out.println("\t\t\t\t>>THANK YOU AND VISIT AGAIN<<");
System.out.println("endtag");
System.exit(0);
}
}
public void withdraw()
{
System.out.println("\t\t\t\tEnter Amount to WithDraw:");
amount2=d.nextInt();
if((bal>=amount2)&&(amount2>0))
{
bal=bal-amount2;
System.out.println("\n\t\t\t\tBalance after Withdrawal :"+bal);
}
else
{
System.out.println("insuffient to withdraw :(");
System.out.println("\t\t\t\t>>THANK YOU AND VISIT AGAIN<<");
System.exit(0);
}
}
public static void main(String args[])
{
int count;
int chance=3,op;
char ch,ch1,ch2;
c=0;
 boolean b1;
Scanner s = new Scanner(System.in);
System.out.println("Enter 4 digit Pin: ");
int key =s.nextInt();
for( count = 0 ; count<3 ; count++)
{
if(key!=2000)
{
System.out.println("Incorrect Pin...Try again !!Chances Left"+(chance-count)+"times");
System.out.println("ReEnter the Pin:");
key =s.nextInt();
if(count==2)
{
System.out.println("Account is Blocked :(");
System.out.println("For More Info. SBI Customer Support for more Details.....");
System.out.println(endtag);
System.exit(0);
}
}
else
{
System.out.println("ACCESS GRANTED :)");
System.out.print(endtag);
System.out.println("\t\t\t\tWelcome To SBI Personal Banking System");  
System.out.println(endtag); 
Date d = new Date( );
SimpleDateFormat ft = new SimpleDateFormat ("E dd.M.yyyy[hh:mm:ss a]");
System.out.println("\n" + ft.format(d));
System.out.println("\n\t\t\t\t\t>>>BASIC INFORMATION<<<\n\n\t\t\t\t\tEnter Your Full Name:");
name =s.next();
int stringLength = name.length();
b1 = Character.isUpperCase(name.charAt(1));
if(stringLength<5)
{
System.out.println("\n\t\t\t\tName is Too Short for Accessing\n\n\t\t\t\t>Kindly Enter FullName!!<");
name =s.next();
}
if(stringLength>20)
{
System.out.println("Name should not exceed 20 characters!! Try Again:(");
System.exit(0);
}
else
System.out.println("\n\t\t\t\t\t\t\t\t\tWelcome\t"+name+":)"); 
System.out.println("\t\t\t\t\tEnter Contact to be Linked\n\n");
ph=s.nextLong();
System.out.println("\n\t\t\t\t$$You have Successfully Linked with Account$$");
System.out.println(endtag);
break;
}
}
Bank b=new Bank();
b.open();
System.out.println("\n\t\t\t<Enter D>DEPOSIT && W>WITHDRAWAL>");
ch=s.next().charAt(0);
if(ch=='D'||ch=='d')
{
b.deposit();
}
else if(ch=='W'||ch=='w')
{
b.withdraw();
}
else
{
System.out.println("Invalid operation!!!TRY AGAIN :(");
System.exit(0);
}
System.out.println("\n\t\t\tDo you Want to Peform Transaction Again??\n\n\t\t\t\t\tEnter >Yes/No<");
ch1=s.next().charAt(0);
if(ch1=='Y'||ch1=='y')
{
System.out.println("\n\t\t\t\t<Choose Any Operation to Perform>\n\t\t\t\t\t1.DEPOSIT\n\t\t\t\t\t2.Withdrawal\n\t\t\t\t\t3.MINI Statement\n\t\t\t\t\t4.EXIT");
op=s.nextInt();
switch(op)
{
case 1:
b.deposit();
break;
case 2:
b.withdraw();
break;
case 3:
b.printstate();
break;
case 4:
System.exit(0);
break;
default:System.out.println("INVALID OPTION!!");
}
if(op==3)
System.exit(0);
System.out.println("\n\n\t\t\t\tDo you want print MINI Statement??\n\t\t\t\t\tEnter YES/NO.....");
ch2=s.next().charAt(0);
if(ch2=='Y'||ch2=='y')
{
b.printstate();
}
else
{
System.out.println("\n\t\t\t\t>>THANK YOU AND VISIT AGAIN<<");
System.out.println(endtag);
}
}
else if(ch1=='N'||ch1=='n')
{
System.out.println("\n\n\t\t\t\tDo you want print MINI Statement??\n\t\t\t\t\tEnter YES/NO.....");
ch2=s.next().charAt(0);
if(ch2=='Y'||ch2=='y')
{
b.printstate();
}
else
{
System.out.println("\n\t\t\t\t>>THANK YOU AND VISIT AGAIN<<");
System.out.println(endtag);
System.exit(0);
}
}
}
}