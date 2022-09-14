/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.alianca.intercab.emp.transactionreturn;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KeySchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4875327188991843308L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KeySchema\",\"namespace\":\"com.alianca.intercab.emp.transactionreturn\",\"fields\":[{\"name\":\"TransactionId\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KeySchema> ENCODER =
      new BinaryMessageEncoder<KeySchema>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KeySchema> DECODER =
      new BinaryMessageDecoder<KeySchema>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<KeySchema> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<KeySchema> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KeySchema>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this KeySchema to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a KeySchema from a ByteBuffer. */
  public static KeySchema fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int TransactionId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KeySchema() {}

  /**
   * All-args constructor.
   * @param TransactionId The new value for TransactionId
   */
  public KeySchema(java.lang.Integer TransactionId) {
    this.TransactionId = TransactionId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return TransactionId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: TransactionId = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'TransactionId' field.
   * @return The value of the 'TransactionId' field.
   */
  public java.lang.Integer getTransactionId() {
    return TransactionId;
  }

  /**
   * Sets the value of the 'TransactionId' field.
   * @param value the value to set.
   */
  public void setTransactionId(java.lang.Integer value) {
    this.TransactionId = value;
  }

  /**
   * Creates a new KeySchema RecordBuilder.
   * @return A new KeySchema RecordBuilder
   */
  public static com.alianca.intercab.emp.transactionreturn.KeySchema.Builder newBuilder() {
    return new com.alianca.intercab.emp.transactionreturn.KeySchema.Builder();
  }

  /**
   * Creates a new KeySchema RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KeySchema RecordBuilder
   */
  public static com.alianca.intercab.emp.transactionreturn.KeySchema.Builder newBuilder(com.alianca.intercab.emp.transactionreturn.KeySchema.Builder other) {
    return new com.alianca.intercab.emp.transactionreturn.KeySchema.Builder(other);
  }

  /**
   * Creates a new KeySchema RecordBuilder by copying an existing KeySchema instance.
   * @param other The existing instance to copy.
   * @return A new KeySchema RecordBuilder
   */
  public static com.alianca.intercab.emp.transactionreturn.KeySchema.Builder newBuilder(com.alianca.intercab.emp.transactionreturn.KeySchema other) {
    return new com.alianca.intercab.emp.transactionreturn.KeySchema.Builder(other);
  }

  /**
   * RecordBuilder for KeySchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KeySchema>
    implements org.apache.avro.data.RecordBuilder<KeySchema> {

    private int TransactionId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.alianca.intercab.emp.transactionreturn.KeySchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.TransactionId)) {
        this.TransactionId = data().deepCopy(fields()[0].schema(), other.TransactionId);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing KeySchema instance
     * @param other The existing instance to copy.
     */
    private Builder(com.alianca.intercab.emp.transactionreturn.KeySchema other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.TransactionId)) {
        this.TransactionId = data().deepCopy(fields()[0].schema(), other.TransactionId);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'TransactionId' field.
      * @return The value.
      */
    public java.lang.Integer getTransactionId() {
      return TransactionId;
    }

    /**
      * Sets the value of the 'TransactionId' field.
      * @param value The value of 'TransactionId'.
      * @return This builder.
      */
    public com.alianca.intercab.emp.transactionreturn.KeySchema.Builder setTransactionId(int value) {
      validate(fields()[0], value);
      this.TransactionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'TransactionId' field has been set.
      * @return True if the 'TransactionId' field has been set, false otherwise.
      */
    public boolean hasTransactionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'TransactionId' field.
      * @return This builder.
      */
    public com.alianca.intercab.emp.transactionreturn.KeySchema.Builder clearTransactionId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KeySchema build() {
      try {
        KeySchema record = new KeySchema();
        record.TransactionId = fieldSetFlags()[0] ? this.TransactionId : (java.lang.Integer) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KeySchema>
    WRITER$ = (org.apache.avro.io.DatumWriter<KeySchema>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KeySchema>
    READER$ = (org.apache.avro.io.DatumReader<KeySchema>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
