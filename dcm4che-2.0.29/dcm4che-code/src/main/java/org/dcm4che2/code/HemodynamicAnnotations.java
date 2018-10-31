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
 * CID 3337 Hemodynamic Annotations.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class HemodynamicAnnotations {

  /** (F-00E22, SRT, "Average diastolic blood pressure") */
  public static final String AverageDiastolicBloodPressure = "F-00E22\\SRT";

  /** (F-00E14, SRT, "Average systolic blood pressure") */
  public static final String AverageSystolicBloodPressure = "F-00E14\\SRT";

  /** (109016, DCM, "A wave peak pressure") */
  public static final String AWavePeakPressure = "109016\\DCM";

  /** (109017, DCM, "A wave pressure, average") */
  public static final String AWavePressureAverage = "109017\\DCM";

  /** (109018, DCM, "Beat detected (accepted)") */
  public static final String BeatDetectedAccepted = "109018\\DCM";

  /** (109019, DCM, "Beat detected (rejected)") */
  public static final String BeatDetectedRejected = "109019\\DCM";

  /** (F-32011, SRT, "End diastole") */
  public static final String EndDiastole = "F-32011\\SRT";

  /** (109023, DCM, "End of expiration") */
  public static final String EndOfExpiration = "109023\\DCM";

  /** (109024, DCM, "End of inspiration") */
  public static final String EndOfInspiration = "109024\\DCM";

  /** (109070, DCM, "End of systole") */
  public static final String EndOfSystole = "109070\\DCM";

  /** (109071, DCM, "Indicator mean transit time") */
  public static final String IndicatorMeanTransitTime = "109071\\DCM";

  /** (109025, DCM, "Max dp/dt") */
  public static final String MaxDpDt = "109025\\DCM";

  /** (F-00E11, SRT, "Maximum systolic blood pressure") */
  public static final String MaximumSystolicBloodPressure = "F-00E11\\SRT";

  /** (109026, DCM, "Max neg dp/dt") */
  public static final String MaxNegDpDt = "109026\\DCM";

  /** (F-31150, SRT, "Mean blood pressure") */
  public static final String MeanBloodPressure = "F-31150\\SRT";

  /** (F-00E1F, SRT, "Minimum diastolic blood pressure") */
  public static final String MinimumDiastolicBloodPressure = "F-00E1F\\SRT";

  /** (109028, DCM, "Peak of thermal cardiac output bolus") */
  public static final String PeakOfThermalCardiacOutputBolus = "109028\\DCM";

  /** (109015, DCM, "70% of thermal/dye dilution CO") */
  public static final String SeventyPercentOfThermalDyeDilutionCO = "109015\\DCM";

  /** (109029, DCM, "Start of expiration") */
  public static final String StartOfExpiration = "109029\\DCM";

  /** (109030, DCM, "Start of inspiration") */
  public static final String StartOfInspiration = "109030\\DCM";

  /** (109031, DCM, "Start of thermal CO") */
  public static final String StartOfThermalCO = "109031\\DCM";

  /** (109072, DCM, "Tau") */
  public static final String Tau = "109072\\DCM";

  /** (109014, DCM, "35% of thermal/dye dilution CO") */
  public static final String ThirtyfivePercentOfThermalDyeDilutionCO = "109014\\DCM";

  /** (109036, DCM, "Valve close") */
  public static final String ValveClose = "109036\\DCM";

  /** (109037, DCM, "Valve open") */
  public static final String ValveOpen = "109037\\DCM";

  /** (109073, DCM, "V max myocardial") */
  public static final String VMaxMyocardial = "109073\\DCM";

  /** (109034, DCM, "V wave peak pressure") */
  public static final String VWavePeakPressure = "109034\\DCM";

  /** (109035, DCM, "V wave pressure, average") */
  public static final String VWavePressureAverage = "109035\\DCM";
}
