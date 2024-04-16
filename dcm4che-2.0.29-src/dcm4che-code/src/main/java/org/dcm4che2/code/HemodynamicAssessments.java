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
 * CID 3641 Hemodynamic Assessments.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class HemodynamicAssessments {

  /** (F-31120, SRT, "Diastolic Pressure") */
  public static final String DiastolicPressure = "F-31120\\SRT";

  /** (F-03E0E, SRT, "Left Ventricular End-Diastolic Pressure") */
  public static final String LeftVentricularEndDiastolicPressure = "F-03E0E\\SRT";

  /** (F-03E0D, SRT, "Left Ventricular Systolic Pressure") */
  public static final String LeftVentricularSystolicPressure = "F-03E0D\\SRT";

  /** (F-0212C, SRT, "Pulmonary Artery Pressure") */
  public static final String PulmonaryArteryPressure = "F-0212C\\SRT";

  /** (F-31146, SRT, "Pulmonary Capillary Wedge Pressure") */
  public static final String PulmonaryCapillaryWedgePressure = "F-31146\\SRT";

  /** (F-03E86, SRT, "Pulmonary Vascular Resistance") */
  public static final String PulmonaryVascularResistance = "F-03E86\\SRT";

  /** (F-03DE9, SRT, "Right Atrial Pressure") */
  public static final String RightAtrialPressure = "F-03DE9\\SRT";

  /** (F-03E02, SRT, "Right Ventricular End-Diastolic Pressure") */
  public static final String RightVentricularEndDiastolicPressure = "F-03E02\\SRT";

  /** (F-03DFE, SRT, "Right Ventricular Systolic Pressure") */
  public static final String RightVentricularSystolicPressure = "F-03DFE\\SRT";

  /** (F-39790, SRT, "Vascular Resistance") */
  public static final String VascularResistance = "F-39790\\SRT";
}
