package com.bankingServer;

public class customer {
      Accounts [] account;
      branch [] branching;
      private String address;
      
      public int deposist(int amount,int accountNumber,customer[] cust) {
    	  for(int i=0;i<cust.length;i++) {
    		  if(cust[i].account[0].getAccountNumber()==accountNumber) {
    			  cust[i].account[0].setAmount(cust[i].account[0].getAmount()+amount);
    			  return cust[i].account[0].getAmount();
    		  }
    	  }
    	  return 0;
    	
      }
      public int withdrawl(int amount,int accountNumber,customer[] cust) {
    	  for(int i=0;i<cust.length;i++) {
    		  if(cust[i].account[0].getAccountNumber()==accountNumber) {
    			  cust[i].account[0].setAmount(cust[i].account[0].getAmount()-amount);
    			  return cust[i].account[0].getAmount();
    		  }
    	  }
    	  return 0;
    	
      }
      
      
      customer(){
    	  
      }
	public Accounts[] getAccount() {
		return account;
	}
	public void setAccount(Accounts[] account) {
		this.account = account;
	}
	public branch[] getBranching() {
		return branching;
	}
	public void setBranching(branch[] branching) {
		this.branching = branching;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
      customer(Accounts[] account,String address,branch [] branching){
    	  this.account=account;
    	  this.address=address;
    	  this.branching=branching;
      }
      
     
      
	
    
}
