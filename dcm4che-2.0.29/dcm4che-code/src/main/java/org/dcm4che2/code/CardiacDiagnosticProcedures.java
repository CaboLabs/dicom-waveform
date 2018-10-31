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
 * CID 3757 Cardiac Diagnostic Procedures.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class CardiacDiagnosticProcedures {

  /** (P1-31600, SRT, "Cardiac catheterization") */
  public static final String CardiacCatheterization = "P1-31600\\SRT";

  /** (P5-08025, SRT, "Cardiac CT") */
  public static final String CardiacCT = "P5-08025\\SRT";

  /** (P5-B3000, SRT, "Echocardiography") */
  public static final String Echocardiography = "P5-B3000\\SRT";

  /** (P5-B3009, SRT, "Exercise Stress echo") */
  public static final String ExerciseStressEcho = "P5-B3009\\SRT";

  /** (P0-006E4, SRT, "Exercise Tolerance Test") */
  public static final String ExerciseToleranceTest = "P0-006E4\\SRT";

  /** (P5-09100, SRT, "Magnetic resonance angiography") */
  public static final String MagneticResonanceAngiography = "P5-09100\\SRT";

  /** (P5-D0050, SRT, "Perfusion imaging (nuclear)") */
  public static final String PerfusionImagingNuclear = "P5-D0050\\SRT";

  /** (P2-31107, SRT, "Pharmacological stress test") */
  public static final String PharmacologicalStressTest = "P2-31107\\SRT";

  /** (P2-31011, SRT, "Pharmacologic and exercise stress test") */
  public static final String PharmacologicAndExerciseStressTest = "P2-31011\\SRT";

  /** (P2-3110B, SRT, "Stress test using cardiac pacing") */
  public static final String StressTestUsingCardiacPacing = "P2-3110B\\SRT";
}
