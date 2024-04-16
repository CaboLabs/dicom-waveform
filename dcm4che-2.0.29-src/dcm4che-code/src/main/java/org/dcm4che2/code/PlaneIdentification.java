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
 * CID 3466 Plane Identification.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PlaneIdentification {

  /** (R-10206, SRT, "Antero-posterior") */
  public static final String AnteroPosterior = "R-10206\\SRT";

  /** (R-101C4, SRT, "Caudal LAO") */
  public static final String CaudalLAO = "R-101C4\\SRT";

  /** (R-101C6, SRT, "Caudal RAO") */
  public static final String CaudalRAO = "R-101C6\\SRT";

  /** (R-101C3, SRT, "Cranial LAO") */
  public static final String CranialLAO = "R-101C3\\SRT";

  /** (R-101C5, SRT, "Cranial RAO") */
  public static final String CranialRAO = "R-101C5\\SRT";

  /** (R-10220, SRT, "Left Anterior Oblique") */
  public static final String LeftAnteriorOblique = "R-10220\\SRT";

  /** (R-10236, SRT, "Left Lateral") */
  public static final String LeftLateral = "R-10236\\SRT";

  /** (R-10218, SRT, "Right Anterior Oblique") */
  public static final String RightAnteriorOblique = "R-10218\\SRT";
}
