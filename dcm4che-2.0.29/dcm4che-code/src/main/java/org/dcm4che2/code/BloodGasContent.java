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
 * CID 3525 Blood Gas Content.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BloodGasContent {

  /** (10232-7, LN, "Aortic Root Oxygen content") */
  public static final String AorticRootOxygenContent = "10232-7\\LN";

  /** (2026-3, LN, "Arterial Blood Carbon dioxide content") */
  public static final String ArterialBloodCarbonDioxideContent = "2026-3\\LN";

  /** (19218-7, LN, "Arterial Oxygen content") */
  public static final String ArterialOxygenContent = "19218-7\\LN";

  /** (20565-8, LN, "Blood Carbon dioxide content") */
  public static final String BloodCarbonDioxideContent = "20565-8\\LN";

  /** (122185, DCM, "Blood Oxygen content") */
  public static final String BloodOxygenContent = "122185\\DCM";

  /** (10245-9, LN, "Pulmonary Artery Main Oxygen content") */
  public static final String PulmonaryArteryMainOxygenContent = "10245-9\\LN";

  /** (10247-5, LN, "Pulmonary Wedge Oxygen content") */
  public static final String PulmonaryWedgeOxygenContent = "10247-5\\LN";

  /** (2027-1, LN, "Venous Blood Carbon dioxide content") */
  public static final String VenousBloodCarbonDioxideContent = "2027-1\\LN";

  /** (19220-3, LN, "Venous Oxygen content") */
  public static final String VenousOxygenContent = "19220-3\\LN";
}
