package javapractice;

public class Lec2Arithmetic {

	public static void main(String[] args) {
		// Arithmetic
		//addition
		//int number=1;
        //double number1=1.5;
        
		int num=10;
		double num2=2.5;
		//double addition;
		// addition=num+num2;
		double addition=num+num2;
		System.out.println(addition);
		
		
		
		// sub
		double sub=num-num2;
		//System.out.println(sub );
		System.out.println(" total numer after sub is: $"+sub);
		//(anything we add in the result console we need to use double coat and + then variable + i am happy
		
		
		
		
	//devison
		double devison=num/num2;
		System.out.println(devison);
		
		//multification
        double multification=num*num2;
        System.out.println(multification);
        
        // modulus
        int mod=7;
        double mod1=2.3;
        double modulus=mod%mod1;
        System.out.println(modulus);
        
        //increment by 1
        
        int inc1=2;
        //inc1+=1;
      inc1=inc1+1;
        System.out.println(inc1);
        
        //increment 4
        int inc3=10;
      //inc3=inc3+4;
        inc3+=4;
        System.out.println(inc3);
        
       // decremet 1
        double dec1=10.2;
        dec1=dec1-1;
 //    dec1-=1;
        
        System.out.println(dec1);
        //decrement by 1when value is 5.5
        double dec2=5.5;
        dec2--;
        System.out.println("decrement by 1 for value for 5.5 is "+dec2+ " happy ");
	}

} 
