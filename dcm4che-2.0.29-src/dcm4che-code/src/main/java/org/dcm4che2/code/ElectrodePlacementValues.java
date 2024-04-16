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
 * CID 3263 Electrode Placement Values.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ElectrodePlacementValues {

  /** (10:11277, MDC, "Bipolar uncorrected XYZ lead system") */
  public static final String BipolarUncorrectedXYZLeadSystem = "10:11277\\MDC";

  /** (10:11276, MDC, "Cube XYZ lead system") */
  public static final String CubeXYZLeadSystem = "10:11276\\MDC";

  /** (10:11274, MDC, "Frank XYZ lead system") */
  public static final String FrankXYZLeadSystem = "10:11274\\MDC";

  /** (10:11266, MDC, "Mason-Likar lead positions, electrodes placed individually") */
  public static final String MasonLikarLeadPositionsElectrodesPlacedIndividually = "10:11266\\MDC";

  /** (10:11267, MDC, "Mason-Likar lead positions, V1-V6 in electrode pad") */
  public static final String MasonLikarLeadPositionsV1V6InElectrodePad = "10:11267\\MDC";

  /** (10:11275, MDC, "McFee-Parungao XYZ lead system") */
  public static final String McFeeParungaoXYZLeadSystem = "10:11275\\MDC";

  /** (10:11280, MDC, "NEHB lead system") */
  public static final String NEHBLeadSystem = "10:11280\\MDC";

  /** (10:11278, MDC, "Pseudo-orthogonal XYZ lead system") */
  public static final String PseudoOrthogonalXYZLeadSystem = "10:11278\\MDC";

  /** (10:11288, MDC, "Standard 12-lead and CC5-CM5-ML") */
  public static final String Standard12LeadAndCC5CM5ML = "10:11288\\MDC";

  /** (10:11289, MDC, "Standard 12-lead and CM5-CC5-CH5") */
  public static final String Standard12LeadAndCM5CC5CH5 = "10:11289\\MDC";

  /** (10:11287, MDC, "Standard 12-lead and NEHB") */
  public static final String Standard12LeadAndNEHB = "10:11287\\MDC";

  /** (10:11286, MDC, "Standard 12-lead and XYZ") */
  public static final String Standard12LeadAndXYZ = "10:11286\\MDC";

  /** (10:11292, MDC, "Standard 12-lead extended to the left by V7, V8, V9") */
  public static final String Standard12LeadExtendedToTheLeftByV7V8V9 = "10:11292\\MDC";

  /** (10:11291, MDC, "Standard 12-lead extended to the right by V5R, V4R, V3R") */
  public static final String Standard12LeadExtendedToTheRightByV5RV4RV3R = "10:11291\\MDC";

  /** (10:11265, MDC, "Standard 12-lead positions, electrodes placed individually") */
  public static final String Standard12LeadPositionsElectrodesPlacedIndividually = "10:11265\\MDC";

  /** (10:11272, MDC, "Standard 12-lead positions one intercostal space higher") */
  public static final String Standard12LeadPositionsOneIntercostalSpaceHigher = "10:11272\\MDC";

  /** (10:11290, MDC, "Standard 12-lead with extra leads to the right and/or left sides") */
  public static final String Standard12LeadWithExtraLeadsToTheRightAndOrLeftSides = "10:11290\\MDC";

  /** (10:11282, MDC, "3-lead system, CC5-CM5-CH5") */
  public static final String ThreeLeadSystemCC5CM5CH5 = "10:11282\\MDC";

  /** (10:11281, MDC, "3-lead system, CC5-CM5-ML") */
  public static final String ThreeLeadSystemCC5CM5ML = "10:11281\\MDC";

  /** (10:11269, MDC, "12-lead derived from Frank XYZ leads") */
  public static final String TwelveLeadDerivedFromFrankXYZLeads = "10:11269\\MDC";

  /** (10:11270, MDC, "12-lead derived from non-standard leads") */
  public static final String TwelveLeadDerivedFromNonStandardLeads = "10:11270\\MDC";

  /** (10:11268, MDC, "12-lead electrode pad") */
  public static final String TwelveLeadElectrodePad = "10:11268\\MDC";

  /** (10:11271, MDC, "12-lead for bicycle exercise testing, limb leads on back of patient") */
  public static final String TwelveLeadForBicycleExerciseTestingLimbLeadsOnBackOfPatient = "10:11271\\MDC";

  /** (10:11284, MDC, "12-lead from EASI leads (ES, AS, AI) by Dower/EASI transformation") */
  public static final String TwelveLeadFromEASILeadsESASAIByDowerEASITransformation = "10:11284\\MDC";

  /** (10:11283, MDC, "12-lead from Frank leads XYZ leads by Dower transformation") */
  public static final String TwelveLeadFromFrankLeadsXYZLeadsByDowerTransformation = "10:11283\\MDC";

  /** (10:11285, MDC, "12-lead from Limb Leads (I, II) and one or more V leads") */
  public static final String TwelveLeadFromLimbLeadsIIIAndOneOrMoreVLeads = "10:11285\\MDC";

  /** (10:11264, MDC, "Unspecified 12-lead system") */
  public static final String Unspecified12LeadSystem = "10:11264\\MDC";

  /** (10:11273, MDC, "Unspecified XYZ lead system") */
  public static final String UnspecifiedXYZLeadSystem = "10:11273\\MDC";

  /** (10:11279, MDC, "XYZ leads derived from standard 12-lead") */
  public static final String XYZLeadsDerivedFromStandard12Lead = "10:11279\\MDC";
}
