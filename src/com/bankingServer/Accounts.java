package com.bankingServer;

public class Accounts {
      private String firstName;
	 private String lastName;
      private  int AccountNumber;
      private int mobileNumber;
      private int amount;
      
     

	public int getMobileNumber() {
		return mobileNumber; 
	}

	public void setMobileNumber(int mobileNumber) {
		String m=mobileNumber+"";
		if(m.length()<=9) {
			this.mobileNumber = mobileNumber;
		}else {
			this.mobileNumber = 000000000;
		}
		
	}
    
//	 Accounts(String firstName, String lastName,int AccountNumber,int mobileNumber,int amount){
//		
//    	
//      }
	
	 public Accounts[] getDetailsByAccNumber(int accountNumber,customer[] cust) {
		     
   	        Accounts ab[]=new Accounts[1];
   	        for(int i=0;i<cust.length;i++) {
   	        	if((cust[i].account[0].AccountNumber)==accountNumber) {
   	        		ab[0]=cust[i].account[0];
   	        		break;
   	        	}
   	        }
   	        return ab;
   	        
     }
	 
	 Accounts(String string, String string2, int i, int j, int k){
		  this.firstName=string;
    	  this.lastName=string2;
    	  this.AccountNumber=i;
    	  this.mobileNumber=j;
    	  this.amount=k;
	    }
	 Accounts(){
		 
	 }
	 
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
      
      public String getFirstName() {
  		return firstName;
  	}

  	public void setFirstName(String firstName) {
  		this.firstName = firstName;
  	}

  	public String getLastName() {
  		return lastName;
  	}

  	public void setLastName(String lastName) {
  		this.lastName = lastName;
  	}

  	public int getAccountNumber() {
  		return AccountNumber;
  	}

  	public void setAccountNumber(int accountNumber) {
  		String a=""+accountNumber;
  		if(a.length()<=9) {
  			AccountNumber = accountNumber;
  		}else {
  			System.out.println("enter valid number");
  		}
  		
  	}
       
}
