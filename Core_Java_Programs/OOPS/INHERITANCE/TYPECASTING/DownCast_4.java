interface Bank{  
	float rateOfInterest();  
} 
 
class SBI implements Bank{  
	public float rateOfInterest(){
			return 9.15f;
		}  
}  

class PNB implements Bank{  
	public float rateOfInterest(){
			return 8.5f;
		}  
}  

class DownCast_4{  
	public static void main(String[] args){  
		Bank b = new SBI();  
		System.out.println("SBI ROI: "+b.rateOfInterest());  
		
		Bank b2 = new PNB();
		System.out.println("PNB ROI: "+b2.rateOfInterest()); 
	}
}  