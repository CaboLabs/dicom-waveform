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
 * CID 3402 Patient Status and Events.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PatientStatusAndEvents {

  /** (122033, DCM, "Hemostasis achieved") */
  public static final String HemostasisAchieved = "122033\\DCM";

  /** (122035, DCM, "Hemostasis not achieved - actively bleeding") */
  public static final String HemostasisNotAchievedActivelyBleeding = "122035\\DCM";

  /** (122034, DCM, "Hemostasis not achieved - oozing") */
  public static final String HemostasisNotAchievedOozing = "122034\\DCM";

  /** (122006, DCM, "Nil Per Os (NPO) status confirmed") */
  public static final String NilPerOsNPOStatusConfirmed = "122006\\DCM";

  /** (122002, DCM, "Patient admitted to procedure room") */
  public static final String PatientAdmittedToProcedureRoom = "122002\\DCM";

  /** (122005, DCM, "Patient advance directive given") */
  public static final String PatientAdvanceDirectiveGiven = "122005\\DCM";

  /** (122025, DCM, "Patient alert") */
  public static final String PatientAlert = "122025\\DCM";

  /** (122028, DCM, "Patient asleep") */
  public static final String PatientAsleep = "122028\\DCM";

  /** (122007, DCM, "Patient assisted to table") */
  public static final String PatientAssistedToTable = "122007\\DCM";

  /** (122001, DCM, "Patient called to procedure room") */
  public static final String PatientCalledToProcedureRoom = "122001\\DCM";

  /** (122009, DCM, "Patient connected to continuous monitoring") */
  public static final String PatientConnectedToContinuousMonitoring = "122009\\DCM";

  /** (122031, DCM, "Patient coughed") */
  public static final String PatientCoughed = "122031\\DCM";

  /** (122037, DCM, "Patient discharged from department") */
  public static final String PatientDischargedFromDepartment = "122037\\DCM";

  /** (122032, DCM, "Patient disconnected from continuous monitoring") */
  public static final String PatientDisconnectedFromContinuousMonitoring = "122032\\DCM";

  /** (122020, DCM, "Patient disoriented") */
  public static final String PatientDisoriented = "122020\\DCM";

  /** (122036, DCM, "Patient given post-procedure instruction") */
  public static final String PatientGivenPostProcedureInstruction = "122036\\DCM";

  /** (122003, DCM, "Patient given pre-procedure instruction") */
  public static final String PatientGivenPreProcedureInstruction = "122003\\DCM";

  /** (122030, DCM, "Patient has respiratory difficulty") */
  public static final String PatientHasRespiratoryDifficulty = "122030\\DCM";

  /** (122004, DCM, "Patient informed consent given") */
  public static final String PatientInformedConsentGiven = "122004\\DCM";

  /** (122008, DCM, "Patient prepped and draped") */
  public static final String PatientPreppedAndDraped = "122008\\DCM";

  /** (122038, DCM, "Patient pronounced dead") */
  public static final String PatientPronouncedDead = "122038\\DCM";

  /** (122023, DCM, "Patient reports chest pain") */
  public static final String PatientReportsChestPain = "122023\\DCM";

  /** (122022, DCM, "Patient reports discomfort") */
  public static final String PatientReportsDiscomfort = "122022\\DCM";

  /** (122021, DCM, "Patient reports nausea") */
  public static final String PatientReportsNausea = "122021\\DCM";

  /** (122024, DCM, "Patient reports no pain") */
  public static final String PatientReportsNoPain = "122024\\DCM";

  /** (122026, DCM, "Patient restless") */
  public static final String PatientRestless = "122026\\DCM";

  /** (122027, DCM, "Patient sedated") */
  public static final String PatientSedated = "122027\\DCM";

  /** (122012, DCM, "Patient transferred to CCU") */
  public static final String PatientTransferredToCCU = "122012\\DCM";

  /** (122010, DCM, "Patient transferred to holding area") */
  public static final String PatientTransferredToHoldingArea = "122010\\DCM";

  /** (122039, DCM, "Patient transferred to morgue") */
  public static final String PatientTransferredToMorgue = "122039\\DCM";

  /** (122011, DCM, "Patient transferred to surgery") */
  public static final String PatientTransferredToSurgery = "122011\\DCM";

  /** (122029, DCM, "Patient unresponsive") */
  public static final String PatientUnresponsive = "122029\\DCM";
}
