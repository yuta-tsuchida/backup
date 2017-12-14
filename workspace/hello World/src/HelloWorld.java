import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internousdev
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
        String s=new String();
		s="hello";
		System.out.println(s);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		String t=br.readLine();
		System.out.println(t);
		System.out.println("入力してください");
		t=br.readLine();
		System.out.println(t);

	}

}
