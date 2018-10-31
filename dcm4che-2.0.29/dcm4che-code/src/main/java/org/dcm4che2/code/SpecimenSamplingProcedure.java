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
 * CID 8110 Specimen Sampling Procedure.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class SpecimenSamplingProcedure {

  /** (P3-4000D, SRT, "Block sectioning") */
  public static final String BlockSectioning = "P3-4000D\\SRT";

  /** (P3-4000F, SRT, "Block step sectioning") */
  public static final String BlockStepSectioning = "P3-4000F\\SRT";

  /** (P3-4000E, SRT, "Block surface recut") */
  public static final String BlockSurfaceRecut = "P3-4000E\\SRT";

  /** (P3-40011, SRT, "Core sampling") */
  public static final String CoreSampling = "P3-40011\\SRT";

  /** (P1-01003, SRT, "Dissection") */
  public static final String Dissection = "P1-01003\\SRT";

  /** (111726, DCM, "Dissection with entire specimen submission") */
  public static final String DissectionWithEntireSpecimenSubmission = "111726\\DCM";

  /** (111727, DCM, "Dissection with representative sections submission") */
  public static final String DissectionWithRepresentativeSectionsSubmission = "111727\\DCM";

  /** (P3-40004, SRT, "Laser microdissection") */
  public static final String LaserMicrodissection = "P3-40004\\SRT";

  /** (P3-00048, SRT, "Smear procedure") */
  public static final String SmearProcedure = "P3-00048\\SRT";

  /** (P3-4500A, SRT, "Touch preparation (procedure)") */
  public static final String TouchPreparationProcedure = "P3-4500A\\SRT";
}
