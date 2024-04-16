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
 * CID 10025 Radiation Dose Reference Points.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class RadiationDoseReferencePoints {

  /** (113865, DCM, "Entrance exposure to a 4.2 cm breast thickness") */
  public static final String EntranceExposureToA4_2CmBreastThickness = "113865\\DCM";

  /** (113860, DCM, "15cm from Isocenter toward Source") */
  public static final String FifteencmFromIsocenterTowardSource = "113860\\DCM";

  /** (113864, DCM, "15cm from Table Centerline") */
  public static final String FifteencmFromTableCenterline = "113864\\DCM";

  /** (113862, DCM, "1cm above Tabletop") */
  public static final String OnecmAboveTabletop = "113862\\DCM";

  /** (113863, DCM, "30cm above Tabletop") */
  public static final String ThirtycmAboveTabletop = "113863\\DCM";

  /** (113861, DCM, "30cm in Front of Image Input Surface") */
  public static final String ThirtycmInFrontOfImageInputSurface = "113861\\DCM";
}
