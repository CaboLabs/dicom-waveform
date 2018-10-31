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
 * CID 7 Ultrasound Beam Path.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class UltrasoundBeamPath {

  /** (G-D001, SRT, "Trans-abdominal") */
  public static final String TransAbdominal = "G-D001\\SRT";

  /** (G-D033, SRT, "Trans-esophageal") */
  public static final String TransEsophageal = "G-D033\\SRT";

  /** (G-A1B2, SRT, "Trans-gastric") */
  public static final String TransGastric = "G-A1B2\\SRT";

  /** (G-A1A9, SRT, "Trans-hepatic") */
  public static final String TransHepatic = "G-A1A9\\SRT";

  /** (G-A1B3, SRT, "Trans-mural") */
  public static final String TransMural = "G-A1B3\\SRT";

  /** (G-A1A8, SRT, "Trans-orbital") */
  public static final String TransOrbital = "G-A1A8\\SRT";

  /** (G-A1A6, SRT, "Trans-pancreatic") */
  public static final String TransPancreatic = "G-A1A6\\SRT";

  /** (G-A1A5, SRT, "Trans-pleural") */
  public static final String TransPleural = "G-A1A5\\SRT";

  /** (G-A1A4, SRT, "Trans-renal") */
  public static final String TransRenal = "G-A1A4\\SRT";

  /** (G-A1A3, SRT, "Trans-splenic") */
  public static final String TransSplenic = "G-A1A3\\SRT";

  /** (G-D032, SRT, "Trans-temporal") */
  public static final String TransTemporal = "G-D032\\SRT";

  /** (G-A1A2, SRT, "Trans-thecal") */
  public static final String TransThecal = "G-A1A2\\SRT";

  /** (G-D002, SRT, "Trans-vaginal (endovaginal)") */
  public static final String TransVaginalEndovaginal = "G-D002\\SRT";

  /** (G-A1A1, SRT, "Trans-vesical") */
  public static final String TransVesical = "G-A1A1\\SRT";
}
