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

package com.google.api.services.dlp.v2.model;

/**
 * Request message for CreateJobTrigger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2CreateJobTriggerRequest extends com.google.api.client.json.GenericJson {

  /**
   * The JobTrigger to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2JobTrigger jobTrigger;

  /**
   * The geographic location to store the job trigger. Reserved for future extensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it
   * must match the regular expression: `[a-zA-Z\\d-_]+`. The maximum length is 100 characters. Can
   * be empty to allow the system to generate one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerId;

  /**
   * The JobTrigger to create.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger getJobTrigger() {
    return jobTrigger;
  }

  /**
   * The JobTrigger to create.
   * @param jobTrigger jobTrigger or {@code null} for none
   */
  public GooglePrivacyDlpV2CreateJobTriggerRequest setJobTrigger(GooglePrivacyDlpV2JobTrigger jobTrigger) {
    this.jobTrigger = jobTrigger;
    return this;
  }

  /**
   * The geographic location to store the job trigger. Reserved for future extensions.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * The geographic location to store the job trigger. Reserved for future extensions.
   * @param locationId locationId or {@code null} for none
   */
  public GooglePrivacyDlpV2CreateJobTriggerRequest setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it
   * must match the regular expression: `[a-zA-Z\\d-_]+`. The maximum length is 100 characters. Can
   * be empty to allow the system to generate one.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerId() {
    return triggerId;
  }

  /**
   * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it
   * must match the regular expression: `[a-zA-Z\\d-_]+`. The maximum length is 100 characters. Can
   * be empty to allow the system to generate one.
   * @param triggerId triggerId or {@code null} for none
   */
  public GooglePrivacyDlpV2CreateJobTriggerRequest setTriggerId(java.lang.String triggerId) {
    this.triggerId = triggerId;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2CreateJobTriggerRequest set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2CreateJobTriggerRequest) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2CreateJobTriggerRequest clone() {
    return (GooglePrivacyDlpV2CreateJobTriggerRequest) super.clone();
  }

}
