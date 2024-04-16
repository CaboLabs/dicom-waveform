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
 * CID 4015 View Modifier for Mammography.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ViewModifierForMammography {

  /** (P2-00161, SRT, "Anterior compression") */
  public static final String AnteriorCompression = "P2-00161\\SRT";

  /** (R-102D1, SRT, "Axillary Tail") */
  public static final String AxillaryTail = "R-102D1\\SRT";

  /** (R-40AB2, SRT, "Axillary tissue") */
  public static final String AxillaryTissue = "R-40AB2\\SRT";

  /** (R-102D2, SRT, "Cleavage") */
  public static final String Cleavage = "R-102D2\\SRT";

  /** (R-102D5, SRT, "Implant Displaced") */
  public static final String ImplantDisplaced = "R-102D5\\SRT";

  /** (R-40ABE, SRT, "Infra-mammary fold") */
  public static final String InfraMammaryFold = "R-40ABE\\SRT";

  /** (R-102D6, SRT, "Magnification") */
  public static final String Magnification = "R-102D6\\SRT";

  /** (R-40AB3, SRT, "Nipple in profile") */
  public static final String NippleInProfile = "R-40AB3\\SRT";

  /** (R-102CA, SRT, "Rolled Inferior") */
  public static final String RolledInferior = "R-102CA\\SRT";

  /** (R-102D3, SRT, "Rolled Lateral") */
  public static final String RolledLateral = "R-102D3\\SRT";

  /** (R-102D4, SRT, "Rolled Medial") */
  public static final String RolledMedial = "R-102D4\\SRT";

  /** (R-102C9, SRT, "Rolled Superior") */
  public static final String RolledSuperior = "R-102C9\\SRT";

  /** (R-102D7, SRT, "Spot Compression") */
  public static final String SpotCompression = "R-102D7\\SRT";

  /** (R-102C2, SRT, "Tangential") */
  public static final String Tangential = "R-102C2\\SRT";
}
