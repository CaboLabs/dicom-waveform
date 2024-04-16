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
 * CID 3755 Cath Complications.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class CathComplications {

  /** (D3-30000, SRT, "Arrhythmia") */
  public static final String Arrhythmia = "D3-30000\\SRT";

  /** (D3-30800, SRT, "Cardiac arrest") */
  public static final String CardiacArrest = "D3-30800\\SRT";

  /** (D3-90100, SRT, "Cardiac tamponade") */
  public static final String CardiacTamponade = "D3-90100\\SRT";

  /** (D3-00200, SRT, "Cardiogenic shock") */
  public static final String CardiogenicShock = "D3-00200\\SRT";

  /** (D3-8900D, SRT, "Cerebrovascular Accident or Stroke") */
  public static final String CerebrovascularAccidentOrStroke = "D3-8900D\\SRT";

  /** (D3-16010, SRT, "Congestive heart failure") */
  public static final String CongestiveHeartFailure = "D3-16010\\SRT";

  /** (DF-10781, SRT, "Contrast media adverse reaction") */
  public static final String ContrastMediaAdverseReaction = "DF-10781\\SRT";

  /** (R-102B3, SRT, "Emergency Coronary Artery Bypass") */
  public static final String EmergencyCoronaryArteryBypass = "R-102B3\\SRT";

  /** (R-102B5, SRT, "Emergency Percutaneous Coronary Intervention") */
  public static final String EmergencyPercutaneousCoronaryIntervention = "R-102B5\\SRT";

  /** (D7-11010, SRT, "Renal failure") */
  public static final String RenalFailure = "D7-11010\\SRT";
}
