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
 * CID 12208 Echocardiography Tricuspid Valve.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class EchocardiographyTricuspidValve {

  /** (20168-1, LN, "Acceleration Time") */
  public static final String AccelerationTime = "20168-1\\LN";

  /** (G-038E, SRT, "Cardiovascular Orifice Area") */
  public static final String CardiovascularOrificeArea = "G-038E\\SRT";

  /** (G-038F, SRT, "Cardiovascular Orifice Diameter") */
  public static final String CardiovascularOrificeDiameter = "G-038F\\SRT";

  /** (20216-8, LN, "Deceleration Slope") */
  public static final String DecelerationSlope = "20216-8\\LN";

  /** (20217-6, LN, "Deceleration Time") */
  public static final String DecelerationTime = "20217-6\\LN";

  /** (11653-3, LN, "End Diastolic Velocity") */
  public static final String EndDiastolicVelocity = "11653-3\\LN";

  /** (8867-4, LN, "Heart rate") */
  public static final String HeartRate = "8867-4\\LN";

  /** (20256-4, LN, "Mean Gradient") */
  public static final String MeanGradient = "20256-4\\LN";

  /** (20352-1, LN, "Mean Velocity") */
  public static final String MeanVelocity = "20352-1\\LN";

  /** (20247-3, LN, "Peak Gradient") */
  public static final String PeakGradient = "20247-3\\LN";

  /** (34141-2, LN, "Peak Instantaneous Flow Rate") */
  public static final String PeakInstantaneousFlowRate = "34141-2\\LN";

  /** (11726-7, LN, "Peak Velocity") */
  public static final String PeakVelocity = "11726-7\\LN";

  /** (20280-4, LN, "Pressure Half-Time") */
  public static final String PressureHalfTime = "20280-4\\LN";

  /** (G-0390, SRT, "Regurgitant Fraction") */
  public static final String RegurgitantFraction = "G-0390\\SRT";

  /** (20296-0, LN, "Time from Q wave to Tricuspid Valve Opens") */
  public static final String TimeFromQWaveToTricuspidValveOpens = "20296-0\\LN";

  /** (18034-9, LN, "Tricuspid Regurgitation dP/dt") */
  public static final String TricuspidRegurgitationDPDt = "18034-9\\LN";

  /** (18030-7, LN, "Tricuspid Valve A Wave Peak Velocity") */
  public static final String TricuspidValveAWavePeakVelocity = "18030-7\\LN";

  /** (G-0389, SRT, "Tricuspid Valve Closure to Opening Time") */
  public static final String TricuspidValveClosureToOpeningTime = "G-0389\\SRT";

  /** (18039-8, LN, "Tricuspid Valve E to A Ratio") */
  public static final String TricuspidValveEToARatio = "18039-8\\LN";

  /** (18031-5, LN, "Tricuspid Valve E Wave Peak Velocity") */
  public static final String TricuspidValveEWavePeakVelocity = "18031-5\\LN";

  /** (20354-7, LN, "Velocity Time Integral") */
  public static final String VelocityTimeIntegral = "20354-7\\LN";

  /** (33878-0, LN, "Volume Flow") */
  public static final String VolumeFlow = "33878-0\\LN";
}
