/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class FileStatus implements TBase, java.io.Serializable {
  public String path;
  public long length;
  public boolean isdir;
  public short block_replication;
  public long blocksize;
  public long modification_time;
  public String permission;
  public String owner;
  public String group;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean path = false;
    public boolean length = false;
    public boolean isdir = false;
    public boolean block_replication = false;
    public boolean blocksize = false;
    public boolean modification_time = false;
    public boolean permission = false;
    public boolean owner = false;
    public boolean group = false;
  }

  public FileStatus() {
  }

  public FileStatus(
    String path,
    long length,
    boolean isdir,
    short block_replication,
    long blocksize,
    long modification_time,
    String permission,
    String owner,
    String group)
  {
    this();
    this.path = path;
    this.__isset.path = true;
    this.length = length;
    this.__isset.length = true;
    this.isdir = isdir;
    this.__isset.isdir = true;
    this.block_replication = block_replication;
    this.__isset.block_replication = true;
    this.blocksize = blocksize;
    this.__isset.blocksize = true;
    this.modification_time = modification_time;
    this.__isset.modification_time = true;
    this.permission = permission;
    this.__isset.permission = true;
    this.owner = owner;
    this.__isset.owner = true;
    this.group = group;
    this.__isset.group = true;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FileStatus)
      return this.equals((FileStatus)that);
    return false;
  }

  public boolean equals(FileStatus that) {
    if (that == null)
      return false;

    boolean this_present_path = true && (this.path != null);
    boolean that_present_path = true && (that.path != null);
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    boolean this_present_isdir = true;
    boolean that_present_isdir = true;
    if (this_present_isdir || that_present_isdir) {
      if (!(this_present_isdir && that_present_isdir))
        return false;
      if (this.isdir != that.isdir)
        return false;
    }

    boolean this_present_block_replication = true;
    boolean that_present_block_replication = true;
    if (this_present_block_replication || that_present_block_replication) {
      if (!(this_present_block_replication && that_present_block_replication))
        return false;
      if (this.block_replication != that.block_replication)
        return false;
    }

    boolean this_present_blocksize = true;
    boolean that_present_blocksize = true;
    if (this_present_blocksize || that_present_blocksize) {
      if (!(this_present_blocksize && that_present_blocksize))
        return false;
      if (this.blocksize != that.blocksize)
        return false;
    }

    boolean this_present_modification_time = true;
    boolean that_present_modification_time = true;
    if (this_present_modification_time || that_present_modification_time) {
      if (!(this_present_modification_time && that_present_modification_time))
        return false;
      if (this.modification_time != that.modification_time)
        return false;
    }

    boolean this_present_permission = true && (this.permission != null);
    boolean that_present_permission = true && (that.permission != null);
    if (this_present_permission || that_present_permission) {
      if (!(this_present_permission && that_present_permission))
        return false;
      if (!this.permission.equals(that.permission))
        return false;
    }

    boolean this_present_owner = true && (this.owner != null);
    boolean that_present_owner = true && (that.owner != null);
    if (this_present_owner || that_present_owner) {
      if (!(this_present_owner && that_present_owner))
        return false;
      if (!this.owner.equals(that.owner))
        return false;
    }

    boolean this_present_group = true && (this.group != null);
    boolean that_present_group = true && (that.group != null);
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (!this.group.equals(that.group))
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
            this.path = iprot.readString();
            this.__isset.path = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.I64) {
            this.length = iprot.readI64();
            this.__isset.length = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3:
          if (field.type == TType.BOOL) {
            this.isdir = iprot.readBool();
            this.__isset.isdir = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4:
          if (field.type == TType.I16) {
            this.block_replication = iprot.readI16();
            this.__isset.block_replication = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5:
          if (field.type == TType.I64) {
            this.blocksize = iprot.readI64();
            this.__isset.blocksize = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6:
          if (field.type == TType.I64) {
            this.modification_time = iprot.readI64();
            this.__isset.modification_time = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7:
          if (field.type == TType.STRING) {
            this.permission = iprot.readString();
            this.__isset.permission = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8:
          if (field.type == TType.STRING) {
            this.owner = iprot.readString();
            this.__isset.owner = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9:
          if (field.type == TType.STRING) {
            this.group = iprot.readString();
            this.__isset.group = true;
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
    TStruct struct = new TStruct("FileStatus");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.path != null) {
      field.name = "path";
      field.type = TType.STRING;
      field.id = 1;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.path);
      oprot.writeFieldEnd();
    }
    field.name = "length";
    field.type = TType.I64;
    field.id = 2;
    oprot.writeFieldBegin(field);
    oprot.writeI64(this.length);
    oprot.writeFieldEnd();
    field.name = "isdir";
    field.type = TType.BOOL;
    field.id = 3;
    oprot.writeFieldBegin(field);
    oprot.writeBool(this.isdir);
    oprot.writeFieldEnd();
    field.name = "block_replication";
    field.type = TType.I16;
    field.id = 4;
    oprot.writeFieldBegin(field);
    oprot.writeI16(this.block_replication);
    oprot.writeFieldEnd();
    field.name = "blocksize";
    field.type = TType.I64;
    field.id = 5;
    oprot.writeFieldBegin(field);
    oprot.writeI64(this.blocksize);
    oprot.writeFieldEnd();
    field.name = "modification_time";
    field.type = TType.I64;
    field.id = 6;
    oprot.writeFieldBegin(field);
    oprot.writeI64(this.modification_time);
    oprot.writeFieldEnd();
    if (this.permission != null) {
      field.name = "permission";
      field.type = TType.STRING;
      field.id = 7;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.permission);
      oprot.writeFieldEnd();
    }
    if (this.owner != null) {
      field.name = "owner";
      field.type = TType.STRING;
      field.id = 8;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.owner);
      oprot.writeFieldEnd();
    }
    if (this.group != null) {
      field.name = "group";
      field.type = TType.STRING;
      field.id = 9;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.group);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("FileStatus(");
    sb.append("path:");
    sb.append(this.path);
    sb.append(",length:");
    sb.append(this.length);
    sb.append(",isdir:");
    sb.append(this.isdir);
    sb.append(",block_replication:");
    sb.append(this.block_replication);
    sb.append(",blocksize:");
    sb.append(this.blocksize);
    sb.append(",modification_time:");
    sb.append(this.modification_time);
    sb.append(",permission:");
    sb.append(this.permission);
    sb.append(",owner:");
    sb.append(this.owner);
    sb.append(",group:");
    sb.append(this.group);
    sb.append(")");
    return sb.toString();
  }

}

