/**
 * 
 */
package testpackage01;



/**
 * @author user1
 *
 */

import javax.swing.JFrame;


public class TestClass01  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hello worlddd!");
		
		MyWindow mw = new MyWindow();
		//test

	}

}

class MyWindow extends JFrame
{
	public MyWindow() {
	    this.setSize(600, 400);
	    this.setVisible(true);
	}
}