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
 * CID 4033 MR Proton Spectroscopy Metabolites.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class MRProtonSpectroscopyMetabolites {

  /** (F-61620, SRT, "Choline") */
  public static final String Choline = "F-61620\\SRT";

  /** (113081, DCM, "Choline/Creatine Ratio") */
  public static final String CholineCreatineRatio = "113081\\DCM";

  /** (F-61080, SRT, "Citrate") */
  public static final String Citrate = "F-61080\\SRT";

  /** (F-61380, SRT, "Creatine") */
  public static final String Creatine = "F-61380\\SRT";

  /** (113094, DCM, "Creatine and Choline") */
  public static final String CreatineAndCholine = "113094\\DCM";

  /** (113096, DCM, "Creatine+Choline/Citrate Ratio") */
  public static final String CreatineCholineCitrateRatio = "113096\\DCM";

  /** (113080, DCM, "Glutamate and glutamine") */
  public static final String GlutamateAndGlutamine = "113080\\DCM";

  /** (F-64210, SRT, "Glutamine") */
  public static final String Glutamine = "F-64210\\SRT";

  /** (F-61A90, SRT, "Inositol") */
  public static final String Inositol = "F-61A90\\SRT";

  /** (F-61760, SRT, "Lactate") */
  public static final String Lactate = "F-61760\\SRT";

  /** (F-63600, SRT, "Lipid") */
  public static final String Lipid = "F-63600\\SRT";

  /** (113095, DCM, "Lipid and Lactate") */
  public static final String LipidAndLactate = "113095\\DCM";

  /** (F-6175A, SRT, "N-acetylaspartate") */
  public static final String NAcetylaspartate = "F-6175A\\SRT";

  /** (113083, DCM, "N-acetylaspartate/Choline Ratio") */
  public static final String NAcetylaspartateCholineRatio = "113083\\DCM";

  /** (113082, DCM, "N-acetylaspartate/Creatine Ratio") */
  public static final String NAcetylaspartateCreatineRatio = "113082\\DCM";

  /** (F-64460, SRT, "Tuarine") */
  public static final String Tuarine = "F-64460\\SRT";
}
