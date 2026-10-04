import java.util.*;

abstract class Bank{
	private long accNum;
	private String name;
	private double balance;
	
	public Bank(long accN, String name, double bal) {
		this.accNum=accN;
		this.name=name;
		this.balance=bal;
	}// setter
	public void setBal(double bal){this.balance=bal;}
    
	// why we cant use setter here because these setter acces by any one s
	
	
	
	public void deposit(int deposit) {
	balance=balance+deposit;
}	
// getters 
public double getBal() { return balance;} 
public long AccNum() { return accNum;}
	public String Name() { return name;}

	abstract void withdraw(int withdraw);
	// 
}

class SavingsAc extends Bank{
	public SavingsAc(long accN, String name, double balance) {
		super(accN, name, balance);
	}

	
	public void withdraw(int withdraw)
	{
	   if(withdraw <= 20000  && getBal() >= withdraw) 
		   setBal(getBal() - withdraw);   // the balance is updteds here
		else 
		System.out.println("check withdraw amount ");
	   }
}

class CurrentAc extends Bank{
	public CurrentAc(long accN, String name, double balance) {
		super(accN, name, balance);
	}
	
	public void withdraw(int withdraw) {
	if( withdraw <100000 && getBal() > withdraw)
		setBal(getBal() - withdraw);
	else {
		System.out.println("check balance");
	}
	}}
			
	

public class Oops{
	
	public static void main(String[] args) {
		Bank b=new SavingsAc(321654787894L, "narasimha" , 1);
	
		System.out.println("Savings  AC");
		System.out.println("Savings  AC present bal: "+b.getBal());
		System.out.println("Acc num i s: "+b.AccNum() +"\n"+ "name : "+b.Name());
		
		b.deposit(1600);
		System.out.println("savings acc bal after depo : "+b.getBal());
		b.withdraw(160);
		System.out.println("savings acc final bal after withdraw : "+b.getBal());
		
		System.out.println("Current  AC");
		b =new CurrentAc(88615141918L,"deva",9846);
		System.out.println("Acc num i s: "+b.AccNum() +"\n"+ "name : "+b.Name());
		
		
			System.out.println("current present   AC bal: "+b.getBal());
		b.deposit(16);
		System.out.println("current acc bal: " +b.getBal());
	
		b.withdraw(40);
		System.out.println("current  acc final bal after withdraw : "+b.getBal());
	}
		
	}
