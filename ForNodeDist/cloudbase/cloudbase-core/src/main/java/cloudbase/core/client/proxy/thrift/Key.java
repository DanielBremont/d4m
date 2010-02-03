/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package cloudbase.core.client.proxy.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class Key implements TBase, java.io.Serializable {
  public byte[] row;
  public Column column;
  public long timestamp;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean row = false;
    public boolean column = false;
    public boolean timestamp = false;
  }

  public Key() {
  }

  public Key(
    byte[] row,
    Column column,
    long timestamp)
  {
    this();
    this.row = row;
    this.__isset.row = true;
    this.column = column;
    this.__isset.column = true;
    this.timestamp = timestamp;
    this.__isset.timestamp = true;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Key)
      return this.equals((Key)that);
    return false;
  }

  public boolean equals(Key that) {
    if (that == null)
      return false;

    boolean this_present_row = true && (this.row != null);
    boolean that_present_row = true && (that.row != null);
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!java.util.Arrays.equals(this.row, that.row))
        return false;
    }

    boolean this_present_column = true && (this.column != null);
    boolean that_present_column = true && (that.column != null);
    if (this_present_column || that_present_column) {
      if (!(this_present_column && that_present_column))
        return false;
      if (!this.column.equals(that.column))
        return false;
    }

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case 1:
          if (field.type == TType.STRING) {
            this.row = iprot.readBinary();
            this.__isset.row = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.STRUCT) {
            this.column = new Column();
            this.column.read(iprot);
            this.__isset.column = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3:
          if (field.type == TType.I64) {
            this.timestamp = iprot.readI64();
            this.__isset.timestamp = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  public void write(TProtocol oprot) throws TException {
    TStruct struct = new TStruct("Key");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.row != null) {
      field.name = "row";
      field.type = TType.STRING;
      field.id = 1;
      oprot.writeFieldBegin(field);
      oprot.writeBinary(this.row);
      oprot.writeFieldEnd();
    }
    if (this.column != null) {
      field.name = "column";
      field.type = TType.STRUCT;
      field.id = 2;
      oprot.writeFieldBegin(field);
      this.column.write(oprot);
      oprot.writeFieldEnd();
    }
    field.name = "timestamp";
    field.type = TType.I64;
    field.id = 3;
    oprot.writeFieldBegin(field);
    oprot.writeI64(this.timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("Key(");
    sb.append("row:");
    sb.append(this.row);
    sb.append(",column:");
    sb.append(this.column.toString());
    sb.append(",timestamp:");
    sb.append(this.timestamp);
    sb.append(")");
    return sb.toString();
  }

}

