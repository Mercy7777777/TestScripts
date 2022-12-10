/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 01:32:48 GMT 2022
 */

package cn.byhieg.annotationstutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.byhieg.annotationstutorial.APTProcessor;
import java.lang.annotation.Annotation;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.tools.JavaFileObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class APTProcessor_ESTest extends APTProcessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      LinkedHashSet<TypeElement> linkedHashSet0 = new LinkedHashSet<TypeElement>();
      Name name0 = mock(Name.class, new ViolatedAssumptionAnswer());
      Name name1 = mock(Name.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(name1).toString();
      TypeElement typeElement0 = mock(TypeElement.class, new ViolatedAssumptionAnswer());
      doReturn(name0).when(typeElement0).getQualifiedName();
      doReturn(name1).when(typeElement0).getSimpleName();
      Messager messager0 = mock(Messager.class, new ViolatedAssumptionAnswer());
      Filer filer0 = mock(Filer.class, new ViolatedAssumptionAnswer());
      doReturn((JavaFileObject) null).when(filer0).createSourceFile(any(java.lang.CharSequence.class) , any(javax.lang.model.element.Element[].class));
      ProcessingEnvironment processingEnvironment0 = mock(ProcessingEnvironment.class, new ViolatedAssumptionAnswer());
      doReturn(filer0).when(processingEnvironment0).getFiler();
      doReturn(messager0).when(processingEnvironment0).getMessager();
      aPTProcessor0.init(processingEnvironment0);
      LinkedList<TypeElement> linkedList0 = new LinkedList<TypeElement>();
      Name name2 = mock(Name.class, new ViolatedAssumptionAnswer());
      doReturn("AutoGenerate").when(name2).toString();
      TypeElement typeElement1 = mock(TypeElement.class, new ViolatedAssumptionAnswer());
      doReturn((Annotation) null).when(typeElement1).getAnnotation(nullable(java.lang.Class.class));
      doReturn(linkedList0).when(typeElement1).getEnclosedElements();
      doReturn(typeElement0).when(typeElement1).getEnclosingElement();
      doReturn(name2, name2).when(typeElement1).getSimpleName();
      linkedHashSet0.add(typeElement1);
      RoundEnvironment roundEnvironment0 = mock(RoundEnvironment.class, new ViolatedAssumptionAnswer());
      doReturn(linkedHashSet0).when(roundEnvironment0).getElementsAnnotatedWith(any(javax.lang.model.element.TypeElement.class));
      // Undeclared exception!
      try { 
        aPTProcessor0.process(linkedHashSet0, roundEnvironment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.annotationstutorial.APTProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      // Undeclared exception!
      try { 
        aPTProcessor0.init((ProcessingEnvironment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Tool provided null ProcessingEnvironment
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      ProcessingEnvironment processingEnvironment0 = mock(ProcessingEnvironment.class, new ViolatedAssumptionAnswer());
      doReturn((Messager) null).when(processingEnvironment0).getMessager();
      aPTProcessor0.init(processingEnvironment0);
      // Undeclared exception!
      try { 
        aPTProcessor0.getSupportedAnnotationTypes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      LinkedHashSet<TypeElement> linkedHashSet0 = new LinkedHashSet<TypeElement>();
      LinkedList<TypeElement> linkedList0 = new LinkedList<TypeElement>();
      Name name0 = mock(Name.class, new ViolatedAssumptionAnswer());
      doReturn("AutoGenerate").when(name0).toString();
      Name name1 = mock(Name.class, new ViolatedAssumptionAnswer());
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      TypeElement typeElement0 = mock(TypeElement.class, new ViolatedAssumptionAnswer());
      doReturn((Annotation) null).when(typeElement0).getAnnotation(nullable(java.lang.Class.class));
      doReturn(linkedList0).when(typeElement0).getEnclosedElements();
      doReturn(element0).when(typeElement0).getEnclosingElement();
      doReturn(name0, name1).when(typeElement0).getSimpleName();
      Messager messager0 = mock(Messager.class, new ViolatedAssumptionAnswer());
      ProcessingEnvironment processingEnvironment0 = mock(ProcessingEnvironment.class, new ViolatedAssumptionAnswer());
      doReturn(messager0).when(processingEnvironment0).getMessager();
      aPTProcessor0.init(processingEnvironment0);
      linkedHashSet0.add(typeElement0);
      RoundEnvironment roundEnvironment0 = mock(RoundEnvironment.class, new ViolatedAssumptionAnswer());
      doReturn(linkedHashSet0).when(roundEnvironment0).getElementsAnnotatedWith(any(javax.lang.model.element.TypeElement.class));
      // Undeclared exception!
      try { 
        aPTProcessor0.process(linkedHashSet0, roundEnvironment0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.javax.lang.model.element.Element$MockitoMock$923561483 cannot be cast to javax.lang.model.element.TypeElement
         //
         verifyException("cn.byhieg.annotationstutorial.APTProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      LinkedHashSet<TypeElement> linkedHashSet0 = new LinkedHashSet<TypeElement>();
      TypeElement typeElement0 = mock(TypeElement.class, new ViolatedAssumptionAnswer());
      linkedHashSet0.add(typeElement0);
      LinkedHashSet<TypeElement> linkedHashSet1 = new LinkedHashSet<TypeElement>();
      RoundEnvironment roundEnvironment0 = mock(RoundEnvironment.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(roundEnvironment0).getElementsAnnotatedWith(any(javax.lang.model.element.TypeElement.class));
      // Undeclared exception!
      try { 
        aPTProcessor0.process(linkedHashSet0, roundEnvironment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.annotationstutorial.APTProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      SourceVersion sourceVersion0 = aPTProcessor0.getSupportedSourceVersion();
      assertEquals(SourceVersion.RELEASE_8, sourceVersion0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      Set<String> set0 = aPTProcessor0.getSupportedAnnotationTypes();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      APTProcessor aPTProcessor0 = new APTProcessor();
      ProcessingEnvironment processingEnvironment0 = mock(ProcessingEnvironment.class, new ViolatedAssumptionAnswer());
      aPTProcessor0.init(processingEnvironment0);
      // Undeclared exception!
      try { 
        aPTProcessor0.init((ProcessingEnvironment) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot call init more than once.
         //
         verifyException("javax.annotation.processing.AbstractProcessor", e);
      }
  }
}