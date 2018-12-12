package wodud.practice.java;

public class MethodDemo4 {
		private static void numbering(int limit) {
			int i=0;
			while(i<limit) {
				System.out.println(i);
				i++;
			}
		}
		public static void main(String[] args) {
			numbering(5);
		}
}
