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
 * CID 4014 View for Mammography.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ViewForMammography {

  /** (R-10244, SRT, "caudo-cranial (from below)") */
  public static final String CaudoCranialFromBelow = "R-10244\\SRT";

  /** (R-10242, SRT, "cranio-caudal") */
  public static final String CranioCaudal = "R-10242\\SRT";

  /** (R-1024A, SRT, "cranio-caudal exaggerated laterally") */
  public static final String CranioCaudalExaggeratedLaterally = "R-1024A\\SRT";

  /** (R-1024B, SRT, "cranio-caudal exaggerated medially") */
  public static final String CranioCaudalExaggeratedMedially = "R-1024B\\SRT";

  /** (R-40AAA, SRT, "inferomedial to superolateral oblique") */
  public static final String InferomedialToSuperolateralOblique = "R-40AAA\\SRT";

  /** (R-10228, SRT, "latero-medial") */
  public static final String LateroMedial = "R-10228\\SRT";

  /** (R-10230, SRT, "latero-medial oblique") */
  public static final String LateroMedialOblique = "R-10230\\SRT";

  /** (R-10224, SRT, "medio-lateral") */
  public static final String MedioLateral = "R-10224\\SRT";

  /** (R-10226, SRT, "medio-lateral oblique") */
  public static final String MedioLateralOblique = "R-10226\\SRT";

  /** (R-102D0, SRT, "superolateral to inferomedial oblique") */
  public static final String SuperolateralToInferomedialOblique = "R-102D0\\SRT";

  /** (G-8310, SRT, "tissue specimen from breast") */
  public static final String TissueSpecimenFromBreast = "G-8310\\SRT";
}
