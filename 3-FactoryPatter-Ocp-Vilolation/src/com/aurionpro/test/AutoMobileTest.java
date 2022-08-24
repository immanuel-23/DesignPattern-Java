package com.aurionpro.test;

import com.aurionpro.model.AutoMobileFactory;
import com.aurionpro.model.AutoType;
import com.aurionpro.model.IAutoMobile;

public class AutoMobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoMobileFactory amf = new AutoMobileFactory();
		IAutoMobile am1 = amf.makeAutoMobile(AutoType.BMW);
		am1.start();
		am1.stop();
		IAutoMobile am2 = amf.makeAutoMobile(AutoType.TESLA);
		am2.start();
		am2.stop();
		IAutoMobile am3 = amf.makeAutoMobile(AutoType.MARUTI);
		am3.start();
		am3.stop();
		// factory patter violates ocp to over come it we use factory method

	}

}
