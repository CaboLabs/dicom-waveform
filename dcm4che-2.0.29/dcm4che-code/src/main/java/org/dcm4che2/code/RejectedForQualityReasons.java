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
 * CID 7011 Rejected for Quality Reasons.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class RejectedForQualityReasons {

  /** (111215, DCM, "Artifact(s) other than grid or detector artifact") */
  public static final String ArtifactOtherThanGridOrDetectorArtifact = "111215\\DCM";

  /** (111214, DCM, "Detector artifact(s)") */
  public static final String DetectorArtifact = "111214\\DCM";

  /** (113026, DCM, "Double exposure") */
  public static final String DoubleExposure = "113026\\DCM";

  /** (111217, DCM, "Electrical failure") */
  public static final String ElectricalFailure = "111217\\DCM";

  /** (111208, DCM, "Grid artifact(s)") */
  public static final String GridArtifact = "111208\\DCM";

  /** (111207, DCM, "Image artifact(s)") */
  public static final String ImageArtifact = "111207\\DCM";

  /** (111219, DCM, "Inappropriate image processing") */
  public static final String InappropriateImageProcessing = "111219\\DCM";

  /** (111216, DCM, "Mechanical failure") */
  public static final String MechanicalFailure = "111216\\DCM";

  /** (111210, DCM, "Motion blur") */
  public static final String MotionBlur = "111210\\DCM";

  /** (111213, DCM, "No image") */
  public static final String NoImage = "111213\\DCM";

  /** (111220, DCM, "Other failure") */
  public static final String OtherFailure = "111220\\DCM";

  /** (111212, DCM, "Over exposed") */
  public static final String OverExposed = "111212\\DCM";

  /** (111209, DCM, "Positioning") */
  public static final String Positioning = "111209\\DCM";

  /** (111218, DCM, "Software failure") */
  public static final String SoftwareFailure = "111218\\DCM";

  /** (111211, DCM, "Under exposed") */
  public static final String UnderExposed = "111211\\DCM";

  /** (111221, DCM, "Unknown failure") */
  public static final String UnknownFailure = "111221\\DCM";
}
