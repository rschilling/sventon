package org.sventon.model;

import junit.framework.TestCase;

public class CamelCasePatternTest extends TestCase {

  public void testExtractCamelCasePattern() {
    try {
      CamelCasePattern.parse(null).getPattern();
      fail("Should trow IAE");
    } catch (IllegalArgumentException e) {
      // expected
    }

    try {
      CamelCasePattern.parse("").getPattern();
      fail("Should trow IAE");
    } catch (IllegalArgumentException e) {
      // expected
    }

    try {
      CamelCasePattern.parse("One").getPattern();
      fail("Should trow IAE");
    } catch (IllegalArgumentException e) {
      // expected
    }

    try {
      CamelCasePattern.parse("one").getPattern();
      fail("Should trow IAE");
    } catch (IllegalArgumentException e) {
      // expected
    }

    try {
      CamelCasePattern.parse("oneTwo").getPattern();
      fail("Should trow IAE");
    } catch (IllegalArgumentException e) {
      // expected
    }

    assertEquals("OT", CamelCasePattern.parse("OneT").getPattern());
    assertEquals("OT", CamelCasePattern.parse("OneTwo").getPattern());
    assertEquals("OTT", CamelCasePattern.parse("OneTwoThree").getPattern());
  }

}