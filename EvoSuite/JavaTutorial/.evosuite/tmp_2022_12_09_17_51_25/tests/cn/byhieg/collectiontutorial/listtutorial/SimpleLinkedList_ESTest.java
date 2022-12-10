/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 01:01:42 GMT 2022
 */

package cn.byhieg.collectiontutorial.listtutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.byhieg.collectiontutorial.listtutorial.SimpleLinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleLinkedList_ESTest extends SimpleLinkedList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleLinkedList<Object> simpleLinkedList0 = new SimpleLinkedList<Object>();
      // Undeclared exception!
      try { 
        simpleLinkedList0.remove(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // \u6307\u5B9Aindex\u8D85\u8FC7\u754C\u9650
         //
         verifyException("cn.byhieg.collectiontutorial.listtutorial.SimpleLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add(" jR\")I^U2usBh");
      int int0 = simpleLinkedList0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add(0, (String) null);
      simpleLinkedList0.add(0, "t|'[");
      int int0 = simpleLinkedList0.indexOf((Object) null);
      assertEquals(2, simpleLinkedList0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add(0, ";");
      simpleLinkedList0.get(0);
      assertEquals(1, simpleLinkedList0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add("X,+OPm/]Z:C3l`");
      simpleLinkedList0.remove(0);
      simpleLinkedList0.add(">4~'4GZby`~sI[");
      simpleLinkedList0.add("X,+OPm/]Z:C3l`");
      boolean boolean0 = simpleLinkedList0.remove((Object) "X,+OPm/]Z:C3l`");
      assertEquals(1, simpleLinkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add("X,+OPm/]Z:C3l`");
      boolean boolean0 = simpleLinkedList0.remove((Object) "X,+OPm/]Z:C3l`");
      assertEquals(0, simpleLinkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add(0, "t|'[");
      int int0 = simpleLinkedList0.indexOf((Object) null);
      assertEquals(1, simpleLinkedList0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleLinkedList<Object> simpleLinkedList0 = new SimpleLinkedList<Object>();
      Integer integer0 = new Integer(0);
      simpleLinkedList0.add((Object) integer0);
      int int0 = simpleLinkedList0.indexOf(integer0);
      assertEquals(1, simpleLinkedList0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleLinkedList<Object> simpleLinkedList0 = new SimpleLinkedList<Object>();
      simpleLinkedList0.add((Object) "cn.byhieg.collectiontutorial.listtutorial.SimpleLinkedList$Node");
      Integer integer0 = new Integer(0);
      int int0 = simpleLinkedList0.indexOf(integer0);
      assertEquals(1, simpleLinkedList0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleLinkedList<Object> simpleLinkedList0 = new SimpleLinkedList<Object>();
      SimpleLinkedList<String> simpleLinkedList1 = new SimpleLinkedList<String>();
      boolean boolean0 = simpleLinkedList0.remove((Object) simpleLinkedList1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleLinkedList<Object> simpleLinkedList0 = new SimpleLinkedList<Object>();
      // Undeclared exception!
      try { 
        simpleLinkedList0.get((-814));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // \u6307\u5B9Aindex\u8D85\u8FC7\u754C\u9650
         //
         verifyException("cn.byhieg.collectiontutorial.listtutorial.SimpleLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleLinkedList<Object> simpleLinkedList0 = new SimpleLinkedList<Object>();
      // Undeclared exception!
      try { 
        simpleLinkedList0.add((-1), (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // \u6307\u5B9A\u7684index\u8D85\u8FC7\u754C\u9650
         //
         verifyException("cn.byhieg.collectiontutorial.listtutorial.SimpleLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleLinkedList<Object> simpleLinkedList0 = new SimpleLinkedList<Object>();
      // Undeclared exception!
      try { 
        simpleLinkedList0.add(4, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // \u6307\u5B9A\u7684index\u8D85\u8FC7\u754C\u9650
         //
         verifyException("cn.byhieg.collectiontutorial.listtutorial.SimpleLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add(0, (String) null);
      simpleLinkedList0.add(0, "t|'[");
      simpleLinkedList0.get(1);
      assertEquals(2, simpleLinkedList0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      simpleLinkedList0.add(0, (String) null);
      simpleLinkedList0.add("-6fF`c2D;I7X2");
      simpleLinkedList0.remove(0);
      assertEquals(1, simpleLinkedList0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleLinkedList<Integer> simpleLinkedList0 = new SimpleLinkedList<Integer>();
      Integer integer0 = new Integer((-1918));
      simpleLinkedList0.add(integer0);
      simpleLinkedList0.add(integer0);
      simpleLinkedList0.add(1, (Integer) null);
      assertEquals(3, simpleLinkedList0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      int int0 = simpleLinkedList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleLinkedList<String> simpleLinkedList0 = new SimpleLinkedList<String>();
      // Undeclared exception!
      try { 
        simpleLinkedList0.get(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // \u6307\u5B9Aindex\u8D85\u8FC7\u754C\u9650
         //
         verifyException("cn.byhieg.collectiontutorial.listtutorial.SimpleLinkedList", e);
      }
  }
}
