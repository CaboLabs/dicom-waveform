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
 * CID 3019 Cardiovascular Anatomic Location Modifiers.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class CardiovascularAnatomicLocationModifiers {

  /** (122101, DCM, "Aneurysm on cited vessel") */
  public static final String AneurysmOnCitedVessel = "122101\\DCM";

  /** (G-A105, SRT, "Anterior") */
  public static final String Anterior = "G-A105\\SRT";

  /** (G-D873, SRT, "Arterial graft to cited segment") */
  public static final String ArterialGraftToCitedSegment = "G-D873\\SRT";

  /** (GA110, SRT, "Central") */
  public static final String Central = "GA110\\SRT";

  /** (G-A119, SRT, "Distal") */
  public static final String Distal = "G-A119\\SRT";

  /** (T-40003, SRT, "Entire Vessel") */
  public static final String EntireVessel = "T-40003\\SRT";

  /** (G-D870, SRT, "Graft to cited segment, body") */
  public static final String GraftToCitedSegmentBody = "G-D870\\SRT";

  /** (G-D872, SRT, "Graft to cited segment, distal anastomosis") */
  public static final String GraftToCitedSegmentDistalAnastomosis = "G-D872\\SRT";

  /** (122104, DCM, "Graft to cited segment, distal section") */
  public static final String GraftToCitedSegmentDistalSection = "122104\\DCM";

  /** (122103, DCM, "Graft to cited segment, mid section") */
  public static final String GraftToCitedSegmentMidSection = "122103\\DCM";

  /** (G-D871, SRT, "Graft to cited segment, proximal anastomosis") */
  public static final String GraftToCitedSegmentProximalAnastomosis = "G-D871\\SRT";

  /** (122102, DCM, "Graft to cited segment, proximal section") */
  public static final String GraftToCitedSegmentProximalSection = "122102\\DCM";

  /** (G-A115, SRT, "Inferior") */
  public static final String Inferior = "G-A115\\SRT";

  /** (G-A104, SRT, "Lateral") */
  public static final String Lateral = "G-A104\\SRT";

  /** (G-A101, SRT, "Left") */
  public static final String Left = "G-A101\\SRT";

  /** (T-3215A, SRT, "Ostium") */
  public static final String Ostium = "T-3215A\\SRT";

  /** (G-A106, SRT, "Posterior") */
  public static final String Posterior = "G-A106\\SRT";

  /** (G-A118, SRT, "Proximal") */
  public static final String Proximal = "G-A118\\SRT";

  /** (G-A100, SRT, "Right") */
  public static final String Right = "G-A100\\SRT";

  /** (G-A116, SRT, "Superior") */
  public static final String Superior = "G-A116\\SRT";

  /** (G-D874, SRT, "Venous graft to cited segment") */
  public static final String VenousGraftToCitedSegment = "G-D874\\SRT";
}
