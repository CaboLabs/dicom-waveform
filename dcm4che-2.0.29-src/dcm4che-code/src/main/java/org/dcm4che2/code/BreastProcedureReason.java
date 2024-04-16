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
 * CID 6051 Breast Procedure Reason.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastProcedureReason {

  /** (111419, DCM, "Additional evaluation requested from abnormal screening exam") */
  public static final String AdditionalEvaluationRequestedFromAbnormalScreeningExam = "111419\\DCM";

  /** (111415, DCM, "Additional evaluation requested from prior study") */
  public static final String AdditionalEvaluationRequestedFromPriorStudy = "111415\\DCM";

  /** (P1-48840, SRT, "Augmentation mammoplasty") */
  public static final String AugmentationMammoplasty = "P1-48840\\SRT";

  /** (P5-C0610, SRT, "Brachytherapy") */
  public static final String Brachytherapy = "P5-C0610\\SRT";

  /** (111402, DCM, "Clinical finding") */
  public static final String ClinicalFinding = "111402\\DCM";

  /** (111416, DCM, "Follow-up at short interval from prior study") */
  public static final String FollowUpAtShortIntervalFromPriorStudy = "111416\\DCM";

  /** (111420, DCM, "History of benign breast biopsy") */
  public static final String HistoryOfBenignBreastBiopsy = "111420\\DCM";

  /** (111417, DCM, "History of breast augmentation, asymptomatic") */
  public static final String HistoryOfBreastAugmentationAsymptomatic = "111417\\DCM";

  /** (111125, DCM, "Known biopsy proven malignancy") */
  public static final String KnownBiopsyProvenMalignancy = "111125\\DCM";

  /** (G-03D3, SRT, "Personal history of breast cancer") */
  public static final String PersonalHistoryOfBreastCancer = "G-03D3\\SRT";

  /** (111421, DCM, "Personal history of breast cancer with breast conservation therapy") */
  public static final String PersonalHistoryOfBreastCancerWithBreastConservationTherapy = "111421\\DCM";

  /** (111124, DCM, "Personal history of breast cancer with mastectomy") */
  public static final String PersonalHistoryOfBreastCancerWithMastectomy = "111124\\DCM";

  /** (P5-C0000, SRT, "Radiation therapy") */
  public static final String RadiationTherapy = "P5-C0000\\SRT";

  /** (111591, DCM, "Recall for imaging findings") */
  public static final String RecallForImagingFindings = "111591\\DCM";

  /** (111592, DCM, "Recall for patient symptoms/ clinical findings") */
  public static final String RecallForPatientSymptomsClinicalFindings = "111592\\DCM";

  /** (111590, DCM, "Recall for technical reasons") */
  public static final String RecallForTechnicalReasons = "111590\\DCM";

  /** (P1-48830, SRT, "Reduction mammoplasty") */
  public static final String ReductionMammoplasty = "P1-48830\\SRT";

  /** (111418, DCM, "Review of an outside study") */
  public static final String ReviewOfAnOutsideStudy = "111418\\DCM";
}
