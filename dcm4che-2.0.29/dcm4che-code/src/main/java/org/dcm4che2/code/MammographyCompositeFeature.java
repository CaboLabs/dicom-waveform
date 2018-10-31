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
 * CID 6016 Mammography Composite Feature.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class MammographyCompositeFeature {

  /** (F-01795, SRT, "Architectural distortion of breast") */
  public static final String ArchitecturalDistortionOfBreast = "F-01795\\SRT";

  /** (F-01793, SRT, "Asymmetric breast tissue") */
  public static final String AsymmetricBreastTissue = "F-01793\\SRT";

  /** (I.E.6, BI[3.0], "Axillary adenopathy") */
  public static final String AxillaryAdenopathy = "I.E.6\\BI[3.0]";

  /** (T-C4710, SRT, "Axillary lymph node") */
  public static final String AxillaryLymphNode = "T-C4710\\SRT";

  /** (F-01710, SRT, "Breast composition") */
  public static final String BreastComposition = "F-01710\\SRT";

  /** (111100, DCM, "Breast geometry") */
  public static final String BreastGeometry = "111100\\DCM";

  /** (F-01775, SRT, "Calcification Cluster") */
  public static final String CalcificationCluster = "F-01775\\SRT";

  /** (111111, DCM, "Cooper's ligament changes") */
  public static final String CooperLigamentChanges = "111111\\DCM";

  /** (M-36300, SRT, "Edema") */
  public static final String Edema = "M-36300\\SRT";

  /** (F-01792, SRT, "Focal asymmetric breast tissue") */
  public static final String FocalAsymmetricBreastTissue = "F-01792\\SRT";

  /** (111101, DCM, "Image Quality") */
  public static final String ImageQuality = "111101\\DCM";

  /** (F-01776, SRT, "Individual Calcification") */
  public static final String IndividualCalcification = "F-01776\\SRT";

  /** (T-C4351, SRT, "Intra-mammary lymph node") */
  public static final String IntraMammaryLymphNode = "T-C4351\\SRT";

  /** (F-01796, SRT, "Mammographic breast density") */
  public static final String MammographicBreastDensity = "F-01796\\SRT";

  /** (F-01791, SRT, "Mammographic breast mass") */
  public static final String MammographicBreastMass = "F-01791\\SRT";

  /** (111112, DCM, "Mass in the skin") */
  public static final String MassInTheSkin = "111112\\DCM";

  /** (111113, DCM, "Mass on the skin") */
  public static final String MassOnTheSkin = "111113\\DCM";

  /** (T-04100, SRT, "Nipple") */
  public static final String Nipple = "T-04100\\SRT";

  /** (111102, DCM, "Non-lesion") */
  public static final String NonLesion = "111102\\DCM";

  /** (111099, DCM, "Selected region") */
  public static final String SelectedRegion = "111099\\DCM";

  /** (D0-00050, SRT, "Skin lesion") */
  public static final String SkinLesion = "D0-00050\\SRT";

  /** (F-01799, SRT, "Skin retraction of breast") */
  public static final String SkinRetractionOfBreast = "F-01799\\SRT";

  /** (F-0179A, SRT, "Skin thickening of breast") */
  public static final String SkinThickeningOfBreast = "F-0179A\\SRT";

  /** (F-01798, SRT, "Trabecular thickening of breast") */
  public static final String TrabecularThickeningOfBreast = "F-01798\\SRT";

  /** (F-01797, SRT, "Tubular density") */
  public static final String TubularDensity = "F-01797\\SRT";
}
