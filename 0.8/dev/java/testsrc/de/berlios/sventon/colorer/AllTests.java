package de.berlios.sventon.colorer;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

  public static void main(String[] args) {
    junit.textui.TestRunner.run(AllTests.suite());
  }

  public static Test suite() {
    TestSuite suite = new TestSuite("Test for de.berlios.sventon.colorer");
    suite.addTestSuite(JHighlightColorerTest.class);
    return suite;
  }

}