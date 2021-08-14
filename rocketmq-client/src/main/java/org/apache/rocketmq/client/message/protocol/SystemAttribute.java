/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.client.message.protocol;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.apache.rocketmq.client.route.Endpoints;

public class SystemAttribute {
    private String tag;
    private final List<String> keys;
    private String messageId;
    private Digest digest;
    private Encoding bodyEncoding;
    private MessageType messageType;
    private long bornTimeMillis;
    private String bornHost;
    private long deliveryTimeMillis;
    private int delayLevel;
    private String receiptHandle;
    private int partitionId;
    private long partitionOffset;
    private long invisiblePeriod;
    private int deliveryAttempt;
    private String producerGroup;
    private String messageGroup;
    private String traceContext;
    private long orphanedTransactionRecoveryPeriodMillis;
    // Would set after receiving the message.
    private long decodedTimestamp;
    private Endpoints ackEndpoints;

    public SystemAttribute() {
        this.keys = new ArrayList<String>();
        this.messageType = MessageType.NORMAL;
        this.deliveryTimeMillis = 0;
        this.delayLevel = 0;
    }

    public void setKeys(List<String> keys) {
        this.keys.clear();
        this.keys.addAll(keys);
    }

    public void setKey(String key) {
        this.keys.clear();
        this.keys.add(key);
    }

    public String getTag() {
        return this.tag;
    }

    public List<String> getKeys() {
        return this.keys;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public Digest getDigest() {
        return this.digest;
    }

    public Encoding getBodyEncoding() {
        return this.bodyEncoding;
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    public long getBornTimeMillis() {
        return this.bornTimeMillis;
    }

    public String getBornHost() {
        return this.bornHost;
    }

    public long getDeliveryTimeMillis() {
        return this.deliveryTimeMillis;
    }

    public int getDelayLevel() {
        return this.delayLevel;
    }

    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    public int getPartitionId() {
        return this.partitionId;
    }

    public long getPartitionOffset() {
        return this.partitionOffset;
    }

    public long getInvisiblePeriod() {
        return this.invisiblePeriod;
    }

    public int getDeliveryAttempt() {
        return this.deliveryAttempt;
    }

    public String getProducerGroup() {
        return this.producerGroup;
    }

    public String getMessageGroup() {
        return this.messageGroup;
    }

    public String getTraceContext() {
        return this.traceContext;
    }

    public long getOrphanedTransactionRecoveryPeriodMillis() {
        return this.orphanedTransactionRecoveryPeriodMillis;
    }

    public long getDecodedTimestamp() {
        return this.decodedTimestamp;
    }

    public Endpoints getAckEndpoints() {
        return this.ackEndpoints;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setDigest(Digest digest) {
        this.digest = digest;
    }

    public void setBodyEncoding(Encoding bodyEncoding) {
        this.bodyEncoding = bodyEncoding;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setBornTimeMillis(long bornTimeMillis) {
        this.bornTimeMillis = bornTimeMillis;
    }

    public void setBornHost(String bornHost) {
        this.bornHost = bornHost;
    }

    public void setDeliveryTimeMillis(long deliveryTimeMillis) {
        this.deliveryTimeMillis = deliveryTimeMillis;
    }

    public void setDelayLevel(int delayLevel) {
        this.delayLevel = delayLevel;
    }

    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    public void setPartitionId(int partitionId) {
        this.partitionId = partitionId;
    }

    public void setPartitionOffset(long partitionOffset) {
        this.partitionOffset = partitionOffset;
    }

    public void setInvisiblePeriod(long invisiblePeriod) {
        this.invisiblePeriod = invisiblePeriod;
    }

    public void setDeliveryAttempt(int deliveryAttempt) {
        this.deliveryAttempt = deliveryAttempt;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public void setMessageGroup(String messageGroup) {
        this.messageGroup = messageGroup;
    }

    public void setTraceContext(String traceContext) {
        this.traceContext = traceContext;
    }

    public void setOrphanedTransactionRecoveryPeriodMillis(long orphanedTransactionRecoveryPeriodMillis) {
        this.orphanedTransactionRecoveryPeriodMillis = orphanedTransactionRecoveryPeriodMillis;
    }

    public void setDecodedTimestamp(long decodedTimestamp) {
        this.decodedTimestamp = decodedTimestamp;
    }

    public void setAckEndpoints(Endpoints ackEndpoints) {
        this.ackEndpoints = ackEndpoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemAttribute that = (SystemAttribute) o;
        return bornTimeMillis == that.bornTimeMillis && deliveryTimeMillis == that.deliveryTimeMillis &&
               delayLevel == that.delayLevel && partitionId == that.partitionId &&
               partitionOffset == that.partitionOffset && invisiblePeriod == that.invisiblePeriod &&
               deliveryAttempt == that.deliveryAttempt &&
               orphanedTransactionRecoveryPeriodMillis == that.orphanedTransactionRecoveryPeriodMillis &&
               decodedTimestamp == that.decodedTimestamp &&
               Objects.equal(tag, that.tag) && Objects.equal(keys, that.keys) &&
               Objects.equal(messageId, that.messageId) && Objects.equal(digest, that.digest) &&
               bodyEncoding == that.bodyEncoding && messageType == that.messageType &&
               Objects.equal(bornHost, that.bornHost) && Objects.equal(receiptHandle, that.receiptHandle) &&
               Objects.equal(producerGroup, that.producerGroup) && Objects.equal(messageGroup, that.messageGroup) &&
               Objects.equal(traceContext, that.traceContext) && Objects.equal(ackEndpoints, that.ackEndpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tag, keys, messageId, digest, bodyEncoding, messageType, bornTimeMillis, bornHost,
                                deliveryTimeMillis, delayLevel, receiptHandle, partitionId, partitionOffset,
                                invisiblePeriod, deliveryAttempt, producerGroup, messageGroup, traceContext,
                                orphanedTransactionRecoveryPeriodMillis, decodedTimestamp, ackEndpoints);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("tag", tag)
                          .add("keys", keys)
                          .add("messageId", messageId)
                          .add("digest", digest)
                          .add("bodyEncoding", bodyEncoding)
                          .add("messageType", messageType)
                          .add("bornTimeMillis", bornTimeMillis)
                          .add("bornHost", bornHost)
                          .add("deliveryTimeMillis", deliveryTimeMillis)
                          .add("delayLevel", delayLevel)
                          .add("receiptHandle", receiptHandle)
                          .add("partitionId", partitionId)
                          .add("partitionOffset", partitionOffset)
                          .add("invisiblePeriod", invisiblePeriod)
                          .add("deliveryAttempt", deliveryAttempt)
                          .add("producerGroup", producerGroup)
                          .add("messageGroup", messageGroup)
                          .add("traceContext", traceContext)
                          .add("orphanedTransactionRecoveryPeriodMillis", orphanedTransactionRecoveryPeriodMillis)
                          .add("decodedTimestamp", decodedTimestamp)
                          .add("ackEndpoints", ackEndpoints)
                          .toString();
    }
}
