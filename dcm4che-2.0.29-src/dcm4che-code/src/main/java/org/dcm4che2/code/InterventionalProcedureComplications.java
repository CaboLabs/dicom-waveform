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
 * CID 6062 Interventional Procedure Complications.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class InterventionalProcedureComplications {

  /** (111491, DCM, "Abnormal discharge") */
  public static final String AbnormalDischarge = "111491\\DCM";

  /** (F-0147C, SRT, "Hematoma - postoperative") */
  public static final String HematomaPostoperative = "F-0147C\\SRT";

  /** (DD-66A67, SRT, "Hemorrhage postprocedure") */
  public static final String HemorrhagePostprocedure = "DD-66A67\\SRT";

  /** (DD-67700, SRT, "Infection as complication of medical care") */
  public static final String InfectionAsComplicationOfMedicalCare = "DD-67700\\SRT";

  /** (111492, DCM, "No complications") */
  public static final String NoComplications = "111492\\DCM";

  /** (F-A2632, SRT, "Persistent pain following procedure") */
  public static final String PersistentPainFollowingProcedure = "F-A2632\\SRT";

  /** (D2-80300, SRT, "Pneumothorax") */
  public static final String Pneumothorax = "D2-80300\\SRT";

  /** (D0-00058, SRT, "Rash") */
  public static final String Rash = "D0-00058\\SRT";

  /** (M-02570, SRT, "Swelling") */
  public static final String Swelling = "M-02570\\SRT";

  /** (F-A5581, SRT, "Vasovagal attack") */
  public static final String VasovagalAttack = "F-A5581\\SRT";

  /** (D0-00165, SRT, "Weal") */
  public static final String Weal = "D0-00165\\SRT";
}
