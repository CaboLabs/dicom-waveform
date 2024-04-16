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
 * CID 3712 Vessel Descriptors.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class VesselDescriptors {

  /** (R-002CE, SRT, "Aneurysmal") */
  public static final String Aneurysmal = "R-002CE\\SRT";

  /** (R-002E2, SRT, "Bifurcation") */
  public static final String Bifurcation = "R-002E2\\SRT";

  /** (G-A264, SRT, "Calcified") */
  public static final String Calcified = "G-A264\\SRT";

  /** (R-002EF, SRT, "Culprit") */
  public static final String Culprit = "R-002EF\\SRT";

  /** (R-002FC, SRT, "Diffuse Disease") */
  public static final String DiffuseDisease = "R-002FC\\SRT";

  /** (R-10051, SRT, "Ectatic") */
  public static final String Ectatic = "R-10051\\SRT";

  /** (R-00314, SRT, "Luminal Irregularities") */
  public static final String LuminalIrregularities = "R-00314\\SRT";

  /** (R-411C5, SRT, "Muscle Bridge") */
  public static final String MuscleBridge = "R-411C5\\SRT";

  /** (R-0036B, SRT, "Restenotic") */
  public static final String Restenotic = "R-0036B\\SRT";

  /** (R-10050, SRT, "Stenotic") */
  public static final String Stenotic = "R-10050\\SRT";

  /** (R-10049, SRT, "Stented") */
  public static final String Stented = "R-10049\\SRT";

  /** (M-35100, SRT, "Thrombus") */
  public static final String Thrombus = "M-35100\\SRT";

  /** (R-10048, SRT, "Tortuous") */
  public static final String Tortuous = "R-10048\\SRT";

  /** (R-00389, SRT, "Ulcerated") */
  public static final String Ulcerated = "R-00389\\SRT";
}
