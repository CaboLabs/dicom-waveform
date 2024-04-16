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
 * CID 3611 Pressure Measurements.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PressureMeasurements {

  /** (F-00E22, SRT, "Average diastolic blood pressure") */
  public static final String AverageDiastolicBloodPressure = "F-00E22\\SRT";

  /** (F-00E14, SRT, "Average systolic blood pressure") */
  public static final String AverageSystolicBloodPressure = "F-00E14\\SRT";

  /** (109016, DCM, "A wave peak pressure") */
  public static final String AWavePeakPressure = "109016\\DCM";

  /** (122196, DCM, "C wave pressure") */
  public static final String CWavePressure = "122196\\DCM";

  /** (122197, DCM, "Gradient pressure, average") */
  public static final String GradientPressureAverage = "122197\\DCM";

  /** (122198, DCM, "Gradient pressure, peak") */
  public static final String GradientPressurePeak = "122198\\DCM";

  /** (8462-4, LN, "Intravascular diastolic blood pressure") */
  public static final String IntravascularDiastolicBloodPressure = "8462-4\\LN";

  /** (8480-6, LN, "Intravascular Systolic Blood pressure") */
  public static final String IntravascularSystolicBloodPressure = "8480-6\\LN";

  /** (F-00E11, SRT, "Maximum systolic blood pressure") */
  public static final String MaximumSystolicBloodPressure = "F-00E11\\SRT";

  /** (F-31150, SRT, "Mean blood pressure") */
  public static final String MeanBloodPressure = "F-31150\\SRT";

  /** (F-00E1F, SRT, "Minimum diastolic blood pressure") */
  public static final String MinimumDiastolicBloodPressure = "F-00E1F\\SRT";

  /** (122199, DCM, "Pressure at dp/dt max") */
  public static final String PressureAtDpDtMax = "122199\\DCM";

  /** (122191, DCM, "Ventricular End Diastolic pressure") */
  public static final String VentricularEndDiastolicPressure = "122191\\DCM";

  /** (109034, DCM, "V wave peak pressure") */
  public static final String VWavePeakPressure = "109034\\DCM";

  /** (122208, DCM, "x-descent pressure") */
  public static final String XDescentPressure = "122208\\DCM";

  /** (122209, DCM, "y-descent pressure") */
  public static final String YDescentPressure = "122209\\DCM";

  /** (122210, DCM, "z-point pressure") */
  public static final String ZPointPressure = "122210\\DCM";
}
