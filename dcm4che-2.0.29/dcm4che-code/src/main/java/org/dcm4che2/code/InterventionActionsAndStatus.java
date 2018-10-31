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
 * CID 3412 Intervention Actions and Status.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class InterventionActionsAndStatus {

  /** (122304, DCM, "Angioplasty balloon deflated") */
  public static final String AngioplastyBalloonDeflated = "122304\\DCM";

  /** (122303, DCM, "Angioplasty balloon inflated") */
  public static final String AngioplastyBalloonInflated = "122303\\DCM";

  /** (122305, DCM, "Device deployed") */
  public static final String DeviceDeployed = "122305\\DCM";

  /** (122302, DCM, "Guidewire crossing lesion successful") */
  public static final String GuidewireCrossingLesionSuccessful = "122302\\DCM";

  /** (122301, DCM, "Guidewire crossing lesion unsuccessful") */
  public static final String GuidewireCrossingLesionUnsuccessful = "122301\\DCM";

  /** (122311, DCM, "Interventional device placed") */
  public static final String InterventionalDevicePlaced = "122311\\DCM";

  /** (122310, DCM, "Interventional device placement unsuccessful") */
  public static final String InterventionalDevicePlacementUnsuccessful = "122310\\DCM";

  /** (122313, DCM, "Interventional device withdrawn") */
  public static final String InterventionalDeviceWithdrawn = "122313\\DCM";

  /** (122312, DCM, "Intervention performed") */
  public static final String InterventionPerformed = "122312\\DCM";

  /** (122307, DCM, "Object removed") */
  public static final String ObjectRemoved = "122307\\DCM";

  /** (122308, DCM, "Radiation applied") */
  public static final String RadiationApplied = "122308\\DCM";

  /** (122309, DCM, "Radiation removed") */
  public static final String RadiationRemoved = "122309\\DCM";

  /** (122306, DCM, "Stent re-expanded") */
  public static final String StentReExpanded = "122306\\DCM";
}
