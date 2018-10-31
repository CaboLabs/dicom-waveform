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
 * CID 3484 IVUS Indices and Ratios.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class IVUSIndicesAndRatios {

  /** (122352, DCM, "EEM Diameter Ratio") */
  public static final String EEMDiameterRatio = "122352\\DCM";

  /** (122350, DCM, "Lumen Diameter Ratio") */
  public static final String LumenDiameterRatio = "122350\\DCM";

  /** (122343, DCM, "Lumen Eccentricity Index") */
  public static final String LumenEccentricityIndex = "122343\\DCM";

  /** (122348, DCM, "Lumen Shape Index") */
  public static final String LumenShapeIndex = "122348\\DCM";

  /** (122344, DCM, "Plaque plus Media Eccentricity Index") */
  public static final String PlaquePlusMediaEccentricityIndex = "122344\\DCM";

  /** (122345, DCM, "Remodeling Index") */
  public static final String RemodelingIndex = "122345\\DCM";

  /** (122351, DCM, "Stent Diameter Ratio") */
  public static final String StentDiameterRatio = "122351\\DCM";

  /** (122347, DCM, "Stent Expansion Index") */
  public static final String StentExpansionIndex = "122347\\DCM";

  /** (122346, DCM, "Stent Symmetry Index") */
  public static final String StentSymmetryIndex = "122346\\DCM";
}
