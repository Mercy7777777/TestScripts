/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 02:26:58 GMT 2022
 */

package cn.byhieg.designpatterntutorial.proxy.staticproxy;

import org.junit.Test;
import static org.junit.Assert.*;
import cn.byhieg.designpatterntutorial.proxy.staticproxy.Client;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Client_ESTest extends Client_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Client client0 = new Client();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Client.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }
}
