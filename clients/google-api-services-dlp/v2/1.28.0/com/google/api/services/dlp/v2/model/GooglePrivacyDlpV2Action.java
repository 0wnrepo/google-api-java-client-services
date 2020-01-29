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
 * A task to execute on the completion of a job. See https://cloud.google.com/dlp/docs/concepts-
 * actions to learn more.
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
public final class GooglePrivacyDlpV2Action extends com.google.api.client.json.GenericJson {

  /**
   * Enable email notification to project owners and editors on job's completion/failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2JobNotificationEmails jobNotificationEmails;

  /**
   * Publish a notification to a pubsub topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2PublishToPubSub pubSub;

  /**
   * Publish findings to Cloud Datahub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog publishFindingsToCloudDataCatalog;

  /**
   * Publish summary to Cloud Security Command Center (Alpha).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2PublishSummaryToCscc publishSummaryToCscc;

  /**
   * Enable Stackdriver metric dlp.googleapis.com/finding_count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2PublishToStackdriver publishToStackdriver;

  /**
   * Save resulting findings in a provided location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2SaveFindings saveFindings;

  /**
   * Enable email notification to project owners and editors on job's completion/failure.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2JobNotificationEmails getJobNotificationEmails() {
    return jobNotificationEmails;
  }

  /**
   * Enable email notification to project owners and editors on job's completion/failure.
   * @param jobNotificationEmails jobNotificationEmails or {@code null} for none
   */
  public GooglePrivacyDlpV2Action setJobNotificationEmails(GooglePrivacyDlpV2JobNotificationEmails jobNotificationEmails) {
    this.jobNotificationEmails = jobNotificationEmails;
    return this;
  }

  /**
   * Publish a notification to a pubsub topic.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2PublishToPubSub getPubSub() {
    return pubSub;
  }

  /**
   * Publish a notification to a pubsub topic.
   * @param pubSub pubSub or {@code null} for none
   */
  public GooglePrivacyDlpV2Action setPubSub(GooglePrivacyDlpV2PublishToPubSub pubSub) {
    this.pubSub = pubSub;
    return this;
  }

  /**
   * Publish findings to Cloud Datahub.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog getPublishFindingsToCloudDataCatalog() {
    return publishFindingsToCloudDataCatalog;
  }

  /**
   * Publish findings to Cloud Datahub.
   * @param publishFindingsToCloudDataCatalog publishFindingsToCloudDataCatalog or {@code null} for none
   */
  public GooglePrivacyDlpV2Action setPublishFindingsToCloudDataCatalog(GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog publishFindingsToCloudDataCatalog) {
    this.publishFindingsToCloudDataCatalog = publishFindingsToCloudDataCatalog;
    return this;
  }

  /**
   * Publish summary to Cloud Security Command Center (Alpha).
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2PublishSummaryToCscc getPublishSummaryToCscc() {
    return publishSummaryToCscc;
  }

  /**
   * Publish summary to Cloud Security Command Center (Alpha).
   * @param publishSummaryToCscc publishSummaryToCscc or {@code null} for none
   */
  public GooglePrivacyDlpV2Action setPublishSummaryToCscc(GooglePrivacyDlpV2PublishSummaryToCscc publishSummaryToCscc) {
    this.publishSummaryToCscc = publishSummaryToCscc;
    return this;
  }

  /**
   * Enable Stackdriver metric dlp.googleapis.com/finding_count.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2PublishToStackdriver getPublishToStackdriver() {
    return publishToStackdriver;
  }

  /**
   * Enable Stackdriver metric dlp.googleapis.com/finding_count.
   * @param publishToStackdriver publishToStackdriver or {@code null} for none
   */
  public GooglePrivacyDlpV2Action setPublishToStackdriver(GooglePrivacyDlpV2PublishToStackdriver publishToStackdriver) {
    this.publishToStackdriver = publishToStackdriver;
    return this;
  }

  /**
   * Save resulting findings in a provided location.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2SaveFindings getSaveFindings() {
    return saveFindings;
  }

  /**
   * Save resulting findings in a provided location.
   * @param saveFindings saveFindings or {@code null} for none
   */
  public GooglePrivacyDlpV2Action setSaveFindings(GooglePrivacyDlpV2SaveFindings saveFindings) {
    this.saveFindings = saveFindings;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Action set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Action) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Action clone() {
    return (GooglePrivacyDlpV2Action) super.clone();
  }

}
