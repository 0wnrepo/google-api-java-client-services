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

package com.google.api.services.run.v1alpha1.model;

/**
 * TriggerStatus represents the current state of a Trigger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriggerStatus extends com.google.api.client.json.GenericJson {

  /**
   * Array of observed TriggerConditions, indicating the current state of the Trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TriggerCondition> conditions;

  static {
    // hack to force ProGuard to consider TriggerCondition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TriggerCondition.class);
  }

  /**
   * ObservedGeneration is the 'Generation' of the Trigger that was last processed by the
   * controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * SubscriberURI is the resolved URI of the receiver for this Trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscriberUri;

  /**
   * Array of observed TriggerConditions, indicating the current state of the Trigger.
   * @return value or {@code null} for none
   */
  public java.util.List<TriggerCondition> getConditions() {
    return conditions;
  }

  /**
   * Array of observed TriggerConditions, indicating the current state of the Trigger.
   * @param conditions conditions or {@code null} for none
   */
  public TriggerStatus setConditions(java.util.List<TriggerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Trigger that was last processed by the
   * controller.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Trigger that was last processed by the
   * controller.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public TriggerStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * SubscriberURI is the resolved URI of the receiver for this Trigger.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscriberUri() {
    return subscriberUri;
  }

  /**
   * SubscriberURI is the resolved URI of the receiver for this Trigger.
   * @param subscriberUri subscriberUri or {@code null} for none
   */
  public TriggerStatus setSubscriberUri(java.lang.String subscriberUri) {
    this.subscriberUri = subscriberUri;
    return this;
  }

  @Override
  public TriggerStatus set(String fieldName, Object value) {
    return (TriggerStatus) super.set(fieldName, value);
  }

  @Override
  public TriggerStatus clone() {
    return (TriggerStatus) super.clone();
  }

}
