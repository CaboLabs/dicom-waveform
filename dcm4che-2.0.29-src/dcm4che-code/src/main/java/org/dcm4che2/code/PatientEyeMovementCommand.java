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
 * CID 4201 Patient Eye Movement Command.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PatientEyeMovementCommand {

  /** (R-10227, SRT, "Convergent gaze") */
  public static final String ConvergentGaze = "R-10227\\SRT";

  /** (R-404B6, SRT, "Downgaze") */
  public static final String Downgaze = "R-404B6\\SRT";

  /** (R-404B7, SRT, "Left downgaze") */
  public static final String LeftDowngaze = "R-404B7\\SRT";

  /** (R-404BC, SRT, "Left gaze") */
  public static final String LeftGaze = "R-404BC\\SRT";

  /** (R-404B9, SRT, "Left upgaze") */
  public static final String LeftUpgaze = "R-404B9\\SRT";

  /** (R-1022D, SRT, "Primary gaze") */
  public static final String PrimaryGaze = "R-1022D\\SRT";

  /** (R-404B8, SRT, "Right downgaze") */
  public static final String RightDowngaze = "R-404B8\\SRT";

  /** (R-404BD, SRT, "Right gaze") */
  public static final String RightGaze = "R-404BD\\SRT";

  /** (R-404BA, SRT, "Right upgaze") */
  public static final String RightUpgaze = "R-404BA\\SRT";

  /** (R-404BF, SRT, "Upward gaze") */
  public static final String UpwardGaze = "R-404BF\\SRT";
}
