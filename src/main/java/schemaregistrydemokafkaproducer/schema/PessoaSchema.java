/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package schemaregistrydemokafkaproducer.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PessoaSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6660448599803798017L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PessoaSchema\",\"namespace\":\"schemaregistrydemokafkaproducer.schema\",\"fields\":[{\"name\":\"tradeId\",\"type\":\"int\",\"default\":-1},{\"name\":\"tradeQuantity\",\"type\":\"int\",\"default\":-1},{\"name\":\"tradeMarket\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"stockName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"tradeType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"price\",\"type\":\"float\",\"default\":-100.0},{\"name\":\"amount\",\"type\":\"float\",\"default\":-100.0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PessoaSchema> ENCODER =
      new BinaryMessageEncoder<PessoaSchema>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PessoaSchema> DECODER =
      new BinaryMessageDecoder<PessoaSchema>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PessoaSchema> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PessoaSchema> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PessoaSchema>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PessoaSchema to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PessoaSchema from a ByteBuffer. */
  public static PessoaSchema fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int tradeId;
  @Deprecated public int tradeQuantity;
  @Deprecated public java.lang.CharSequence tradeMarket;
  @Deprecated public java.lang.CharSequence stockName;
  @Deprecated public java.lang.CharSequence tradeType;
  @Deprecated public float price;
  @Deprecated public float amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PessoaSchema() {}

  /**
   * All-args constructor.
   * @param tradeId The new value for tradeId
   * @param tradeQuantity The new value for tradeQuantity
   * @param tradeMarket The new value for tradeMarket
   * @param stockName The new value for stockName
   * @param tradeType The new value for tradeType
   * @param price The new value for price
   * @param amount The new value for amount
   */
  public PessoaSchema(java.lang.Integer tradeId, java.lang.Integer tradeQuantity, java.lang.CharSequence tradeMarket, java.lang.CharSequence stockName, java.lang.CharSequence tradeType, java.lang.Float price, java.lang.Float amount) {
    this.tradeId = tradeId;
    this.tradeQuantity = tradeQuantity;
    this.tradeMarket = tradeMarket;
    this.stockName = stockName;
    this.tradeType = tradeType;
    this.price = price;
    this.amount = amount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tradeId;
    case 1: return tradeQuantity;
    case 2: return tradeMarket;
    case 3: return stockName;
    case 4: return tradeType;
    case 5: return price;
    case 6: return amount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: tradeId = (java.lang.Integer)value$; break;
    case 1: tradeQuantity = (java.lang.Integer)value$; break;
    case 2: tradeMarket = (java.lang.CharSequence)value$; break;
    case 3: stockName = (java.lang.CharSequence)value$; break;
    case 4: tradeType = (java.lang.CharSequence)value$; break;
    case 5: price = (java.lang.Float)value$; break;
    case 6: amount = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'tradeId' field.
   * @return The value of the 'tradeId' field.
   */
  public java.lang.Integer getTradeId() {
    return tradeId;
  }

  /**
   * Sets the value of the 'tradeId' field.
   * @param value the value to set.
   */
  public void setTradeId(java.lang.Integer value) {
    this.tradeId = value;
  }

  /**
   * Gets the value of the 'tradeQuantity' field.
   * @return The value of the 'tradeQuantity' field.
   */
  public java.lang.Integer getTradeQuantity() {
    return tradeQuantity;
  }

  /**
   * Sets the value of the 'tradeQuantity' field.
   * @param value the value to set.
   */
  public void setTradeQuantity(java.lang.Integer value) {
    this.tradeQuantity = value;
  }

  /**
   * Gets the value of the 'tradeMarket' field.
   * @return The value of the 'tradeMarket' field.
   */
  public java.lang.CharSequence getTradeMarket() {
    return tradeMarket;
  }

  /**
   * Sets the value of the 'tradeMarket' field.
   * @param value the value to set.
   */
  public void setTradeMarket(java.lang.CharSequence value) {
    this.tradeMarket = value;
  }

  /**
   * Gets the value of the 'stockName' field.
   * @return The value of the 'stockName' field.
   */
  public java.lang.CharSequence getStockName() {
    return stockName;
  }

  /**
   * Sets the value of the 'stockName' field.
   * @param value the value to set.
   */
  public void setStockName(java.lang.CharSequence value) {
    this.stockName = value;
  }

  /**
   * Gets the value of the 'tradeType' field.
   * @return The value of the 'tradeType' field.
   */
  public java.lang.CharSequence getTradeType() {
    return tradeType;
  }

  /**
   * Sets the value of the 'tradeType' field.
   * @param value the value to set.
   */
  public void setTradeType(java.lang.CharSequence value) {
    this.tradeType = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.lang.Float getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.lang.Float value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.Float getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.Float value) {
    this.amount = value;
  }

  /**
   * Creates a new PessoaSchema RecordBuilder.
   * @return A new PessoaSchema RecordBuilder
   */
  public static schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder newBuilder() {
    return new schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder();
  }

  /**
   * Creates a new PessoaSchema RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PessoaSchema RecordBuilder
   */
  public static schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder newBuilder(schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder other) {
    return new schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder(other);
  }

  /**
   * Creates a new PessoaSchema RecordBuilder by copying an existing PessoaSchema instance.
   * @param other The existing instance to copy.
   * @return A new PessoaSchema RecordBuilder
   */
  public static schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder newBuilder(schemaregistrydemokafkaproducer.schema.PessoaSchema other) {
    return new schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder(other);
  }

  /**
   * RecordBuilder for PessoaSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PessoaSchema>
    implements org.apache.avro.data.RecordBuilder<PessoaSchema> {

    private int tradeId;
    private int tradeQuantity;
    private java.lang.CharSequence tradeMarket;
    private java.lang.CharSequence stockName;
    private java.lang.CharSequence tradeType;
    private float price;
    private float amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tradeId)) {
        this.tradeId = data().deepCopy(fields()[0].schema(), other.tradeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tradeQuantity)) {
        this.tradeQuantity = data().deepCopy(fields()[1].schema(), other.tradeQuantity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tradeMarket)) {
        this.tradeMarket = data().deepCopy(fields()[2].schema(), other.tradeMarket);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stockName)) {
        this.stockName = data().deepCopy(fields()[3].schema(), other.stockName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tradeType)) {
        this.tradeType = data().deepCopy(fields()[4].schema(), other.tradeType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.amount)) {
        this.amount = data().deepCopy(fields()[6].schema(), other.amount);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PessoaSchema instance
     * @param other The existing instance to copy.
     */
    private Builder(schemaregistrydemokafkaproducer.schema.PessoaSchema other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.tradeId)) {
        this.tradeId = data().deepCopy(fields()[0].schema(), other.tradeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tradeQuantity)) {
        this.tradeQuantity = data().deepCopy(fields()[1].schema(), other.tradeQuantity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tradeMarket)) {
        this.tradeMarket = data().deepCopy(fields()[2].schema(), other.tradeMarket);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stockName)) {
        this.stockName = data().deepCopy(fields()[3].schema(), other.stockName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tradeType)) {
        this.tradeType = data().deepCopy(fields()[4].schema(), other.tradeType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.amount)) {
        this.amount = data().deepCopy(fields()[6].schema(), other.amount);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'tradeId' field.
      * @return The value.
      */
    public java.lang.Integer getTradeId() {
      return tradeId;
    }

    /**
      * Sets the value of the 'tradeId' field.
      * @param value The value of 'tradeId'.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder setTradeId(int value) {
      validate(fields()[0], value);
      this.tradeId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'tradeId' field has been set.
      * @return True if the 'tradeId' field has been set, false otherwise.
      */
    public boolean hasTradeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'tradeId' field.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder clearTradeId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'tradeQuantity' field.
      * @return The value.
      */
    public java.lang.Integer getTradeQuantity() {
      return tradeQuantity;
    }

    /**
      * Sets the value of the 'tradeQuantity' field.
      * @param value The value of 'tradeQuantity'.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder setTradeQuantity(int value) {
      validate(fields()[1], value);
      this.tradeQuantity = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'tradeQuantity' field has been set.
      * @return True if the 'tradeQuantity' field has been set, false otherwise.
      */
    public boolean hasTradeQuantity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'tradeQuantity' field.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder clearTradeQuantity() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'tradeMarket' field.
      * @return The value.
      */
    public java.lang.CharSequence getTradeMarket() {
      return tradeMarket;
    }

    /**
      * Sets the value of the 'tradeMarket' field.
      * @param value The value of 'tradeMarket'.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder setTradeMarket(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.tradeMarket = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'tradeMarket' field has been set.
      * @return True if the 'tradeMarket' field has been set, false otherwise.
      */
    public boolean hasTradeMarket() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'tradeMarket' field.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder clearTradeMarket() {
      tradeMarket = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'stockName' field.
      * @return The value.
      */
    public java.lang.CharSequence getStockName() {
      return stockName;
    }

    /**
      * Sets the value of the 'stockName' field.
      * @param value The value of 'stockName'.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder setStockName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.stockName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'stockName' field has been set.
      * @return True if the 'stockName' field has been set, false otherwise.
      */
    public boolean hasStockName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'stockName' field.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder clearStockName() {
      stockName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'tradeType' field.
      * @return The value.
      */
    public java.lang.CharSequence getTradeType() {
      return tradeType;
    }

    /**
      * Sets the value of the 'tradeType' field.
      * @param value The value of 'tradeType'.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder setTradeType(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.tradeType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'tradeType' field has been set.
      * @return True if the 'tradeType' field has been set, false otherwise.
      */
    public boolean hasTradeType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'tradeType' field.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder clearTradeType() {
      tradeType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.lang.Float getPrice() {
      return price;
    }

    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder setPrice(float value) {
      validate(fields()[5], value);
      this.price = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder clearPrice() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.Float getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder setAmount(float value) {
      validate(fields()[6], value);
      this.amount = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public schemaregistrydemokafkaproducer.schema.PessoaSchema.Builder clearAmount() {
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PessoaSchema build() {
      try {
        PessoaSchema record = new PessoaSchema();
        record.tradeId = fieldSetFlags()[0] ? this.tradeId : (java.lang.Integer) defaultValue(fields()[0]);
        record.tradeQuantity = fieldSetFlags()[1] ? this.tradeQuantity : (java.lang.Integer) defaultValue(fields()[1]);
        record.tradeMarket = fieldSetFlags()[2] ? this.tradeMarket : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.stockName = fieldSetFlags()[3] ? this.stockName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.tradeType = fieldSetFlags()[4] ? this.tradeType : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.price = fieldSetFlags()[5] ? this.price : (java.lang.Float) defaultValue(fields()[5]);
        record.amount = fieldSetFlags()[6] ? this.amount : (java.lang.Float) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PessoaSchema>
    WRITER$ = (org.apache.avro.io.DatumWriter<PessoaSchema>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PessoaSchema>
    READER$ = (org.apache.avro.io.DatumReader<PessoaSchema>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
