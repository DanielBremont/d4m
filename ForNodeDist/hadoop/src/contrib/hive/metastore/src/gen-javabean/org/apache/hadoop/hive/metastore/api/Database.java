/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class Database implements TBase, java.io.Serializable {
private String name;
private String description;

public final Isset __isset = new Isset();
public static final class Isset implements java.io.Serializable {
public boolean name = false;
public boolean description = false;
}

public Database() {
}

public Database(
String name,
String description)
{
this();
this.name = name;
this.__isset.name = true;
this.description = description;
this.__isset.description = true;
}

public String getName() {
return this.name;
}

public void setName(String name) {
this.name = name;
this.__isset.name = true;
}

public void unsetName() {
this.__isset.name = false;
}

public String getDescription() {
return this.description;
}

public void setDescription(String description) {
this.description = description;
this.__isset.description = true;
}

public void unsetDescription() {
this.__isset.description = false;
}

public boolean equals(Object that) {
if (that == null)
  return false;
if (that instanceof Database)
  return this.equals((Database)that);
return false;
}

public boolean equals(Database that) {
if (that == null)
  return false;

boolean this_present_name = true && (this.name != null);
boolean that_present_name = true && (that.name != null);
if (this_present_name || that_present_name) {
if (!(this_present_name && that_present_name))
  return false;
if (!this.name.equals(that.name))
  return false;
}

boolean this_present_description = true && (this.description != null);
boolean that_present_description = true && (that.description != null);
if (this_present_description || that_present_description) {
if (!(this_present_description && that_present_description))
  return false;
if (!this.description.equals(that.description))
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
      this.name = iprot.readString();
      this.__isset.name = true;
    } else { 
      TProtocolUtil.skip(iprot, field.type);
    }
    break;
  case 2:
    if (field.type == TType.STRING) {
      this.description = iprot.readString();
      this.__isset.description = true;
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
TStruct struct = new TStruct("Database");
oprot.writeStructBegin(struct);
TField field = new TField();
if (this.name != null) {
field.name = "name";
field.type = TType.STRING;
field.id = 1;
oprot.writeFieldBegin(field);
oprot.writeString(this.name);
oprot.writeFieldEnd();
}
if (this.description != null) {
field.name = "description";
field.type = TType.STRING;
field.id = 2;
oprot.writeFieldBegin(field);
oprot.writeString(this.description);
oprot.writeFieldEnd();
}
oprot.writeFieldStop();
oprot.writeStructEnd();
}

public String toString() {
StringBuilder sb = new StringBuilder("Database(");
sb.append("name:");
sb.append(this.name);
sb.append(",description:");
sb.append(this.description);
sb.append(")");
return sb.toString();
}

}

