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
 * Transcode Settings
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
public final class SiteTranscodeSetting extends com.google.api.client.json.GenericJson {

  /**
   * Whitelist of video formats to be served to this site template. Set this list to null or empty
   * to serve all video formats.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> enabledVideoFormats;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#siteTranscodeSetting".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Whitelist of video formats to be served to this site template. Set this list to null or empty
   * to serve all video formats.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getEnabledVideoFormats() {
    return enabledVideoFormats;
  }

  /**
   * Whitelist of video formats to be served to this site template. Set this list to null or empty
   * to serve all video formats.
   * @param enabledVideoFormats enabledVideoFormats or {@code null} for none
   */
  public SiteTranscodeSetting setEnabledVideoFormats(java.util.List<java.lang.Integer> enabledVideoFormats) {
    this.enabledVideoFormats = enabledVideoFormats;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#siteTranscodeSetting".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#siteTranscodeSetting".
   * @param kind kind or {@code null} for none
   */
  public SiteTranscodeSetting setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public SiteTranscodeSetting set(String fieldName, Object value) {
    return (SiteTranscodeSetting) super.set(fieldName, value);
  }

  @Override
  public SiteTranscodeSetting clone() {
    return (SiteTranscodeSetting) super.clone();
  }

}
