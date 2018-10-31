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
 * CID 3703 Wall Motion.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class WallMotion {

  /** (F-30004, SRT, "Akinesis") */
  public static final String Akinesis = "F-30004\\SRT";

  /** (F-32052, SRT, "Dyskinesis") */
  public static final String Dyskinesis = "F-32052\\SRT";

  /** (R-0030D, SRT, "Hyperkinetic region") */
  public static final String HyperkineticRegion = "R-0030D\\SRT";

  /** (R-4041B, SRT, "Hypokinesis") */
  public static final String Hypokinesis = "R-4041B\\SRT";

  /** (F-32056, SRT, "Mild Hypokinesis") */
  public static final String MildHypokinesis = "F-32056\\SRT";

  /** (R-0032F, SRT, "Moderate Hypokinesis") */
  public static final String ModerateHypokinesis = "R-0032F\\SRT";

  /** (R-00344, SRT, "Normal wall motion") */
  public static final String NormalWallMotion = "R-00344\\SRT";

  /** (R-00378, SRT, "Not Evaluated") */
  public static final String NotEvaluated = "R-00378\\SRT";

  /** (122288, DCM, "Not visualized") */
  public static final String NotVisualized = "122288\\DCM";

  /** (R-00370, SRT, "Severe Hypokinesis") */
  public static final String SevereHypokinesis = "R-00370\\SRT";

  /** (R-41198, SRT, "Unknown") */
  public static final String Unknown = "R-41198\\SRT";
}
