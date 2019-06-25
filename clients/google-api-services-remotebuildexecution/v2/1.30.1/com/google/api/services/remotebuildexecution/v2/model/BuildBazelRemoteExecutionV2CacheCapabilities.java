/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * Capabilities of the remote cache system.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2CacheCapabilities extends com.google.api.client.json.GenericJson {

  /**
   * Capabilities for updating the action cache.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities actionCacheUpdateCapabilities;

  /**
   * Supported cache priority range for both CAS and ActionCache.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2PriorityCapabilities cachePriorityCapabilities;

  /**
   * All the digest functions supported by the remote cache. Remote cache may support multiple
   * digest functions simultaneously.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> digestFunction;

  /**
   * Maximum total size of blobs to be uploaded/downloaded using batch methods. A value of 0 means
   * no limit is set, although in practice there will always be a message size limitation of the
   * protocol in use, e.g. GRPC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxBatchTotalSizeBytes;

  /**
   * Whether absolute symlink targets are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String symlinkAbsolutePathStrategy;

  /**
   * Capabilities for updating the action cache.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities getActionCacheUpdateCapabilities() {
    return actionCacheUpdateCapabilities;
  }

  /**
   * Capabilities for updating the action cache.
   * @param actionCacheUpdateCapabilities actionCacheUpdateCapabilities or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2CacheCapabilities setActionCacheUpdateCapabilities(BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities actionCacheUpdateCapabilities) {
    this.actionCacheUpdateCapabilities = actionCacheUpdateCapabilities;
    return this;
  }

  /**
   * Supported cache priority range for both CAS and ActionCache.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2PriorityCapabilities getCachePriorityCapabilities() {
    return cachePriorityCapabilities;
  }

  /**
   * Supported cache priority range for both CAS and ActionCache.
   * @param cachePriorityCapabilities cachePriorityCapabilities or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2CacheCapabilities setCachePriorityCapabilities(BuildBazelRemoteExecutionV2PriorityCapabilities cachePriorityCapabilities) {
    this.cachePriorityCapabilities = cachePriorityCapabilities;
    return this;
  }

  /**
   * All the digest functions supported by the remote cache. Remote cache may support multiple
   * digest functions simultaneously.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDigestFunction() {
    return digestFunction;
  }

  /**
   * All the digest functions supported by the remote cache. Remote cache may support multiple
   * digest functions simultaneously.
   * @param digestFunction digestFunction or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2CacheCapabilities setDigestFunction(java.util.List<java.lang.String> digestFunction) {
    this.digestFunction = digestFunction;
    return this;
  }

  /**
   * Maximum total size of blobs to be uploaded/downloaded using batch methods. A value of 0 means
   * no limit is set, although in practice there will always be a message size limitation of the
   * protocol in use, e.g. GRPC.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxBatchTotalSizeBytes() {
    return maxBatchTotalSizeBytes;
  }

  /**
   * Maximum total size of blobs to be uploaded/downloaded using batch methods. A value of 0 means
   * no limit is set, although in practice there will always be a message size limitation of the
   * protocol in use, e.g. GRPC.
   * @param maxBatchTotalSizeBytes maxBatchTotalSizeBytes or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2CacheCapabilities setMaxBatchTotalSizeBytes(java.lang.Long maxBatchTotalSizeBytes) {
    this.maxBatchTotalSizeBytes = maxBatchTotalSizeBytes;
    return this;
  }

  /**
   * Whether absolute symlink targets are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getSymlinkAbsolutePathStrategy() {
    return symlinkAbsolutePathStrategy;
  }

  /**
   * Whether absolute symlink targets are supported.
   * @param symlinkAbsolutePathStrategy symlinkAbsolutePathStrategy or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2CacheCapabilities setSymlinkAbsolutePathStrategy(java.lang.String symlinkAbsolutePathStrategy) {
    this.symlinkAbsolutePathStrategy = symlinkAbsolutePathStrategy;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2CacheCapabilities set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2CacheCapabilities) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2CacheCapabilities clone() {
    return (BuildBazelRemoteExecutionV2CacheCapabilities) super.clone();
  }

}
