package edunova;

public class Matrica {

	public static void main(String[] args) {
		
        int n = 5;		
		
        int [][] spiral = new int [n][n];
        
        int value  = 1;
        
        int minRow = 0;
        
        int maxRow = n- 1;
        
        int minCol = 0;
        
        int maxCol = n-1;
        
        while (value <= n*n)
        {	   
	       
            for( int i = minRow; i <= maxRow; i++ )
            {   
              spiral [i][maxCol]=value;
              
              value++;
            }
            if(value>n*n) {
            	break;
            }
            
            System.out.println("gore prema dolje");
            ispisi(spiral);
              
            for( int i = maxCol-1; i>=minCol; i--)
            {
         	   spiral [maxRow][i]=value;
         	   
         	   value++;
            }
            if(value>n*n) {
            	break;
            }
            
            System.out.println("desno prema lijevo");
            ispisi(spiral);
            
            for( int i = maxRow-1; i >= minRow; i--)
            {
         	   spiral [i][minCol]=value;
         	   
         	   value++;
            }
            
            if(value>n*n) {
            	break;
            }
            
            System.out.println("dolje prema gore");
            ispisi(spiral);
            
            for ( int i = minCol+1; i <= maxCol-1; i++)
            {   
         	   spiral[minRow][i]=value;
               
                value++;
            
            }
            
            System.out.println("lijevo prema desno");
            ispisi(spiral);
                minCol++;
                minRow++;
                maxCol--;
                maxRow--;
                
            }    
           
	        	ispisi(spiral);
	        	
	 
	}
	
	private static void ispisi(int[][] spiral) {
		 for (int i = 0; i < spiral.length; i++)
         {  
      	   for( int j = 0; j < spiral.length; j++)
      		   
      	   {
      		   System.out.print(spiral[i][j] + ("\t "));
     	   }
      	   
                 System.out.println();
     
	        }
	}
}
