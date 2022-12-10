/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 01:17:36 GMT 2022
 */

package cn.byhieg.iotutorial.bytestreamio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.byhieg.iotutorial.bytestreamio.FileOutputStreamExample;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileOutputStreamExample_ESTest extends FileOutputStreamExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("D:/write_file.txt");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileOutputStreamExample fileOutputStreamExample0 = new FileOutputStreamExample();
      try { 
        fileOutputStreamExample0.writeToFile();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileOutputStreamExample fileOutputStreamExample0 = new FileOutputStreamExample();
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        fileOutputStreamExample0.writeToFile();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileOutputStreamExample fileOutputStreamExample0 = new FileOutputStreamExample();
      fileOutputStreamExample0.writeToFile();
  }
}