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
 * Placement Tag Data
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
public final class TagData extends com.google.api.client.json.GenericJson {

  /**
   * Ad associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long adId;

  /**
   * Tag string to record a click.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clickTag;

  /**
   * Creative associated with this placement tag. Applicable only when format is
   * PLACEMENT_TAG_TRACKING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creativeId;

  /**
   * TagData tag format of this tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Tag string for serving an ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String impressionTag;

  /**
   * Ad associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdId() {
    return adId;
  }

  /**
   * Ad associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING.
   * @param adId adId or {@code null} for none
   */
  public TagData setAdId(java.lang.Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * Tag string to record a click.
   * @return value or {@code null} for none
   */
  public java.lang.String getClickTag() {
    return clickTag;
  }

  /**
   * Tag string to record a click.
   * @param clickTag clickTag or {@code null} for none
   */
  public TagData setClickTag(java.lang.String clickTag) {
    this.clickTag = clickTag;
    return this;
  }

  /**
   * Creative associated with this placement tag. Applicable only when format is
   * PLACEMENT_TAG_TRACKING.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreativeId() {
    return creativeId;
  }

  /**
   * Creative associated with this placement tag. Applicable only when format is
   * PLACEMENT_TAG_TRACKING.
   * @param creativeId creativeId or {@code null} for none
   */
  public TagData setCreativeId(java.lang.Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  /**
   * TagData tag format of this tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * TagData tag format of this tag.
   * @param format format or {@code null} for none
   */
  public TagData setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Tag string for serving an ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getImpressionTag() {
    return impressionTag;
  }

  /**
   * Tag string for serving an ad.
   * @param impressionTag impressionTag or {@code null} for none
   */
  public TagData setImpressionTag(java.lang.String impressionTag) {
    this.impressionTag = impressionTag;
    return this;
  }

  @Override
  public TagData set(String fieldName, Object value) {
    return (TagData) super.set(fieldName, value);
  }

  @Override
  public TagData clone() {
    return (TagData) super.clone();
  }

}