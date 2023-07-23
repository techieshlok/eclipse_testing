package com.bankingServer;
import java.util.*;
public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       customer cm=new customer(new Accounts[] {new Accounts("shlok","sharma",123456948,547896858,1000)},"pumphouse",new branch[] {new branch("andheri","and102","idi0973","micr098")});
       customer cm1=new customer(new Accounts[] {new Accounts("aniket","sharma",123456949,547896859,2000)},"saiwadi",new branch[] {new branch("andheri","and103","idi0974","micr099")});
       customer cm2=new customer(new Accounts[] {new Accounts("mukesh","sharma",123456947,547896857,500)},"jijamata",new branch[] {new branch("andheri","and102","idi0973","micr098")});
       customer[]cust =new customer[] {cm,cm1,cm2};
       customer c=new customer();
       Accounts ac=new Accounts();
//       System.out.println(c.deposist(100, 123456948,cust));
       System.out.println(c.deposist(100, 123456949,cust));
       System.out.println(c.withdrawl(100, 123456947,cust));
       System.out.println(ac.getDetailsByAccNumber(123456949, cust)[0].getAmount());
       
	}

}
