package wodud.practice.java;

public class ThreeSixNineGameDemo2 {
		public static void main(String[] args) {  for(int i = 0; i < 10; i++){
			   for(int j = 0; j < 10; j++){
				    if((i == 0) && (j == 0))
				     continue;
				    else if((j%3 == 0) && !(j == 0)){
				     if(!(i == 0) && (i%3 ==0)){
				      System.out.println("짝짝");continue;
				     }
				     System.out.println("짝");continue;
				    }else if(!(i == 0) && (i%3 ==0)){
				     System.out.println("짝");continue;
				    }
				    System.out.println(i+""+j);
				   }
				  } }}