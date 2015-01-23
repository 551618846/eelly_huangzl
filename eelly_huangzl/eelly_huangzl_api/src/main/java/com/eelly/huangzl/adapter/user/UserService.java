/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.eelly.huangzl.adapter.user;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

  public interface Iface extends com.eelly.core.thrift.adapter.CommonService.Iface {

    /**
     * 
     * @方法名：getUserByUserName
     * @描述：TODO 
     * @创建人：<a href=mailto: huangzhenliang@eelly.net>huangzhenliang</a>
     * @修改人：
     * @修改时间：2014年9月30日 上午8:45:23
     * @param userName
     * @param params
     * @return
     * @throws org.apache.thrift.TException 
     * @返回值：com.eelly.core.thrift.vo.ReturnObj 
     * @异常说明：
     */
    public com.eelly.core.thrift.vo.ReturnObj getUserByUserName(String userName, com.eelly.core.thrift.vo.Params params) throws org.apache.thrift.TException;

  }

  public interface AsyncIface extends com.eelly.core.thrift.adapter.CommonService .AsyncIface {

    public void getUserByUserName(String userName, com.eelly.core.thrift.vo.Params params, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends com.eelly.core.thrift.adapter.CommonService.Client implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public com.eelly.core.thrift.vo.ReturnObj getUserByUserName(String userName, com.eelly.core.thrift.vo.Params params) throws org.apache.thrift.TException
    {
      send_getUserByUserName(userName, params);
      return recv_getUserByUserName();
    }

    public void send_getUserByUserName(String userName, com.eelly.core.thrift.vo.Params params) throws org.apache.thrift.TException
    {
      getUserByUserName_args args = new getUserByUserName_args();
      args.setUserName(userName);
      args.setParams(params);
      sendBase("getUserByUserName", args);
    }

    public com.eelly.core.thrift.vo.ReturnObj recv_getUserByUserName() throws org.apache.thrift.TException
    {
      getUserByUserName_result result = new getUserByUserName_result();
      receiveBase(result, "getUserByUserName");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "getUserByUserName failed: unknown result");
    }

  }
  public static class AsyncClient extends com.eelly.core.thrift.adapter.CommonService.AsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void getUserByUserName(String userName, com.eelly.core.thrift.vo.Params params, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      getUserByUserName_call method_call = new getUserByUserName_call(userName, params, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class getUserByUserName_call extends org.apache.thrift.async.TAsyncMethodCall {
      private String userName;
      private com.eelly.core.thrift.vo.Params params;
      public getUserByUserName_call(String userName, com.eelly.core.thrift.vo.Params params, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.userName = userName;
        this.params = params;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("getUserByUserName", org.apache.thrift.protocol.TMessageType.CALL, 0));
        getUserByUserName_args args = new getUserByUserName_args();
        args.setUserName(userName);
        args.setParams(params);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public com.eelly.core.thrift.vo.ReturnObj getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_getUserByUserName();
      }
    }

  }

  public static class Processor<I extends Iface> extends com.eelly.core.thrift.adapter.CommonService.Processor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("getUserByUserName", new getUserByUserName());
      return processMap;
    }

    public static class getUserByUserName<I extends Iface> extends org.apache.thrift.ProcessFunction<I, getUserByUserName_args> {
      public getUserByUserName() {
        super("getUserByUserName");
      }

      public getUserByUserName_args getEmptyArgsInstance() {
        return new getUserByUserName_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public getUserByUserName_result getResult(I iface, getUserByUserName_args args) throws org.apache.thrift.TException {
        getUserByUserName_result result = new getUserByUserName_result();
        result.success = iface.getUserByUserName(args.userName, args.params);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends com.eelly.core.thrift.adapter.CommonService.AsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("getUserByUserName", new getUserByUserName());
      return processMap;
    }

    public static class getUserByUserName<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, getUserByUserName_args, com.eelly.core.thrift.vo.ReturnObj> {
      public getUserByUserName() {
        super("getUserByUserName");
      }

      public getUserByUserName_args getEmptyArgsInstance() {
        return new getUserByUserName_args();
      }

      public AsyncMethodCallback<com.eelly.core.thrift.vo.ReturnObj> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<com.eelly.core.thrift.vo.ReturnObj>() { 
          public void onComplete(com.eelly.core.thrift.vo.ReturnObj o) {
            getUserByUserName_result result = new getUserByUserName_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            getUserByUserName_result result = new getUserByUserName_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, getUserByUserName_args args, org.apache.thrift.async.AsyncMethodCallback<com.eelly.core.thrift.vo.ReturnObj> resultHandler) throws TException {
        iface.getUserByUserName(args.userName, args.params,resultHandler);
      }
    }

  }

  public static class getUserByUserName_args implements org.apache.thrift.TBase<getUserByUserName_args, getUserByUserName_args._Fields>, java.io.Serializable, Cloneable, Comparable<getUserByUserName_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getUserByUserName_args");

    private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.STRUCT, (short)2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getUserByUserName_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new getUserByUserName_argsTupleSchemeFactory());
    }

    private String userName; // required
    private com.eelly.core.thrift.vo.Params params; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      USER_NAME((short)1, "userName"),
      PARAMS((short)2, "params");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // USER_NAME
            return USER_NAME;
          case 2: // PARAMS
            return PARAMS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.eelly.core.thrift.vo.Params.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getUserByUserName_args.class, metaDataMap);
    }

    public getUserByUserName_args() {
    }

    public getUserByUserName_args(
      String userName,
      com.eelly.core.thrift.vo.Params params)
    {
      this();
      this.userName = userName;
      this.params = params;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getUserByUserName_args(getUserByUserName_args other) {
      if (other.isSetUserName()) {
        this.userName = other.userName;
      }
      if (other.isSetParams()) {
        this.params = new com.eelly.core.thrift.vo.Params(other.params);
      }
    }

    public getUserByUserName_args deepCopy() {
      return new getUserByUserName_args(this);
    }

    @Override
    public void clear() {
      this.userName = null;
      this.params = null;
    }

    public String getUserName() {
      return this.userName;
    }

    public void setUserName(String userName) {
      this.userName = userName;
    }

    public void unsetUserName() {
      this.userName = null;
    }

    /** Returns true if field userName is set (has been assigned a value) and false otherwise */
    public boolean isSetUserName() {
      return this.userName != null;
    }

    public void setUserNameIsSet(boolean value) {
      if (!value) {
        this.userName = null;
      }
    }

    public com.eelly.core.thrift.vo.Params getParams() {
      return this.params;
    }

    public void setParams(com.eelly.core.thrift.vo.Params params) {
      this.params = params;
    }

    public void unsetParams() {
      this.params = null;
    }

    /** Returns true if field params is set (has been assigned a value) and false otherwise */
    public boolean isSetParams() {
      return this.params != null;
    }

    public void setParamsIsSet(boolean value) {
      if (!value) {
        this.params = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case USER_NAME:
        if (value == null) {
          unsetUserName();
        } else {
          setUserName((String)value);
        }
        break;

      case PARAMS:
        if (value == null) {
          unsetParams();
        } else {
          setParams((com.eelly.core.thrift.vo.Params)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case USER_NAME:
        return getUserName();

      case PARAMS:
        return getParams();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case USER_NAME:
        return isSetUserName();
      case PARAMS:
        return isSetParams();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getUserByUserName_args)
        return this.equals((getUserByUserName_args)that);
      return false;
    }

    public boolean equals(getUserByUserName_args that) {
      if (that == null)
        return false;

      boolean this_present_userName = true && this.isSetUserName();
      boolean that_present_userName = true && that.isSetUserName();
      if (this_present_userName || that_present_userName) {
        if (!(this_present_userName && that_present_userName))
          return false;
        if (!this.userName.equals(that.userName))
          return false;
      }

      boolean this_present_params = true && this.isSetParams();
      boolean that_present_params = true && that.isSetParams();
      if (this_present_params || that_present_params) {
        if (!(this_present_params && that_present_params))
          return false;
        if (!this.params.equals(that.params))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(getUserByUserName_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetUserName()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetParams()).compareTo(other.isSetParams());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetParams()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("getUserByUserName_args(");
      boolean first = true;

      sb.append("userName:");
      if (this.userName == null) {
        sb.append("null");
      } else {
        sb.append(this.userName);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("params:");
      if (this.params == null) {
        sb.append("null");
      } else {
        sb.append(this.params);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (params != null) {
        params.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class getUserByUserName_argsStandardSchemeFactory implements SchemeFactory {
      public getUserByUserName_argsStandardScheme getScheme() {
        return new getUserByUserName_argsStandardScheme();
      }
    }

    private static class getUserByUserName_argsStandardScheme extends StandardScheme<getUserByUserName_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getUserByUserName_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // USER_NAME
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.userName = iprot.readString();
                struct.setUserNameIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // PARAMS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.params = new com.eelly.core.thrift.vo.Params();
                struct.params.read(iprot);
                struct.setParamsIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, getUserByUserName_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.userName != null) {
          oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
          oprot.writeString(struct.userName);
          oprot.writeFieldEnd();
        }
        if (struct.params != null) {
          oprot.writeFieldBegin(PARAMS_FIELD_DESC);
          struct.params.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class getUserByUserName_argsTupleSchemeFactory implements SchemeFactory {
      public getUserByUserName_argsTupleScheme getScheme() {
        return new getUserByUserName_argsTupleScheme();
      }
    }

    private static class getUserByUserName_argsTupleScheme extends TupleScheme<getUserByUserName_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, getUserByUserName_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetUserName()) {
          optionals.set(0);
        }
        if (struct.isSetParams()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetUserName()) {
          oprot.writeString(struct.userName);
        }
        if (struct.isSetParams()) {
          struct.params.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, getUserByUserName_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.userName = iprot.readString();
          struct.setUserNameIsSet(true);
        }
        if (incoming.get(1)) {
          struct.params = new com.eelly.core.thrift.vo.Params();
          struct.params.read(iprot);
          struct.setParamsIsSet(true);
        }
      }
    }

  }

  public static class getUserByUserName_result implements org.apache.thrift.TBase<getUserByUserName_result, getUserByUserName_result._Fields>, java.io.Serializable, Cloneable, Comparable<getUserByUserName_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getUserByUserName_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getUserByUserName_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new getUserByUserName_resultTupleSchemeFactory());
    }

    private com.eelly.core.thrift.vo.ReturnObj success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.eelly.core.thrift.vo.ReturnObj.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getUserByUserName_result.class, metaDataMap);
    }

    public getUserByUserName_result() {
    }

    public getUserByUserName_result(
      com.eelly.core.thrift.vo.ReturnObj success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getUserByUserName_result(getUserByUserName_result other) {
      if (other.isSetSuccess()) {
        this.success = new com.eelly.core.thrift.vo.ReturnObj(other.success);
      }
    }

    public getUserByUserName_result deepCopy() {
      return new getUserByUserName_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public com.eelly.core.thrift.vo.ReturnObj getSuccess() {
      return this.success;
    }

    public void setSuccess(com.eelly.core.thrift.vo.ReturnObj success) {
      this.success = success;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((com.eelly.core.thrift.vo.ReturnObj)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getUserByUserName_result)
        return this.equals((getUserByUserName_result)that);
      return false;
    }

    public boolean equals(getUserByUserName_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(getUserByUserName_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("getUserByUserName_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class getUserByUserName_resultStandardSchemeFactory implements SchemeFactory {
      public getUserByUserName_resultStandardScheme getScheme() {
        return new getUserByUserName_resultStandardScheme();
      }
    }

    private static class getUserByUserName_resultStandardScheme extends StandardScheme<getUserByUserName_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getUserByUserName_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new com.eelly.core.thrift.vo.ReturnObj();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, getUserByUserName_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class getUserByUserName_resultTupleSchemeFactory implements SchemeFactory {
      public getUserByUserName_resultTupleScheme getScheme() {
        return new getUserByUserName_resultTupleScheme();
      }
    }

    private static class getUserByUserName_resultTupleScheme extends TupleScheme<getUserByUserName_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, getUserByUserName_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, getUserByUserName_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new com.eelly.core.thrift.vo.ReturnObj();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}