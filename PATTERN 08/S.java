/*
* * *
 * *
* * *
 * *
* * *
*/
public class S{
	public static void main(String[] args) {
		
		int N=5;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){

				if(i%2==1){

					if(j%2==1) {


                        // if(i==1 && j==1){

                        //     for(int k=i;k<=N;k++){
                        //     for(int l=j;l<=5;l++){
                        //         System.out.println("*");
                        //     }
                        //     System.out.println( );
                                
                        // }



                        }

                        for(int k=1;k<=N;k++){
                            for(int l=1;l<=5;l++){
                                System.out.print("*");
                                


                                
                        }


                                
                            
                        }

                    
                    }
                    else{	
                     
                      for(int k=1;k<=N;k++){
                            for(int l=1;l<=5;l++){
                                System.out.print(" ");
                            }
                        }
                     
                    }

				}
				else{

					if(j%2==1){
                     
                      for(int k=1;k<=N;k++){
                            for(int l=1;l<=5;l++){
                                System.out.print(" ");
                            }
                            // System.out.println("a");
                        }
                        // System.out.println("a");
                     
                    }
                    else{

                      for(int k=1;k<=N;k++){
                            for(int l=1;l<=5;l++){
                                System.out.print("*");
                            }
                        }
                     }

				}

			}

			System.out.println();
		}


	}
}