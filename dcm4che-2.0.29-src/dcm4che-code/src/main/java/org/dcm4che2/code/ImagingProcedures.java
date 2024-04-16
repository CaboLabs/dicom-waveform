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
 * CID 3428 Imaging Procedures.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision: 13559 $ $Date: 2010-06-16 11:56:08 +0200 (Mi, 16 Jun 2010) $
 * @since Jun 2, 2010
 */
public class ImagingProcedures {

  /** (P5-009A0, SRT, "Angiography") */
  public static final String Angiography = "P5-009A0\\SRT";

  /** (P5-32130, SRT, "Aortography") */
  public static final String Aortography = "P5-32130\\SRT";

  /** (122058, DCM, "Arterial conduit angiography") */
  public static final String ArterialConduitAngiography = "122058\\DCM";

  /** (P5-30107, SRT, "Bypass graft angiography") */
  public static final String BypassGraftAngiography = "P5-30107\\SRT";

  /** (P5-3003A, SRT, "Cardiac ventriculography") */
  public static final String CardiacVentriculography = "P5-3003A\\SRT";

  /** (P5-30100, SRT, "Coronary Arteriography") */
  public static final String CoronaryArteriography = "P5-30100\\SRT";

  /** (P5-B3004, SRT, "Epicardial echocardiography") */
  public static final String EpicardialEchocardiography = "P5-B3004\\SRT";

  /** (P5-B3006, SRT, "Intracardiac echocardiography") */
  public static final String IntracardiacEchocardiography = "P5-B3006\\SRT";

  /** (P5-B001D, SRT, "Intravascular ultrasound") */
  public static final String IntravascularUltrasound = "P5-B001D\\SRT";

  /** (P5-30041, SRT, "Left Ventriculography") */
  public static final String LeftVentriculography = "P5-30041\\SRT";

  /** (P5-3003F, SRT, "Right Ventriculography") */
  public static final String RightVentriculography = "P5-3003F\\SRT";

  /** (P5-B3002, SRT, "Transesophageal echocardiography") */
  public static final String TransesophagealEchocardiography = "P5-B3002\\SRT";

  /** (P5-B3003, SRT, "Transthoracic echocardiography") */
  public static final String TransthoracicEchocardiography = "P5-B3003\\SRT";
}
