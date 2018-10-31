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
 * CID 3241 Hemodynamic Measurement Techniques.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class HemodynamicMeasurementTechniques {

  /** (PA-50038, SRT, "Averaged hemodynamic measurement method") */
  public static final String AveragedHemodynamicMeasurementMethod = "PA-50038\\SRT";

  /** (PA-50035, SRT, "Composite hemodynamic measurement method") */
  public static final String CompositeHemodynamicMeasurementMethod = "PA-50035\\SRT";

  /** (PA-50034, SRT, "Computed hemodynamic measurement method") */
  public static final String ComputedHemodynamicMeasurementMethod = "PA-50034\\SRT";

  /** (PA-5003B, SRT, "Conductance catheter method") */
  public static final String ConductanceCatheterMethod = "PA-5003B\\SRT";

  /** (PA-5003C, SRT, "Doppler catheter method") */
  public static final String DopplerCatheterMethod = "PA-5003C\\SRT";

  /** (PA-50031, SRT, "Dual catheter method") */
  public static final String DualCatheterMethod = "PA-50031\\SRT";

  /** (PA-5003D, SRT, "Fiberoptic catheter method") */
  public static final String FiberopticCatheterMethod = "PA-5003D\\SRT";

  /** (PA-50039, SRT, "Fluid filled catheter method") */
  public static final String FluidFilledCatheterMethod = "PA-50039\\SRT";

  /** (PA-5003E, SRT, "Hall catheter method") */
  public static final String HallCatheterMethod = "PA-5003E\\SRT";

  /** (PA-50033, SRT, "Pullback method") */
  public static final String PullbackMethod = "PA-50033\\SRT";

  /** (PA-50032, SRT, "Pulmonary capillary wedge method") */
  public static final String PulmonaryCapillaryWedgeMethod = "PA-50032\\SRT";

  /** (PA-50036, SRT, "Static catheter method") */
  public static final String StaticCatheterMethod = "PA-50036\\SRT";

  /** (PA-5003F, SRT, "Thermistor catheter method") */
  public static final String ThermistorCatheterMethod = "PA-5003F\\SRT";

  /** (PA-5003A, SRT, "Tip manometer method") */
  public static final String TipManometerMethod = "PA-5003A\\SRT";

  /** (PA-50037, SRT, "Wedge method") */
  public static final String WedgeMethod = "PA-50037\\SRT";
}
