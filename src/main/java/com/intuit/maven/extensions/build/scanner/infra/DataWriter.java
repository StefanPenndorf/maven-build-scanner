package com.intuit.maven.extensions.build.scanner.infra;

import java.io.Closeable;

public interface DataWriter extends Closeable {

  void open();

  void checkPoint();

  @Override
  void close();
}
