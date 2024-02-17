package CameraAndDrill;

public class CameraAndDrill {
	
	static String state = "Idle";
	static String innerState = "Off";
	
	
	
	public static void main(String[] args) {
		
		//Take A Picture With Color Camera
		televisionControlUnit("Button One Five Seconds");
		colorCameraMode("Button One");
		
		//Back To Idle
		colorCameraMode("Button Two");
		
		//Access Temporizer With 16 MM Camera
	    televisionControlUnit("Button One Ten Seconds");
	    sixteenMMCameraMode("Button One For Five Seconds");
		
	  //Back To Idle
	    sixteenMMCameraMode("Button Two");
	    
	  //Turn Drill On
	    televisionControlUnit("Button One Twice");
	    drillMode("Button One");
	    
	  //Turn Drill On
	    drillMode("Button One");
	    
	  //Back To Idle
	    drillMode("Button Two");

	}
	
	
	    public static void capturePhoto(String cameraType) {
		
		if (cameraType == "Color Camera"){
			System.out.println("Take A Picture With Color Camera");
		}
		else if (cameraType == "16 mm Camera") {
			System.out.println("Take A Picture With 16 MM Camera");
		}
	    }
		public static void temporizer(String cameraType) {
			
			if (cameraType == "Color Camera"){
				System.out.println("Temporizer With Color Camera");
			}
			else if (cameraType == "16 mm Camera") {
				System.out.println("Temporizer With 16 MM Camera");
			}
		}
			
		public static void colorCameraMode(String buttonAction) {
			
			
			state = "Color Camera Mode";
			
			if (buttonAction == "Button One") {
				capturePhoto("Color Camera");
			}
			
			else if (buttonAction == "Button One For Five Seconds") {
				temporizer("Color Camera");
			}
			
			else if (buttonAction == "Button Two") {
				state = "Idle";
			}
			else {
				System.out.println("Color Camera Mode");
			}
			}
	
		public static void sixteenMMCameraMode(String buttonAction) {
			state = "16 MM Camera Mode";
			
			if (buttonAction == "Button One") {
				capturePhoto("16 mm Camera");
			}
			
			else if (buttonAction == "Button One For Five Seconds") {
				temporizer("16 mm Camera");
			}
			else if (buttonAction == "Button Two") {
				state = "Idle";
			}
			else {
				System.out.println("16 MM Camera Mode");
			}
			
		}
		
		public static void drillMode(String buttonAction) {
			state = "Drill Mode";
			
			
			
			
			if (buttonAction == "Button One" && innerState == "Off") {
				innerState = "On";
				System.out.println("Drill On");
			}
			
			else if (buttonAction == "Button One" && innerState == "On") {
				innerState = "Off";
				System.out.println("Drill Off");
			}
			
			else if (buttonAction == "Button Two") {
				state = "Idle";
			}
			else {
				System.out.println("Drill Mode:Off");
			}
			
		}
			
		
		
		public static void televisionControlUnit(String buttonAction) {
			
			System.out.println("Idle");
			
			if (buttonAction == "Button One Five Seconds" && state == "Idle") {
				
				colorCameraMode("Idle");
				
			}
			
			else if (buttonAction == "Button One Ten Seconds" && state == "Idle") {
				
            	sixteenMMCameraMode("Idle");
				
			}
            
            else if (buttonAction == "Button One Twice" && state == "Idle") {
				
            	drillMode("Idle");
				
			}
            
			
		}
		
			
			
			
		
	
	
	
	
	
	

	

}
