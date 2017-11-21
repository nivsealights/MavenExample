package edu.lmu.cs.mike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.Override;

import edu.lmu.cs.mike.iface.IntegerDoubler;
import edu.lmu.cs.mike.impl.AdditionDoubler;
import edu.lmu.cs.mike.impl.BitShiftDoubler;
import edu.lmu.cs.mike.impl.MultiplicationDoubler;

public class TestDoubler {
  // @Test
  // public void additionDoubler() {
  //   IntegerDoubler doubler = new AdditionDoubler();

  //   assertEquals(1, doubler.doDouble(1));
  //   assertEquals(1, doubler.doDouble(2));
  // }

  // @Test
  // public void multiplicationDoubler() {
  //   IntegerDoubler doubler = new MultiplicationDoubler();

  //   assertEquals(1, doubler.doDouble(3));
  //   assertEquals(1, doubler.doDouble(4));
  // }

  @Test
  public void bitshiftDoubler() {
    IntegerDoubler doubler = new BitShiftDoubler();

    assertEquals(1, doubler.doDouble(5));
    assertEquals(1, doubler.doDouble(6));
  }
}
