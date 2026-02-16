import java.util.*;

public class Main {
	public static void main(String[] args) {

		String str[] = { "ava Programming", "Python programming", "frontend", "ztabase" };

		for (int i = 0; i <= str.length - 2; i++) {
			for (int j = 0; j <= str.length - 2 - i; j++) {
				if(str[j].compareTo(str[j+1]) < 0) {
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}

			}
		}
		
		System.out.println(Arrays.toString(str));
	}
}