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
 * CID 6201 Colon Finding or Feature.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ColonFindingOrFeature {

  /** (112238, DCM, "Anatomic non-colon") */
  public static final String AnatomicNonColon = "112238\\DCM";

  /** (T-59345, SRT, "Colonic haustra") */
  public static final String ColonicHaustra = "T-59345\\SRT";

  /** (F-61D54, SRT, "Contrast media") */
  public static final String ContrastMedia = "F-61D54\\SRT";

  /** (M-32700, SRT, "Diverticulum") */
  public static final String Diverticulum = "M-32700\\SRT";

  /** (T-59666, SRT, "Feces") */
  public static final String Feces = "T-59666\\SRT";

  /** (T-58650, SRT, "Ileocecal valve") */
  public static final String IleocecalValve = "T-58650\\SRT";

  /** (111101, DCM, "Image quality") */
  public static final String ImageQuality = "111101\\DCM";

  /** (T-50153, SRT, "Intraluminal fluid") */
  public static final String IntraluminalFluid = "T-50153\\SRT";

  /** (M-32704, SRT, "Inverted diverticulum") */
  public static final String InvertedDiverticulum = "M-32704\\SRT";

  /** (M-88500, SRT, "Lipoma") */
  public static final String Lipoma = "M-88500\\SRT";

  /** (111102, DCM, "Non-lesion") */
  public static final String NonLesion = "111102\\DCM";

  /** (M-18000, SRT, "Operative Site") */
  public static final String OperativeSite = "M-18000\\SRT";

  /** (D5-41170, SRT, "Polyp of colon") */
  public static final String PolypOfColon = "D5-41170\\SRT";

  /** (F-54005, SRT, "Rectal mass") */
  public static final String RectalMass = "F-54005\\SRT";

  /** (111099, DCM, "Selected region") */
  public static final String SelectedRegion = "111099\\DCM";

  /** (D5-F131F, SRT, "Tumor of colon") */
  public static final String TumorOfColon = "D5-F131F\\SRT";
}
