/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.thrift.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
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
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

/**
 * An HColumnDescriptor contains information about a column family
 * such as the number of versions, compression settings, etc. It is
 * used as input when creating a table or adding a column.
 */
public class ColumnDescriptor implements TBase<ColumnDescriptor._Fields>, java.io.Serializable, Cloneable, Comparable<ColumnDescriptor> {
  private static final TStruct STRUCT_DESC = new TStruct("ColumnDescriptor");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField MAX_VERSIONS_FIELD_DESC = new TField("maxVersions", TType.I32, (short)2);
  private static final TField COMPRESSION_FIELD_DESC = new TField("compression", TType.STRING, (short)3);
  private static final TField IN_MEMORY_FIELD_DESC = new TField("inMemory", TType.BOOL, (short)4);
  private static final TField BLOOM_FILTER_TYPE_FIELD_DESC = new TField("bloomFilterType", TType.STRING, (short)5);
  private static final TField BLOOM_FILTER_VECTOR_SIZE_FIELD_DESC = new TField("bloomFilterVectorSize", TType.I32, (short)6);
  private static final TField BLOOM_FILTER_NB_HASHES_FIELD_DESC = new TField("bloomFilterNbHashes", TType.I32, (short)7);
  private static final TField BLOCK_CACHE_ENABLED_FIELD_DESC = new TField("blockCacheEnabled", TType.BOOL, (short)8);
  private static final TField TIME_TO_LIVE_FIELD_DESC = new TField("timeToLive", TType.I32, (short)9);

  public byte[] name;
  public int maxVersions;
  public String compression;
  public boolean inMemory;
  public String bloomFilterType;
  public int bloomFilterVectorSize;
  public int bloomFilterNbHashes;
  public boolean blockCacheEnabled;
  public int timeToLive;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    MAX_VERSIONS((short)2, "maxVersions"),
    COMPRESSION((short)3, "compression"),
    IN_MEMORY((short)4, "inMemory"),
    BLOOM_FILTER_TYPE((short)5, "bloomFilterType"),
    BLOOM_FILTER_VECTOR_SIZE((short)6, "bloomFilterVectorSize"),
    BLOOM_FILTER_NB_HASHES((short)7, "bloomFilterNbHashes"),
    BLOCK_CACHE_ENABLED((short)8, "blockCacheEnabled"),
    TIME_TO_LIVE((short)9, "timeToLive");

    private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byId.put((int)field._thriftId, field);
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      return byId.get(fieldId);
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
  private static final int __MAXVERSIONS_ISSET_ID = 0;
  private static final int __INMEMORY_ISSET_ID = 1;
  private static final int __BLOOMFILTERVECTORSIZE_ISSET_ID = 2;
  private static final int __BLOOMFILTERNBHASHES_ISSET_ID = 3;
  private static final int __BLOCKCACHEENABLED_ISSET_ID = 4;
  private static final int __TIMETOLIVE_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.MAX_VERSIONS, new FieldMetaData("maxVersions", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I32)));
    put(_Fields.COMPRESSION, new FieldMetaData("compression", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.IN_MEMORY, new FieldMetaData("inMemory", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.BOOL)));
    put(_Fields.BLOOM_FILTER_TYPE, new FieldMetaData("bloomFilterType", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.BLOOM_FILTER_VECTOR_SIZE, new FieldMetaData("bloomFilterVectorSize", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I32)));
    put(_Fields.BLOOM_FILTER_NB_HASHES, new FieldMetaData("bloomFilterNbHashes", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I32)));
    put(_Fields.BLOCK_CACHE_ENABLED, new FieldMetaData("blockCacheEnabled", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.BOOL)));
    put(_Fields.TIME_TO_LIVE, new FieldMetaData("timeToLive", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I32)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(ColumnDescriptor.class, metaDataMap);
  }

  public ColumnDescriptor() {
    this.maxVersions = 3;

    this.compression = "NONE";

    this.inMemory = false;

    this.bloomFilterType = "NONE";

    this.bloomFilterVectorSize = 0;

    this.bloomFilterNbHashes = 0;

    this.blockCacheEnabled = false;

    this.timeToLive = -1;

  }

  public ColumnDescriptor(
    byte[] name,
    int maxVersions,
    String compression,
    boolean inMemory,
    String bloomFilterType,
    int bloomFilterVectorSize,
    int bloomFilterNbHashes,
    boolean blockCacheEnabled,
    int timeToLive)
  {
    this();
    this.name = name;
    this.maxVersions = maxVersions;
    setMaxVersionsIsSet(true);
    this.compression = compression;
    this.inMemory = inMemory;
    setInMemoryIsSet(true);
    this.bloomFilterType = bloomFilterType;
    this.bloomFilterVectorSize = bloomFilterVectorSize;
    setBloomFilterVectorSizeIsSet(true);
    this.bloomFilterNbHashes = bloomFilterNbHashes;
    setBloomFilterNbHashesIsSet(true);
    this.blockCacheEnabled = blockCacheEnabled;
    setBlockCacheEnabledIsSet(true);
    this.timeToLive = timeToLive;
    setTimeToLiveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnDescriptor(ColumnDescriptor other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.maxVersions = other.maxVersions;
    if (other.isSetCompression()) {
      this.compression = other.compression;
    }
    this.inMemory = other.inMemory;
    if (other.isSetBloomFilterType()) {
      this.bloomFilterType = other.bloomFilterType;
    }
    this.bloomFilterVectorSize = other.bloomFilterVectorSize;
    this.bloomFilterNbHashes = other.bloomFilterNbHashes;
    this.blockCacheEnabled = other.blockCacheEnabled;
    this.timeToLive = other.timeToLive;
  }

  public ColumnDescriptor deepCopy() {
    return new ColumnDescriptor(this);
  }

  @Deprecated
  public ColumnDescriptor clone() {
    return new ColumnDescriptor(this);
  }

  public byte[] getName() {
    return this.name;
  }

  public ColumnDescriptor setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getMaxVersions() {
    return this.maxVersions;
  }

  public ColumnDescriptor setMaxVersions(int maxVersions) {
    this.maxVersions = maxVersions;
    setMaxVersionsIsSet(true);
    return this;
  }

  public void unsetMaxVersions() {
    __isset_bit_vector.clear(__MAXVERSIONS_ISSET_ID);
  }

  /** Returns true if field maxVersions is set (has been asigned a value) and false otherwise */
  public boolean isSetMaxVersions() {
    return __isset_bit_vector.get(__MAXVERSIONS_ISSET_ID);
  }

  public void setMaxVersionsIsSet(boolean value) {
    __isset_bit_vector.set(__MAXVERSIONS_ISSET_ID, value);
  }

  public String getCompression() {
    return this.compression;
  }

  public ColumnDescriptor setCompression(String compression) {
    this.compression = compression;
    return this;
  }

  public void unsetCompression() {
    this.compression = null;
  }

  /** Returns true if field compression is set (has been asigned a value) and false otherwise */
  public boolean isSetCompression() {
    return this.compression != null;
  }

  public void setCompressionIsSet(boolean value) {
    if (!value) {
      this.compression = null;
    }
  }

  public boolean isInMemory() {
    return this.inMemory;
  }

  public ColumnDescriptor setInMemory(boolean inMemory) {
    this.inMemory = inMemory;
    setInMemoryIsSet(true);
    return this;
  }

  public void unsetInMemory() {
    __isset_bit_vector.clear(__INMEMORY_ISSET_ID);
  }

  /** Returns true if field inMemory is set (has been asigned a value) and false otherwise */
  public boolean isSetInMemory() {
    return __isset_bit_vector.get(__INMEMORY_ISSET_ID);
  }

  public void setInMemoryIsSet(boolean value) {
    __isset_bit_vector.set(__INMEMORY_ISSET_ID, value);
  }

  public String getBloomFilterType() {
    return this.bloomFilterType;
  }

  public ColumnDescriptor setBloomFilterType(String bloomFilterType) {
    this.bloomFilterType = bloomFilterType;
    return this;
  }

  public void unsetBloomFilterType() {
    this.bloomFilterType = null;
  }

  /** Returns true if field bloomFilterType is set (has been asigned a value) and false otherwise */
  public boolean isSetBloomFilterType() {
    return this.bloomFilterType != null;
  }

  public void setBloomFilterTypeIsSet(boolean value) {
    if (!value) {
      this.bloomFilterType = null;
    }
  }

  public int getBloomFilterVectorSize() {
    return this.bloomFilterVectorSize;
  }

  public ColumnDescriptor setBloomFilterVectorSize(int bloomFilterVectorSize) {
    this.bloomFilterVectorSize = bloomFilterVectorSize;
    setBloomFilterVectorSizeIsSet(true);
    return this;
  }

  public void unsetBloomFilterVectorSize() {
    __isset_bit_vector.clear(__BLOOMFILTERVECTORSIZE_ISSET_ID);
  }

  /** Returns true if field bloomFilterVectorSize is set (has been asigned a value) and false otherwise */
  public boolean isSetBloomFilterVectorSize() {
    return __isset_bit_vector.get(__BLOOMFILTERVECTORSIZE_ISSET_ID);
  }

  public void setBloomFilterVectorSizeIsSet(boolean value) {
    __isset_bit_vector.set(__BLOOMFILTERVECTORSIZE_ISSET_ID, value);
  }

  public int getBloomFilterNbHashes() {
    return this.bloomFilterNbHashes;
  }

  public ColumnDescriptor setBloomFilterNbHashes(int bloomFilterNbHashes) {
    this.bloomFilterNbHashes = bloomFilterNbHashes;
    setBloomFilterNbHashesIsSet(true);
    return this;
  }

  public void unsetBloomFilterNbHashes() {
    __isset_bit_vector.clear(__BLOOMFILTERNBHASHES_ISSET_ID);
  }

  /** Returns true if field bloomFilterNbHashes is set (has been asigned a value) and false otherwise */
  public boolean isSetBloomFilterNbHashes() {
    return __isset_bit_vector.get(__BLOOMFILTERNBHASHES_ISSET_ID);
  }

  public void setBloomFilterNbHashesIsSet(boolean value) {
    __isset_bit_vector.set(__BLOOMFILTERNBHASHES_ISSET_ID, value);
  }

  public boolean isBlockCacheEnabled() {
    return this.blockCacheEnabled;
  }

  public ColumnDescriptor setBlockCacheEnabled(boolean blockCacheEnabled) {
    this.blockCacheEnabled = blockCacheEnabled;
    setBlockCacheEnabledIsSet(true);
    return this;
  }

  public void unsetBlockCacheEnabled() {
    __isset_bit_vector.clear(__BLOCKCACHEENABLED_ISSET_ID);
  }

  /** Returns true if field blockCacheEnabled is set (has been asigned a value) and false otherwise */
  public boolean isSetBlockCacheEnabled() {
    return __isset_bit_vector.get(__BLOCKCACHEENABLED_ISSET_ID);
  }

  public void setBlockCacheEnabledIsSet(boolean value) {
    __isset_bit_vector.set(__BLOCKCACHEENABLED_ISSET_ID, value);
  }

  public int getTimeToLive() {
    return this.timeToLive;
  }

  public ColumnDescriptor setTimeToLive(int timeToLive) {
    this.timeToLive = timeToLive;
    setTimeToLiveIsSet(true);
    return this;
  }

  public void unsetTimeToLive() {
    __isset_bit_vector.clear(__TIMETOLIVE_ISSET_ID);
  }

  /** Returns true if field timeToLive is set (has been asigned a value) and false otherwise */
  public boolean isSetTimeToLive() {
    return __isset_bit_vector.get(__TIMETOLIVE_ISSET_ID);
  }

  public void setTimeToLiveIsSet(boolean value) {
    __isset_bit_vector.set(__TIMETOLIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((byte[])value);
      }
      break;

    case MAX_VERSIONS:
      if (value == null) {
        unsetMaxVersions();
      } else {
        setMaxVersions((Integer)value);
      }
      break;

    case COMPRESSION:
      if (value == null) {
        unsetCompression();
      } else {
        setCompression((String)value);
      }
      break;

    case IN_MEMORY:
      if (value == null) {
        unsetInMemory();
      } else {
        setInMemory((Boolean)value);
      }
      break;

    case BLOOM_FILTER_TYPE:
      if (value == null) {
        unsetBloomFilterType();
      } else {
        setBloomFilterType((String)value);
      }
      break;

    case BLOOM_FILTER_VECTOR_SIZE:
      if (value == null) {
        unsetBloomFilterVectorSize();
      } else {
        setBloomFilterVectorSize((Integer)value);
      }
      break;

    case BLOOM_FILTER_NB_HASHES:
      if (value == null) {
        unsetBloomFilterNbHashes();
      } else {
        setBloomFilterNbHashes((Integer)value);
      }
      break;

    case BLOCK_CACHE_ENABLED:
      if (value == null) {
        unsetBlockCacheEnabled();
      } else {
        setBlockCacheEnabled((Boolean)value);
      }
      break;

    case TIME_TO_LIVE:
      if (value == null) {
        unsetTimeToLive();
      } else {
        setTimeToLive((Integer)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case MAX_VERSIONS:
      return new Integer(getMaxVersions());

    case COMPRESSION:
      return getCompression();

    case IN_MEMORY:
      return new Boolean(isInMemory());

    case BLOOM_FILTER_TYPE:
      return getBloomFilterType();

    case BLOOM_FILTER_VECTOR_SIZE:
      return new Integer(getBloomFilterVectorSize());

    case BLOOM_FILTER_NB_HASHES:
      return new Integer(getBloomFilterNbHashes());

    case BLOCK_CACHE_ENABLED:
      return new Boolean(isBlockCacheEnabled());

    case TIME_TO_LIVE:
      return new Integer(getTimeToLive());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case NAME:
      return isSetName();
    case MAX_VERSIONS:
      return isSetMaxVersions();
    case COMPRESSION:
      return isSetCompression();
    case IN_MEMORY:
      return isSetInMemory();
    case BLOOM_FILTER_TYPE:
      return isSetBloomFilterType();
    case BLOOM_FILTER_VECTOR_SIZE:
      return isSetBloomFilterVectorSize();
    case BLOOM_FILTER_NB_HASHES:
      return isSetBloomFilterNbHashes();
    case BLOCK_CACHE_ENABLED:
      return isSetBlockCacheEnabled();
    case TIME_TO_LIVE:
      return isSetTimeToLive();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnDescriptor)
      return this.equals((ColumnDescriptor)that);
    return false;
  }

  public boolean equals(ColumnDescriptor that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!java.util.Arrays.equals(this.name, that.name))
        return false;
    }

    boolean this_present_maxVersions = true;
    boolean that_present_maxVersions = true;
    if (this_present_maxVersions || that_present_maxVersions) {
      if (!(this_present_maxVersions && that_present_maxVersions))
        return false;
      if (this.maxVersions != that.maxVersions)
        return false;
    }

    boolean this_present_compression = true && this.isSetCompression();
    boolean that_present_compression = true && that.isSetCompression();
    if (this_present_compression || that_present_compression) {
      if (!(this_present_compression && that_present_compression))
        return false;
      if (!this.compression.equals(that.compression))
        return false;
    }

    boolean this_present_inMemory = true;
    boolean that_present_inMemory = true;
    if (this_present_inMemory || that_present_inMemory) {
      if (!(this_present_inMemory && that_present_inMemory))
        return false;
      if (this.inMemory != that.inMemory)
        return false;
    }

    boolean this_present_bloomFilterType = true && this.isSetBloomFilterType();
    boolean that_present_bloomFilterType = true && that.isSetBloomFilterType();
    if (this_present_bloomFilterType || that_present_bloomFilterType) {
      if (!(this_present_bloomFilterType && that_present_bloomFilterType))
        return false;
      if (!this.bloomFilterType.equals(that.bloomFilterType))
        return false;
    }

    boolean this_present_bloomFilterVectorSize = true;
    boolean that_present_bloomFilterVectorSize = true;
    if (this_present_bloomFilterVectorSize || that_present_bloomFilterVectorSize) {
      if (!(this_present_bloomFilterVectorSize && that_present_bloomFilterVectorSize))
        return false;
      if (this.bloomFilterVectorSize != that.bloomFilterVectorSize)
        return false;
    }

    boolean this_present_bloomFilterNbHashes = true;
    boolean that_present_bloomFilterNbHashes = true;
    if (this_present_bloomFilterNbHashes || that_present_bloomFilterNbHashes) {
      if (!(this_present_bloomFilterNbHashes && that_present_bloomFilterNbHashes))
        return false;
      if (this.bloomFilterNbHashes != that.bloomFilterNbHashes)
        return false;
    }

    boolean this_present_blockCacheEnabled = true;
    boolean that_present_blockCacheEnabled = true;
    if (this_present_blockCacheEnabled || that_present_blockCacheEnabled) {
      if (!(this_present_blockCacheEnabled && that_present_blockCacheEnabled))
        return false;
      if (this.blockCacheEnabled != that.blockCacheEnabled)
        return false;
    }

    boolean this_present_timeToLive = true;
    boolean that_present_timeToLive = true;
    if (this_present_timeToLive || that_present_timeToLive) {
      if (!(this_present_timeToLive && that_present_timeToLive))
        return false;
      if (this.timeToLive != that.timeToLive)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_maxVersions = true;
    builder.append(present_maxVersions);
    if (present_maxVersions)
      builder.append(maxVersions);

    boolean present_compression = true && (isSetCompression());
    builder.append(present_compression);
    if (present_compression)
      builder.append(compression);

    boolean present_inMemory = true;
    builder.append(present_inMemory);
    if (present_inMemory)
      builder.append(inMemory);

    boolean present_bloomFilterType = true && (isSetBloomFilterType());
    builder.append(present_bloomFilterType);
    if (present_bloomFilterType)
      builder.append(bloomFilterType);

    boolean present_bloomFilterVectorSize = true;
    builder.append(present_bloomFilterVectorSize);
    if (present_bloomFilterVectorSize)
      builder.append(bloomFilterVectorSize);

    boolean present_bloomFilterNbHashes = true;
    builder.append(present_bloomFilterNbHashes);
    if (present_bloomFilterNbHashes)
      builder.append(bloomFilterNbHashes);

    boolean present_blockCacheEnabled = true;
    builder.append(present_blockCacheEnabled);
    if (present_blockCacheEnabled)
      builder.append(blockCacheEnabled);

    boolean present_timeToLive = true;
    builder.append(present_timeToLive);
    if (present_timeToLive)
      builder.append(timeToLive);

    return builder.toHashCode();
  }

  public int compareTo(ColumnDescriptor other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ColumnDescriptor typedOther = (ColumnDescriptor)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(name, typedOther.name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMaxVersions()).compareTo(isSetMaxVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(maxVersions, typedOther.maxVersions);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCompression()).compareTo(isSetCompression());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(compression, typedOther.compression);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetInMemory()).compareTo(isSetInMemory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(inMemory, typedOther.inMemory);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBloomFilterType()).compareTo(isSetBloomFilterType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(bloomFilterType, typedOther.bloomFilterType);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBloomFilterVectorSize()).compareTo(isSetBloomFilterVectorSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(bloomFilterVectorSize, typedOther.bloomFilterVectorSize);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBloomFilterNbHashes()).compareTo(isSetBloomFilterNbHashes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(bloomFilterNbHashes, typedOther.bloomFilterNbHashes);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBlockCacheEnabled()).compareTo(isSetBlockCacheEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(blockCacheEnabled, typedOther.blockCacheEnabled);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTimeToLive()).compareTo(isSetTimeToLive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(timeToLive, typedOther.timeToLive);
    if (lastComparison != 0) {
      return lastComparison;
    }
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
      _Fields fieldId = _Fields.findByThriftId(field.id);
      if (fieldId == null) {
        TProtocolUtil.skip(iprot, field.type);
      } else {
        switch (fieldId) {
          case NAME:
            if (field.type == TType.STRING) {
              this.name = iprot.readBinary();
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case MAX_VERSIONS:
            if (field.type == TType.I32) {
              this.maxVersions = iprot.readI32();
              setMaxVersionsIsSet(true);
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case COMPRESSION:
            if (field.type == TType.STRING) {
              this.compression = iprot.readString();
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case IN_MEMORY:
            if (field.type == TType.BOOL) {
              this.inMemory = iprot.readBool();
              setInMemoryIsSet(true);
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case BLOOM_FILTER_TYPE:
            if (field.type == TType.STRING) {
              this.bloomFilterType = iprot.readString();
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case BLOOM_FILTER_VECTOR_SIZE:
            if (field.type == TType.I32) {
              this.bloomFilterVectorSize = iprot.readI32();
              setBloomFilterVectorSizeIsSet(true);
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case BLOOM_FILTER_NB_HASHES:
            if (field.type == TType.I32) {
              this.bloomFilterNbHashes = iprot.readI32();
              setBloomFilterNbHashesIsSet(true);
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case BLOCK_CACHE_ENABLED:
            if (field.type == TType.BOOL) {
              this.blockCacheEnabled = iprot.readBool();
              setBlockCacheEnabledIsSet(true);
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case TIME_TO_LIVE:
            if (field.type == TType.I32) {
              this.timeToLive = iprot.readI32();
              setTimeToLiveIsSet(true);
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
        }
        iprot.readFieldEnd();
      }
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(MAX_VERSIONS_FIELD_DESC);
    oprot.writeI32(this.maxVersions);
    oprot.writeFieldEnd();
    if (this.compression != null) {
      oprot.writeFieldBegin(COMPRESSION_FIELD_DESC);
      oprot.writeString(this.compression);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IN_MEMORY_FIELD_DESC);
    oprot.writeBool(this.inMemory);
    oprot.writeFieldEnd();
    if (this.bloomFilterType != null) {
      oprot.writeFieldBegin(BLOOM_FILTER_TYPE_FIELD_DESC);
      oprot.writeString(this.bloomFilterType);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(BLOOM_FILTER_VECTOR_SIZE_FIELD_DESC);
    oprot.writeI32(this.bloomFilterVectorSize);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(BLOOM_FILTER_NB_HASHES_FIELD_DESC);
    oprot.writeI32(this.bloomFilterNbHashes);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(BLOCK_CACHE_ENABLED_FIELD_DESC);
    oprot.writeBool(this.blockCacheEnabled);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(TIME_TO_LIVE_FIELD_DESC);
    oprot.writeI32(this.timeToLive);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ColumnDescriptor(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxVersions:");
    sb.append(this.maxVersions);
    first = false;
    if (!first) sb.append(", ");
    sb.append("compression:");
    if (this.compression == null) {
      sb.append("null");
    } else {
      sb.append(this.compression);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inMemory:");
    sb.append(this.inMemory);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bloomFilterType:");
    if (this.bloomFilterType == null) {
      sb.append("null");
    } else {
      sb.append(this.bloomFilterType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bloomFilterVectorSize:");
    sb.append(this.bloomFilterVectorSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bloomFilterNbHashes:");
    sb.append(this.bloomFilterNbHashes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("blockCacheEnabled:");
    sb.append(this.blockCacheEnabled);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeToLive:");
    sb.append(this.timeToLive);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

