/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NotificationSyncRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NotificationSyncRequest\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"appStateSeqNumber\",\"type\":\"int\"},{\"name\":\"topicListHash\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"topicStates\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TopicState\",\"fields\":[{\"name\":\"topicId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"seqNumber\",\"type\":\"int\"}],\"direction\":\"out\"}},\"null\"]},{\"name\":\"acceptedUnicastNotifications\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"null\"]},{\"name\":\"subscriptionCommands\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SubscriptionCommand\",\"fields\":[{\"name\":\"topicId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"command\",\"type\":{\"type\":\"enum\",\"name\":\"SubscriptionCommandType\",\"symbols\":[\"ADD\",\"REMOVE\"]}}],\"direction\":\"out\"}},\"null\"]}],\"direction\":\"out\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int appStateSeqNumber;
   private java.nio.ByteBuffer topicListHash;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState> topicStates;
   private java.util.List<java.lang.String> acceptedUnicastNotifications;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand> subscriptionCommands;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public NotificationSyncRequest() {}

  /**
   * All-args constructor.
   */
  public NotificationSyncRequest(java.lang.Integer appStateSeqNumber, java.nio.ByteBuffer topicListHash, java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState> topicStates, java.util.List<java.lang.String> acceptedUnicastNotifications, java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand> subscriptionCommands) {
    this.appStateSeqNumber = appStateSeqNumber;
    this.topicListHash = topicListHash;
    this.topicStates = topicStates;
    this.acceptedUnicastNotifications = acceptedUnicastNotifications;
    this.subscriptionCommands = subscriptionCommands;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return appStateSeqNumber;
    case 1: return topicListHash;
    case 2: return topicStates;
    case 3: return acceptedUnicastNotifications;
    case 4: return subscriptionCommands;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: appStateSeqNumber = (java.lang.Integer)value$; break;
    case 1: topicListHash = (java.nio.ByteBuffer)value$; break;
    case 2: topicStates = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState>)value$; break;
    case 3: acceptedUnicastNotifications = (java.util.List<java.lang.String>)value$; break;
    case 4: subscriptionCommands = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'appStateSeqNumber' field.
   */
  public java.lang.Integer getAppStateSeqNumber() {
    return appStateSeqNumber;
  }

  /**
   * Sets the value of the 'appStateSeqNumber' field.
   * @param value the value to set.
   */
  public void setAppStateSeqNumber(java.lang.Integer value) {
    this.appStateSeqNumber = value;
  }

  /**
   * Gets the value of the 'topicListHash' field.
   */
  public java.nio.ByteBuffer getTopicListHash() {
    return topicListHash;
  }

  /**
   * Sets the value of the 'topicListHash' field.
   * @param value the value to set.
   */
  public void setTopicListHash(java.nio.ByteBuffer value) {
    this.topicListHash = value;
  }

  /**
   * Gets the value of the 'topicStates' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState> getTopicStates() {
    return topicStates;
  }

  /**
   * Sets the value of the 'topicStates' field.
   * @param value the value to set.
   */
  public void setTopicStates(java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState> value) {
    this.topicStates = value;
  }

  /**
   * Gets the value of the 'acceptedUnicastNotifications' field.
   */
  public java.util.List<java.lang.String> getAcceptedUnicastNotifications() {
    return acceptedUnicastNotifications;
  }

  /**
   * Sets the value of the 'acceptedUnicastNotifications' field.
   * @param value the value to set.
   */
  public void setAcceptedUnicastNotifications(java.util.List<java.lang.String> value) {
    this.acceptedUnicastNotifications = value;
  }

  /**
   * Gets the value of the 'subscriptionCommands' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand> getSubscriptionCommands() {
    return subscriptionCommands;
  }

  /**
   * Sets the value of the 'subscriptionCommands' field.
   * @param value the value to set.
   */
  public void setSubscriptionCommands(java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand> value) {
    this.subscriptionCommands = value;
  }

  /** Creates a new NotificationSyncRequest RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder();
  }
  
  /** Creates a new NotificationSyncRequest RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder(other);
  }
  
  /** Creates a new NotificationSyncRequest RecordBuilder by copying an existing NotificationSyncRequest instance */
  public static org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest other) {
    return new org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for NotificationSyncRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NotificationSyncRequest>
    implements org.apache.avro.data.RecordBuilder<NotificationSyncRequest> {

    private int appStateSeqNumber;
    private java.nio.ByteBuffer topicListHash;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState> topicStates;
    private java.util.List<java.lang.String> acceptedUnicastNotifications;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand> subscriptionCommands;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.appStateSeqNumber)) {
        this.appStateSeqNumber = data().deepCopy(fields()[0].schema(), other.appStateSeqNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.topicListHash)) {
        this.topicListHash = data().deepCopy(fields()[1].schema(), other.topicListHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.topicStates)) {
        this.topicStates = data().deepCopy(fields()[2].schema(), other.topicStates);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.acceptedUnicastNotifications)) {
        this.acceptedUnicastNotifications = data().deepCopy(fields()[3].schema(), other.acceptedUnicastNotifications);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.subscriptionCommands)) {
        this.subscriptionCommands = data().deepCopy(fields()[4].schema(), other.subscriptionCommands);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing NotificationSyncRequest instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest other) {
            super(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.appStateSeqNumber)) {
        this.appStateSeqNumber = data().deepCopy(fields()[0].schema(), other.appStateSeqNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.topicListHash)) {
        this.topicListHash = data().deepCopy(fields()[1].schema(), other.topicListHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.topicStates)) {
        this.topicStates = data().deepCopy(fields()[2].schema(), other.topicStates);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.acceptedUnicastNotifications)) {
        this.acceptedUnicastNotifications = data().deepCopy(fields()[3].schema(), other.acceptedUnicastNotifications);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.subscriptionCommands)) {
        this.subscriptionCommands = data().deepCopy(fields()[4].schema(), other.subscriptionCommands);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'appStateSeqNumber' field */
    public java.lang.Integer getAppStateSeqNumber() {
      return appStateSeqNumber;
    }
    
    /** Sets the value of the 'appStateSeqNumber' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder setAppStateSeqNumber(int value) {
      validate(fields()[0], value);
      this.appStateSeqNumber = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'appStateSeqNumber' field has been set */
    public boolean hasAppStateSeqNumber() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'appStateSeqNumber' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder clearAppStateSeqNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'topicListHash' field */
    public java.nio.ByteBuffer getTopicListHash() {
      return topicListHash;
    }
    
    /** Sets the value of the 'topicListHash' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder setTopicListHash(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.topicListHash = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'topicListHash' field has been set */
    public boolean hasTopicListHash() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'topicListHash' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder clearTopicListHash() {
      topicListHash = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'topicStates' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState> getTopicStates() {
      return topicStates;
    }
    
    /** Sets the value of the 'topicStates' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder setTopicStates(java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState> value) {
      validate(fields()[2], value);
      this.topicStates = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'topicStates' field has been set */
    public boolean hasTopicStates() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'topicStates' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder clearTopicStates() {
      topicStates = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'acceptedUnicastNotifications' field */
    public java.util.List<java.lang.String> getAcceptedUnicastNotifications() {
      return acceptedUnicastNotifications;
    }
    
    /** Sets the value of the 'acceptedUnicastNotifications' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder setAcceptedUnicastNotifications(java.util.List<java.lang.String> value) {
      validate(fields()[3], value);
      this.acceptedUnicastNotifications = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'acceptedUnicastNotifications' field has been set */
    public boolean hasAcceptedUnicastNotifications() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'acceptedUnicastNotifications' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder clearAcceptedUnicastNotifications() {
      acceptedUnicastNotifications = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'subscriptionCommands' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand> getSubscriptionCommands() {
      return subscriptionCommands;
    }
    
    /** Sets the value of the 'subscriptionCommands' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder setSubscriptionCommands(java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand> value) {
      validate(fields()[4], value);
      this.subscriptionCommands = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'subscriptionCommands' field has been set */
    public boolean hasSubscriptionCommands() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'subscriptionCommands' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest.Builder clearSubscriptionCommands() {
      subscriptionCommands = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public NotificationSyncRequest build() {
      try {
        NotificationSyncRequest record = new NotificationSyncRequest();
        record.appStateSeqNumber = fieldSetFlags()[0] ? this.appStateSeqNumber : (java.lang.Integer) defaultValue(fields()[0]);
        record.topicListHash = fieldSetFlags()[1] ? this.topicListHash : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.topicStates = fieldSetFlags()[2] ? this.topicStates : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.TopicState>) defaultValue(fields()[2]);
        record.acceptedUnicastNotifications = fieldSetFlags()[3] ? this.acceptedUnicastNotifications : (java.util.List<java.lang.String>) defaultValue(fields()[3]);
        record.subscriptionCommands = fieldSetFlags()[4] ? this.subscriptionCommands : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.SubscriptionCommand>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
