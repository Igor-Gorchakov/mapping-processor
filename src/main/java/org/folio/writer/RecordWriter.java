package org.folio.writer;

import org.folio.reader.values.CompositeValue;
import org.folio.reader.values.SimpleValue;

public interface RecordWriter {

    void write(SimpleValue value);

    void write(CompositeValue compositeValue);

    String getResult();
}
