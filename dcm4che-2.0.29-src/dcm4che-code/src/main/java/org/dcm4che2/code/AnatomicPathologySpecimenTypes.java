/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa HealthCare.
 * Portions created by the Initial Developer are Copyright (C) 2010
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4che2.code;

/**
 * CID 8103 Anatomic Pathology Specimen Types.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class AnatomicPathologySpecimenTypes {

  /** (G-8003, SRT, "Aspirate") */
  public static final String Aspirate = "G-8003\\SRT";

  /** (G-80A6, SRT, "Body fluid sample") */
  public static final String BodyFluidSample = "G-80A6\\SRT";

  /** (G-80A5, SRT, "Body substance sample") */
  public static final String BodySubstanceSample = "G-80A5\\SRT";

  /** (G-8346, SRT, "breast duct sample") */
  public static final String BreastDuctSample = "G-8346\\SRT";

  /** (G-832D, SRT, "breast tru-cut biopsy sample") */
  public static final String BreastTruCutBiopsySample = "G-832D\\SRT";

  /** (G-843B, SRT, "Core sample of tissue block") */
  public static final String CoreSampleOfTissueBlock = "G-843B\\SRT";

  /** (T-D0010, SRT, "Entire body") */
  public static final String EntireBody = "T-D0010\\SRT";

  /** (G-8339, SRT, "frozen section breast sample") */
  public static final String FrozenSectionBreastSample = "G-8339\\SRT";

  /** (G-81A0, SRT, "Genetic sample") */
  public static final String GeneticSample = "G-81A0\\SRT";

  /** (G-843A, SRT, "Gross specimen") */
  public static final String GrossSpecimen = "G-843A\\SRT";

  /** (T-1A403, SRT, "Liquid based cytologic material") */
  public static final String LiquidBasedCytologicMaterial = "T-1A403\\SRT";

  /** (G-833D, SRT, "lumpectomy breast sample") */
  public static final String LumpectomyBreastSample = "G-833D\\SRT";

  /** (G-833F, SRT, "segmentectomy breast sample") */
  public static final String SegmentectomyBreastSample = "G-833F\\SRT";

  /** (G-81EA, SRT, "Slide") */
  public static final String Slide = "G-81EA\\SRT";

  /** (G-803C, SRT, "Smear sample") */
  public static final String SmearSample = "G-803C\\SRT";

  /** (G-831B, SRT, "specimen from breast by incisional biopsy of breast mass") */
  public static final String SpecimenFromBreastByIncisionalBiopsyOfBreastMass = "G-831B\\SRT";

  /** (G-8318, SRT, "specimen from breast obtained by core needle biopsy") */
  public static final String SpecimenFromBreastObtainedByCoreNeedleBiopsy = "G-8318\\SRT";

  /** (G-8430, SRT, "specimen from breast obtained by excision") */
  public static final String SpecimenFromBreastObtainedByExcision = "G-8430\\SRT";

  /** (R-003AC, SRT, "specimen from breast obtained by image guided core biopsy") */
  public static final String SpecimenFromBreastObtainedByImageGuidedCoreBiopsy = "R-003AC\\SRT";

  /** (G-8311, SRT, "specimen from breast obtained by total mastectomy") */
  public static final String SpecimenFromBreastObtainedByTotalMastectomy = "G-8311\\SRT";

  /** (G-8319, SRT, "specimen from breast, stereotactically guided core needle biopsy") */
  public static final String SpecimenFromBreastStereotacticallyGuidedCoreNeedleBiopsy = "G-8319\\SRT";

  /** (G-8439, SRT, "Tissue section") */
  public static final String TissueSection = "G-8439\\SRT";

  /** (G-8300, SRT, "Tissue specimen") */
  public static final String TissueSpecimen = "G-8300\\SRT";

  /** (G-843C, SRT, "Tissue spot") */
  public static final String TissueSpot = "G-843C\\SRT";

  /** (T-1A404, SRT, "Touch preparation cytologic material") */
  public static final String TouchPreparationCytologicMaterial = "T-1A404\\SRT";
}
