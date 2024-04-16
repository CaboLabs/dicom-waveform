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
 * CID 6055 Breast Clinical Finding or Indicated Problem.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastClinicalFindingOrIndicatedProblem {

  /** (D7-90565, SRT, "Bloody nipple discharge") */
  public static final String BloodyNippleDischarge = "D7-90565\\SRT";

  /** (D7-90530, SRT, "Breast lump") */
  public static final String BreastLump = "D7-90530\\SRT";

  /** (F-8A030, SRT, "Breast pain") */
  public static final String BreastPain = "F-8A030\\SRT";

  /** (111480, DCM, "Cancer elsewhere") */
  public static final String CancerElsewhere = "111480\\DCM";

  /** (111479, DCM, "Difficult physical/clinical examination") */
  public static final String DifficultPhysicalClinicalExamination = "111479\\DCM";

  /** (F-8A074, SRT, "Discoloration of skin of breast") */
  public static final String DiscolorationOfSkinOfBreast = "F-8A074\\SRT";

  /** (D7-90010, SRT, "Disorder of breast implant") */
  public static final String DisorderOfBreastImplant = "D7-90010\\SRT";

  /** (DF-00577, SRT, "Disseminated malignancy of unknown primary") */
  public static final String DisseminatedMalignancyOfUnknownPrimary = "DF-00577\\SRT";

  /** (F-4410C, SRT, "Erythema") */
  public static final String Erythema = "F-4410C\\SRT";

  /** (111126, DCM, "Image detected mass") */
  public static final String ImageDetectedMass = "111126\\DCM";

  /** (F-03753, SRT, "Nipple discharge symptom") */
  public static final String NippleDischargeSymptom = "F-03753\\SRT";

  /** (F-8A09C, SRT, "Nipple problem") */
  public static final String NippleProblem = "F-8A09C\\SRT";

  /** (111478, DCM, "Non-bloody discharge (from nipple)") */
  public static final String NonBloodyDischargeFromNipple = "111478\\DCM";

  /** (R-20099, SRT, "O/E - axillary lymphadenopathy") */
  public static final String OEAxillaryLymphadenopathy = "R-20099\\SRT";

  /** (R-207D7, SRT, "O/E - Breast lump palpated") */
  public static final String OEBreastLumpPalpated = "R-207D7\\SRT";

  /** (R-20681, SRT, "O/E - lymphadenopathy NOS") */
  public static final String OELymphadenopathyNOS = "R-20681\\SRT";

  /** (D7-90560, SRT, "Peau d'orange surface of breast") */
  public static final String PeauDOrangeSurfaceOfBreast = "D7-90560\\SRT";

  /** (F-01760, SRT, "Radiographic calcification finding") */
  public static final String RadiographicCalcificationFinding = "F-01760\\SRT";

  /** (F-01799, SRT, "Skin retraction of breast") */
  public static final String SkinRetractionOfBreast = "F-01799\\SRT";

  /** (F-0179A, SRT, "Skin thickening of breast") */
  public static final String SkinThickeningOfBreast = "F-0179A\\SRT";
}
