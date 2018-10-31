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
 * CID 6160 Breast Primary Tumor Assessment from AJCC.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastPrimaryTumorAssessmentFromAJCC {

  /** (R-003B9, SRT, "T0: No evidence of primary tumor (breast)") */
  public static final String T0NoEvidenceOfPrimaryTumorBreast = "R-003B9\\SRT";

  /** (R-003C0, SRT, "T1a: Tumor more than 0.1 cm but not more than 0.5 cm...") */
  public static final String T1aTumorMoreThan0_1CmButNotMoreThan0_5Cm = "R-003C0\\SRT";

  /** (R-003C1, SRT, "T1b: Tumor more than 0.5 cm but not more than 1 cm...") */
  public static final String T1bTumorMoreThan0_5CmButNotMoreThan1Cm = "R-003C1\\SRT";

  /** (R-003C2, SRT, "T1c: Tumor more than 1 cm but not more than 2 cm...") */
  public static final String T1cTumorMoreThan1CmButNotMoreThan2Cm = "R-003C2\\SRT";

  /** (R-003BF, SRT, "T1mic: Microinvasion 0.1 cm or less in greatest dimension...") */
  public static final String T1micMicroinvasion0_1CmOrLessInGreatestDimension = "R-003BF\\SRT";

  /** (R-003BA, SRT, "T1: Tumor 2 cm or less in greatest dimension (breast)") */
  public static final String T1Tumor2CmOrLessInGreatestDimensionBreast = "R-003BA\\SRT";

  /** (R-003C3, SRT, "T2: Tumor more than 2 cm but not more than 5 cm...") */
  public static final String T2TumorMoreThan2CmButNotMoreThan5Cm = "R-003C3\\SRT";

  /** (R-003C4, SRT, "T3: Tumor more than 5 cm in greatest dimension (breast)") */
  public static final String T3TumorMoreThan5CmInGreatestDimensionBreast = "R-003C4\\SRT";

  /** (R-003C6, SRT, "T4a: Tumor of any size with extension to chest wall, not incl...") */
  public static final String T4aTumorOfAnySizeWithExtensionToChestWallNotIncl = "R-003C6\\SRT";

  /** (R-003C7, SRT, "T4b: Tumor of any size with edema (including peau d'orange)...") */
  public static final String T4bTumorOfAnySizeWithEdemaIncludingPeauDOrange = "R-003C7\\SRT";

  /** (R-003C8, SRT, "T4c: Tumor of any size with direct extension to chest wall...") */
  public static final String T4cTumorOfAnySizeWithDirectExtensionToChestWall = "R-003C8\\SRT";

  /** (R-003C9, SRT, "T4: Inflammatory carcinoma (breast)") */
  public static final String T4InflammatoryCarcinomaBreast = "R-003C9\\SRT";

  /** (R-003C5, SRT, "T4: Tumor of any size with direct extension to chest wall...") */
  public static final String T4TumorOfAnySizeWithDirectExtensionToChestWall = "R-003C5\\SRT";

  /** (R-003BB, SRT, "Tis: Carcinoma in situ (breast)") */
  public static final String TisCarcinomaInSituBreast = "R-003BB\\SRT";

  /** (R-003BC, SRT, "Tis: Ductal carcinoma in situ (breast)") */
  public static final String TisDuctalCarcinomaInSituBreast = "R-003BC\\SRT";

  /** (R-003BD, SRT, "Tis: Lobular carcinoma in situ (breast)") */
  public static final String TisLobularCarcinomaInSituBreast = "R-003BD\\SRT";

  /** (R-003BE, SRT, "Tis: Paget's disease of the nipple with no tumor") */
  public static final String TisPagetDiseaseOfTheNippleWithNoTumor = "R-003BE\\SRT";

  /** (R-003B8, SRT, "TX: Primary tumor cannot be assessed (breast)") */
  public static final String TXPrimaryTumorCannotBeAssessedBreast = "R-003B8\\SRT";
}
