/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      TestUserDAO dao=new TestUserDAO();
      dao.select("taro","123");
      dao.selectAll();
	}

}
