/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 02:50:00 GMT 2022
 */

package cn.byhieg.annotationstutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import cn.byhieg.annotationstutorial.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      User user0 = new User();
      user0.doSomeThing();
      assertEquals(0, user0.age);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.toString();
      assertEquals("\u540D\u5B57\u662F null\u5E74\u9F84\u662F 0", string0);
  }
}
