// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

package com.nh.concurrent.net.bean;

public final class Request {
  private Request() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface request_NetOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string cmd = 1;
    /**
     * <code>required string cmd = 1;</code>
     */
    boolean hasCmd();
    /**
     * <code>required string cmd = 1;</code>
     */
    java.lang.String getCmd();
    /**
     * <code>required string cmd = 1;</code>
     */
    com.google.protobuf.ByteString
        getCmdBytes();

    // optional int32 keycode = 2;
    /**
     * <code>optional int32 keycode = 2;</code>
     */
    boolean hasKeycode();
    /**
     * <code>optional int32 keycode = 2;</code>
     */
    int getKeycode();

    // optional sint32 posX = 3;
    /**
     * <code>optional sint32 posX = 3;</code>
     */
    boolean hasPosX();
    /**
     * <code>optional sint32 posX = 3;</code>
     */
    int getPosX();

    // optional sint32 posY = 4;
    /**
     * <code>optional sint32 posY = 4;</code>
     */
    boolean hasPosY();
    /**
     * <code>optional sint32 posY = 4;</code>
     */
    int getPosY();

    // optional bool onOrOff = 5;
    /**
     * <code>optional bool onOrOff = 5;</code>
     */
    boolean hasOnOrOff();
    /**
     * <code>optional bool onOrOff = 5;</code>
     */
    boolean getOnOrOff();

    // optional bool ontouch = 6;
    /**
     * <code>optional bool ontouch = 6;</code>
     */
    boolean hasOntouch();
    /**
     * <code>optional bool ontouch = 6;</code>
     */
    boolean getOntouch();
  }
  /**
   * Protobuf type {@code com.nh.concurrent.net.bean.request_Net}
   */
  public static final class request_Net extends
      com.google.protobuf.GeneratedMessage
      implements request_NetOrBuilder {
    // Use request_Net.newBuilder() to construct.
    private request_Net(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private request_Net(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final request_Net defaultInstance;
    public static request_Net getDefaultInstance() {
      return defaultInstance;
    }

    public request_Net getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private request_Net(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              cmd_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              keycode_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              posX_ = input.readSInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              posY_ = input.readSInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              onOrOff_ = input.readBool();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              ontouch_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nh.concurrent.net.bean.Request.internal_static_com_nh_concurrent_net_bean_request_Net_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nh.concurrent.net.bean.Request.internal_static_com_nh_concurrent_net_bean_request_Net_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nh.concurrent.net.bean.Request.request_Net.class, com.nh.concurrent.net.bean.Request.request_Net.Builder.class);
    }

    public static com.google.protobuf.Parser<request_Net> PARSER =
        new com.google.protobuf.AbstractParser<request_Net>() {
      public request_Net parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new request_Net(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<request_Net> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string cmd = 1;
    public static final int CMD_FIELD_NUMBER = 1;
    private java.lang.Object cmd_;
    /**
     * <code>required string cmd = 1;</code>
     */
    public boolean hasCmd() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string cmd = 1;</code>
     */
    public java.lang.String getCmd() {
      java.lang.Object ref = cmd_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          cmd_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string cmd = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCmdBytes() {
      java.lang.Object ref = cmd_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cmd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 keycode = 2;
    public static final int KEYCODE_FIELD_NUMBER = 2;
    private int keycode_;
    /**
     * <code>optional int32 keycode = 2;</code>
     */
    public boolean hasKeycode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 keycode = 2;</code>
     */
    public int getKeycode() {
      return keycode_;
    }

    // optional sint32 posX = 3;
    public static final int POSX_FIELD_NUMBER = 3;
    private int posX_;
    /**
     * <code>optional sint32 posX = 3;</code>
     */
    public boolean hasPosX() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional sint32 posX = 3;</code>
     */
    public int getPosX() {
      return posX_;
    }

    // optional sint32 posY = 4;
    public static final int POSY_FIELD_NUMBER = 4;
    private int posY_;
    /**
     * <code>optional sint32 posY = 4;</code>
     */
    public boolean hasPosY() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional sint32 posY = 4;</code>
     */
    public int getPosY() {
      return posY_;
    }

    // optional bool onOrOff = 5;
    public static final int ONOROFF_FIELD_NUMBER = 5;
    private boolean onOrOff_;
    /**
     * <code>optional bool onOrOff = 5;</code>
     */
    public boolean hasOnOrOff() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool onOrOff = 5;</code>
     */
    public boolean getOnOrOff() {
      return onOrOff_;
    }

    // optional bool ontouch = 6;
    public static final int ONTOUCH_FIELD_NUMBER = 6;
    private boolean ontouch_;
    /**
     * <code>optional bool ontouch = 6;</code>
     */
    public boolean hasOntouch() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool ontouch = 6;</code>
     */
    public boolean getOntouch() {
      return ontouch_;
    }

    private void initFields() {
      cmd_ = "";
      keycode_ = 0;
      posX_ = 0;
      posY_ = 0;
      onOrOff_ = false;
      ontouch_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasCmd()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getCmdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, keycode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeSInt32(3, posX_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeSInt32(4, posY_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, onOrOff_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, ontouch_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getCmdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, keycode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(3, posX_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(4, posY_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, onOrOff_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, ontouch_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.nh.concurrent.net.bean.Request.request_Net parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.nh.concurrent.net.bean.Request.request_Net prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.nh.concurrent.net.bean.request_Net}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.nh.concurrent.net.bean.Request.request_NetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.nh.concurrent.net.bean.Request.internal_static_com_nh_concurrent_net_bean_request_Net_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.nh.concurrent.net.bean.Request.internal_static_com_nh_concurrent_net_bean_request_Net_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.nh.concurrent.net.bean.Request.request_Net.class, com.nh.concurrent.net.bean.Request.request_Net.Builder.class);
      }

      // Construct using com.nh.concurrent.net.bean.Request.request_Net.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        cmd_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        keycode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        posX_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        posY_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        onOrOff_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        ontouch_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.nh.concurrent.net.bean.Request.internal_static_com_nh_concurrent_net_bean_request_Net_descriptor;
      }

      public com.nh.concurrent.net.bean.Request.request_Net getDefaultInstanceForType() {
        return com.nh.concurrent.net.bean.Request.request_Net.getDefaultInstance();
      }

      public com.nh.concurrent.net.bean.Request.request_Net build() {
        com.nh.concurrent.net.bean.Request.request_Net result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.nh.concurrent.net.bean.Request.request_Net buildPartial() {
        com.nh.concurrent.net.bean.Request.request_Net result = new com.nh.concurrent.net.bean.Request.request_Net(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cmd_ = cmd_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.keycode_ = keycode_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.posX_ = posX_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.posY_ = posY_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.onOrOff_ = onOrOff_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.ontouch_ = ontouch_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.nh.concurrent.net.bean.Request.request_Net) {
          return mergeFrom((com.nh.concurrent.net.bean.Request.request_Net)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.nh.concurrent.net.bean.Request.request_Net other) {
        if (other == com.nh.concurrent.net.bean.Request.request_Net.getDefaultInstance()) return this;
        if (other.hasCmd()) {
          bitField0_ |= 0x00000001;
          cmd_ = other.cmd_;
          onChanged();
        }
        if (other.hasKeycode()) {
          setKeycode(other.getKeycode());
        }
        if (other.hasPosX()) {
          setPosX(other.getPosX());
        }
        if (other.hasPosY()) {
          setPosY(other.getPosY());
        }
        if (other.hasOnOrOff()) {
          setOnOrOff(other.getOnOrOff());
        }
        if (other.hasOntouch()) {
          setOntouch(other.getOntouch());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCmd()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.nh.concurrent.net.bean.Request.request_Net parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.nh.concurrent.net.bean.Request.request_Net) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string cmd = 1;
      private java.lang.Object cmd_ = "";
      /**
       * <code>required string cmd = 1;</code>
       */
      public boolean hasCmd() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string cmd = 1;</code>
       */
      public java.lang.String getCmd() {
        java.lang.Object ref = cmd_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          cmd_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string cmd = 1;</code>
       */
      public com.google.protobuf.ByteString
          getCmdBytes() {
        java.lang.Object ref = cmd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cmd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string cmd = 1;</code>
       */
      public Builder setCmd(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        cmd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string cmd = 1;</code>
       */
      public Builder clearCmd() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cmd_ = getDefaultInstance().getCmd();
        onChanged();
        return this;
      }
      /**
       * <code>required string cmd = 1;</code>
       */
      public Builder setCmdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        cmd_ = value;
        onChanged();
        return this;
      }

      // optional int32 keycode = 2;
      private int keycode_ ;
      /**
       * <code>optional int32 keycode = 2;</code>
       */
      public boolean hasKeycode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 keycode = 2;</code>
       */
      public int getKeycode() {
        return keycode_;
      }
      /**
       * <code>optional int32 keycode = 2;</code>
       */
      public Builder setKeycode(int value) {
        bitField0_ |= 0x00000002;
        keycode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 keycode = 2;</code>
       */
      public Builder clearKeycode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        keycode_ = 0;
        onChanged();
        return this;
      }

      // optional sint32 posX = 3;
      private int posX_ ;
      /**
       * <code>optional sint32 posX = 3;</code>
       */
      public boolean hasPosX() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional sint32 posX = 3;</code>
       */
      public int getPosX() {
        return posX_;
      }
      /**
       * <code>optional sint32 posX = 3;</code>
       */
      public Builder setPosX(int value) {
        bitField0_ |= 0x00000004;
        posX_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint32 posX = 3;</code>
       */
      public Builder clearPosX() {
        bitField0_ = (bitField0_ & ~0x00000004);
        posX_ = 0;
        onChanged();
        return this;
      }

      // optional sint32 posY = 4;
      private int posY_ ;
      /**
       * <code>optional sint32 posY = 4;</code>
       */
      public boolean hasPosY() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional sint32 posY = 4;</code>
       */
      public int getPosY() {
        return posY_;
      }
      /**
       * <code>optional sint32 posY = 4;</code>
       */
      public Builder setPosY(int value) {
        bitField0_ |= 0x00000008;
        posY_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint32 posY = 4;</code>
       */
      public Builder clearPosY() {
        bitField0_ = (bitField0_ & ~0x00000008);
        posY_ = 0;
        onChanged();
        return this;
      }

      // optional bool onOrOff = 5;
      private boolean onOrOff_ ;
      /**
       * <code>optional bool onOrOff = 5;</code>
       */
      public boolean hasOnOrOff() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool onOrOff = 5;</code>
       */
      public boolean getOnOrOff() {
        return onOrOff_;
      }
      /**
       * <code>optional bool onOrOff = 5;</code>
       */
      public Builder setOnOrOff(boolean value) {
        bitField0_ |= 0x00000010;
        onOrOff_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool onOrOff = 5;</code>
       */
      public Builder clearOnOrOff() {
        bitField0_ = (bitField0_ & ~0x00000010);
        onOrOff_ = false;
        onChanged();
        return this;
      }

      // optional bool ontouch = 6;
      private boolean ontouch_ ;
      /**
       * <code>optional bool ontouch = 6;</code>
       */
      public boolean hasOntouch() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool ontouch = 6;</code>
       */
      public boolean getOntouch() {
        return ontouch_;
      }
      /**
       * <code>optional bool ontouch = 6;</code>
       */
      public Builder setOntouch(boolean value) {
        bitField0_ |= 0x00000020;
        ontouch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool ontouch = 6;</code>
       */
      public Builder clearOntouch() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ontouch_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.nh.concurrent.net.bean.request_Net)
    }

    static {
      defaultInstance = new request_Net(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.nh.concurrent.net.bean.request_Net)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_nh_concurrent_net_bean_request_Net_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_nh_concurrent_net_bean_request_Net_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rRequest.proto\022\032com.nh.concurrent.net.b" +
      "ean\"i\n\013request_Net\022\013\n\003cmd\030\001 \002(\t\022\017\n\007keyco" +
      "de\030\002 \001(\005\022\014\n\004posX\030\003 \001(\021\022\014\n\004posY\030\004 \001(\021\022\017\n\007" +
      "onOrOff\030\005 \001(\010\022\017\n\007ontouch\030\006 \001(\010B%\n\032com.nh" +
      ".concurrent.net.beanB\007Request"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_nh_concurrent_net_bean_request_Net_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_nh_concurrent_net_bean_request_Net_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_nh_concurrent_net_bean_request_Net_descriptor,
              new java.lang.String[] { "Cmd", "Keycode", "PosX", "PosY", "OnOrOff", "Ontouch", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
