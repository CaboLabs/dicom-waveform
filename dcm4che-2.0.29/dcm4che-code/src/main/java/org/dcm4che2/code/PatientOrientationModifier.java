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
 * CID 20 Patient Orientation Modifier.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PatientOrientationModifier {

  /** (F-10326, SRT, "anatomical") */
  public static final String Anatomical = "F-10326\\SRT";

  /** (F-10410, SRT, "curled-up") */
  public static final String CurledUp = "F-10410\\SRT";

  /** (F-10380, SRT, "frog") */
  public static final String Frog = "F-10380\\SRT";

  /** (F-10349, SRT, "inverse Trendelenburg") */
  public static final String InverseTrendelenburg = "F-10349\\SRT";

  /** (F-10336, SRT, "knee-chest") */
  public static final String KneeChest = "F-10336\\SRT";

  /** (F-10330, SRT, "kneeling") */
  public static final String Kneeling = "F-10330\\SRT";

  /** (F-10318, SRT, "lateral decubitus") */
  public static final String LateralDecubitus = "F-10318\\SRT";

  /** (F-10319, SRT, "left lateral decubitus") */
  public static final String LeftLateralDecubitus = "F-10319\\SRT";

  /** (F-10346, SRT, "lithotomy") */
  public static final String Lithotomy = "F-10346\\SRT";

  /** (R-40799, SRT, "lordotic") */
  public static final String Lordotic = "R-40799\\SRT";

  /** (F-10310, SRT, "prone") */
  public static final String Prone = "F-10310\\SRT";

  /** (F-10317, SRT, "right lateral decubitus") */
  public static final String RightLateralDecubitus = "F-10317\\SRT";

  /** (F-10316, SRT, "semi-prone") */
  public static final String SemiProne = "F-10316\\SRT";

  /** (F-103A0, SRT, "sitting") */
  public static final String Sitting = "F-103A0\\SRT";

  /** (F-10320, SRT, "standing") */
  public static final String Standing = "F-10320\\SRT";

  /** (F-10390, SRT, "stooped-over") */
  public static final String StoopedOver = "F-10390\\SRT";

  /** (F-10340, SRT, "supine") */
  public static final String Supine = "F-10340\\SRT";

  /** (F-10348, SRT, "Trendelenburg") */
  public static final String Trendelenburg = "F-10348\\SRT";
}
