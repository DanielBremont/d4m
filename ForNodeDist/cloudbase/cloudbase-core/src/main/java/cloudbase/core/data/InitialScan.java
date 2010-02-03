/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package cloudbase.core.data;

import com.facebook.thrift.TBase;
import com.facebook.thrift.TException;
import com.facebook.thrift.protocol.TField;
import com.facebook.thrift.protocol.TProtocol;
import com.facebook.thrift.protocol.TProtocolUtil;
import com.facebook.thrift.protocol.TStruct;
import com.facebook.thrift.protocol.TType;

@SuppressWarnings("serial")
public class InitialScan implements TBase, java.io.Serializable {
  public long scanID;
  public ScanResult result;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean scanID = false;
    public boolean result = false;
  }

  public InitialScan() {
  }

  public InitialScan(
    long scanID,
    ScanResult result)
  {
    this();
    this.scanID = scanID;
    this.__isset.scanID = true;
    this.result = result;
    this.__isset.result = true;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InitialScan)
      return this.equals((InitialScan)that);
    return false;
  }

  public boolean equals(InitialScan that) {
    if (that == null)
      return false;

    boolean this_present_scanID = true;
    boolean that_present_scanID = true;
    if (this_present_scanID || that_present_scanID) {
      if (!(this_present_scanID && that_present_scanID))
        return false;
      if (this.scanID != that.scanID)
        return false;
    }

    boolean this_present_result = true && (this.result != null);
    boolean that_present_result = true && (that.result != null);
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
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
          if (field.type == TType.I64) {
            this.scanID = iprot.readI64();
            this.__isset.scanID = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.STRUCT) {
            this.result = new ScanResult();
            this.result.read(iprot);
            this.__isset.result = true;
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
    TStruct struct = new TStruct("InitialScan");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    field.name = "scanID";
    field.type = TType.I64;
    field.id = 1;
    oprot.writeFieldBegin(field);
    oprot.writeI64(this.scanID);
    oprot.writeFieldEnd();
    if (this.result != null) {
      field.name = "result";
      field.type = TType.STRUCT;
      field.id = 2;
      oprot.writeFieldBegin(field);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("InitialScan(");
    sb.append("scanID:");
    sb.append(this.scanID);
    sb.append(",result:");
    sb.append(this.result.toString());
    sb.append(")");
    return sb.toString();
  }

}

