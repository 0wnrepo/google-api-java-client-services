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

package com.google.api.services.dfareporting.model;

/**
 * Click-through URL
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeClickThroughUrl extends com.google.api.client.json.GenericJson {

  /**
   * Read-only convenience field representing the actual URL that will be used for this click-
   * through. The URL is computed as follows: - If landingPageId is specified then that landing
   * page's URL is assigned to this field. - Otherwise, the customClickThroughUrl is assigned to
   * this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String computedClickThroughUrl;

  /**
   * Custom click-through URL. Applicable if the landingPageId field is left unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customClickThroughUrl;

  /**
   * ID of the landing page for the click-through URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long landingPageId;

  /**
   * Read-only convenience field representing the actual URL that will be used for this click-
   * through. The URL is computed as follows: - If landingPageId is specified then that landing
   * page's URL is assigned to this field. - Otherwise, the customClickThroughUrl is assigned to
   * this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getComputedClickThroughUrl() {
    return computedClickThroughUrl;
  }

  /**
   * Read-only convenience field representing the actual URL that will be used for this click-
   * through. The URL is computed as follows: - If landingPageId is specified then that landing
   * page's URL is assigned to this field. - Otherwise, the customClickThroughUrl is assigned to
   * this field.
   * @param computedClickThroughUrl computedClickThroughUrl or {@code null} for none
   */
  public CreativeClickThroughUrl setComputedClickThroughUrl(java.lang.String computedClickThroughUrl) {
    this.computedClickThroughUrl = computedClickThroughUrl;
    return this;
  }

  /**
   * Custom click-through URL. Applicable if the landingPageId field is left unset.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomClickThroughUrl() {
    return customClickThroughUrl;
  }

  /**
   * Custom click-through URL. Applicable if the landingPageId field is left unset.
   * @param customClickThroughUrl customClickThroughUrl or {@code null} for none
   */
  public CreativeClickThroughUrl setCustomClickThroughUrl(java.lang.String customClickThroughUrl) {
    this.customClickThroughUrl = customClickThroughUrl;
    return this;
  }

  /**
   * ID of the landing page for the click-through URL.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLandingPageId() {
    return landingPageId;
  }

  /**
   * ID of the landing page for the click-through URL.
   * @param landingPageId landingPageId or {@code null} for none
   */
  public CreativeClickThroughUrl setLandingPageId(java.lang.Long landingPageId) {
    this.landingPageId = landingPageId;
    return this;
  }

  @Override
  public CreativeClickThroughUrl set(String fieldName, Object value) {
    return (CreativeClickThroughUrl) super.set(fieldName, value);
  }

  @Override
  public CreativeClickThroughUrl clone() {
    return (CreativeClickThroughUrl) super.clone();
  }

}
