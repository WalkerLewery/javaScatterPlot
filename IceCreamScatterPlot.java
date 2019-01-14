import java.util.Scanner;
public class IceCreamScatterPlot{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		System.out.println(input);
		int [] x=new int[30];
		int [] y=new int[30];
		int spaceCounter=0;
		boolean firstTime=true;
		input= scan.nextLine();
		int space=0;
		for(int i=0;i<30;i++){
		if(input!="end" && scan.hasNextLine()){				
			String[] data = input.split(",");
			x[i] = Integer.parseInt(data[0]);
			y[i] = Integer.parseInt(data[1]);
			input= scan.nextLine();
			
		}}
		
		int n = x.length; 
       		for (int i = 0; i < n-1; i++) 
                	for (int j = 0; j < n-i-1; j++) 
                		if (x[j] > x[j+1]){ 
                    		
                    		int temp = x[j]; 
				int temp2 = y[j]; 
                   		 x[j] = x[j+1]; 
                   		 x[j+1] = temp; 
				 y[j] = y[j+1]; 
                   		 y[j+1] = temp2; 
              			 } 
	
		for(int i=1000;i>=0;i-=100){
			
			if(i==0){
				System.out.print("$"+i+"\t└");
				for(int l = 0; l<30;l++){
					System.out.print("-");
				}
				System.out.println();
				System.out.print("        0    5    10   15   20   25   30");
			
			}		
			else{
				int holder =0;
				System.out.print("$"+i+"\t|");
				for(int j=0; j<y.length; j++){
					if(y[j]==i){
						if(holder!=0){
							space = x[j]-holder;
						}
						else{
							space = x[j];
						}
						holder = x[j];
						for(int k =0; k<space-1;k++){
							System.out.print(" ");
						}
						if(j>0&&(x[j]!=x[j-1]))
						System.out.print("*");
						
					}
				}
			}
			System.out.println();

		}//for i
		
	}//main method
}//class
