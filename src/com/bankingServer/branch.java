package com.bankingServer;

public class branch {
     private String branchName;
     private String branchCode;
     private String iFSCODE;
     private String MicrCode;
     
     branch(String branchName,String branchCode,String iFSCODE,String MicrCode){
    	 this.branchName=branchName;
    	 this.branchCode=branchCode;
    	 this.iFSCODE=iFSCODE;
    	 this.MicrCode=MicrCode;
     }
     
     public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getiFSCODE() {
		return iFSCODE;
	}
	public void setiFSCODE(String iFSCODE) {
		this.iFSCODE = iFSCODE;
	}
	public String getMicrCode() {
		return MicrCode;
	}
	public void setMicrCode(String micrCode) {
		MicrCode = micrCode;
	}
	
     
     
}
