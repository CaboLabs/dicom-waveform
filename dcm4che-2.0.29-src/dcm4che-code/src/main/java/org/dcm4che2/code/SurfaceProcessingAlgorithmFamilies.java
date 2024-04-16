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
 * CID 7162 Surface Processing Algorithm Families.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class SurfaceProcessingAlgorithmFamilies {

  /** (123102, DCM, "Adaptive Filtering") */
  public static final String AdaptiveFiltering = "123102\\DCM";

  /** (123110, DCM, "Artificial Intelligence") */
  public static final String ArtificialIntelligence = "123110\\DCM";

  /** (123107, DCM, "Cluster Analysis") */
  public static final String ClusterAnalysis = "123107\\DCM";

  /** (123111, DCM, "Deformable Models") */
  public static final String DeformableModels = "123111\\DCM";

  /** (123103, DCM, "Edge Detection") */
  public static final String EdgeDetection = "123103\\DCM";

  /** (123105, DCM, "Histogram Analysis") */
  public static final String HistogramAnalysis = "123105\\DCM";

  /** (123109, DCM, "Manual Processing") */
  public static final String ManualProcessing = "123109\\DCM";

  /** (123104, DCM, "Morphological Operations") */
  public static final String MorphologicalOperations = "123104\\DCM";

  /** (123106, DCM, "Multi-Scale/Resolution Filtering") */
  public static final String MultiScaleResolutionFiltering = "123106\\DCM";

  /** (123108, DCM, "Multispectral Processing") */
  public static final String MultispectralProcessing = "123108\\DCM";

  /** (123101, DCM, "Neighborhood Analysis") */
  public static final String NeighborhoodAnalysis = "123101\\DCM";
}
