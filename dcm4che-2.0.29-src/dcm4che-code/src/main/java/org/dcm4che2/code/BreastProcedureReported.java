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
 * CID 6050 Breast Procedure Reported.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastProcedureReported {

  /** (P1-4830F, SRT, "Breast - surgical biopsy") */
  public static final String BreastSurgicalBiopsy = "P1-4830F\\SRT";

  /** (P1-48304, SRT, "Core needle biopsy of breast") */
  public static final String CoreNeedleBiopsyOfBreast = "P1-48304\\SRT";

  /** (P5-0801C, SRT, "CT of breast") */
  public static final String CTOfBreast = "P5-0801C\\SRT";

  /** (P1-48142, SRT, "Diagnostic aspiration of breast cyst") */
  public static final String DiagnosticAspirationOfBreastCyst = "P1-48142\\SRT";

  /** (111409, DCM, "Digital Mammography") */
  public static final String DigitalMammography = "111409\\DCM";

  /** (P2-4A000, SRT, "Examination of breast") */
  public static final String ExaminationOfBreast = "P2-4A000\\SRT";

  /** (111408, DCM, "Film Screen Mammography") */
  public static final String FilmScreenMammography = "111408\\DCM";

  /** (P1-48145, SRT, "Fine needle aspiration of breast") */
  public static final String FineNeedleAspirationOfBreast = "P1-48145\\SRT";

  /** (P1-05535, SRT, "Insertion of catheter") */
  public static final String InsertionOfCatheter = "P1-05535\\SRT";

  /** (P5-40060, SRT, "Mammary ductogram") */
  public static final String MammaryDuctogram = "P5-40060\\SRT";

  /** (111411, DCM, "Mammography CAD") */
  public static final String MammographyCAD = "111411\\DCM";

  /** (111123, DCM, "Marker placement") */
  public static final String MarkerPlacement = "111123\\DCM";

  /** (P5-0900D, SRT, "MRI of breast") */
  public static final String MRIOfBreast = "P5-0900D\\SRT";

  /** (P1-48011, SRT, "Pre-biopsy localization of breast lesion") */
  public static final String PreBiopsyLocalizationOfBreastLesion = "P1-48011\\SRT";

  /** (P5-D0061, SRT, "Radioisotope scan of lymphatic system") */
  public static final String RadioisotopeScanOfLymphaticSystem = "P5-D0061\\SRT";

  /** (P5-D0042, SRT, "Radionuclide localization of tumor, limited area") */
  public static final String RadionuclideLocalizationOfTumorLimitedArea = "P5-D0042\\SRT";

  /** (P1-65359, SRT, "Sentinel lymph node biopsy") */
  public static final String SentinelLymphNodeBiopsy = "P1-65359\\SRT";

  /** (P5-40030, SRT, "Specimen radiography of breast") */
  public static final String SpecimenRadiographyOfBreast = "P5-40030\\SRT";

  /** (111410, DCM, "Surgical consult") */
  public static final String SurgicalConsult = "111410\\DCM";

  /** (P5-B8500, SRT, "Ultrasonography of breast") */
  public static final String UltrasonographyOfBreast = "P5-B8500\\SRT";
}
