package wodud.practice.java;

public class LoginDemo4 {
		public static void main(String[] args) {
			String id = args[0];
			String password = args[1];
			if((id.equals("egoing")||id.equals("k8804")||id.equals("sorialgi"))
				&& password.equals("111111")) {
				System.out.println("right");
		} else{
			System.out.println("wrong");
		}
		}
}
