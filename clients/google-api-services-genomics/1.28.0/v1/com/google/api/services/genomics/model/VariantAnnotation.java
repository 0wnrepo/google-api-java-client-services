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

package com.google.api.services.genomics.model;

/**
 * Model definition for VariantAnnotation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VariantAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * The alternate allele for this variant. If multiple alternate alleles exist at this location,
   * create a separate variant for each one, as they may represent distinct conditions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateBases;

  /**
   * Describes the clinical significance of a variant. It is adapted from the ClinVar controlled
   * vocabulary for clinical significance described at:
   * http://www.ncbi.nlm.nih.gov/clinvar/docs/clinsig/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clinicalSignificance;

  /**
   * The set of conditions associated with this variant. A condition describes the way a variant
   * influences human health.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ClinicalCondition> conditions;

  static {
    // hack to force ProGuard to consider ClinicalCondition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ClinicalCondition.class);
  }

  /**
   * Effect of the variant on the coding sequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String effect;

  /**
   * Google annotation ID of the gene affected by this variant. This should be provided when the
   * variant is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String geneId;

  /**
   * Google annotation IDs of the transcripts affected by this variant. These should be provided
   * when the variant is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> transcriptIds;

  /**
   * Type has been adapted from ClinVar's list of variant types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The alternate allele for this variant. If multiple alternate alleles exist at this location,
   * create a separate variant for each one, as they may represent distinct conditions.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateBases() {
    return alternateBases;
  }

  /**
   * The alternate allele for this variant. If multiple alternate alleles exist at this location,
   * create a separate variant for each one, as they may represent distinct conditions.
   * @param alternateBases alternateBases or {@code null} for none
   */
  public VariantAnnotation setAlternateBases(java.lang.String alternateBases) {
    this.alternateBases = alternateBases;
    return this;
  }

  /**
   * Describes the clinical significance of a variant. It is adapted from the ClinVar controlled
   * vocabulary for clinical significance described at:
   * http://www.ncbi.nlm.nih.gov/clinvar/docs/clinsig/
   * @return value or {@code null} for none
   */
  public java.lang.String getClinicalSignificance() {
    return clinicalSignificance;
  }

  /**
   * Describes the clinical significance of a variant. It is adapted from the ClinVar controlled
   * vocabulary for clinical significance described at:
   * http://www.ncbi.nlm.nih.gov/clinvar/docs/clinsig/
   * @param clinicalSignificance clinicalSignificance or {@code null} for none
   */
  public VariantAnnotation setClinicalSignificance(java.lang.String clinicalSignificance) {
    this.clinicalSignificance = clinicalSignificance;
    return this;
  }

  /**
   * The set of conditions associated with this variant. A condition describes the way a variant
   * influences human health.
   * @return value or {@code null} for none
   */
  public java.util.List<ClinicalCondition> getConditions() {
    return conditions;
  }

  /**
   * The set of conditions associated with this variant. A condition describes the way a variant
   * influences human health.
   * @param conditions conditions or {@code null} for none
   */
  public VariantAnnotation setConditions(java.util.List<ClinicalCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Effect of the variant on the coding sequence.
   * @return value or {@code null} for none
   */
  public java.lang.String getEffect() {
    return effect;
  }

  /**
   * Effect of the variant on the coding sequence.
   * @param effect effect or {@code null} for none
   */
  public VariantAnnotation setEffect(java.lang.String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Google annotation ID of the gene affected by this variant. This should be provided when the
   * variant is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getGeneId() {
    return geneId;
  }

  /**
   * Google annotation ID of the gene affected by this variant. This should be provided when the
   * variant is created.
   * @param geneId geneId or {@code null} for none
   */
  public VariantAnnotation setGeneId(java.lang.String geneId) {
    this.geneId = geneId;
    return this;
  }

  /**
   * Google annotation IDs of the transcripts affected by this variant. These should be provided
   * when the variant is created.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTranscriptIds() {
    return transcriptIds;
  }

  /**
   * Google annotation IDs of the transcripts affected by this variant. These should be provided
   * when the variant is created.
   * @param transcriptIds transcriptIds or {@code null} for none
   */
  public VariantAnnotation setTranscriptIds(java.util.List<java.lang.String> transcriptIds) {
    this.transcriptIds = transcriptIds;
    return this;
  }

  /**
   * Type has been adapted from ClinVar's list of variant types.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type has been adapted from ClinVar's list of variant types.
   * @param type type or {@code null} for none
   */
  public VariantAnnotation setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public VariantAnnotation set(String fieldName, Object value) {
    return (VariantAnnotation) super.set(fieldName, value);
  }

  @Override
  public VariantAnnotation clone() {
    return (VariantAnnotation) super.clone();
  }

}