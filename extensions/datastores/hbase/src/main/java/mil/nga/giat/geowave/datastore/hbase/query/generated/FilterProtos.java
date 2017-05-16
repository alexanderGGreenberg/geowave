/*******************************************************************************
 * Copyright (c) 2013-2017 Contributors to the Eclipse Foundation
 * 
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License,
 * Version 2.0 which accompanies this distribution and is available at
 * http://www.apache.org/licenses/LICENSE-2.0.txt
 ******************************************************************************/
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/SingleEntryFilters.proto

package mil.nga.giat.geowave.datastore.hbase.query.generated;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings
public final class FilterProtos
{
	private FilterProtos() {}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry ) {}

	public interface SingleEntryFilterOrBuilder extends
			com.google.protobuf.MessageOrBuilder
	{

		// required bytes adapterId = 1;
		/**
		 * <code>required bytes adapterId = 1;</code>
		 */
		boolean hasAdapterId();

		/**
		 * <code>required bytes adapterId = 1;</code>
		 */
		com.google.protobuf.ByteString getAdapterId();

		// required bytes dataId = 2;
		/**
		 * <code>required bytes dataId = 2;</code>
		 */
		boolean hasDataId();

		/**
		 * <code>required bytes dataId = 2;</code>
		 */
		com.google.protobuf.ByteString getDataId();
	}

	/**
	 * Protobuf type {@code SingleEntryFilter}
	 */
	public static final class SingleEntryFilter extends
			com.google.protobuf.GeneratedMessage implements
			SingleEntryFilterOrBuilder
	{
		// Use SingleEntryFilter.newBuilder() to construct.
		private SingleEntryFilter(
				com.google.protobuf.GeneratedMessage.Builder<?> builder ) {
			super(
					builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private SingleEntryFilter(
				boolean noInit ) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final SingleEntryFilter defaultInstance;

		public static SingleEntryFilter getDefaultInstance() {
			return defaultInstance;
		}

		public SingleEntryFilter getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private SingleEntryFilter(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry )
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
						case 0:
							done = true;
							break;
						default: {
							if (!parseUnknownField(
									input,
									unknownFields,
									extensionRegistry,
									tag)) {
								done = true;
							}
							break;
						}
						case 10: {
							bitField0_ |= 0x00000001;
							adapterId_ = input.readBytes();
							break;
						}
						case 18: {
							bitField0_ |= 0x00000002;
							dataId_ = input.readBytes();
							break;
						}
					}
				}
			}
			catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			}
			catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(
						e.getMessage()).setUnfinishedMessage(this);
			}
			finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.internal_static_SingleEntryFilter_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.internal_static_SingleEntryFilter_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter.class,
							mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter.Builder.class);
		}

		public static com.google.protobuf.Parser<SingleEntryFilter> PARSER = new com.google.protobuf.AbstractParser<SingleEntryFilter>() {
			public SingleEntryFilter parsePartialFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry )
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new SingleEntryFilter(
						input,
						extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<SingleEntryFilter> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// required bytes adapterId = 1;
		public static final int ADAPTERID_FIELD_NUMBER = 1;
		private com.google.protobuf.ByteString adapterId_;

		/**
		 * <code>required bytes adapterId = 1;</code>
		 */
		public boolean hasAdapterId() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required bytes adapterId = 1;</code>
		 */
		public com.google.protobuf.ByteString getAdapterId() {
			return adapterId_;
		}

		// required bytes dataId = 2;
		public static final int DATAID_FIELD_NUMBER = 2;
		private com.google.protobuf.ByteString dataId_;

		/**
		 * <code>required bytes dataId = 2;</code>
		 */
		public boolean hasDataId() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>required bytes dataId = 2;</code>
		 */
		public com.google.protobuf.ByteString getDataId() {
			return dataId_;
		}

		private void initFields() {
			adapterId_ = com.google.protobuf.ByteString.EMPTY;
			dataId_ = com.google.protobuf.ByteString.EMPTY;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1) return isInitialized == 1;

			if (!hasAdapterId()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasDataId()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(
				com.google.protobuf.CodedOutputStream output )
				throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeBytes(
						1,
						adapterId_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeBytes(
						2,
						dataId_);
			}
			getUnknownFields().writeTo(
					output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1) return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(
						1,
						adapterId_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(
						2,
						dataId_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace()
				throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		@java.lang.Override
		public boolean equals(
				final java.lang.Object obj ) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter)) {
				return super.equals(obj);
			}
			mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter other = (mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter) obj;

			boolean result = true;
			result = result && (hasAdapterId() == other.hasAdapterId());
			if (hasAdapterId()) {
				result = result && getAdapterId().equals(
						other.getAdapterId());
			}
			result = result && (hasDataId() == other.hasDataId());
			if (hasDataId()) {
				result = result && getDataId().equals(
						other.getDataId());
			}
			result = result && getUnknownFields().equals(
					other.getUnknownFields());
			return result;
		}

		private int memoizedHashCode = 0;

		@java.lang.Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptorForType().hashCode();
			if (hasAdapterId()) {
				hash = (37 * hash) + ADAPTERID_FIELD_NUMBER;
				hash = (53 * hash) + getAdapterId().hashCode();
			}
			if (hasDataId()) {
				hash = (37 * hash) + DATAID_FIELD_NUMBER;
				hash = (53 * hash) + getDataId().hashCode();
			}
			hash = (29 * hash) + getUnknownFields().hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				com.google.protobuf.ByteString data )
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry )
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(
					data,
					extensionRegistry);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				byte[] data )
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry )
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(
					data,
					extensionRegistry);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				java.io.InputStream input )
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry )
				throws java.io.IOException {
			return PARSER.parseFrom(
					input,
					extensionRegistry);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseDelimitedFrom(
				java.io.InputStream input )
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseDelimitedFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry )
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(
					input,
					extensionRegistry);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				com.google.protobuf.CodedInputStream input )
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parseFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry )
				throws java.io.IOException {
			return PARSER.parseFrom(
					input,
					extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(
				mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter prototype ) {
			return newBuilder().mergeFrom(
					prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(
				com.google.protobuf.GeneratedMessage.BuilderParent parent ) {
			Builder builder = new Builder(
					parent);
			return builder;
		}

		/**
		 * Protobuf type {@code SingleEntryFilter}
		 */
		public static final class Builder extends
				com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilterOrBuilder
		{
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.internal_static_SingleEntryFilter_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.internal_static_SingleEntryFilter_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter.class,
								mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter.Builder.class);
			}

			// Construct using
			// mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(
					com.google.protobuf.GeneratedMessage.BuilderParent parent ) {
				super(
						parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				// if
				// (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders)
				// {}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				adapterId_ = com.google.protobuf.ByteString.EMPTY;
				bitField0_ = (bitField0_ & ~0x00000001);
				dataId_ = com.google.protobuf.ByteString.EMPTY;
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(
						buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.internal_static_SingleEntryFilter_descriptor;
			}

			public mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter getDefaultInstanceForType() {
				return mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter
						.getDefaultInstance();
			}

			public mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter build() {
				mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter buildPartial() {
				mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter result = new mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter(
						this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.adapterId_ = adapterId_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.dataId_ = dataId_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(
					com.google.protobuf.Message other ) {
				if (other instanceof mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter) {
					return mergeFrom((mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter) other);
				}
				else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(
					mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter other ) {
				if (other == mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter
						.getDefaultInstance()) return this;
				if (other.hasAdapterId()) {
					setAdapterId(other.getAdapterId());
				}
				if (other.hasDataId()) {
					setDataId(other.getDataId());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasAdapterId()) {

					return false;
				}
				if (!hasDataId()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry )
					throws java.io.IOException {
				mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(
							input,
							extensionRegistry);
				}
				catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (mil.nga.giat.geowave.datastore.hbase.query.generated.FilterProtos.SingleEntryFilter) e
							.getUnfinishedMessage();
					throw e;
				}
				finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// required bytes adapterId = 1;
			private com.google.protobuf.ByteString adapterId_ = com.google.protobuf.ByteString.EMPTY;

			/**
			 * <code>required bytes adapterId = 1;</code>
			 */
			public boolean hasAdapterId() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required bytes adapterId = 1;</code>
			 */
			public com.google.protobuf.ByteString getAdapterId() {
				return adapterId_;
			}

			/**
			 * <code>required bytes adapterId = 1;</code>
			 */
			public Builder setAdapterId(
					com.google.protobuf.ByteString value ) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				adapterId_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required bytes adapterId = 1;</code>
			 */
			public Builder clearAdapterId() {
				bitField0_ = (bitField0_ & ~0x00000001);
				adapterId_ = getDefaultInstance().getAdapterId();
				onChanged();
				return this;
			}

			// required bytes dataId = 2;
			private com.google.protobuf.ByteString dataId_ = com.google.protobuf.ByteString.EMPTY;

			/**
			 * <code>required bytes dataId = 2;</code>
			 */
			public boolean hasDataId() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>required bytes dataId = 2;</code>
			 */
			public com.google.protobuf.ByteString getDataId() {
				return dataId_;
			}

			/**
			 * <code>required bytes dataId = 2;</code>
			 */
			public Builder setDataId(
					com.google.protobuf.ByteString value ) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				dataId_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required bytes dataId = 2;</code>
			 */
			public Builder clearDataId() {
				bitField0_ = (bitField0_ & ~0x00000002);
				dataId_ = getDefaultInstance().getDataId();
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:SingleEntryFilter)
		}

		static {
			defaultInstance = new SingleEntryFilter(
					true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:SingleEntryFilter)
	}

	private static com.google.protobuf.Descriptors.Descriptor internal_static_SingleEntryFilter_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_SingleEntryFilter_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = {
			"\n!protobuf/SingleEntryFilters.proto\"6\n\021S"
					+ "ingleEntryFilter\022\021\n\tadapterId\030\001 \002(\014\022\016\n\006d"
					+ "ataId\030\002 \002(\014BL\n4mil.nga.giat.geowave.data"
					+ "store.hbase.query.generatedB\014FilterProto" + "sH\001\210\001\001\240\001\001"
		};
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root ) {
				descriptor = root;
				internal_static_SingleEntryFilter_descriptor = getDescriptor().getMessageTypes().get(
						0);
				internal_static_SingleEntryFilter_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_SingleEntryFilter_descriptor,
						new java.lang.String[] {
							"AdapterId",
							"DataId",
						});
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
				descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {},
				assigner);
	}

	// @@protoc_insertion_point(outer_class_scope)
}
