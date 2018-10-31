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
 * CID 6029 Recommended Follow-up from BI-RADS.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class RecommendedFollowUpFromBIRADS {

  /** (111135, DCM, "Additional projections") */
  public static final String AdditionalProjections = "111135\\DCM";

  /** (111141, DCM, "Any decision to biopsy should be based on clinical assessment") */
  public static final String AnyDecisionToBiopsyShouldBeBasedOnClinicalAssessment = "111141\\DCM";

  /** (111143, DCM, "Biopsy should be considered") */
  public static final String BiopsyShouldBeConsidered = "111143\\DCM";

  /** (111148, DCM, "Biopsy should be strongly considered") */
  public static final String BiopsyShouldBeStronglyConsidered = "111148\\DCM";

  /** (111147, DCM, "Cytologic analysis") */
  public static final String CytologicAnalysis = "111147\\DCM";

  /** (111142, DCM, "Follow-up at short interval (1-11 months)") */
  public static final String FollowUpAtShortInterval111Months = "111142\\DCM";

  /** (111149, DCM, "Highly suggestive of malignancy - take appropriate action") */
  public static final String HighlySuggestiveOfMalignancyTakeAppropriateAction = "111149\\DCM";

  /** (111145, DCM, "Histology using core biopsy") */
  public static final String HistologyUsingCoreBiopsy = "111145\\DCM";

  /** (111122, DCM, "Known biopsy proven malignancy - take appropriate action") */
  public static final String KnownBiopsyProvenMalignancyTakeAppropriateAction = "111122\\DCM";

  /** (R-102D6, SRT, "Magnification views") */
  public static final String MagnificationViews = "R-102D6\\SRT";

  /** (P5-40060, SRT, "Mammary ductogram") */
  public static final String MammaryDuctogram = "P5-40060\\SRT";

  /** (P5-0900D, SRT, "MRI of breast") */
  public static final String MRIOfBreast = "P5-0900D\\SRT";

  /** (111144, DCM, "Needle localization and biopsy") */
  public static final String NeedleLocalizationAndBiopsy = "111144\\DCM";

  /** (111140, DCM, "Normal interval follow-up") */
  public static final String NormalIntervalFollowUp = "111140\\DCM";

  /** (111138, DCM, "Old films for comparison") */
  public static final String OldFilmsForComparison = "111138\\DCM";

  /** (R-102D7, SRT, "Spot compression") */
  public static final String SpotCompression = "R-102D7\\SRT";

  /** (111136, DCM, "Spot magnification view(s)") */
  public static final String SpotMagnificationView = "111136\\DCM";

  /** (111146, DCM, "Suggestive of malignancy - take appropriate action") */
  public static final String SuggestiveOfMalignancyTakeAppropriateAction = "111146\\DCM";

  /** (P5-B0099, SRT, "Ultrasound procedure") */
  public static final String UltrasoundProcedure = "P5-B0099\\SRT";
}
