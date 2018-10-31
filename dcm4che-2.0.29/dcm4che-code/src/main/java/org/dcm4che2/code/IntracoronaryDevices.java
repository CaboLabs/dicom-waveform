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
 * CID 3411 Intracoronary Devices.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class IntracoronaryDevices {

  /** (A-040ED, SRT, "Brachytherapy Device") */
  public static final String BrachytherapyDevice = "A-040ED\\SRT";

  /** (R-002F0, SRT, "Cutting Balloon Angioplasty (CBA) Device") */
  public static final String CuttingBalloonAngioplastyCBADevice = "R-002F0\\SRT";

  /** (R-002FD, SRT, "Directional Coronary Atherectomy (DCA) Device") */
  public static final String DirectionalCoronaryAtherectomyDCADevice = "R-002FD\\SRT";

  /** (R-00310, SRT, "Intracoronary Doppler guide wire") */
  public static final String IntracoronaryDopplerGuideWire = "R-00310\\SRT";

  /** (R-00311, SRT, "Intracoronary pressure guide wire") */
  public static final String IntracoronaryPressureGuideWire = "R-00311\\SRT";

  /** (R-00312, SRT, "Intravascular Ultrasound (IVUS) Device") */
  public static final String IntravascularUltrasoundIVUSDevice = "R-00312\\SRT";

  /** (A-81080, SRT, "Laser") */
  public static final String Laser = "A-81080\\SRT";

  /** (A-26912, SRT, "Percutaneous Transluminal Angioplasty Balloon") */
  public static final String PercutaneousTransluminalAngioplastyBalloon = "A-26912\\SRT";

  /** (R-00361, SRT, "Radiofrequency Ablation Device") */
  public static final String RadiofrequencyAblationDevice = "R-00361\\SRT";

  /** (A-25610, SRT, "Rotational Atherectomy Device") */
  public static final String RotationalAtherectomyDevice = "A-25610\\SRT";

  /** (R-0036F, SRT, "Saline Thrombectomy") */
  public static final String SalineThrombectomy = "R-0036F\\SRT";

  /** (A-25500, SRT, "Stent") */
  public static final String Stent = "A-25500\\SRT";

  /** (A-26920, SRT, "Transluminal Extraction Catheter (TEC)") */
  public static final String TransluminalExtractionCatheterTEC = "A-26920\\SRT";
}
