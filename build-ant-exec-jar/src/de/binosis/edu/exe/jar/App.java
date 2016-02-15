/**
 * 
 */
package de.binosis.edu.exe.jar;

import org.apache.commons.lang3.SystemUtils;

/**
 * @author KORA
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("IO is : " + SystemUtils.JAVA_VM_NAME);
		System.out.println("OS_ARCH is : " + SystemUtils.OS_ARCH);
		System.out.println("OS_ARCH is : " + SystemUtils.OS_NAME);
		System.out.println("OS_ARCH is : " + SystemUtils.OS_VERSION);
		System.out.println("\nHello World\n");
	}

}
