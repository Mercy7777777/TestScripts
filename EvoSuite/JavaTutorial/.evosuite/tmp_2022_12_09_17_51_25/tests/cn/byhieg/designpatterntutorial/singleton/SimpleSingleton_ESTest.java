/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 02:08:27 GMT 2022
 */

package cn.byhieg.designpatterntutorial.singleton;

import org.junit.Test;
import static org.junit.Assert.*;
import cn.byhieg.designpatterntutorial.singleton.SimpleSingleton;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleSingleton_ESTest extends SimpleSingleton_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleSingleton simpleSingleton0 = SimpleSingleton.getInstance();
      SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
      assertSame(simpleSingleton1, simpleSingleton0);
  }
}
