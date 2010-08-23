package org.sventon.model;

import junit.framework.TestCase;
import org.sventon.TestUtils;

import java.util.List;

public class DirEntryKindFilterTest extends TestCase {

  public void testFilter() throws Exception {

    final List<DirEntry> list = TestUtils.getDirectoryList();
    List<DirEntry> filteredList;

    try {
      new DirEntryKindFilter(DirEntry.Kind.NONE).filter(list);
      fail("Should throw IllegalArgumentException");
    } catch (IllegalArgumentException iae) {
      // expected
    }

    try {
      new DirEntryKindFilter(DirEntry.Kind.ANY).filter(list);
      fail("Should throw IllegalArgumentException");
    } catch (IllegalArgumentException iae) {
      // expected
    }

    try {
      new DirEntryKindFilter(DirEntry.Kind.UNKNOWN).filter(list);
      fail("Should throw IllegalArgumentException");
    } catch (IllegalArgumentException iae) {
      // expected
    }

    filteredList = new DirEntryKindFilter(DirEntry.Kind.DIR).filter(list);
    assertEquals(4, filteredList.size());

    filteredList = new DirEntryKindFilter(DirEntry.Kind.FILE).filter(list);
    assertEquals(9, filteredList.size());

    try {
      new DirEntryKindFilter(null).filter(list);
      fail("Should throw IllegalArgumentException");
    } catch (IllegalArgumentException iae) {
      // expected
    }
  }
}