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
 * CID 3220 Stress Symptoms.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class StressSymptoms {

  /** (F-37006, SRT, "Chest discomfort") */
  public static final String ChestDiscomfort = "F-37006\\SRT";

  /** (F-37000, SRT, "Chest pain") */
  public static final String ChestPain = "F-37000\\SRT";

  /** (F-18010, SRT, "Claudication") */
  public static final String Claudication = "F-18010\\SRT";

  /** (F-06017, SRT, "Dizziness") */
  public static final String Dizziness = "F-06017\\SRT";

  /** (F-201B3, SRT, "Dyspnea") */
  public static final String Dyspnea = "F-201B3\\SRT";

  /** (F-01360, SRT, "Fatigue") */
  public static final String Fatigue = "F-01360\\SRT";

  /** (D0-30017, SRT, "Flushing") */
  public static final String Flushing = "D0-30017\\SRT";

  /** (F-52760, SRT, "Nausea") */
  public static final String Nausea = "F-52760\\SRT";

  /** (D3-00006, SRT, "Syncope") */
  public static final String Syncope = "D3-00006\\SRT";
}
