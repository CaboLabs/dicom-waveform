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
 * CID 6142 Calculated Value.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class CalculatedValue {

  /** (112196, DCM, "Area of Vascular Calcification") */
  public static final String AreaOfVascularCalcification = "112196\\DCM";

  /** (112200, DCM, "Average calcification distance in a calcification cluster") */
  public static final String AverageCalcificationDistanceInACalcificationCluster = "112200\\DCM";

  /** (112191, DCM, "Breast tissue density") */
  public static final String BreastTissueDensity = "112191\\DCM";

  /** (112018, DCM, "Calcification extent as percent of surface") */
  public static final String CalcificationExtentAsPercentOfSurface = "112018\\DCM";

  /** (112019, DCM, "Calcification extent as percent of volume") */
  public static final String CalcificationExtentAsPercentOfVolume = "112019\\DCM";

  /** (112058, DCM, "Calcium score") */
  public static final String CalciumScore = "112058\\DCM";

  /** (112017, DCM, "Cavity extent as percent of volume") */
  public static final String CavityExtentAsPercentOfVolume = "112017\\DCM";

  /** (112195, DCM, "Mass of breast") */
  public static final String MassOfBreast = "112195\\DCM";

  /** (112194, DCM, "Mass of parenchymal tissue") */
  public static final String MassOfParenchymalTissue = "112194\\DCM";

  /** (112199, DCM, "Mass of Vascular Calcification") */
  public static final String MassOfVascularCalcification = "112199\\DCM";

  /** (112198, DCM, "Percentage of Vascular Calcification") */
  public static final String PercentageOfVascularCalcification = "112198\\DCM";

  /** (112201, DCM, "Standard deviation distance of calcifications in a cluster") */
  public static final String StandardDeviationDistanceOfCalcificationsInACluster = "112201\\DCM";

  /** (112193, DCM, "Volume of breast") */
  public static final String VolumeOfBreast = "112193\\DCM";

  /** (112192, DCM, "Volume of parenchymal tissue") */
  public static final String VolumeOfParenchymalTissue = "112192\\DCM";

  /** (112197, DCM, "Volume of Vascular Calcification") */
  public static final String VolumeOfVascularCalcification = "112197\\DCM";
}
