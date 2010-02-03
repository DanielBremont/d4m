/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package cloudbase.core.monitor.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class MasterMonitorInfo implements TBase, java.io.Serializable {
  public Map<String,TableInfo> tableMap;
  public List<cloudbase.core.master.thrift.TabletServerStatus> tServerInfo;
  public Map<String,Short> badTServers;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean tableMap = false;
    public boolean tServerInfo = false;
    public boolean badTServers = false;
  }

  public MasterMonitorInfo() {
  }

  public MasterMonitorInfo(
    Map<String,TableInfo> tableMap,
    List<cloudbase.core.master.thrift.TabletServerStatus> tServerInfo,
    Map<String,Short> badTServers)
  {
    this();
    this.tableMap = tableMap;
    this.__isset.tableMap = true;
    this.tServerInfo = tServerInfo;
    this.__isset.tServerInfo = true;
    this.badTServers = badTServers;
    this.__isset.badTServers = true;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MasterMonitorInfo)
      return this.equals((MasterMonitorInfo)that);
    return false;
  }

  public boolean equals(MasterMonitorInfo that) {
    if (that == null)
      return false;

    boolean this_present_tableMap = true && (this.tableMap != null);
    boolean that_present_tableMap = true && (that.tableMap != null);
    if (this_present_tableMap || that_present_tableMap) {
      if (!(this_present_tableMap && that_present_tableMap))
        return false;
      if (!this.tableMap.equals(that.tableMap))
        return false;
    }

    boolean this_present_tServerInfo = true && (this.tServerInfo != null);
    boolean that_present_tServerInfo = true && (that.tServerInfo != null);
    if (this_present_tServerInfo || that_present_tServerInfo) {
      if (!(this_present_tServerInfo && that_present_tServerInfo))
        return false;
      if (!this.tServerInfo.equals(that.tServerInfo))
        return false;
    }

    boolean this_present_badTServers = true && (this.badTServers != null);
    boolean that_present_badTServers = true && (that.badTServers != null);
    if (this_present_badTServers || that_present_badTServers) {
      if (!(this_present_badTServers && that_present_badTServers))
        return false;
      if (!this.badTServers.equals(that.badTServers))
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
          if (field.type == TType.MAP) {
            {
              TMap _map0 = iprot.readMapBegin();
              this.tableMap = new HashMap<String,TableInfo>(2*_map0.size);
              for (int _i1 = 0; _i1 < _map0.size; ++_i1)
              {
                String _key2;
                TableInfo _val3;
                _key2 = iprot.readString();
                _val3 = new TableInfo();
                _val3.read(iprot);
                this.tableMap.put(_key2, _val3);
              }
              iprot.readMapEnd();
            }
            this.__isset.tableMap = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.LIST) {
            {
              TList _list4 = iprot.readListBegin();
              this.tServerInfo = new ArrayList<cloudbase.core.master.thrift.TabletServerStatus>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                cloudbase.core.master.thrift.TabletServerStatus _elem6 = new cloudbase.core.master.thrift.TabletServerStatus();
                _elem6 = new cloudbase.core.master.thrift.TabletServerStatus();
                _elem6.read(iprot);
                this.tServerInfo.add(_elem6);
              }
              iprot.readListEnd();
            }
            this.__isset.tServerInfo = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3:
          if (field.type == TType.MAP) {
            {
              TMap _map7 = iprot.readMapBegin();
              this.badTServers = new HashMap<String,Short>(2*_map7.size);
              for (int _i8 = 0; _i8 < _map7.size; ++_i8)
              {
                String _key9;
                short _val10;
                _key9 = iprot.readString();
                _val10 = iprot.readI16();
                this.badTServers.put(_key9, _val10);
              }
              iprot.readMapEnd();
            }
            this.__isset.badTServers = true;
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
    TStruct struct = new TStruct("MasterMonitorInfo");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.tableMap != null) {
      field.name = "tableMap";
      field.type = TType.MAP;
      field.id = 1;
      oprot.writeFieldBegin(field);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.tableMap.size()));
        for (String _iter11 : this.tableMap.keySet())        {
          oprot.writeString(_iter11);
          this.tableMap.get(_iter11).write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.tServerInfo != null) {
      field.name = "tServerInfo";
      field.type = TType.LIST;
      field.id = 2;
      oprot.writeFieldBegin(field);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.tServerInfo.size()));
        for (cloudbase.core.master.thrift.TabletServerStatus _iter12 : this.tServerInfo)        {
          _iter12.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.badTServers != null) {
      field.name = "badTServers";
      field.type = TType.MAP;
      field.id = 3;
      oprot.writeFieldBegin(field);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.I16, this.badTServers.size()));
        for (String _iter13 : this.badTServers.keySet())        {
          oprot.writeString(_iter13);
          oprot.writeI16(this.badTServers.get(_iter13));
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("MasterMonitorInfo(");
    sb.append("tableMap:");
    sb.append(this.tableMap);
    sb.append(",tServerInfo:");
    sb.append(this.tServerInfo);
    sb.append(",badTServers:");
    sb.append(this.badTServers);
    sb.append(")");
    return sb.toString();
  }

}

