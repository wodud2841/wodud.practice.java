package wodud.practice.java;

public class PrepostDemo {

	public static void main(String[] args) {
			int i =3;
			i++;
			System.out.println(i); //4출력 
			++i;
			System.out.println(i); //5출력 
			System.out.println(++i); //6출력 
			System.out.println(i++); /*6출력 i 이후에 ++는 괄호()에서 계산되지않고 
									 sysout이후에 계산되어 다음 계산에 더해진다 */
			System.out.println(i); //7출력 
			System.out.println(++i); //8출력
			System.out.println(i++); //8출력
			System.out.println(i); //9출력
			
	}

}
