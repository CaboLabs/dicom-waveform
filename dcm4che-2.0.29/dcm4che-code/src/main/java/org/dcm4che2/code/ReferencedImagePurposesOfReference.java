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
 * CID 7201 Referenced Image Purposes of Reference.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ReferencedImagePurposesOfReference {

  /** (121346, DCM, "Acquisition frames corresponding to volume") */
  public static final String AcquisitionFramesCorrespondingToVolume = "121346\\DCM";

  /** (121338, DCM, "Anatomic image") */
  public static final String AnatomicImage = "121338\\DCM";

  /** (121312, DCM, "Biopsy localizer") */
  public static final String BiopsyLocalizer = "121312\\DCM";

  /** (121341, DCM, "Device localizer") */
  public static final String DeviceLocalizer = "121341\\DCM";

  /** (121339, DCM, "Functional image") */
  public static final String FunctionalImage = "121339\\DCM";

  /** (121316, DCM, "Images related to standalone object") */
  public static final String ImagesRelatedToStandaloneObject = "121316\\DCM";

  /** (121311, DCM, "Localizer") */
  public static final String Localizer = "121311\\DCM";

  /** (121314, DCM, "Other image of biplane pair") */
  public static final String OtherImageOfBiplanePair = "121314\\DCM";

  /** (121315, DCM, "Other image of stereoscopic pair") */
  public static final String OtherImageOfStereoscopicPair = "121315\\DCM";

  /** (121313, DCM, "Other partial views") */
  public static final String OtherPartialViews = "121313\\DCM";

  /** (121340, DCM, "Spectral filtered image") */
  public static final String SpectralFilteredImage = "121340\\DCM";

  /** (121317, DCM, "Spectroscopy") */
  public static final String Spectroscopy = "121317\\DCM";

  /** (121348, DCM, "Temporal Predecessor") */
  public static final String TemporalPredecessor = "121348\\DCM";

  /** (121349, DCM, "Temporal Successor") */
  public static final String TemporalSuccessor = "121349\\DCM";

  /** (121347, DCM, "Volume corresponding to spatially-related acquisition frames") */
  public static final String VolumeCorrespondingToSpatiallyRelatedAcquisitionFrames = "121347\\DCM";
}
