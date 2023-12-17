// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class StartCocoonStageScRspOuterClass {
  /**
   * Protobuf type {@code StartCocoonStageScRsp}
   */
  public static final class StartCocoonStageScRsp extends ProtoMessage<StartCocoonStageScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 wave = 3;</code>
     */
    private int wave;

    /**
     * <code>optional uint32 retcode = 5;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 cocoon_id = 9;</code>
     */
    private int cocoonId;

    /**
     * <code>optional uint32 prop_entity_id = 13;</code>
     */
    private int propEntityId;

    /**
     * <code>optional .SceneBattleInfo battle_info = 10;</code>
     */
    private final SceneBattleInfoOuterClass.SceneBattleInfo battleInfo = SceneBattleInfoOuterClass.SceneBattleInfo.newInstance();

    private StartCocoonStageScRsp() {
    }

    /**
     * @return a new empty instance of {@code StartCocoonStageScRsp}
     */
    public static StartCocoonStageScRsp newInstance() {
      return new StartCocoonStageScRsp();
    }

    /**
     * <code>optional uint32 wave = 3;</code>
     * @return whether the wave field is set
     */
    public boolean hasWave() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 wave = 3;</code>
     * @return this
     */
    public StartCocoonStageScRsp clearWave() {
      bitField0_ &= ~0x00000001;
      wave = 0;
      return this;
    }

    /**
     * <code>optional uint32 wave = 3;</code>
     * @return the wave
     */
    public int getWave() {
      return wave;
    }

    /**
     * <code>optional uint32 wave = 3;</code>
     * @param value the wave to set
     * @return this
     */
    public StartCocoonStageScRsp setWave(final int value) {
      bitField0_ |= 0x00000001;
      wave = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return this
     */
    public StartCocoonStageScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @param value the retcode to set
     * @return this
     */
    public StartCocoonStageScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 cocoon_id = 9;</code>
     * @return whether the cocoonId field is set
     */
    public boolean hasCocoonId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cocoon_id = 9;</code>
     * @return this
     */
    public StartCocoonStageScRsp clearCocoonId() {
      bitField0_ &= ~0x00000004;
      cocoonId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cocoon_id = 9;</code>
     * @return the cocoonId
     */
    public int getCocoonId() {
      return cocoonId;
    }

    /**
     * <code>optional uint32 cocoon_id = 9;</code>
     * @param value the cocoonId to set
     * @return this
     */
    public StartCocoonStageScRsp setCocoonId(final int value) {
      bitField0_ |= 0x00000004;
      cocoonId = value;
      return this;
    }

    /**
     * <code>optional uint32 prop_entity_id = 13;</code>
     * @return whether the propEntityId field is set
     */
    public boolean hasPropEntityId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 prop_entity_id = 13;</code>
     * @return this
     */
    public StartCocoonStageScRsp clearPropEntityId() {
      bitField0_ &= ~0x00000008;
      propEntityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 prop_entity_id = 13;</code>
     * @return the propEntityId
     */
    public int getPropEntityId() {
      return propEntityId;
    }

    /**
     * <code>optional uint32 prop_entity_id = 13;</code>
     * @param value the propEntityId to set
     * @return this
     */
    public StartCocoonStageScRsp setPropEntityId(final int value) {
      bitField0_ |= 0x00000008;
      propEntityId = value;
      return this;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 10;</code>
     * @return whether the battleInfo field is set
     */
    public boolean hasBattleInfo() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 10;</code>
     * @return this
     */
    public StartCocoonStageScRsp clearBattleInfo() {
      bitField0_ &= ~0x00000010;
      battleInfo.clear();
      return this;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBattleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getBattleInfo() {
      return battleInfo;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getMutableBattleInfo() {
      bitField0_ |= 0x00000010;
      return battleInfo;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 10;</code>
     * @param value the battleInfo to set
     * @return this
     */
    public StartCocoonStageScRsp setBattleInfo(
        final SceneBattleInfoOuterClass.SceneBattleInfo value) {
      bitField0_ |= 0x00000010;
      battleInfo.copyFrom(value);
      return this;
    }

    @Override
    public StartCocoonStageScRsp copyFrom(final StartCocoonStageScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        wave = other.wave;
        retcode = other.retcode;
        cocoonId = other.cocoonId;
        propEntityId = other.propEntityId;
        battleInfo.copyFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public StartCocoonStageScRsp mergeFrom(final StartCocoonStageScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWave()) {
        setWave(other.wave);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasCocoonId()) {
        setCocoonId(other.cocoonId);
      }
      if (other.hasPropEntityId()) {
        setPropEntityId(other.propEntityId);
      }
      if (other.hasBattleInfo()) {
        getMutableBattleInfo().mergeFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public StartCocoonStageScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      wave = 0;
      retcode = 0;
      cocoonId = 0;
      propEntityId = 0;
      battleInfo.clear();
      return this;
    }

    @Override
    public StartCocoonStageScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartCocoonStageScRsp)) {
        return false;
      }
      StartCocoonStageScRsp other = (StartCocoonStageScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasWave() || wave == other.wave)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasCocoonId() || cocoonId == other.cocoonId)
        && (!hasPropEntityId() || propEntityId == other.propEntityId)
        && (!hasBattleInfo() || battleInfo.equals(other.battleInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(wave);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(cocoonId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(battleInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(wave);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cocoonId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(battleInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartCocoonStageScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // wave
            wave = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // cocoonId
            cocoonId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // propEntityId
            propEntityId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // battleInfo
            input.readMessage(battleInfo);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.wave, wave);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.cocoonId, cocoonId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.propEntityId, propEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.battleInfo, battleInfo);
      }
      output.endObject();
    }

    @Override
    public StartCocoonStageScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3642105: {
            if (input.isAtField(FieldNames.wave)) {
              if (!input.trySkipNullValue()) {
                wave = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -886563534:
          case -1713644381: {
            if (input.isAtField(FieldNames.cocoonId)) {
              if (!input.trySkipNullValue()) {
                cocoonId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -68717343:
          case -57484005: {
            if (input.isAtField(FieldNames.propEntityId)) {
              if (!input.trySkipNullValue()) {
                propEntityId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2053377414:
          case -749633579: {
            if (input.isAtField(FieldNames.battleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(battleInfo);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public StartCocoonStageScRsp clone() {
      return new StartCocoonStageScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartCocoonStageScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartCocoonStageScRsp(), data).checkInitialized();
    }

    public static StartCocoonStageScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartCocoonStageScRsp(), input).checkInitialized();
    }

    public static StartCocoonStageScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartCocoonStageScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartCocoonStageScRsp messages
     */
    public static MessageFactory<StartCocoonStageScRsp> getFactory() {
      return StartCocoonStageScRspFactory.INSTANCE;
    }

    private enum StartCocoonStageScRspFactory implements MessageFactory<StartCocoonStageScRsp> {
      INSTANCE;

      @Override
      public StartCocoonStageScRsp create() {
        return StartCocoonStageScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName wave = FieldName.forField("wave");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName cocoonId = FieldName.forField("cocoonId", "cocoon_id");

      static final FieldName propEntityId = FieldName.forField("propEntityId", "prop_entity_id");

      static final FieldName battleInfo = FieldName.forField("battleInfo", "battle_info");
    }
  }
}
