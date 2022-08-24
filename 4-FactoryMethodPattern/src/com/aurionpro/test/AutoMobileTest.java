package com.aurionpro.test;

import com.aurionpro.model.BmwFactory;
import com.aurionpro.model.IAutoMobile;
import com.aurionpro.model.IAutoMobileFactory;
import com.aurionpro.model.TeslaFactory;

public class AutoMobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		AutoMobileFactory amf = new AutoMobileFactory();
//		IAutoMobile am1 = amf.makeAutoMobile(AutoType.BMW);
//		am1.start();
//		am1.stop();
//		IAutoMobile am2 = amf.makeAutoMobile(AutoType.TESLA);
//		am2.start();
//		am2.stop();
//		IAutoMobile am3 = amf.makeAutoMobile(AutoType.MARUTI);
//		am3.start();
//		am3.stop();
//		// factory patter violates ocp to over come it we use factory method
		IAutoMobileFactory factory= BmwFactory.getInstance();
		IAutoMobile bmw= factory.makeAutoMobile();

		 bmw.start();
		 bmw.stop();
		IAutoMobileFactory factory1= TeslaFactory.getInstance();		
		IAutoMobile tesla= factory1.makeAutoMobile();
		tesla.start();
		tesla.stop();

			
			

		 
//		 System.out.println(bmw.hashCode());
//		 System.out.println(bmw1.hashCode());
//		IAutoMobileFactory factory1= new TeslaFactory();
//
//		IAutoMobile tesla= factory1.makeAutoMobile();
//		tesla.start();
//		tesla.stop();


	}

}
