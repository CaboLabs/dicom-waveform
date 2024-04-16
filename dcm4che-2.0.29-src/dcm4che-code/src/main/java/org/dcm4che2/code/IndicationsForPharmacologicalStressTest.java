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
 * CID 3205 Indications for Pharmacological Stress Test.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class IndicationsForPharmacologicalStressTest {

  /** (F-01380, SRT, "Asthenia (debility)") */
  public static final String AstheniaDebility = "F-01380\\SRT";

  /** (F-A4580, SRT, "Ataxia or incoordination") */
  public static final String AtaxiaOrIncoordination = "F-A4580\\SRT";

  /** (F-029F7, SRT, "Cachexia") */
  public static final String Cachexia = "F-029F7\\SRT";

  /** (F-33019, SRT, "Cannot reach target heart rate") */
  public static final String CannotReachTargetHeartRate = "F-33019\\SRT";

  /** (S-20570, SRT, "Dependence on enabling machine or device") */
  public static final String DependenceOnEnablingMachineOrDevice = "S-20570\\SRT";

  /** (DD-13000, SRT, "Fracture of lower limb") */
  public static final String FractureOfLowerLimb = "DD-13000\\SRT";

  /** (F-18002, SRT, "Gait problem") */
  public static final String GaitProblem = "F-18002\\SRT";

  /** (D3-33120, SRT, "Left bundle branch block") */
  public static final String LeftBundleBranchBlock = "D3-33120\\SRT";

  /** (G-02BD, SRT, "Lower limb amputation") */
  public static final String LowerLimbAmputation = "G-02BD\\SRT";

  /** (DD-33500, SRT, "Open wound of lower limb") */
  public static final String OpenWoundOfLowerLimb = "DD-33500\\SRT";

  /** (DA-26000, SRT, "Paralytic syndrome") */
  public static final String ParalyticSyndrome = "DA-26000\\SRT";

  /** (R-0039E, SRT, "Patient has pacemaker") */
  public static final String PatientHasPacemaker = "R-0039E\\SRT";

  /** (122764, DCM, "Patient weight exceeds equipment limit") */
  public static final String PatientWeightExceedsEquipmentLimit = "122764\\DCM";

  /** (D3-8005B, SRT, "Peripheral vascular disease") */
  public static final String PeripheralVascularDisease = "D3-8005B\\SRT";

  /** (D2-50000, SRT, "Pulmonary disease") */
  public static final String PulmonaryDisease = "D2-50000\\SRT";

  /** (G-044D, SRT, "Recent Myocardial infarction") */
  public static final String RecentMyocardialInfarction = "G-044D\\SRT";

  /** (G-0202, SRT, "Request by Physician") */
  public static final String RequestByPhysician = "G-0202\\SRT";

  /** (F-A0846, SRT, "Transient limb paralysis") */
  public static final String TransientLimbParalysis = "F-A0846\\SRT";
}
