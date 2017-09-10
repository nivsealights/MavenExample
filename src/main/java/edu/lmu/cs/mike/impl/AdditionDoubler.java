package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class AdditionDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    int a = 5;
    return i + i;
  }
}

