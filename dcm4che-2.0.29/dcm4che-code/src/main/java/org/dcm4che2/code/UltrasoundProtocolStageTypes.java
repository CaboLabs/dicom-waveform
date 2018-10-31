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
 * CID 12002 Ultrasound Protocol Stage Types.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class UltrasoundProtocolStageTypes {

  /** (R-422A4, SRT, "After Procedure") */
  public static final String AfterProcedure = "R-422A4\\SRT";

  /** (R-40FB9, SRT, "Before Procedure") */
  public static final String BeforeProcedure = "R-40FB9\\SRT";

  /** (P2-35000, SRT, "Cardiac pacing") */
  public static final String CardiacPacing = "P2-35000\\SRT";

  /** (F-05018, SRT, "Cardiac stress recovery state") */
  public static final String CardiacStressRecoveryState = "F-05018\\SRT";

  /** (F-05019, SRT, "Cardiac stress state") */
  public static final String CardiacStressState = "F-05019\\SRT";

  /** (R-40FBA, SRT, "During Procedure") */
  public static final String DuringProcedure = "R-40FBA\\SRT";

  /** (P2-71306, SRT, "Hand grip") */
  public static final String HandGrip = "P2-71306\\SRT";

  /** (F-25040, SRT, "Hyperventilation") */
  public static final String Hyperventilation = "F-25040\\SRT";

  /** (F-05028, SRT, "Peak cardiac stress state") */
  public static final String PeakCardiacStressState = "F-05028\\SRT";

  /** (F-01604, SRT, "Resting State") */
  public static final String RestingState = "F-01604\\SRT";

  /** (R-40928, SRT, "Valsalva") */
  public static final String Valsalva = "R-40928\\SRT";
}
