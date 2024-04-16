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
 * CID 3620 Hemodynamic Ratios.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class HemodynamicRatios {

  /** (122217, DCM, "Coronary Flow reserve") */
  public static final String CoronaryFlowReserve = "122217\\DCM";

  /** (122218, DCM, "Diastolic/Systolic velocity ratio") */
  public static final String DiastolicSystolicVelocityRatio = "122218\\DCM";

  /** (R-00307, SRT, "Fractional flow reserve") */
  public static final String FractionalFlowReserve = "R-00307\\SRT";

  /** (R-00308, SRT, "Fractional Flow Reserve using intracoronary bolus") */
  public static final String FractionalFlowReserveUsingIntracoronaryBolus = "R-00308\\SRT";

  /** (R-00309, SRT, "Fractional Flow Reserve using intravenous infusion") */
  public static final String FractionalFlowReserveUsingIntravenousInfusion = "R-00309\\SRT";

  /** (122220, DCM, "Hemodynamic Resistance Index") */
  public static final String HemodynamicResistanceIndex = "122220\\DCM";

  /** (122219, DCM, "Hyperemic ratio") */
  public static final String HyperemicRatio = "122219\\DCM";

  /** (F-0238B, SRT, "Pulmonary/Systemic Flow Ratio") */
  public static final String PulmonarySystemicFlowRatio = "F-0238B\\SRT";

  /** (F-031A2, SRT, "Pulsatility Index") */
  public static final String PulsatilityIndex = "F-031A2\\SRT";

  /** (8581-1, LN, "Tibial/brachial index") */
  public static final String TibialBrachialIndex = "8581-1\\LN";
}
