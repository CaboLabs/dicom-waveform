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
 * CID 6040 Non-Lesion Object Type.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class NonLesionObjectType {

  /** (A-32475, SRT, "BB shot (Lead Pellet)") */
  public static final String BBShotLeadPellet = "A-32475\\SRT";

  /** (A-32110, SRT, "Bullet") */
  public static final String Bullet = "A-32110\\SRT";

  /** (A-11101, SRT, "Cardiac Pacemaker") */
  public static final String CardiacPacemaker2 = "A-11101\\SRT";

  /** (A-26800, SRT, "Catheter") */
  public static final String Catheter = "A-26800\\SRT";

  /** (A-12062, SRT, "Clip") */
  public static final String Clip = "A-12062\\SRT";

  /** (A-10044, SRT, "Collimator") */
  public static final String Collimator = "A-10044\\SRT";

  /** (A-10042, SRT, "Compression paddle") */
  public static final String CompressionPaddle = "A-10042\\SRT";

  /** (C-B0300, SRT, "Contrast agent") */
  public static final String ContrastAgent = "C-B0300\\SRT";

  /** (A-16016, SRT, "ID Plate") */
  public static final String IDPlate = "A-16016\\SRT";

  /** (A-04010, SRT, "Implant") */
  public static final String Implant = "A-04010\\SRT";

  /** (A-1016B, SRT, "J Wire") */
  public static final String JWire = "A-1016B\\SRT";

  /** (A-00D7B, SRT, "Opaque Marker") */
  public static final String OpaqueMarker = "A-00D7B\\SRT";

  /** (111175, DCM, "Other Marker") */
  public static final String OtherMarker = "111175\\DCM";

  /** (M-78060, SRT, "Scar tissue") */
  public static final String ScarTissue = "M-78060\\SRT";

  /** (A-13600, SRT, "Staple") */
  public static final String Staple = "A-13600\\SRT";

  /** (A-13510, SRT, "Suture material") */
  public static final String SutureMaterial = "A-13510\\SRT";

  /** (111176, DCM, "Unspecified") */
  public static final String Unspecified = "111176\\DCM";
}
