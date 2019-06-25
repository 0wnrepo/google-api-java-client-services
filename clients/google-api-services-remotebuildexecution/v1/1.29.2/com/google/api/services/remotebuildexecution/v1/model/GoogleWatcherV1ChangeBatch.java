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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * A batch of Change messages.
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
public final class GoogleWatcherV1ChangeBatch extends com.google.api.client.json.GenericJson {

  /**
   * A list of Change messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleWatcherV1Change> changes;

  static {
    // hack to force ProGuard to consider GoogleWatcherV1Change used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleWatcherV1Change.class);
  }

  /**
   * A list of Change messages.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleWatcherV1Change> getChanges() {
    return changes;
  }

  /**
   * A list of Change messages.
   * @param changes changes or {@code null} for none
   */
  public GoogleWatcherV1ChangeBatch setChanges(java.util.List<GoogleWatcherV1Change> changes) {
    this.changes = changes;
    return this;
  }

  @Override
  public GoogleWatcherV1ChangeBatch set(String fieldName, Object value) {
    return (GoogleWatcherV1ChangeBatch) super.set(fieldName, value);
  }

  @Override
  public GoogleWatcherV1ChangeBatch clone() {
    return (GoogleWatcherV1ChangeBatch) super.clone();
  }

}
