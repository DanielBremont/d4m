/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package cloudbase.core.data;

import com.facebook.thrift.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings("serial")
public class IterInfo implements TBase, java.io.Serializable {
  public int priority;
  public String className;
  public String iterName;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean priority = false;
    public boolean className = false;
    public boolean iterName = false;
  }

  public IterInfo() {
  }

  public IterInfo(
    int priority,
    String className,
    String iterName)
  {
    this();
    this.priority = priority;
    this.__isset.priority = true;
    this.className = className;
    this.__isset.className = true;
    this.iterName = iterName;
    this.__isset.iterName = true;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IterInfo)
      return this.equals((IterInfo)that);
    return false;
  }

  public boolean equals(IterInfo that) {
    if (that == null)
      return false;

    boolean this_present_priority = true;
    boolean that_present_priority = true;
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (this.priority != that.priority)
        return false;
    }

    boolean this_present_className = true && (this.className != null);
    boolean that_present_className = true && (that.className != null);
    if (this_present_className || that_present_className) {
      if (!(this_present_className && that_present_className))
        return false;
      if (!this.className.equals(that.className))
        return false;
    }

    boolean this_present_iterName = true && (this.iterName != null);
    boolean that_present_iterName = true && (that.iterName != null);
    if (this_present_iterName || that_present_iterName) {
      if (!(this_present_iterName && that_present_iterName))
        return false;
      if (!this.iterName.equals(that.iterName))
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
          if (field.type == TType.I32) {
            this.priority = iprot.readI32();
            this.__isset.priority = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.STRING) {
            this.className = iprot.readString();
            this.__isset.className = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3:
          if (field.type == TType.STRING) {
            this.iterName = iprot.readString();
            this.__isset.iterName = true;
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
    TStruct struct = new TStruct("IterInfo");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    field.name = "priority";
    field.type = TType.I32;
    field.id = 1;
    oprot.writeFieldBegin(field);
    oprot.writeI32(this.priority);
    oprot.writeFieldEnd();
    if (this.className != null) {
      field.name = "className";
      field.type = TType.STRING;
      field.id = 2;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.className);
      oprot.writeFieldEnd();
    }
    if (this.iterName != null) {
      field.name = "iterName";
      field.type = TType.STRING;
      field.id = 3;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.iterName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("IterInfo(");
    sb.append("priority:");
    sb.append(this.priority);
    sb.append(",className:");
    sb.append(this.className);
    sb.append(",iterName:");
    sb.append(this.iterName);
    sb.append(")");
    return sb.toString();
  }

}

