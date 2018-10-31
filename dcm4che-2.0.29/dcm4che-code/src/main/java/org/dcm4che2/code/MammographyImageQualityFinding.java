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
 * CID 6041 Mammography Image Quality Finding.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class MammographyImageQualityFinding {

  /** (111215, DCM, "Artifact(s) other than grid or detector artifact") */
  public static final String ArtifactOtherThanGridOrDetectorArtifact = "111215\\DCM";

  /** (111203, DCM, "CC Nipple not centered on image") */
  public static final String CCNippleNotCenteredOnImage = "111203\\DCM";

  /** (111202, DCM, "CC Not all medial tissue visualized") */
  public static final String CCNotAllMedialTissueVisualized = "111202\\DCM";

  /** (111204, DCM, "CC Posterior nipple line does not measure within 1 cm of MLO") */
  public static final String CCPosteriorNippleLineDoesNotMeasureWithin1CmOfMLO = "111204\\DCM";

  /** (111195, DCM, "Collimation too close to breast") */
  public static final String CollimationTooCloseToBreast = "111195\\DCM";

  /** (111193, DCM, "Date sticker is missing") */
  public static final String DateStickerIsMissing = "111193\\DCM";

  /** (111214, DCM, "Detector artifact(s)") */
  public static final String DetectorArtifact = "111214\\DCM";

  /** (111217, DCM, "Electrical failure") */
  public static final String ElectricalFailure = "111217\\DCM";

  /** (111191, DCM, "Flash doesn't include cassette/screen/detector identification") */
  public static final String FlashDoesnotIncludeCassetteScreenDetectorIdentification = "111191\\DCM";

  /** (111188, DCM, "Flash doesn't include date of examination") */
  public static final String FlashDoesnotIncludeDateOfExamination = "111188\\DCM";

  /** (111189, DCM, "Flash doesn't include facility name and location") */
  public static final String FlashDoesnotIncludeFacilityNameAndLocation = "111189\\DCM";

  /** (111192, DCM, "Flash doesn't include mammography unit identification") */
  public static final String FlashDoesnotIncludeMammographyUnitIdentification = "111192\\DCM";

  /** (111187, DCM, "Flash doesn't include patient name and additional patient id") */
  public static final String FlashDoesnotIncludePatientNameAndAdditionalPatientId = "111187\\DCM";

  /** (111190, DCM, "Flash doesn't include technologist identification") */
  public static final String FlashDoesnotIncludeTechnologistIdentification = "111190\\DCM";

  /** (111186, DCM, "Flash is illegible, does not fit, or is lopsided") */
  public static final String FlashIsIllegibleDoesNotFitOrIsLopsided = "111186\\DCM";

  /** (111185, DCM, "Flash is not near edge of film") */
  public static final String FlashIsNotNearEdgeOfFilm = "111185\\DCM";

  /** (111208, DCM, "Grid artifact(s)") */
  public static final String GridArtifact = "111208\\DCM";

  /** (111196, DCM, "Inadequate compression") */
  public static final String InadequateCompression = "111196\\DCM";

  /** (111219, DCM, "Inappropriate image processing") */
  public static final String InappropriateImageProcessing = "111219\\DCM";

  /** (111206, DCM, "Insufficient implant displacement incorrect") */
  public static final String InsufficientImplantDisplacementIncorrect = "111206\\DCM";

  /** (111216, DCM, "Mechanical failure") */
  public static final String MechanicalFailure = "111216\\DCM";

  /** (111200, DCM, "MLO Evidence of motion blur") */
  public static final String MLOEvidenceOfMotionBlur = "111200\\DCM";

  /** (111201, DCM, "MLO Inframammary fold is not open") */
  public static final String MLOInframammaryFoldIsNotOpen = "111201\\DCM";

  /** (111197, DCM, "MLO Insufficient pectoral muscle") */
  public static final String MLOInsufficientPectoralMuscle = "111197\\DCM";

  /** (111198, DCM, "MLO No fat is visualized posterior to fibroglandular tissues") */
  public static final String MLONoFatIsVisualizedPosteriorToFibroglandularTissues = "111198\\DCM";

  /** (111199, DCM, "MLO Poor separation of deep and superficial breast tissues") */
  public static final String MLOPoorSeparationOfDeepAndSuperficialBreastTissues = "111199\\DCM";

  /** (111210, DCM, "Motion blur") */
  public static final String MotionBlur = "111210\\DCM";

  /** (111205, DCM, "Nipple not in profile") */
  public static final String NippleNotInProfile = "111205\\DCM";

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

  /** (111194, DCM, "Technical factors missing") */
  public static final String TechnicalFactorsMissing = "111194\\DCM";

  /** (111211, DCM, "Under exposed") */
  public static final String UnderExposed = "111211\\DCM";

  /** (111221, DCM, "Unknown failure") */
  public static final String UnknownFailure = "111221\\DCM";

  /** (111179, DCM, "View and Laterality Marker does not have approved codes") */
  public static final String ViewAndLateralityMarkerDoesNotHaveApprovedCodes = "111179\\DCM";

  /** (111178, DCM, "View and Laterality Marker does not have both view and laterality") */
  public static final String ViewAndLateralityMarkerDoesNotHaveBothViewAndLaterality = "111178\\DCM";

  /** (111183, DCM, "View and Laterality Marker is incorrect") */
  public static final String ViewAndLateralityMarkerIsIncorrect = "111183\\DCM";

  /** (111177, DCM, "View and Laterality Marker is missing") */
  public static final String ViewAndLateralityMarkerIsMissing = "111177\\DCM";

  /** (111180, DCM, "View and Laterality Marker is not near the axilla") */
  public static final String ViewAndLateralityMarkerIsNotNearTheAxilla = "111180\\DCM";

  /** (111184, DCM, "View and Laterality Marker is off image") */
  public static final String ViewAndLateralityMarkerIsOffImage = "111184\\DCM";

  /** (111182, DCM, "View and Laterality Marker is partially obscured") */
  public static final String ViewAndLateralityMarkerIsPartiallyObscured = "111182\\DCM";

  /** (111181, DCM, "View and Laterality Marker overlaps breast tissue") */
  public static final String ViewAndLateralityMarkerOverlapsBreastTissue = "111181\\DCM";
}
