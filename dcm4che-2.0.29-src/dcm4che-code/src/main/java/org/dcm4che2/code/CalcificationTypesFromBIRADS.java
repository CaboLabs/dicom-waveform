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
 * CID 6011 Calcification Types from BI-RADS.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class CalcificationTypesFromBIRADS {

  /** (F-0176C, SRT, "Amorphous calcification") */
  public static final String AmorphousCalcification = "F-0176C\\SRT";

  /** (F-01769, SRT, "Calcified skin of breast") */
  public static final String CalcifiedSkinOfBreast = "F-01769\\SRT";

  /** (F-0176A, SRT, "Calcified suture material") */
  public static final String CalcifiedSutureMaterial = "F-0176A\\SRT";

  /** (F-01761, SRT, "Coarse (popcorn-like) calcification") */
  public static final String CoarsePopcornLikeCalcification = "F-01761\\SRT";

  /** (F-01762, SRT, "Dystrophic calcification") */
  public static final String DystrophicCalcification = "F-01762\\SRT";

  /** (F-01763, SRT, "Eggshell calcification") */
  public static final String EggshellCalcification = "F-01763\\SRT";

  /** (F-0176E, SRT, "Fine linear, branching (casting) calcification") */
  public static final String FineLinearBranchingCastingCalcification = "F-0176E\\SRT";

  /** (F-0176D, SRT, "Fine, linear (casting) calcification") */
  public static final String FineLinearCastingCalcification = "F-0176D\\SRT";

  /** (111344, DCM, "Fine pleomorphic calcification") */
  public static final String FinePleomorphicCalcification = "111344\\DCM";

  /** (F-0176F, SRT, "Heterogeneous calcification") */
  public static final String HeterogeneousCalcification = "F-0176F\\SRT";

  /** (F-01764, SRT, "Large rod-like calcification") */
  public static final String LargeRodLikeCalcification = "F-01764\\SRT";

  /** (F-01766, SRT, "Lucent-centered calcification") */
  public static final String LucentCenteredCalcification = "F-01766\\SRT";

  /** (111345, DCM, "Macrocalcifications") */
  public static final String Macrocalcifications = "111345\\DCM";

  /** (D7-90435, SRT, "Microcalcifications of the breast") */
  public static final String MicrocalcificationsOfTheBreast = "D7-90435\\SRT";

  /** (F-01765, SRT, "Milk of calcium calcification") */
  public static final String MilkOfCalciumCalcification = "F-01765\\SRT";

  /** (F-01767, SRT, "Punctate calcification") */
  public static final String PunctateCalcification = "F-01767\\SRT";

  /** (F-01768, SRT, "Round shaped calcification") */
  public static final String RoundShapedCalcification = "F-01768\\SRT";

  /** (F-0176B, SRT, "Vascular calcification") */
  public static final String VascularCalcification = "F-0176B\\SRT";
}
