package wodud.practice.java;

public class ThreeSixNineGameDemo4 {
		public static void main(String[] args) {
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					for(int k=0;k<10;k++) {
						if((i%3==0)&&!(i==0)&&(j%3==0)&&!(j==0)&&(k%3==0)&&!(k==0)) {
							System.out.println("짝짝짝");continue;
						}if((i%3==0)&&!(i==0)&&(j%3==0)&&!(j==0)||(i%3==0)&&!(i==0)&&(k%3==0)&&!(k==0)||(j%3==0)&&!(j==0)&&(j%3==0)&&!(j==0)) {
							System.out.println("짝짝");continue;
						}if((i%3==0)&&!(i==0)||(j%3==0)&&!(j==0)||(k%3==0)&&!(k==0)) {
							System.out.println("짝");continue;
						}System.out.println(i+""+j+""+k);
					}
				}
			}
		}
	}