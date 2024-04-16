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
 * CID 6067 Fluid Color.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class FluidColor {

  /** (G-A12C, SRT, "Black color") */
  public static final String BlackColor = "G-A12C\\SRT";

  /** (111454, DCM, "Blood tinged color") */
  public static final String BloodTingedColor = "111454\\DCM";

  /** (111453, DCM, "Bright red color") */
  public static final String BrightRedColor = "111453\\DCM";

  /** (G-A12E, SRT, "Brown color") */
  public static final String BrownColor = "G-A12E\\SRT";

  /** (R-4205B, SRT, "Clear") */
  public static final String Clear = "R-4205B\\SRT";

  /** (111452, DCM, "Dark brown color") */
  public static final String DarkBrownColor = "111452\\DCM";

  /** (111451, DCM, "Dark red color") */
  public static final String DarkRedColor = "111451\\DCM";

  /** (G-A12D, SRT, "Gray color") */
  public static final String GrayColor = "G-A12D\\SRT";

  /** (G-A11E, SRT, "Green color") */
  public static final String GreenColor = "G-A11E\\SRT";

  /** (111450, DCM, "Light brown color") */
  public static final String LightBrownColor = "111450\\DCM";

  /** (G-A12B, SRT, "White color") */
  public static final String WhiteColor = "G-A12B\\SRT";

  /** (G-A11D, SRT, "Yellow color") */
  public static final String YellowColor = "G-A11D\\SRT";
}
