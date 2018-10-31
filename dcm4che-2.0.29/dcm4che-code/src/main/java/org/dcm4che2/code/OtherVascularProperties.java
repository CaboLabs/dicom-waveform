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
 * CID 12122 Other Vascular Properties.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class OtherVascularProperties {

  /** (20168-1, LN, "Acceleration Time") */
  public static final String AccelerationTime = "20168-1\\LN";

  /** (20217-6, LN, "Deceleration Time") */
  public static final String DecelerationTime = "20217-6\\LN";

  /** (R-1025F, SRT, "Length of Segment") */
  public static final String LengthOfSegment = "R-1025F\\SRT";

  /** (20256-4, LN, "Mean Gradient") */
  public static final String MeanGradient = "20256-4\\LN";

  /** (20247-3, LN, "Peak Gradient") */
  public static final String PeakGradient = "20247-3\\LN";

  /** (R-1025E, SRT, "Vessel depth from surface") */
  public static final String VesselDepthFromSurface = "R-1025E\\SRT";

  /** (R-1025D, SRT, "Vessel Intimal Cross-Sectional Area") */
  public static final String VesselIntimalCrossSectionalArea = "R-1025D\\SRT";

  /** (R-1025C, SRT, "Vessel Intimal Diameter") */
  public static final String VesselIntimalDiameter = "R-1025C\\SRT";

  /** (G-0366, SRT, "Vessel lumen cross-sectional area") */
  public static final String VesselLumenCrossSectionalArea = "G-0366\\SRT";

  /** (G-0364, SRT, "Vessel lumen diameter") */
  public static final String VesselLumenDiameter = "G-0364\\SRT";

  /** (G-0365, SRT, "Vessel outside diameter") */
  public static final String VesselOutsideDiameter = "G-0365\\SRT";

  /** (33878-0, LN, "Volume flow") */
  public static final String VolumeFlow = "33878-0\\LN";
}
