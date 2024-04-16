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
 * CID 7470 Linear Measurements.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class LinearMeasurements {

  /** (M-02560, SRT, "Circumference") */
  public static final String Circumference = "M-02560\\SRT";

  /** (G-D785, SRT, "Depth") */
  public static final String Depth = "G-D785\\SRT";

  /** (M-02550, SRT, "Diameter") */
  public static final String Diameter = "M-02550\\SRT";

  /** (G-A198, SRT, "Diameter of circumscribed circle") */
  public static final String DiameterOfCircumscribedCircle = "G-A198\\SRT";

  /** (121206, DCM, "Distance") */
  public static final String Distance = "121206\\DCM";

  /** (121207, DCM, "Height") */
  public static final String Height = "121207\\DCM";

  /** (G-A22A, SRT, "Length") */
  public static final String Length = "G-A22A\\SRT";

  /** (G-A185, SRT, "Long Axis") */
  public static final String LongAxis = "G-A185\\SRT";

  /** (G-A193, SRT, "Major Axis") */
  public static final String MajorAxis = "G-A193\\SRT";

  /** (G-A194, SRT, "Minor Axis") */
  public static final String MinorAxis = "G-A194\\SRT";

  /** (121211, DCM, "Path length") */
  public static final String PathLength = "121211\\DCM";

  /** (G-A197, SRT, "Perimeter") */
  public static final String Perimeter = "G-A197\\SRT";

  /** (G-A195, SRT, "Perpendicular Axis") */
  public static final String PerpendicularAxis = "G-A195\\SRT";

  /** (G-A196, SRT, "Radius") */
  public static final String Radius = "G-A196\\SRT";

  /** (G-A186, SRT, "Short Axis") */
  public static final String ShortAxis = "G-A186\\SRT";

  /** (G-A220, SRT, "Width") */
  public static final String Width = "G-A220\\SRT";
}
