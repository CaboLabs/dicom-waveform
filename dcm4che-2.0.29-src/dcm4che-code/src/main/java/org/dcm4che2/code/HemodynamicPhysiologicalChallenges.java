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
 * CID 3271 Hemodynamic Physiological Challenges.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class HemodynamicPhysiologicalChallenges {

  /** (P2-71317, SRT, "Drug infusion") */
  public static final String DrugInfusion = "P2-71317\\SRT";

  /** (P2-71310, SRT, "Exercise challenge") */
  public static final String ExerciseChallenge = "P2-71310\\SRT";

  /** (P2-71306, SRT, "Handgrip") */
  public static final String Handgrip = "P2-71306\\SRT";

  /** (P2-71302, SRT, "Head up") */
  public static final String HeadUp = "P2-71302\\SRT";

  /** (P2-71314, SRT, "Held inspiration") */
  public static final String HeldInspiration = "P2-71314\\SRT";

  /** (P2-71316, SRT, "Held ventilation") */
  public static final String HeldVentilation = "P2-71316\\SRT";

  /** (P2-71304, SRT, "Leg up") */
  public static final String LegUp = "P2-71304\\SRT";

  /** (P2-71308, SRT, "Negative lower body pressure") */
  public static final String NegativeLowerBodyPressure = "P2-71308\\SRT";

  /** (P2-35000, SRT, "Pacing") */
  public static final String Pacing = "P2-35000\\SRT";

  /** (P2-71318, SRT, "Post volume challenge") */
  public static final String PostVolumeChallenge = "P2-71318\\SRT";

  /** (P2-71312, SRT, "Vagal stimulation") */
  public static final String VagalStimulation = "P2-71312\\SRT";

  /** (F-F7102, SRT, "Valsalva maneuver") */
  public static final String ValsalvaManeuver = "F-F7102\\SRT";
}
