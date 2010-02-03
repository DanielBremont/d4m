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

public class ScanResult implements TBase, java.io.Serializable {
  public List<KeyValue> data;
  public boolean more;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean data = false;
    public boolean more = false;
  }

  public ScanResult() {
  }

  public ScanResult(
    List<KeyValue> data,
    boolean more)
  {
    this();
    this.data = data;
    this.__isset.data = true;
    this.more = more;
    this.__isset.more = true;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScanResult)
      return this.equals((ScanResult)that);
    return false;
  }

  public boolean equals(ScanResult that) {
    if (that == null)
      return false;

    boolean this_present_data = true && (this.data != null);
    boolean that_present_data = true && (that.data != null);
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_more = true;
    boolean that_present_more = true;
    if (this_present_more || that_present_more) {
      if (!(this_present_more && that_present_more))
        return false;
      if (this.more != that.more)
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
          if (field.type == TType.LIST) {
            {
              TList _list12 = iprot.readListBegin();
              this.data = new ArrayList<KeyValue>(_list12.size);
              for (int _i13 = 0; _i13 < _list12.size; ++_i13)
              {
                KeyValue _elem14 = new KeyValue();
                _elem14 = new KeyValue();
                _elem14.read(iprot);
                this.data.add(_elem14);
              }
              iprot.readListEnd();
            }
            this.__isset.data = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.BOOL) {
            this.more = iprot.readBool();
            this.__isset.more = true;
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
    TStruct struct = new TStruct("ScanResult");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.data != null) {
      field.name = "data";
      field.type = TType.LIST;
      field.id = 1;
      oprot.writeFieldBegin(field);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.data.size()));
        for (KeyValue _iter15 : this.data)        {
          _iter15.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    field.name = "more";
    field.type = TType.BOOL;
    field.id = 2;
    oprot.writeFieldBegin(field);
    oprot.writeBool(this.more);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("ScanResult(");
    sb.append("data:");
    sb.append(this.data);
    sb.append(",more:");
    sb.append(this.more);
    sb.append(")");
    return sb.toString();
  }

}

