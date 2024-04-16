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
 * CID 3001 ECG Leads.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ECGLeads {

  /** (2:127, MDC, "Auxiliary bipolar lead 1") */
  public static final String AuxiliaryBipolarLead1 = "2:127\\MDC";

  /** (2:128, MDC, "Auxiliary bipolar lead 2") */
  public static final String AuxiliaryBipolarLead2 = "2:128\\MDC";

  /** (2:129, MDC, "Auxiliary bipolar lead 3") */
  public static final String AuxiliaryBipolarLead3 = "2:129\\MDC";

  /** (2:130, MDC, "Auxiliary bipolar lead 4") */
  public static final String AuxiliaryBipolarLead4 = "2:130\\MDC";

  /** (2:75, MDC, "Auxiliary unipolar lead 1") */
  public static final String AuxiliaryUnipolarLead1 = "2:75\\MDC";

  /** (2:76, MDC, "Auxiliary unipolar lead 2") */
  public static final String AuxiliaryUnipolarLead2 = "2:76\\MDC";

  /** (2:77, MDC, "Auxiliary unipolar lead 3") */
  public static final String AuxiliaryUnipolarLead3 = "2:77\\MDC";

  /** (2:78, MDC, "Auxiliary unipolar lead 4") */
  public static final String AuxiliaryUnipolarLead4 = "2:78\\MDC";

  /** (2:64, MDC, "aVF, augmented voltage, foot") */
  public static final String AVFAugmentedVoltageFoot = "2:64\\MDC";

  /** (2:63, MDC, "aVL, augmented voltage, left") */
  public static final String AVLAugmentedVoltageLeft = "2:63\\MDC";

  /** (2:65, MDC, "-aVR") */
  public static final String AVR = "2:65\\MDC";

  /** (2:62, MDC, "aVR, augmented voltage, right") */
  public static final String AVRAugmentedVoltageRight = "2:62\\MDC";

  /** (2:148, MDC, "Canine, fifth right intercostal space near edge of sternum") */
  public static final String CanineFifthRightIntercostalSpaceNearEdgeOfSternum = "2:148\\MDC";

  /** (2:151, MDC, "Canine, over dorsal spinous process of 7th thoracic vertebra") */
  public static final String CanineOverDorsalSpinousProcessOf7thThoracicVertebra = "2:151\\MDC";

  /** (2:150, MDC, "Canine, sixth left intercostal space at costochondral junction") */
  public static final String CanineSixthLeftIntercostalSpaceAtCostochondralJunction = "2:150\\MDC";

  /** (2:149, MDC, "Canine, sixth left intercostal space near edge of sternum") */
  public static final String CanineSixthLeftIntercostalSpaceNearEdgeOfSternum = "2:149\\MDC";

  /** (2:26, MDC, "Chest lead") */
  public static final String ChestLead = "2:26\\MDC";

  /** (2:99, MDC, "Chest lead per V1 and V1R placement") */
  public static final String ChestLeadPerV1AndV1RPlacement = "2:99\\MDC";

  /** (2:100, MDC, "Chest lead per V2 and V2R placement") */
  public static final String ChestLeadPerV2AndV2RPlacement = "2:100\\MDC";

  /** (2:101, MDC, "Chest lead per V3 and V3R placement") */
  public static final String ChestLeadPerV3AndV3RPlacement = "2:101\\MDC";

  /** (2:102, MDC, "Chest lead per V4 and V4R placement") */
  public static final String ChestLeadPerV4AndV4RPlacement = "2:102\\MDC";

  /** (2:19, MDC, "Chest lead per V5 and V5R placement") */
  public static final String ChestLeadPerV5AndV5RPlacement = "2:19\\MDC";

  /** (2:103, MDC, "Chest lead per V6 and V6R placement") */
  public static final String ChestLeadPerV6AndV6RPlacement = "2:103\\MDC";

  /** (2:104, MDC, "Chest lead per V7 and V8R placement") */
  public static final String ChestLeadPerV7AndV8RPlacement = "2:104\\MDC";

  /** (2:98, MDC, "Chest lead (symmetric placement)") */
  public static final String ChestLeadSymmetricPlacement = "2:98\\MDC";

  /** (2:105, MDC, "Chest-manubrium lead") */
  public static final String ChestManubriumLead = "2:105\\MDC";

  /** (2:106, MDC, "Chest-manubrium lead per V1 placement") */
  public static final String ChestManubriumLeadPerV1Placement = "2:106\\MDC";

  /** (2:107, MDC, "Chest-manubrium lead per V2 placement") */
  public static final String ChestManubriumLeadPerV2Placement = "2:107\\MDC";

  /** (2:108, MDC, "Chest-manubrium lead per V3 placement") */
  public static final String ChestManubriumLeadPerV3Placement = "2:108\\MDC";

  /** (2:109, MDC, "Chest-manubrium lead per V4 placement") */
  public static final String ChestManubriumLeadPerV4Placement = "2:109\\MDC";

  /** (2:110, MDC, "Chest-manubrium lead per V6 placement") */
  public static final String ChestManubriumLeadPerV6Placement = "2:110\\MDC";

  /** (2:121, MDC, "Chest-manubrium lead per V7 placement") */
  public static final String ChestManubriumLeadPerV7Placement = "2:121\\MDC";

  /** (2:73, MDC, "Defibrillator lead: anterior-lateral") */
  public static final String DefibrillatorLeadAnteriorLateral = "2:73\\MDC";

  /** (2:114, MDC, "Derived Lead aVF") */
  public static final String DerivedLeadAVF = "2:114\\MDC";

  /** (2:113, MDC, "Derived Lead aVL") */
  public static final String DerivedLeadAVL = "2:113\\MDC";

  /** (2:112, MDC, "Derived Lead aVR") */
  public static final String DerivedLeadAVR = "2:112\\MDC";

  /** (2:31, MDC, "Derived Lead I") */
  public static final String DerivedLeadI = "2:31\\MDC";

  /** (2:32, MDC, "Derived Lead II") */
  public static final String DerivedLeadII = "2:32\\MDC";

  /** (2:111, MDC, "Derived Lead III") */
  public static final String DerivedLeadIII = "2:111\\MDC";

  /** (2:33, MDC, "Derived Lead V1") */
  public static final String DerivedLeadV1 = "2:33\\MDC";

  /** (2:34, MDC, "Derived Lead V2") */
  public static final String DerivedLeadV2 = "2:34\\MDC";

  /** (2:35, MDC, "Derived Lead V3") */
  public static final String DerivedLeadV3 = "2:35\\MDC";

  /** (2:36, MDC, "Derived Lead V4") */
  public static final String DerivedLeadV4 = "2:36\\MDC";

  /** (2:37, MDC, "Derived Lead V5") */
  public static final String DerivedLeadV5 = "2:37\\MDC";

  /** (2:38, MDC, "Derived Lead V6") */
  public static final String DerivedLeadV6 = "2:38\\MDC";

  /** (2:133, MDC, "EASI Lead AI") */
  public static final String EASILeadAI = "2:133\\MDC";

  /** (2:132, MDC, "EASI Lead AS") */
  public static final String EASILeadAS = "2:132\\MDC";

  /** (2:131, MDC, "EASI Lead ES") */
  public static final String EASILeadES = "2:131\\MDC";

  /** (2:134, MDC, "EASI upper sternum lead") */
  public static final String EASIUpperSternumLead = "2:134\\MDC";

  /** (2:74, MDC, "External pacing lead: anterior-posterior") */
  public static final String ExternalPacingLeadAnteriorPosterior = "2:74\\MDC";

  /** (2:27, MDC, "Frank Lead A") */
  public static final String FrankLeadA = "2:27\\MDC";

  /** (2:25, MDC, "Frank Lead E") */
  public static final String FrankLeadE = "2:25\\MDC";

  /** (2:29, MDC, "Frank Lead F") */
  public static final String FrankLeadF = "2:29\\MDC";

  /** (2:30, MDC, "Frank Lead H") */
  public static final String FrankLeadH = "2:30\\MDC";

  /** (2:24, MDC, "Frank Lead I") */
  public static final String FrankLeadI = "2:24\\MDC";

  /** (2:28, MDC, "Frank Lead M") */
  public static final String FrankLeadM = "2:28\\MDC";

  /** (2:71, MDC, "Lead A (Nehb - Anterior)") */
  public static final String LeadANehbAnterior = "2:71\\MDC";

  /** (2:122, MDC, "Lead CH5") */
  public static final String LeadCH5 = "2:122\\MDC";

  /** (2:125, MDC, "Lead CR5") */
  public static final String LeadCR5 = "2:125\\MDC";

  /** (2:70, MDC, "Lead D (Nehb - Dorsal)") */
  public static final String LeadDNehbDorsal = "2:70\\MDC";

  /** (2:1, MDC, "Lead I") */
  public static final String LeadI = "2:1\\MDC";

  /** (2:2, MDC, "Lead II") */
  public static final String LeadII = "2:2\\MDC";

  /** (2:3, MDC, "Lead III") */
  public static final String LeadIII = "2:3\\MDC";

  /** (2:72, MDC, "Lead J (Nehb - Inferior)") */
  public static final String LeadJNehbInferior = "2:72\\MDC";

  /** (2:4, MDC, "Lead V2") */
  public static final String LeadV2 = "2:4\\MDC";

  /** (2:10, MDC, "Lead V2R") */
  public static final String LeadV2R = "2:10\\MDC";

  /** (2:5, MDC, "Lead V3") */
  public static final String LeadV3 = "2:5\\MDC";

  /** (2:11, MDC, "Lead V3R") */
  public static final String LeadV3R = "2:11\\MDC";

  /** (2:6, MDC, "Lead V4") */
  public static final String LeadV4 = "2:6\\MDC";

  /** (2:12, MDC, "Lead V4R") */
  public static final String LeadV4R = "2:12\\MDC";

  /** (2:7, MDC, "Lead V5") */
  public static final String LeadV5 = "2:7\\MDC";

  /** (2:13, MDC, "Lead V5R") */
  public static final String LeadV5R = "2:13\\MDC";

  /** (2:8, MDC, "Lead V6") */
  public static final String LeadV6 = "2:8\\MDC";

  /** (2:14, MDC, "Lead V6R") */
  public static final String LeadV6R = "2:14\\MDC";

  /** (2:9, MDC, "Lead V7") */
  public static final String LeadV7 = "2:9\\MDC";

  /** (2:15, MDC, "Lead V7R") */
  public static final String LeadV7R = "2:15\\MDC";

  /** (2:66, MDC, "Lead V8") */
  public static final String LeadV8 = "2:66\\MDC";

  /** (2:68, MDC, "Lead V8R") */
  public static final String LeadV8R = "2:68\\MDC";

  /** (2:67, MDC, "Lead V9") */
  public static final String LeadV9 = "2:67\\MDC";

  /** (2:69, MDC, "Lead V9R") */
  public static final String LeadV9R = "2:69\\MDC";

  /** (2:90, MDC, "Lead VF, nonaugmented voltage, vector of LL") */
  public static final String LeadVFNonaugmentedVoltageVectorOfLL = "2:90\\MDC";

  /** (2:89, MDC, "Lead VL, nonaugmented voltage, vector of LA") */
  public static final String LeadVLNonaugmentedVoltageVectorOfLA = "2:89\\MDC";

  /** (2:88, MDC, "Lead VR, nonaugmented voltage, vector of RA") */
  public static final String LeadVRNonaugmentedVoltageVectorOfRA = "2:88\\MDC";

  /** (2:16, MDC, "Lead X") */
  public static final String LeadX = "2:16\\MDC";

  /** (2:17, MDC, "Lead Y") */
  public static final String LeadY = "2:17\\MDC";

  /** (2:18, MDC, "Lead Z") */
  public static final String LeadZ = "2:18\\MDC";

  /** (2:21, MDC, "Left Arm Lead") */
  public static final String LeftArmLead = "2:21\\MDC";

  /** (2:23, MDC, "Left Leg Lead") */
  public static final String LeftLegLead = "2:23\\MDC";

  /** (2:91, MDC, "Modified chest lead (left arm indifferent)") */
  public static final String ModifiedChestLeadLeftArmIndifferent = "2:91\\MDC";

  /** (2:92, MDC, "Modified chest lead per V1 placement") */
  public static final String ModifiedChestLeadPerV1Placement = "2:92\\MDC";

  /** (2:93, MDC, "Modified chest lead per V2 placement") */
  public static final String ModifiedChestLeadPerV2Placement = "2:93\\MDC";

  /** (2:94, MDC, "Modified chest lead per V3 placement") */
  public static final String ModifiedChestLeadPerV3Placement = "2:94\\MDC";

  /** (2:95, MDC, "Modified chest lead per V4 placement") */
  public static final String ModifiedChestLeadPerV4Placement = "2:95\\MDC";

  /** (2:96, MDC, "Modified chest lead per V5 placement") */
  public static final String ModifiedChestLeadPerV5Placement = "2:96\\MDC";

  /** (2:97, MDC, "Modified chest lead per V6 placement") */
  public static final String ModifiedChestLeadPerV6Placement = "2:97\\MDC";

  /** (2:126, MDC, "Modified limb lead") */
  public static final String ModifiedLimbLead = "2:126\\MDC";

  /** (2:124, MDC, "negative: low right scapula Lead") */
  public static final String NegativeLowRightScapulaLead = "2:124\\MDC";

  /** (2:123, MDC, "negative: right infraclavicular fossa") */
  public static final String NegativeRightInfraclavicularFossa = "2:123\\MDC";

  /** (2:87, MDC, "Precordial lead") */
  public static final String PrecordialLead = "2:87\\MDC";

  /** (2:22, MDC, "Right Arm Lead") */
  public static final String RightArmLead = "2:22\\MDC";

  /** (2:147, MDC, "Right Leg Lead") */
  public static final String RightLegLead = "2:147\\MDC";

  /** (2:0, MDC, "Unspecified lead") */
  public static final String UnspecifiedLead = "2:0\\MDC";
}
