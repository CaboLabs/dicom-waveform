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
 * CID 3228 ECG Timing Measurements.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ECGTimingMeasurements {

  /** (2:16184, MDC, "P duration global") */
  public static final String PDurationGlobal = "2:16184\\MDC";

  /** (2:6656, MDC, "P duration per lead") */
  public static final String PDurationPerLead = "2:6656\\MDC";

  /** (2:16140, MDC, "PP interval global") */
  public static final String PPIntervalGlobal = "2:16140\\MDC";

  /** (2:32768, MDC, "PP interval per lead") */
  public static final String PPIntervalPerLead = "2:32768\\MDC";

  /** (2:15872, MDC, "PR interval global") */
  public static final String PRIntervalGlobal = "2:15872\\MDC";

  /** (2:7168, MDC, "PR interval per lead") */
  public static final String PRIntervalPerLead = "2:7168\\MDC";

  /** (2:16156, MDC, "QRS duration global") */
  public static final String QRSDurationGlobal = "2:16156\\MDC";

  /** (2:7936, MDC, "QRS duration per lead") */
  public static final String QRSDurationPerLead = "2:7936\\MDC";

  /** (2:16160, MDC, "QT interval global") */
  public static final String QTIntervalGlobal = "2:16160\\MDC";

  /** (2:8192, MDC, "QT interval per lead") */
  public static final String QTIntervalPerLead = "2:8192\\MDC";

  /** (2:16168, MDC, "RR interval global") */
  public static final String RRIntervalGlobal = "2:16168\\MDC";

  /** (2:33024, MDC, "RR interval per lead") */
  public static final String RRIntervalPerLead = "2:33024\\MDC";
}
