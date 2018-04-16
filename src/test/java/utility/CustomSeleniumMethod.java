package utility;


import base.Testbase;

public class CustomSeleniumMethod extends Testbase {
	
  
  
  public static void hardWait(int sec) {
		 
	  try {
		Thread.sleep(sec*1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	    }

	
}
