/**
 * 
 */
package com.thistestuser.debugger;

/**
 * @author kesin
 *
 */
public class Test {
	private int param1;
	public Test(int param1) {
		System.out.println("THERE");

		DebuggerHook.injectDebugger(this, null);
		this.param1=param1;
	}
	
	
	public static void main(String[] args) {

		
		Test a = new Test(1);
		System.out.println("HERE");
	}
	

}
