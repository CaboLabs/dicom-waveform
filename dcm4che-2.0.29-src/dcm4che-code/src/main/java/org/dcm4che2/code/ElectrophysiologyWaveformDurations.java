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
 * CID 3687 Electrophysiology Waveform Durations.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ElectrophysiologyWaveformDurations {

  /** (5.13.5-53, SCPECG[1.3], "Intrisicoid Deflection duration") */
  public static final String IntrisicoidDeflectionDuration = "5.13.5-53\\SCPECG[1.3]";

  /** (5.13.5-51, SCPECG[1.3], "Isoelectric Segment duration at the end of QRS") */
  public static final String IsoelectricSegmentDurationAtTheEndOfQRS = "5.13.5-51\\SCPECG[1.3]";

  /** (5.13.5-49, SCPECG[1.3], "Isoelectric Segment duration at the onset of QRS") */
  public static final String IsoelectricSegmentDurationAtTheOnsetOfQRS = "5.13.5-49\\SCPECG[1.3]";

  /** (5.13.5-5, SCPECG[1.3], "P Duration") */
  public static final String PDuration = "5.13.5-5\\SCPECG[1.3]";

  /** (5.13.5-7, SCPECG[1.3], "PR Interval") */
  public static final String PRInterval = "5.13.5-7\\SCPECG[1.3]";

  /** (5.13.5-13, SCPECG[1.3], "Q Duration") */
  public static final String QDuration = "5.13.5-13\\SCPECG[1.3]";

  /** (5.13.5-9, SCPECG[1.3], "QRS Duration") */
  public static final String QRSDuration = "5.13.5-9\\SCPECG[1.3]";

  /** (5.13.5-11, SCPECG[1.3], "QT Interval") */
  public static final String QTInterval = "5.13.5-11\\SCPECG[1.3]";

  /** (5.13.5-19, SCPECG[1.3], "R' Duration") */
  public static final String RDerivedDuration = "5.13.5-19\\SCPECG[1.3]";

  /** (5.13.5-15, SCPECG[1.3], "R Duration") */
  public static final String RDuration = "5.13.5-15\\SCPECG[1.3]";

  /** (5.13.5-21, SCPECG[1.3], "S' Duration") */
  public static final String SDerivedDuration = "5.13.5-21\\SCPECG[1.3]";

  /** (5.13.5-17, SCPECG[1.3], "S Duration") */
  public static final String SDuration = "5.13.5-17\\SCPECG[1.3]";
}
