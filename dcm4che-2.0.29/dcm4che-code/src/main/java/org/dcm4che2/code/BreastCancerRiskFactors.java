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
 * CID 6081 Breast Cancer Risk Factors.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastCancerRiskFactors {

  /** (111556, DCM, "BRCA1 breast cancer gene") */
  public static final String BRCA1BreastCancerGene = "111556\\DCM";

  /** (111557, DCM, "BRCA2 breast cancer gene") */
  public static final String BRCA2BreastCancerGene = "111557\\DCM";

  /** (111558, DCM, "BRCA3 breast cancer gene") */
  public static final String BRCA3BreastCancerGene = "111558\\DCM";

  /** (G-0325, SRT, "Family history of breast cancer") */
  public static final String FamilyHistoryOfBreastCancer = "G-0325\\SRT";

  /** (111562, DCM, "Family history of prostate cancer") */
  public static final String FamilyHistoryOfProstateCancer = "111562\\DCM";

  /** (111563, DCM, "Family history unknown") */
  public static final String FamilyHistoryUnknown = "111563\\DCM";

  /** (111551, DCM, "History of endometrial cancer") */
  public static final String HistoryOfEndometrialCancer = "111551\\DCM";

  /** (111553, DCM, "History of high risk lesion on previous biopsy") */
  public static final String HistoryOfHighRiskLesionOnPreviousBiopsy = "111553\\DCM";

  /** (111552, DCM, "History of ovarian cancer") */
  public static final String HistoryOfOvarianCancer = "111552\\DCM";

  /** (111560, DCM, "Intermediate family history of breast cancer") */
  public static final String IntermediateFamilyHistoryOfBreastCancer = "111560\\DCM";

  /** (111555, DCM, "Late child bearing (after 30)") */
  public static final String LateChildBearingAfter30 = "111555\\DCM";

  /** (R-207AD, SRT, "No family history of breast carcinoma") */
  public static final String NoFamilyHistoryOfBreastCarcinoma = "R-207AD\\SRT";

  /** (F-84430, SRT, "Nulliparous") */
  public static final String Nulliparous = "F-84430\\SRT";

  /** (111550, DCM, "Personal breast cancer history") */
  public static final String PersonalBreastCancerHistory = "111550\\DCM";

  /** (111554, DCM, "Post menopausal patient") */
  public static final String PostMenopausalPatient = "111554\\DCM";

  /** (111561, DCM, "Very strong family history of breast cancer") */
  public static final String VeryStrongFamilyHistoryOfBreastCancer = "111561\\DCM";

  /** (111559, DCM, "Weak family history of breast cancer") */
  public static final String WeakFamilyHistoryOfBreastCancer = "111559\\DCM";
}
