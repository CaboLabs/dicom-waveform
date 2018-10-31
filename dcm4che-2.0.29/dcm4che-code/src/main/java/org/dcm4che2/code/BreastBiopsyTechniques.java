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
 * CID 6060 Breast Biopsy Techniques.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastBiopsyTechniques {

  /** (P1-03106, SRT, "Computed tomography guided biopsy") */
  public static final String ComputedTomographyGuidedBiopsy = "P1-03106\\SRT";

  /** (P5-00032, SRT, "Diagnostic radiography, stereotactic localization") */
  public static final String DiagnosticRadiographyStereotacticLocalization = "P5-00032\\SRT";

  /** (P1-03005, SRT, "Lumpectomy") */
  public static final String Lumpectomy = "P1-03005\\SRT";

  /** (P1-03107, SRT, "Magnetic resonance imaging guided biopsy") */
  public static final String MagneticResonanceImagingGuidedBiopsy = "P1-03107\\SRT";

  /** (111487, DCM, "Mammographic (crosshair)") */
  public static final String MammographicCrosshair = "111487\\DCM";

  /** (111488, DCM, "Mammographic (grid)") */
  public static final String MammographicGrid = "111488\\DCM";

  /** (P5-40010, SRT, "Mammography") */
  public static final String Mammography = "P5-40010\\SRT";

  /** (P1-43850, SRT, "Mastectomy") */
  public static final String Mastectomy = "P1-43850\\SRT";

  /** (111489, DCM, "Palpation guided") */
  public static final String PalpationGuided = "111489\\DCM";

  /** (P1-4834A, SRT, "Quadrantectomy of breast") */
  public static final String QuadrantectomyOfBreast = "P1-4834A\\SRT";

  /** (P5-B0700, SRT, "Ultrasonic guidance procedure") */
  public static final String UltrasonicGuidanceProcedure = "P5-B0700\\SRT";

  /** (111490, DCM, "Vacuum assisted") */
  public static final String VacuumAssisted = "111490\\DCM";
}
