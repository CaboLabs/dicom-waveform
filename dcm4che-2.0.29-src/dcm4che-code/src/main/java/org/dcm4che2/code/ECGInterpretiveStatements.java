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
 * CID 3686 ECG Interpretive Statements.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ECGInterpretiveStatements {

  /** (D.3-PAAAI, SCPECG[1.3], "AAI pacemaker") */
  public static final String AAIPacemaker = "D.3-PAAAI\\SCPECG[1.3]";

  /** (D.3-ABSVS, SCPECG[1.3], "aberrant complexes, possibly supraventricular origin") */
  public static final String AberrantComplexesPossiblySupraventricularOrigin = "D.3-ABSVS\\SCPECG[1.3]";

  /** (D.3-ABSVC, SCPECG[1.3], "aberrant complex, possibly supraventricular origin") */
  public static final String AberrantComplexPossiblySupraventricularOrigin = "D.3-ABSVC\\SCPECG[1.3]";

  /** (D.3-ABBCO, SCPECG[1.3], "aberrant conduction") */
  public static final String AberrantConduction = "D.3-ABBCO\\SCPECG[1.3]";

  /** (D.3-ABER, SCPECG[1.3], "aberrantly conducted complex(es)") */
  public static final String AberrantlyConductedComplexEs = "D.3-ABER\\SCPECG[1.3]";

  /** (D.3-ABPCS, SCPECG[1.3], "aberrant premature complexes, origin unknown") */
  public static final String AberrantPrematureComplexesOriginUnknown = "D.3-ABPCS\\SCPECG[1.3]";

  /** (D.3-ABASH, SCPECG[1.3], "aberrant supraventricular complexes, Ashman type") */
  public static final String AberrantSupraventricularComplexesAshmanType = "D.3-ABASH\\SCPECG[1.3]";

  /** (D.3-ABECG, SCPECG[1.3], "abnormal ECG") */
  public static final String AbnormalECG = "D.3-ABECG\\SCPECG[1.3]";

  /** (D.3-ABFA, SCPECG[1.3], "abnormal for age") */
  public static final String AbnormalForAge = "D.3-ABFA\\SCPECG[1.3]";

  /** (D.3-ABFB, SCPECG[1.3], "abnormal for build") */
  public static final String AbnormalForBuild = "D.3-ABFB\\SCPECG[1.3]";

  /** (D.3-ABPAX, SCPECG[1.3], "abnormal P-axis") */
  public static final String AbnormalPAxis = "D.3-ABPAX\\SCPECG[1.3]";

  /** (D.3-ABQRS, SCPECG[1.3], "abnormal QRS") */
  public static final String AbnormalQRS = "D.3-ABQRS\\SCPECG[1.3]";

  /** (D.3-ABRPR, SCPECG[1.3], "abnormal R-wave progression") */
  public static final String AbnormalRWaveProgression = "D.3-ABRPR\\SCPECG[1.3]";

  /** (D.3-ABSTT, SCPECG[1.3], "abnormal ST-T") */
  public static final String AbnormalSTT = "D.3-ABSTT\\SCPECG[1.3]";

  /** (D.3-ACAR, SCPECG[1.3], "accelerated atrial rhythm") */
  public static final String AcceleratedAtrialRhythm = "D.3-ACAR\\SCPECG[1.3]";

  /** (D.3-AAVCO, SCPECG[1.3], "accelerated AV conduction") */
  public static final String AcceleratedAVConduction = "D.3-AAVCO\\SCPECG[1.3]";

  /** (D.3-ACJR, SCPECG[1.3], "accelerated junctional rhythm") */
  public static final String AcceleratedJunctionalRhythm = "D.3-ACJR\\SCPECG[1.3]";

  /** (D.3-ACVR, SCPECG[1.3], "accelerated ventricular rhythm") */
  public static final String AcceleratedVentricularRhythm = "D.3-ACVR\\SCPECG[1.3]";

  /** (D.3-AHERR, SCPECG[1.3], "acquisition/hardware error") */
  public static final String AcquisitionHardwareError = "D.3-AHERR\\SCPECG[1.3]";

  /** (D.3-DSCAL, SCPECG[1.3], "all leads double standard calibration (i.e. 20 mm/mV)") */
  public static final String AllLeadsDoubleStandardCalibrationI_e_20MmMV = "D.3-DSCAL\\SCPECG[1.3]";

  /** (D.3-HSCAL, SCPECG[1.3], "all leads half standard calibration (i.e. 5 mm/mV)") */
  public static final String AllLeadsHalfStandardCalibrationI_e_5MmMV = "D.3-HSCAL\\SCPECG[1.3]";

  /** (D.3-A2AVB, SCPECG[1.3], "alternating second degree AV block") */
  public static final String AlternatingSecondDegreeAVBlock = "D.3-A2AVB\\SCPECG[1.3]";

  /** (D.3-AMI, SCPECG[1.3], "anterior myocardial infarction") */
  public static final String AnteriorMyocardialInfarction = "D.3-AMI\\SCPECG[1.3]";

  /** (D.3-ANTCO, SCPECG[1.3], "anterograde conduction") */
  public static final String AnterogradeConduction = "D.3-ANTCO\\SCPECG[1.3]";

  /** (D.3-ALMI, SCPECG[1.3], "anterolateral myocardial infarction") */
  public static final String AnterolateralMyocardialInfarction = "D.3-ALMI\\SCPECG[1.3]";

  /** (D.3-ASMI, SCPECG[1.3], "anteroseptal myocardial infarction") */
  public static final String AnteroseptalMyocardialInfarction = "D.3-ASMI\\SCPECG[1.3]";

  /** (D.3-APMI, SCPECG[1.3], "apical myocardial infarction") */
  public static final String ApicalMyocardialInfarction = "D.3-APMI\\SCPECG[1.3]";

  /** (D.3-ARRHY, SCPECG[1.3], "arrhythmia, origin unknown") */
  public static final String ArrhythmiaOriginUnknown = "D.3-ARRHY\\SCPECG[1.3]";

  /** (D.3-ARTEF, SCPECG[1.3], "artifacts") */
  public static final String Artifacts = "D.3-ARTEF\\SCPECG[1.3]";

  /** (D.3-PACEA, SCPECG[1.3], "artificial pacemaker rhythm with 100% capture") */
  public static final String ArtificialPacemakerRhythmWith100PercentCapture = "D.3-PACEA\\SCPECG[1.3]";

  /** (D.3-PACEP, SCPECG[1.3], "artificial pacemaker rhythm with partial capture") */
  public static final String ArtificialPacemakerRhythmWithPartialCapture = "D.3-PACEP\\SCPECG[1.3]";

  /** (D.3-PACEF, SCPECG[1.3], "artificial pacemaker rhythm with underlying atrial fibrilation") */
  public static final String ArtificialPacemakerRhythmWithUnderlyingAtrialFibrilation = "D.3-PACEF\\SCPECG[1.3]";

  /** (D.3-ASYST, SCPECG[1.3], "asystole") */
  public static final String Asystole = "D.3-ASYST\\SCPECG[1.3]";

  /** (D.3-ABIG, SCPECG[1.3], "atrial bigeminy") */
  public static final String AtrialBigeminy = "D.3-ABIG\\SCPECG[1.3]";

  /** (D.3-AEC, SCPECG[1.3], "atrial escape complex(es)") */
  public static final String AtrialEscapeComplexEs = "D.3-AEC\\SCPECG[1.3]";

  /** (D.3-AFIB, SCPECG[1.3], "atrial fibrillation") */
  public static final String AtrialFibrillation = "D.3-AFIB\\SCPECG[1.3]";

  /** (D.3-AFLT, SCPECG[1.3], "atrial flutter") */
  public static final String AtrialFlutter = "D.3-AFLT\\SCPECG[1.3]";

  /** (D.3-APARA, SCPECG[1.3], "atrial parasystole") */
  public static final String AtrialParasystole = "D.3-APARA\\SCPECG[1.3]";

  /** (D.3-APC, SCPECG[1.3], "atrial premature complex") */
  public static final String AtrialPrematureComplex = "D.3-APC\\SCPECG[1.3]";

  /** (D.3-PAC, SCPECG[1.3], "atrial premature complex") */
  public static final String AtrialPrematureComplex2 = "D.3-PAC\\SCPECG[1.3]";

  /** (D.3-ARATE, SCPECG[1.3], "atrial rate") */
  public static final String AtrialRate = "D.3-ARATE\\SCPECG[1.3]";

  /** (D.3-ARHYT, SCPECG[1.3], "atrial rhythm") */
  public static final String AtrialRhythm = "D.3-ARHYT\\SCPECG[1.3]";

  /** (D.3-ATACH, SCPECG[1.3], "atrial tachycardia") */
  public static final String AtrialTachycardia = "D.3-ATACH\\SCPECG[1.3]";

  /** (D.3-ATRIG, SCPECG[1.3], "atrial trigeminy") */
  public static final String AtrialTrigeminy = "D.3-ATRIG\\SCPECG[1.3]";

  /** (D.3-AVNRT, SCPECG[1.3], "atrioventricular nodal re-entrant tachycardia") */
  public static final String AtrioventricularNodalReEntrantTachycardia = "D.3-AVNRT\\SCPECG[1.3]";

  /** (D.3-AVRT, SCPECG[1.3], "atrioventricular reciprocating tachycardia") */
  public static final String AtrioventricularReciprocatingTachycardia = "D.3-AVRT\\SCPECG[1.3]";

  /** (D.3-ALBBB, SCPECG[1.3], "atypical left bundle branch block") */
  public static final String AtypicalLeftBundleBranchBlock = "D.3-ALBBB\\SCPECG[1.3]";

  /** (D.3-AVDIS, SCPECG[1.3], "AV-dissociation") */
  public static final String AVDissociation = "D.3-AVDIS\\SCPECG[1.3]";

  /** (D.3-AVJR, SCPECG[1.3], "AV-junctional rhythm") */
  public static final String AVJunctionalRhythm = "D.3-AVJR\\SCPECG[1.3]";

  /** (D.3-AVREN, SCPECG[1.3], "AV nodal re-entry") */
  public static final String AVNodalReEntry = "D.3-AVREN\\SCPECG[1.3]";

  /** (D.3-AXPOS, SCPECG[1.3], "axis shifted posteriorly") */
  public static final String AxisShiftedPosteriorly = "D.3-AXPOS\\SCPECG[1.3]";

  /** (D.3-AXSUP, SCPECG[1.3], "axis shifted superiorly") */
  public static final String AxisShiftedSuperiorly = "D.3-AXSUP\\SCPECG[1.3]";

  /** (D.3-AXVER, SCPECG[1.3], "axis vertical in frontal plane") */
  public static final String AxisVerticalInFrontalPlane = "D.3-AXVER\\SCPECG[1.3]";

  /** (D.3-WANDR, SCPECG[1.3], "baseline wander") */
  public static final String BaselineWander = "D.3-WANDR\\SCPECG[1.3]";

  /** (D.3-BAE, SCPECG[1.3], "bi-atrial enlargement") */
  public static final String BiAtrialEnlargement = "D.3-BAE\\SCPECG[1.3]";

  /** (D.3-BAO, SCPECG[1.3], "bi-atrial overload") */
  public static final String BiAtrialOverload = "D.3-BAO\\SCPECG[1.3]";

  /** (D.3-BIFAS, SCPECG[1.3], "bifascicular block") */
  public static final String BifascicularBlock = "D.3-BIFAS\\SCPECG[1.3]";

  /** (D.3-BIGU, SCPECG[1.3], "bigeminal pattern") */
  public static final String BigeminalPattern = "D.3-BIGU\\SCPECG[1.3]";

  /** (D.3-EPARV, SCPECG[1.3], "bipolar electronic pacemaker at the apex of the right ventricle") */
  public static final String BipolarElectronicPacemakerAtTheApexOfTheRightVentricle = "D.3-EPARV\\SCPECG[1.3]";

  /** (D.3-BVH, SCPECG[1.3], "biventricular hypertrophy") */
  public static final String BiventricularHypertrophy = "D.3-BVH\\SCPECG[1.3]";

  /** (D.3-BOECG, SCPECG[1.3], "borderline ECG") */
  public static final String BorderlineECG = "D.3-BOECG\\SCPECG[1.3]";

  /** (D.3-BPAC, SCPECG[1.3], "BPAC blocked premature atrial contraction") */
  public static final String BPACBlockedPrematureAtrialContraction = "D.3-BPAC\\SCPECG[1.3]";

  /** (D.3-BRADO, SCPECG[1.3], "bradycardia, origin unknown or not specified") */
  public static final String BradycardiaOriginUnknownOrNotSpecified = "D.3-BRADO\\SCPECG[1.3]";

  /** (D.3-CAPT, SCPECG[1.3], "capture complex(es)") */
  public static final String CaptureComplexEs = "D.3-CAPT\\SCPECG[1.3]";

  /** (D.3-ASD, SCPECG[1.3], "changes compatible with atrial septal defect (ostium secundum)") */
  public static final String ChangesCompatibleWithAtrialSeptalDefectOstiumSecundum = "D.3-ASD\\SCPECG[1.3]";

  /** (D.3-CWRT, SCPECG[1.3], "clockwise rotation") */
  public static final String ClockwiseRotation = "D.3-CWRT\\SCPECG[1.3]";

  /** (D.3-ECD, SCPECG[1.3], "compatible endocardial cushion defect (ASD ostium primum)") */
  public static final String CompatibleEndocardialCushionDefectASDOstiumPrimum = "D.3-ECD\\SCPECG[1.3]";

  /** (D.3-ACA, SCPECG[1.3], "compatible with anomalous location of the coronary") */
  public static final String CompatibleWithAnomalousLocationOfTheCoronary = "D.3-ACA\\SCPECG[1.3]";

  /** (D.3-MYOPA, SCPECG[1.3], "compatible with cardiomyopathy") */
  public static final String CompatibleWithCardiomyopathy = "D.3-MYOPA\\SCPECG[1.3]";

  /** (D.3-EBSTA, SCPECG[1.3], "compatible with Ebstein's anomaly") */
  public static final String CompatibleWithEbsteinAnomaly = "D.3-EBSTA\\SCPECG[1.3]";

  /** (D.3-NDOC, SCPECG[1.3], "compatible with endocrine disease") */
  public static final String CompatibleWithEndocrineDisease = "D.3-NDOC\\SCPECG[1.3]";

  /** (D.3-IBP, SCPECG[1.3], "compatible with hypertension") */
  public static final String CompatibleWithHypertension = "D.3-IBP\\SCPECG[1.3]";

  /** (D.3-ISDIG, SCPECG[1.3], "compatible with ischemia / digitalis effect") */
  public static final String CompatibleWithIschemiaDigitalisEffect = "D.3-ISDIG\\SCPECG[1.3]";

  /** (D.3-MYOCA, SCPECG[1.3], "compatible with myocarditis") */
  public static final String CompatibleWithMyocarditis = "D.3-MYOCA\\SCPECG[1.3]";

  /** (D.3-PULM, SCPECG[1.3], "compatible with pulmonary embolism") */
  public static final String CompatibleWithPulmonaryEmbolism = "D.3-PULM\\SCPECG[1.3]";

  /** (D.3-TCA, SCPECG[1.3], "compatible with tricuspid atresia") */
  public static final String CompatibleWithTricuspidAtresia = "D.3-TCA\\SCPECG[1.3]";

  /** (D.3-CLBBB, SCPECG[1.3], "complete left bundle branch block") */
  public static final String CompleteLeftBundleBranchBlock = "D.3-CLBBB\\SCPECG[1.3]";

  /** (D.3-CRBBB, SCPECG[1.3], "complete right bundle branch block") */
  public static final String CompleteRightBundleBranchBlock = "D.3-CRBBB\\SCPECG[1.3]";

  /** (D.3-CONCO, SCPECG[1.3], "concealed conduction") */
  public static final String ConcealedConduction = "D.3-CONCO\\SCPECG[1.3]";

  /** (D.3-CONRE, SCPECG[1.3], "concealed re-entry") */
  public static final String ConcealedReEntry = "D.3-CONRE\\SCPECG[1.3]";

  /** (D.3-HPRCA, SCPECG[1.3], "consider hypercalcemia") */
  public static final String ConsiderHypercalcemia = "D.3-HPRCA\\SCPECG[1.3]";

  /** (D.3-HPRK, SCPECG[1.3], "consider hyperkalemia") */
  public static final String ConsiderHyperkalemia = "D.3-HPRK\\SCPECG[1.3]";

  /** (D.3-HPOCA, SCPECG[1.3], "consider hypocalcemia") */
  public static final String ConsiderHypocalcemia = "D.3-HPOCA\\SCPECG[1.3]";

  /** (D.3-HPOK, SCPECG[1.3], "consider hypokalemia") */
  public static final String ConsiderHypokalemia = "D.3-HPOK\\SCPECG[1.3]";

  /** (D.3-COPD, SCPECG[1.3], "consistent with chronic obstructive pulmonary disease") */
  public static final String ConsistentWithChronicObstructivePulmonaryDisease = "D.3-COPD\\SCPECG[1.3]";

  /** (D.3-CCWRT, SCPECG[1.3], "counterclockwise rotation") */
  public static final String CounterclockwiseRotation = "D.3-CCWRT\\SCPECG[1.3]";

  /** (D.3-CRIMA, SCPECG[1.3], "criteria for") */
  public static final String CriteriaFor = "D.3-CRIMA\\SCPECG[1.3]";

  /** (D.3-PADDD, SCPECG[1.3], "DDD pacemaker") */
  public static final String DDDPacemaker = "D.3-PADDD\\SCPECG[1.3]";

  /** (D.3-PACED, SCPECG[1.3], "demand pacemaker rhythm") */
  public static final String DemandPacemakerRhythm = "D.3-PACED\\SCPECG[1.3]";

  /** (D.3-PADEM, SCPECG[1.3], "demand pacing, based upon intrinsic complexes") */
  public static final String DemandPacingBasedUponIntrinsicComplexes = "D.3-PADEM\\SCPECG[1.3]";

  /** (D.3-DXTRO, SCPECG[1.3], "dextrocardia") */
  public static final String Dextrocardia = "D.3-DXTRO\\SCPECG[1.3]";

  /** (D.3-DIG, SCPECG[1.3], "digitalis-effect") */
  public static final String DigitalisEffect = "D.3-DIG\\SCPECG[1.3]";

  /** (D.3-PAD, SCPECG[1.3], "dual chamber electronic pacing") */
  public static final String DualChamberElectronicPacing = "D.3-PAD\\SCPECG[1.3]";

  /** (D.3-PADVI, SCPECG[1.3], "DVI pacemaker") */
  public static final String DVIPacemaker = "D.3-PADVI\\SCPECG[1.3]";

  /** (D.3-WHNOR, SCPECG[1.3], "ECG within normal limits for age and sex") */
  public static final String ECGWithinNormalLimitsForAgeAndSex = "D.3-WHNOR\\SCPECG[1.3]";

  /** (D.3-EAR, SCPECG[1.3], "ectopic atrial rhythm") */
  public static final String EctopicAtrialRhythm = "D.3-EAR\\SCPECG[1.3]";

  /** (D.3-PAA, SCPECG[1.3], "electronic atrial pacing") */
  public static final String ElectronicAtrialPacing = "D.3-PAA\\SCPECG[1.3]";

  /** (D.3-EPAVS, SCPECG[1.3], "electronic pacemaker AV sequential, normal capture") */
  public static final String ElectronicPacemakerAVSequentialNormalCapture = "D.3-EPAVS\\SCPECG[1.3]";

  /** (D.3-EPDM, SCPECG[1.3], "electronic pacemaker, demand mode") */
  public static final String ElectronicPacemakerDemandMode = "D.3-EPDM\\SCPECG[1.3]";

  /** (D.3-EPFC, SCPECG[1.3], "electronic pacemaker, failure to capture") */
  public static final String ElectronicPacemakerFailureToCapture = "D.3-EPFC\\SCPECG[1.3]";

  /** (D.3-EPFS, SCPECG[1.3], "electronic pacemaker, failure to sense") */
  public static final String ElectronicPacemakerFailureToSense = "D.3-EPFS\\SCPECG[1.3]";

  /** (D.3-EPVC, SCPECG[1.3], "electronic pacemaker, ventricular capture") */
  public static final String ElectronicPacemakerVentricularCapture = "D.3-EPVC\\SCPECG[1.3]";

  /** (D.3-PAVA, SCPECG[1.3], "electronic ventricular pacing with atrial sensing") */
  public static final String ElectronicVentricularPacingWithAtrialSensing = "D.3-PAVA\\SCPECG[1.3]";

  /** (D.3-ENTBL, SCPECG[1.3], "entrance block") */
  public static final String EntranceBlock = "D.3-ENTBL\\SCPECG[1.3]";

  /** (D.3-EPI, SCPECG[1.3], "epicardial injury") */
  public static final String EpicardialInjury = "D.3-EPI\\SCPECG[1.3]";

  /** (D.3-ESCUN, SCPECG[1.3], "escape complex, origin unknown") */
  public static final String EscapeComplexOriginUnknown = "D.3-ESCUN\\SCPECG[1.3]";

  /** (D.3-EXIBL, SCPECG[1.3], "exit block") */
  public static final String ExitBlock = "D.3-EXIBL\\SCPECG[1.3]";

  /** (D.3-EBRAD, SCPECG[1.3], "extreme bradycardia") */
  public static final String ExtremeBradycardia = "D.3-EBRAD\\SCPECG[1.3]";

  /** (D.3-ETACH, SCPECG[1.3], "extreme tachycardia") */
  public static final String ExtremeTachycardia = "D.3-ETACH\\SCPECG[1.3]";

  /** (D.3-FAULT, SCPECG[1.3], "faulty lead") */
  public static final String FaultyLead = "D.3-FAULT\\SCPECG[1.3]";

  /** (D.3-1AVB, SCPECG[1.3], "first degree AV block") */
  public static final String FirstDegreeAVBlock = "D.3-1AVB\\SCPECG[1.3]";

  /** (D.3-FCOUP, SCPECG[1.3], "fixed coupling interval") */
  public static final String FixedCouplingInterval = "D.3-FCOUP\\SCPECG[1.3]";

  /** (D.3-FUSC, SCPECG[1.3], "fusion complex(es)") */
  public static final String FusionComplexEs = "D.3-FUSC\\SCPECG[1.3]";

  /** (D.3-HIGHT, SCPECG[1.3], "high amplitude T-waves") */
  public static final String HighAmplitudeTWaves = "D.3-HIGHT\\SCPECG[1.3]";

  /** (D.3-HLMI, SCPECG[1.3], "high-lateral myocardial infarction") */
  public static final String HighLateralMyocardialInfarction = "D.3-HLMI\\SCPECG[1.3]";

  /** (D.3-HPVOL, SCPECG[1.3], "high P-voltages") */
  public static final String HighPVoltages = "D.3-HPVOL\\SCPECG[1.3]";

  /** (D.3-HVOLT, SCPECG[1.3], "high QRS voltage") */
  public static final String HighQRSVoltage = "D.3-HVOLT\\SCPECG[1.3]";

  /** (D.3-HVOLH, SCPECG[1.3], "high QRS voltage in the horizontal leads") */
  public static final String HighQRSVoltageInTheHorizontalLeads = "D.3-HVOLH\\SCPECG[1.3]";

  /** (D.3-HVOLF, SCPECG[1.3], "high QRS voltages in the frontal leads") */
  public static final String HighQRSVoltagesInTheFrontalLeads = "D.3-HVOLF\\SCPECG[1.3]";

  /** (D.3-HTVOL, SCPECG[1.3], "high T-voltages") */
  public static final String HighTVoltages = "D.3-HTVOL\\SCPECG[1.3]";

  /** (D.3-AXHOR, SCPECG[1.3], "horizontal axis in frontal plane") */
  public static final String HorizontalAxisInFrontalPlane = "D.3-AXHOR\\SCPECG[1.3]";

  /** (D.3-IDIOR, SCPECG[1.3], "idioventricular rhythm") */
  public static final String IdioventricularRhythm = "D.3-IDIOR\\SCPECG[1.3]";

  /** (D.3-ILBBB, SCPECG[1.3], "incomplete left bundle branch block") */
  public static final String IncompleteLeftBundleBranchBlock = "D.3-ILBBB\\SCPECG[1.3]";

  /** (D.3-INCAN, SCPECG[1.3], "incomplete or no analysis (by the program)") */
  public static final String IncompleteOrNoAnalysisByTheProgram = "D.3-INCAN\\SCPECG[1.3]";

  /** (D.3-IRBBB, SCPECG[1.3], "incomplete right bundle branch block") */
  public static final String IncompleteRightBundleBranchBlock = "D.3-IRBBB\\SCPECG[1.3]";

  /** (D.3-PINFO, SCPECG[1.3], "inconsistent or erroneous patient demographic data") */
  public static final String InconsistentOrErroneousPatientDemographicData = "D.3-PINFO\\SCPECG[1.3]";

  /** (D.3-IMI, SCPECG[1.3], "inferior myocardial infarction") */
  public static final String InferiorMyocardialInfarction = "D.3-IMI\\SCPECG[1.3]";

  /** (D.3-ILMI, SCPECG[1.3], "inferolateral myocardial infarction") */
  public static final String InferolateralMyocardialInfarction = "D.3-ILMI\\SCPECG[1.3]";

  /** (D.3-IPMI, SCPECG[1.3], "inferoposterior myocardial infarction") */
  public static final String InferoposteriorMyocardialInfarction = "D.3-IPMI\\SCPECG[1.3]";

  /** (D.3-IPLMI, SCPECG[1.3], "inferoposterolateral myocardial infarction") */
  public static final String InferoposterolateralMyocardialInfarction = "D.3-IPLMI\\SCPECG[1.3]";

  /** (D.3-SIMUL, SCPECG[1.3], "input is from simulator or test pattern") */
  public static final String InputIsFromSimulatorOrTestPattern = "D.3-SIMUL\\SCPECG[1.3]";

  /** (D.3-I2AVB, SCPECG[1.3], "intermittent second degree AV block") */
  public static final String IntermittentSecondDegreeAVBlock = "D.3-I2AVB\\SCPECG[1.3]";

  /** (D.3-CLIN, SCPECG[1.3], "interpret with clinical data") */
  public static final String InterpretWithClinicalData = "D.3-CLIN\\SCPECG[1.3]";

  /** (D.3-IACD, SCPECG[1.3], "intra-atrial conduction delay") */
  public static final String IntraAtrialConductionDelay = "D.3-IACD\\SCPECG[1.3]";

  /** (D.3-IVCD>, SCPECG[1.3], "intraventricular conduction disturbance (QRS>120 ms)") */
  public static final String IntraventricularConductionDisturbanceQRSGreater120Ms = "D.3-IVCD>\\SCPECG[1.3]";

  /** (D.3-INVT, SCPECG[1.3], "inverted T-waves") */
  public static final String InvertedTWaves = "D.3-INVT\\SCPECG[1.3]";

  /** (D.3-IRREG, SCPECG[1.3], "irregular rhythm") */
  public static final String IrregularRhythm = "D.3-IRREG\\SCPECG[1.3]";

  /** (D.3-IVR, SCPECG[1.3], "irregular ventricular response") */
  public static final String IrregularVentricularResponse = "D.3-IVR\\SCPECG[1.3]";

  /** (D.3-ISC, SCPECG[1.3], "Ischemic") */
  public static final String Ischemic = "D.3-ISC\\SCPECG[1.3]";

  /** (D.3-JBRAD, SCPECG[1.3], "junctional bradycardia") */
  public static final String JunctionalBradycardia = "D.3-JBRAD\\SCPECG[1.3]";

  /** (D.3-JEC, SCPECG[1.3], "junctional escape complex(es)") */
  public static final String JunctionalEscapeComplexEs = "D.3-JEC\\SCPECG[1.3]";

  /** (D.3-JESCR, SCPECG[1.3], "junctional escape rhythm") */
  public static final String JunctionalEscapeRhythm = "D.3-JESCR\\SCPECG[1.3]";

  /** (D.3-JPC, SCPECG[1.3], "junctional premature complex(es)") */
  public static final String JunctionalPrematureComplexEs = "D.3-JPC\\SCPECG[1.3]";

  /** (D.3-JRHYT, SCPECG[1.3], "junctional rhythm") */
  public static final String JunctionalRhythm = "D.3-JRHYT\\SCPECG[1.3]";

  /** (D.3-STDJ, SCPECG[1.3], "junctional ST depression") */
  public static final String JunctionalSTDepression = "D.3-STDJ\\SCPECG[1.3]";

  /** (D.3-JTACH, SCPECG[1.3], "junctional tachycardia") */
  public static final String JunctionalTachycardia = "D.3-JTACH\\SCPECG[1.3]";

  /** (D.3-JUV, SCPECG[1.3], "juvenile T waves") */
  public static final String JuvenileTWaves = "D.3-JUV\\SCPECG[1.3]";

  /** (D.3-LMI, SCPECG[1.3], "lateral myocardial infarction") */
  public static final String LateralMyocardialInfarction = "D.3-LMI\\SCPECG[1.3]";

  /** (D.3-LMISP, SCPECG[1.3], "lead misplacement") */
  public static final String LeadMisplacement = "D.3-LMISP\\SCPECG[1.3]";

  /** (D.3-LAFB, SCPECG[1.3], "left anterior fascicular block") */
  public static final String LeftAnteriorFascicularBlock = "D.3-LAFB\\SCPECG[1.3]";

  /** (D.3-LAE, SCPECG[1.3], "left atrial enlargement") */
  public static final String LeftAtrialEnlargement = "D.3-LAE\\SCPECG[1.3]";

  /** (D.3-LAO, SCPECG[1.3], "left atrial overload") */
  public static final String LeftAtrialOverload = "D.3-LAO\\SCPECG[1.3]";

  /** (D.3-LAR, SCPECG[1.3], "left atrial rhythm") */
  public static final String LeftAtrialRhythm = "D.3-LAR\\SCPECG[1.3]";

  /** (D.3-LAD, SCPECG[1.3], "left axis deviation of QRS in frontal plane (< -30)") */
  public static final String LeftAxisDeviationOfQRSInFrontalPlaneLesser30 = "D.3-LAD\\SCPECG[1.3]";

  /** (D.3-LPFB, SCPECG[1.3], "left posterior fascicular block") */
  public static final String LeftPosteriorFascicularBlock = "D.3-LPFB\\SCPECG[1.3]";

  /** (D.3-LVH, SCPECG[1.3], "left ventricular hypertrophy") */
  public static final String LeftVentricularHypertrophy = "D.3-LVH\\SCPECG[1.3]";

  /** (D.3-AXL, SCPECG[1.3], "leftward axis") */
  public static final String LeftwardAxis = "D.3-AXL\\SCPECG[1.3]";

  /** (D.3-DSLIM, SCPECG[1.3], "limb leads double standard calibration") */
  public static final String LimbLeadsDoubleStandardCalibration = "D.3-DSLIM\\SCPECG[1.3]";

  /** (D.3-HSLIM, SCPECG[1.3], "limb leads half standard calibration") */
  public static final String LimbLeadsHalfStandardCalibration = "D.3-HSLIM\\SCPECG[1.3]";

  /** (D.3-LNGQT, SCPECG[1.3], "long QT-interval") */
  public static final String LongQTInterval = "D.3-LNGQT\\SCPECG[1.3]";

  /** (D.3-LRR, SCPECG[1.3], "long R-R interval measured") */
  public static final String LongRRIntervalMeasured = "D.3-LRR\\SCPECG[1.3]";

  /** (D.3-LOWT, SCPECG[1.3], "low amplitude T-waves") */
  public static final String LowAmplitudeTWaves = "D.3-LOWT\\SCPECG[1.3]";

  /** (D.3-LGL, SCPECG[1.3], "Lown-Ganong-Levine syndrome") */
  public static final String LownGanongLevineSyndrome = "D.3-LGL\\SCPECG[1.3]";

  /** (D.3-LVOLT, SCPECG[1.3], "low QRS voltages in the frontal and horizontal leads") */
  public static final String LowQRSVoltagesInTheFrontalAndHorizontalLeads = "D.3-LVOLT\\SCPECG[1.3]";

  /** (D.3-LVOLH, SCPECG[1.3], "low QRS voltages in the horizontal leads") */
  public static final String LowQRSVoltagesInTheHorizontalLeads = "D.3-LVOLH\\SCPECG[1.3]";

  /** (D.3-RAR, SCPECG[1.3], "low right atrial rhythm") */
  public static final String LowRightAtrialRhythm = "D.3-RAR\\SCPECG[1.3]";

  /** (D.3-LVOLF, SCPECG[1.3], "low voltage in frontal leads") */
  public static final String LowVoltageInFrontalLeads = "D.3-LVOLF\\SCPECG[1.3]";

  /** (D.3-PACEM, SCPECG[1.3], "malfunctioning artificial pacemaker") */
  public static final String MalfunctioningArtificialPacemaker = "D.3-PACEM\\SCPECG[1.3]";

  /** (D.3-MAPCS, SCPECG[1.3], "MAPCS multiple atrial premature complexes") */
  public static final String MAPCSMultipleAtrialPrematureComplexes = "D.3-MAPCS\\SCPECG[1.3]";

  /** (D.3-MSAR, SCPECG[1.3], "marked sinus arrhythmia") */
  public static final String MarkedSinusArrhythmia = "D.3-MSAR\\SCPECG[1.3]";

  /** (D.3-CRIMI, SCPECG[1.3], "minimal criteria for") */
  public static final String MinimalCriteriaFor = "D.3-CRIMI\\SCPECG[1.3]";

  /** (D.3-IVCD<, SCPECG[1.3], "minor intraventricular conduction disturbance (QRS<120ms)") */
  public static final String MinorIntraventricularConductionDisturbanceQRSLesser120ms = "D.3-IVCD<\\SCPECG[1.3]";

  /** (D.3-NODAT, SCPECG[1.3], "missing or no data") */
  public static final String MissingOrNoData = "D.3-NODAT\\SCPECG[1.3]";

  /** (D.3-MOBI2, SCPECG[1.3], "Mobitz type 2 second degree AV block") */
  public static final String MobitzType2SecondDegreeAVBlock = "D.3-MOBI2\\SCPECG[1.3]";

  /** (D.3-CRIMO, SCPECG[1.3], "moderate criteria for") */
  public static final String ModerateCriteriaFor = "D.3-CRIMO\\SCPECG[1.3]";

  /** (D.3-MAR, SCPECG[1.3], "multifocal atrial rhythm") */
  public static final String MultifocalAtrialRhythm = "D.3-MAR\\SCPECG[1.3]";

  /** (D.3-MFAT, SCPECG[1.3], "multifocal atrial tachycardia") */
  public static final String MultifocalAtrialTachycardia = "D.3-MFAT\\SCPECG[1.3]";

  /** (D.3-MTACH, SCPECG[1.3], "multifocal tachycardia") */
  public static final String MultifocalTachycardia = "D.3-MTACH\\SCPECG[1.3]";

  /** (D.3-MICS, SCPECG[1.3], "multiple interpolated complexes") */
  public static final String MultipleInterpolatedComplexes = "D.3-MICS\\SCPECG[1.3]";

  /** (D.3-MJPCS, SCPECG[1.3], "multiple junctional premature complexes") */
  public static final String MultipleJunctionalPrematureComplexes = "D.3-MJPCS\\SCPECG[1.3]";

  /** (D.3-MVPCS, SCPECG[1.3], "multiple premature ventricular complexes") */
  public static final String MultiplePrematureVentricularComplexes = "D.3-MVPCS\\SCPECG[1.3]";

  /** (D.3-SVPCS, SCPECG[1.3], "(multiple) supraventricular premature complexes") */
  public static final String MultipleSupraventricularPrematureComplexes = "D.3-SVPCS\\SCPECG[1.3]";

  /** (D.3-MVICS, SCPECG[1.3], "multiple ventricular interpolated complexes") */
  public static final String MultipleVentricularInterpolatedComplexes = "D.3-MVICS\\SCPECG[1.3]";

  /** (D.3-MI, SCPECG[1.3], "myocardial infarction") */
  public static final String MyocardialInfarction = "D.3-MI\\SCPECG[1.3]";

  /** (D.3-NQTAC, SCPECG[1.3], "narrow QRS tachycardia") */
  public static final String NarrowQRSTachycardia = "D.3-NQTAC\\SCPECG[1.3]";

  /** (D.3-NODRH, SCPECG[1.3], "nodal rhythm") */
  public static final String NodalRhythm = "D.3-NODRH\\SCPECG[1.3]";

  /** (D.3-NOISE, SCPECG[1.3], "noisy recording") */
  public static final String NoisyRecording = "D.3-NOISE\\SCPECG[1.3]";

  /** (D.3-NDT, SCPECG[1.3], "non-diagnostic T abnormalities") */
  public static final String NonDiagnosticTAbnormalities = "D.3-NDT\\SCPECG[1.3]";

  /** (D.3-IVCD, SCPECG[1.3], "non-specific intraventricular conduction disturban") */
  public static final String NonSpecificIntraventricularConductionDisturban = "D.3-IVCD\\SCPECG[1.3]";

  /** (D.3-NSPEP, SCPECG[1.3], "non-specific P wave abnormalities") */
  public static final String NonSpecificPWaveAbnormalities = "D.3-NSPEP\\SCPECG[1.3]";

  /** (D.3-NST, SCPECG[1.3], "non-specific ST changes") */
  public static final String NonSpecificSTChanges = "D.3-NST\\SCPECG[1.3]";

  /** (D.3-STD, SCPECG[1.3], "non-specific ST depression") */
  public static final String NonSpecificSTDepression = "D.3-STD\\SCPECG[1.3]";

  /** (D.3-STE, SCPECG[1.3], "non-specific ST elevation") */
  public static final String NonSpecificSTElevation = "D.3-STE\\SCPECG[1.3]";

  /** (D.3-NT, SCPECG[1.3], "non-specific T-wave changes") */
  public static final String NonSpecificTWaveChanges = "D.3-NT\\SCPECG[1.3]";

  /** (D.3-NSCAL, SCPECG[1.3], "non-standard calibration") */
  public static final String NonStandardCalibration = "D.3-NSCAL\\SCPECG[1.3]";

  /** (D.3-NSVT, SCPECG[1.3], "non-sustained ventricular tachycardia") */
  public static final String NonSustainedVentricularTachycardia = "D.3-NSVT\\SCPECG[1.3]";

  /** (D.3-NORM, SCPECG[1.3], "normal ECG") */
  public static final String NormalECG = "D.3-NORM\\SCPECG[1.3]";

  /** (D.3-NFA, SCPECG[1.3], "normal for age") */
  public static final String NormalForAge = "D.3-NFA\\SCPECG[1.3]";

  /** (D.3-NFB, SCPECG[1.3], "normal for build") */
  public static final String NormalForBuild = "D.3-NFB\\SCPECG[1.3]";

  /** (D.3-PACE, SCPECG[1.3], "normal functioning artificial pacemaker") */
  public static final String NormalFunctioningArtificialPacemaker = "D.3-PACE\\SCPECG[1.3]";

  /** (D.3-NLP, SCPECG[1.3], "normal P wave") */
  public static final String NormalPWave = "D.3-NLP\\SCPECG[1.3]";

  /** (D.3-NLQRS, SCPECG[1.3], "normal QRS") */
  public static final String NormalQRS = "D.3-NLQRS\\SCPECG[1.3]";

  /** (D.3-NSR, SCPECG[1.3], "normal sinus rhythm") */
  public static final String NormalSinusRhythm = "D.3-NSR\\SCPECG[1.3]";

  /** (D.3-NLSTT, SCPECG[1.3], "normal ST-T") */
  public static final String NormalSTT = "D.3-NLSTT\\SCPECG[1.3]";

  /** (D.3-TNOR, SCPECG[1.3], "normal T-wave variations") */
  public static final String NormalTWaveVariations = "D.3-TNOR\\SCPECG[1.3]";

  /** (D.3-STNOR, SCPECG[1.3], "normal variant") */
  public static final String NormalVariant = "D.3-STNOR\\SCPECG[1.3]";

  /** (D.3-OCAP, SCPECG[1.3], "occasional capture") */
  public static final String OccasionalCapture = "D.3-OCAP\\SCPECG[1.3]";

  /** (D.3-ONPAC, SCPECG[1.3], "occasional non-paced complexes") */
  public static final String OccasionalNonPacedComplexes = "D.3-ONPAC\\SCPECG[1.3]";

  /** (D.3-OVPAC, SCPECG[1.3], "occasional ventricular paced complexes") */
  public static final String OccasionalVentricularPacedComplexes = "D.3-OVPAC\\SCPECG[1.3]";

  /** (D.3-ORTCO, SCPECG[1.3], "orthograde conduction") */
  public static final String OrthogradeConduction = "D.3-ORTCO\\SCPECG[1.3]";

  /** (D.3-PAPCS, SCPECG[1.3], "paired atrial premature complexes") */
  public static final String PairedAtrialPrematureComplexes = "D.3-PAPCS\\SCPECG[1.3]";

  /** (D.3-PJPCS, SCPECG[1.3], "paired junctional premature complexes") */
  public static final String PairedJunctionalPrematureComplexes = "D.3-PJPCS\\SCPECG[1.3]";

  /** (D.3-PPVCS, SCPECG[1.3], "paired ventricular premature complexes") */
  public static final String PairedVentricularPrematureComplexes = "D.3-PPVCS\\SCPECG[1.3]";

  /** (D.3-PVPCS, SCPECG[1.3], "paired ventricular premature complexes") */
  public static final String PairedVentricularPrematureComplexes2 = "D.3-PVPCS\\SCPECG[1.3]";

  /** (D.3-PAT, SCPECG[1.3], "paroxysmal atrial tachycardia") */
  public static final String ParoxysmalAtrialTachycardia = "D.3-PAT\\SCPECG[1.3]";

  /** (D.3-PSVT, SCPECG[1.3], "paroxysmal supraventricular tachycardia") */
  public static final String ParoxysmalSupraventricularTachycardia = "D.3-PSVT\\SCPECG[1.3]";

  /** (D.3-PED, SCPECG[1.3], "pediatric interpretation") */
  public static final String PediatricInterpretation = "D.3-PED\\SCPECG[1.3]";

  /** (D.3-QCERR, SCPECG[1.3], "poor data quality, interpretation may be adversely affected") */
  public static final String PoorDataQualityInterpretationMayBeAdverselyAffected = "D.3-QCERR\\SCPECG[1.3]";

  /** (D.3-POORR, SCPECG[1.3], "poor R-wave progression in precordial leads") */
  public static final String PoorRWaveProgressionInPrecordialLeads = "D.3-POORR\\SCPECG[1.3]";

  /** (D.3-POSAB, SCPECG[1.3], "possibly abnormal ECG") */
  public static final String PossiblyAbnormalECG = "D.3-POSAB\\SCPECG[1.3]";

  /** (D.3-METAB, SCPECG[1.3], "possibly due to metabolic changes") */
  public static final String PossiblyDueToMetabolicChanges = "D.3-METAB\\SCPECG[1.3]";

  /** (D.3-MEASE, SCPECG[1.3], "possibly measurement error") */
  public static final String PossiblyMeasurementError = "D.3-MEASE\\SCPECG[1.3]";

  /** (D.3-POSNL, SCPECG[1.3], "possibly normal ECG") */
  public static final String PossiblyNormalECG = "D.3-POSNL\\SCPECG[1.3]";

  /** (D.3-PMI, SCPECG[1.3], "posterior myocardial infarction") */
  public static final String PosteriorMyocardialInfarction = "D.3-PMI\\SCPECG[1.3]";

  /** (D.3-STPVC, SCPECG[1.3], "post-extrasystolic T-wave changes") */
  public static final String PostExtrasystolicTWaveChanges = "D.3-STPVC\\SCPECG[1.3]";

  /** (D.3-POSTO, SCPECG[1.3], "post-operative changes") */
  public static final String PostOperativeChanges = "D.3-POSTO\\SCPECG[1.3]";

  /** (D.3-DSPRE, SCPECG[1.3], "precordial leads double standard calibration") */
  public static final String PrecordialLeadsDoubleStandardCalibration = "D.3-DSPRE\\SCPECG[1.3]";

  /** (D.3-HSPRE, SCPECG[1.3], "precordial leads half standard calibration") */
  public static final String PrecordialLeadsHalfStandardCalibration = "D.3-HSPRE\\SCPECG[1.3]";

  /** (D.3-B2T1, SCPECG[1.3], "(predominant) 2:1 block") */
  public static final String Predominant21Block = "D.3-B2T1\\SCPECG[1.3]";

  /** (D.3-C2T1, SCPECG[1.3], "(predominant) 2:1 conduction") */
  public static final String Predominant21Conduction = "D.3-C2T1\\SCPECG[1.3]";

  /** (D.3-B351, SCPECG[1.3], "(predominant) 3:1 block") */
  public static final String Predominant31Block = "D.3-B351\\SCPECG[1.3]";

  /** (D.3-C3T1, SCPECG[1.3], "(predominant) 3:1 conduction") */
  public static final String Predominant31Conduction = "D.3-C3T1\\SCPECG[1.3]";

  /** (D.3-B4T1, SCPECG[1.3], "(predominant) 4:1 block") */
  public static final String Predominant41Block = "D.3-B4T1\\SCPECG[1.3]";

  /** (D.3-C4T1, SCPECG[1.3], "(predominant) 4:1 conduction") */
  public static final String Predominant41Conduction = "D.3-C4T1\\SCPECG[1.3]";

  /** (D.3-B5T1, SCPECG[1.3], "(predominant) 5:1 block") */
  public static final String Predominant51Block = "D.3-B5T1\\SCPECG[1.3]";

  /** (D.3-C5T1, SCPECG[1.3], "(predominant) 5:1 conduction") */
  public static final String Predominant51Conduction = "D.3-C5T1\\SCPECG[1.3]";

  /** (D.3-PREEX, SCPECG[1.3], "pre-excitation") */
  public static final String PreExcitation = "D.3-PREEX\\SCPECG[1.3]";

  /** (D.3-PRC, SCPECG[1.3], "premature complex(es)") */
  public static final String PrematureComplexEs = "D.3-PRC\\SCPECG[1.3]";

  /** (D.3-PRANT, SCPECG[1.3], "prominent anterior forces") */
  public static final String ProminentAnteriorForces = "D.3-PRANT\\SCPECG[1.3]";

  /** (D.3-PROMR, SCPECG[1.3], "prominent R waves in right precordial leads") */
  public static final String ProminentRWavesInRightPrecordialLeads = "D.3-PROMR\\SCPECG[1.3]";

  /** (D.3-PE, SCPECG[1.3], "pulmonary emphysema") */
  public static final String PulmonaryEmphysema = "D.3-PE\\SCPECG[1.3]";

  /** (D.3-AXIND, SCPECG[1.3], "QRS axis indeterminate") */
  public static final String QRSAxisIndeterminate = "D.3-AXIND\\SCPECG[1.3]";

  /** (D.3-QWAVE, SCPECG[1.3], "Q waves present") */
  public static final String QWavesPresent = "D.3-QWAVE\\SCPECG[1.3]";

  /** (D.3-RVR, SCPECG[1.3], "rapid ventricular response") */
  public static final String RapidVentricularResponse = "D.3-RVR\\SCPECG[1.3]";

  /** (D.3-RATE, SCPECG[1.3], "rate, not specified ventricular or atrial") */
  public static final String RateNotSpecifiedVentricularOrAtrial = "D.3-RATE\\SCPECG[1.3]";

  /** (D.3-RECIP, SCPECG[1.3], "reciprocal or re-entrant impulse") */
  public static final String ReciprocalOrReEntrantImpulse = "D.3-RECIP\\SCPECG[1.3]";

  /** (D.3-RST, SCPECG[1.3], "reciprocal ST-T changes") */
  public static final String ReciprocalSTTChanges = "D.3-RST\\SCPECG[1.3]";

  /** (D.3-RENTR, SCPECG[1.3], "re-entry phenomenon") */
  public static final String ReEntryPhenomenon = "D.3-RENTR\\SCPECG[1.3]";

  /** (D.3-REGRH, SCPECG[1.3], "regular rhythm") */
  public static final String RegularRhythm = "D.3-REGRH\\SCPECG[1.3]";

  /** (D.3-ACET, SCPECG[1.3], "related to pacemaker activity") */
  public static final String RelatedToPacemakerActivity = "D.3-ACET\\SCPECG[1.3]";

  /** (D.3-RETCO, SCPECG[1.3], "retrograde conduction") */
  public static final String RetrogradeConduction = "D.3-RETCO\\SCPECG[1.3]";

  /** (D.3-AECHO, SCPECG[1.3], "return of impulse to its chamber of origin: the atrium") */
  public static final String ReturnOfImpulseToItsChamberOfOriginTheAtrium = "D.3-AECHO\\SCPECG[1.3]";

  /** (D.3-VECHO, SCPECG[1.3], "return of impulse to its chamber of origin: the ventricle") */
  public static final String ReturnOfImpulseToItsChamberOfOriginTheVentricle = "D.3-VECHO\\SCPECG[1.3]";

  /** (D.3-STPAC, SCPECG[1.3], "review ST-T analysis for the effects of pacing") */
  public static final String ReviewSTTAnalysisForTheEffectsOfPacing = "D.3-STPAC\\SCPECG[1.3]";

  /** (D.3-RHY, SCPECG[1.3], "rhythm") */
  public static final String Rhythm = "D.3-RHY\\SCPECG[1.3]";

  /** (D.3-RAE, SCPECG[1.3], "right atrial enlargement") */
  public static final String RightAtrialEnlargement = "D.3-RAE\\SCPECG[1.3]";

  /** (D.3-RAO, SCPECG[1.3], "right atrial overload") */
  public static final String RightAtrialOverload = "D.3-RAO\\SCPECG[1.3]";

  /** (D.3-RAD, SCPECG[1.3], "right axis deviation of QRS in frontal plane (> +90)") */
  public static final String RightAxisDeviationOfQRSInFrontalPlaneGreater90 = "D.3-RAD\\SCPECG[1.3]";

  /** (D.3-RVD, SCPECG[1.3], "right ventricular dominance") */
  public static final String RightVentricularDominance = "D.3-RVD\\SCPECG[1.3]";

  /** (D.3-RVH, SCPECG[1.3], "right ventricular hypertrophy") */
  public static final String RightVentricularHypertrophy = "D.3-RVH\\SCPECG[1.3]";

  /** (D.3-AXR, SCPECG[1.3], "rightward axis") */
  public static final String RightwardAxis = "D.3-AXR\\SCPECG[1.3]";

  /** (D.3-RSR1, SCPECG[1.3], "rSr' type in V1 or V2") */
  public static final String RSR1TypeInV1OrV2 = "D.3-RSR1\\SCPECG[1.3]";

  /** (D.3-RAPCS, SCPECG[1.3], "run of atrial premature complexes") */
  public static final String RunOfAtrialPrematureComplexes = "D.3-RAPCS\\SCPECG[1.3]";

  /** (D.3-RATAC, SCPECG[1.3], "run of atrial tachycardia") */
  public static final String RunOfAtrialTachycardia = "D.3-RATAC\\SCPECG[1.3]";

  /** (D.3-RJPCS, SCPECG[1.3], "run of junctional premature complexes") */
  public static final String RunOfJunctionalPrematureComplexes = "D.3-RJPCS\\SCPECG[1.3]";

  /** (D.3-RJTAC, SCPECG[1.3], "run of junctional tachycardia") */
  public static final String RunOfJunctionalTachycardia = "D.3-RJTAC\\SCPECG[1.3]";

  /** (D.3-RPVCS, SCPECG[1.3], "run of ventricular premature complexes") */
  public static final String RunOfVentricularPrematureComplexes = "D.3-RPVCS\\SCPECG[1.3]";

  /** (D.3-RVPCS, SCPECG[1.3], "run of ventricular premature complexes") */
  public static final String RunOfVentricularPrematureComplexes2 = "D.3-RVPCS\\SCPECG[1.3]";

  /** (D.3-RVTAC, SCPECG[1.3], "run of ventricular tachycardia") */
  public static final String RunOfVentricularTachycardia = "D.3-RVTAC\\SCPECG[1.3]";

  /** (D.3-S1S23, SCPECG[1.3], "S1 S2 S3 type QRS pattern") */
  public static final String S1S2S3TypeQRSPattern = "D.3-S1S23\\SCPECG[1.3]";

  /** (D.3-CONG, SCPECG[1.3], "secondary to congenital heart disease") */
  public static final String SecondaryToCongenitalHeartDisease = "D.3-CONG\\SCPECG[1.3]";

  /** (D.3-RESP, SCPECG[1.3], "secondary to respiratory disease") */
  public static final String SecondaryToRespiratoryDisease = "D.3-RESP\\SCPECG[1.3]";

  /** (D.3-VALV, SCPECG[1.3], "secondary to valvular heart disease") */
  public static final String SecondaryToValvularHeartDisease = "D.3-VALV\\SCPECG[1.3]";

  /** (D.3-2AVB, SCPECG[1.3], "second degree AV block") */
  public static final String SecondDegreeAVBlock = "D.3-2AVB\\SCPECG[1.3]";

  /** (D.3-SEHYP, SCPECG[1.3], "septal hypertrophy") */
  public static final String SeptalHypertrophy = "D.3-SEHYP\\SCPECG[1.3]";

  /** (D.3-SHTPR, SCPECG[1.3], "Short PR-interval.") */
  public static final String ShortPRInterval_ = "D.3-SHTPR\\SCPECG[1.3]";

  /** (D.3-SHTQT, SCPECG[1.3], "short QT-interval") */
  public static final String ShortQTInterval = "D.3-SHTQT\\SCPECG[1.3]";

  /** (D.3-SABLK, SCPECG[1.3], "sino-atrial block") */
  public static final String SinoAtrialBlock = "D.3-SABLK\\SCPECG[1.3]";

  /** (D.3-SAR, SCPECG[1.3], "sinus arrest") */
  public static final String SinusArrest = "D.3-SAR\\SCPECG[1.3]";

  /** (D.3-SARA, SCPECG[1.3], "sinus arrest with atrial escape") */
  public static final String SinusArrestWithAtrialEscape = "D.3-SARA\\SCPECG[1.3]";

  /** (D.3-SARJ, SCPECG[1.3], "sinus arrest with junctional escape") */
  public static final String SinusArrestWithJunctionalEscape = "D.3-SARJ\\SCPECG[1.3]";

  /** (D.3-SARSV, SCPECG[1.3], "sinus arrest with supraventricular escape") */
  public static final String SinusArrestWithSupraventricularEscape = "D.3-SARSV\\SCPECG[1.3]";

  /** (D.3-SARV, SCPECG[1.3], "sinus arrest with ventricular escape") */
  public static final String SinusArrestWithVentricularEscape = "D.3-SARV\\SCPECG[1.3]";

  /** (D.3-SARRH, SCPECG[1.3], "sinus arrhythmia") */
  public static final String SinusArrhythmia = "D.3-SARRH\\SCPECG[1.3]";

  /** (D.3-SBRAD, SCPECG[1.3], "sinus bradycardia") */
  public static final String SinusBradycardia = "D.3-SBRAD\\SCPECG[1.3]";

  /** (D.3-SPAUS, SCPECG[1.3], "sinus pause") */
  public static final String SinusPause = "D.3-SPAUS\\SCPECG[1.3]";

  /** (D.3-SR, SCPECG[1.3], "sinus rhythm") */
  public static final String SinusRhythm = "D.3-SR\\SCPECG[1.3]";

  /** (D.3-STACH, SCPECG[1.3], "sinus tachycardia") */
  public static final String SinusTachycardia = "D.3-STACH\\SCPECG[1.3]";

  /** (D.3-SVR, SCPECG[1.3], "slow ventricular response") */
  public static final String SlowVentricularResponse = "D.3-SVR\\SCPECG[1.3]";

  /** (D.3-STVAG, SCPECG[1.3], "ST-elevation V1-V3 possibly due to enhanced vagal tone") */
  public static final String STElevationV1V3PossiblyDueToEnhancedVagalTone = "D.3-STVAG\\SCPECG[1.3]";

  /** (D.3-STT, SCPECG[1.3], "ST-T change") */
  public static final String STTChange = "D.3-STT\\SCPECG[1.3]";

  /** (D.3-REPOL, SCPECG[1.3], "ST-T changes compatible with early repolarization") */
  public static final String STTChangesCompatibleWithEarlyRepolarization = "D.3-REPOL\\SCPECG[1.3]";

  /** (D.3-PERIC, SCPECG[1.3], "ST-T changes compatible with pericarditis") */
  public static final String STTChangesCompatibleWithPericarditis = "D.3-PERIC\\SCPECG[1.3]";

  /** (D.3-ANEUR, SCPECG[1.3], "ST-T changes compatible with ventricular aneurysm") */
  public static final String STTChangesCompatibleWithVentricularAneurysm = "D.3-ANEUR\\SCPECG[1.3]";

  /** (D.3-QUIN, SCPECG[1.3], "ST-T changes due to quinidine-effect") */
  public static final String STTChangesDueToQuinidineEffect = "D.3-QUIN\\SCPECG[1.3]";

  /** (D.3-INJ, SCPECG[1.3], "subendocardial injury") */
  public static final String SubendocardialInjury = "D.3-INJ\\SCPECG[1.3]";

  /** (D.3-MYOIN, SCPECG[1.3], "suggests myocardial infarction, no location specified") */
  public static final String SuggestsMyocardialInfarctionNoLocationSpecified = "D.3-MYOIN\\SCPECG[1.3]";

  /** (D.3-SVARR, SCPECG[1.3], "supraventricular arrhythmia") */
  public static final String SupraventricularArrhythmia = "D.3-SVARR\\SCPECG[1.3]";

  /** (D.3-SVBIG, SCPECG[1.3], "supraventricular bigeminy") */
  public static final String SupraventricularBigeminy = "D.3-SVBIG\\SCPECG[1.3]";

  /** (D.3-SVBRA, SCPECG[1.3], "supraventricular bradycardia") */
  public static final String SupraventricularBradycardia = "D.3-SVBRA\\SCPECG[1.3]";

  /** (D.3-SVEC, SCPECG[1.3], "supraventricular escape complex(es)") */
  public static final String SupraventricularEscapeComplexEs = "D.3-SVEC\\SCPECG[1.3]";

  /** (D.3-SVIC, SCPECG[1.3], "supraventricular interpolated complex(es)") */
  public static final String SupraventricularInterpolatedComplexEs = "D.3-SVIC\\SCPECG[1.3]";

  /** (D.3-SVPC, SCPECG[1.3], "supraventricular premature complex") */
  public static final String SupraventricularPrematureComplex = "D.3-SVPC\\SCPECG[1.3]";

  /** (D.3-SVRHY, SCPECG[1.3], "supraventricular rhythm") */
  public static final String SupraventricularRhythm = "D.3-SVRHY\\SCPECG[1.3]";

  /** (D.3-SVTAC, SCPECG[1.3], "supraventricular tachycardia") */
  public static final String SupraventricularTachycardia = "D.3-SVTAC\\SCPECG[1.3]";

  /** (D.3-SVTRI, SCPECG[1.3], "supraventricular trigeminy") */
  public static final String SupraventricularTrigeminy = "D.3-SVTRI\\SCPECG[1.3]";

  /** (D.3-ARMRE, SCPECG[1.3], "suspect arm leads reversed") */
  public static final String SuspectArmLeadsReversed = "D.3-ARMRE\\SCPECG[1.3]";

  /** (D.3-SVT, SCPECG[1.3], "sustained ventricular tachycardia") */
  public static final String SustainedVentricularTachycardia = "D.3-SVT\\SCPECG[1.3]";

  /** (D.3-TACHO, SCPECG[1.3], "tachycardia, origin unknown or not specified") */
  public static final String TachycardiaOriginUnknownOrNotSpecified = "D.3-TACHO\\SCPECG[1.3]";

  /** (D.3-3AVB, SCPECG[1.3], "third degree AV block") */
  public static final String ThirdDegreeAVBlock = "D.3-3AVB\\SCPECG[1.3]";

  /** (D.3-TORSA, SCPECG[1.3], "torsade des pointes ventricular tachycardia") */
  public static final String TorsadeDesPointesVentricularTachycardia = "D.3-TORSA\\SCPECG[1.3]";

  /** (D.3-TRSLT, SCPECG[1.3], "transition in horizontal leads shifted leftward") */
  public static final String TransitionInHorizontalLeadsShiftedLeftward = "D.3-TRSLT\\SCPECG[1.3]";

  /** (D.3-TRSRT, SCPECG[1.3], "transition in horizontal leads shifted rightward") */
  public static final String TransitionInHorizontalLeadsShiftedRightward = "D.3-TRSRT\\SCPECG[1.3]";

  /** (D.3-TRNZL, SCPECG[1.3], "Transition zone in precordial leads displaced to left") */
  public static final String TransitionZoneInPrecordialLeadsDisplacedToLeft = "D.3-TRNZL\\SCPECG[1.3]";

  /** (D.3-TRNZR, SCPECG[1.3], "Transition zone in precordial leads displaced to right") */
  public static final String TransitionZoneInPrecordialLeadsDisplacedToRight = "D.3-TRNZR\\SCPECG[1.3]";

  /** (D.3-TRFAS, SCPECG[1.3], "trifascicular block") */
  public static final String TrifascicularBlock = "D.3-TRFAS\\SCPECG[1.3]";

  /** (D.3-TRIGU, SCPECG[1.3], "trigeminal pattern") */
  public static final String TrigeminalPattern = "D.3-TRIGU\\SCPECG[1.3]";

  /** (D.3-TAB, SCPECG[1.3], "T-wave abnormality") */
  public static final String TWaveAbnormality = "D.3-TAB\\SCPECG[1.3]";

  /** (D.3-UNRHY, SCPECG[1.3], "undetermined rhythm") */
  public static final String UndeterminedRhythm = "D.3-UNRHY\\SCPECG[1.3]";

  /** (D.3-EPU, SCPECG[1.3], "unipolar electronic pacemaker") */
  public static final String UnipolarElectronicPacemaker = "D.3-EPU\\SCPECG[1.3]";

  /** (D.3-EPURV, SCPECG[1.3], "unipolar electronic pacemaker at the apex of the right ventricle") */
  public static final String UnipolarElectronicPacemakerAtTheApexOfTheRightVentricle = "D.3-EPURV\\SCPECG[1.3]";

  /** (D.3-BBB, SCPECG[1.3], "unspecified bundle branch block") */
  public static final String UnspecifiedBundleBranchBlock = "D.3-BBB\\SCPECG[1.3]";

  /** (D.3-BLOCK, SCPECG[1.3], "unspecified delay or failure of impulse propagation") */
  public static final String UnspecifiedDelayOrFailureOfImpulsePropagation = "D.3-BLOCK\\SCPECG[1.3]";

  /** (D.3-UFB, SCPECG[1.3], "unusual for build") */
  public static final String UnusualForBuild = "D.3-UFB\\SCPECG[1.3]";

  /** (D.3-UNPAX, SCPECG[1.3], "unusual P-axis") */
  public static final String UnusualPAxis = "D.3-UNPAX\\SCPECG[1.3]";

  /** (D.3-VARBL, SCPECG[1.3], "variable block") */
  public static final String VariableBlock = "D.3-VARBL\\SCPECG[1.3]";

  /** (D.3-VARCO, SCPECG[1.3], "variable conduction") */
  public static final String VariableConduction = "D.3-VARCO\\SCPECG[1.3]";

  /** (D.3-VCOUP, SCPECG[1.3], "variable coupling interval") */
  public static final String VariableCouplingInterval = "D.3-VCOUP\\SCPECG[1.3]";

  /** (D.3-PAVAT, SCPECG[1.3], "VAT pacemaker") */
  public static final String VATPacemaker = "D.3-PAVAT\\SCPECG[1.3]";

  /** (D.3-PAVDD, SCPECG[1.3], "VDD pacemaker") */
  public static final String VDDPacemaker = "D.3-PAVDD\\SCPECG[1.3]";

  /** (D.3-VBIG, SCPECG[1.3], "ventricular bigeminy") */
  public static final String VentricularBigeminy = "D.3-VBIG\\SCPECG[1.3]";

  /** (D.3-VEC, SCPECG[1.3], "ventricular escape complex(es)") */
  public static final String VentricularEscapeComplexEs = "D.3-VEC\\SCPECG[1.3]";

  /** (D.3-VESCR, SCPECG[1.3], "ventricular escape rhythm") */
  public static final String VentricularEscapeRhythm = "D.3-VESCR\\SCPECG[1.3]";

  /** (D.3-VFIB, SCPECG[1.3], "ventricular fibrillation") */
  public static final String VentricularFibrillation = "D.3-VFIB\\SCPECG[1.3]";

  /** (D.3-VFLT, SCPECG[1.3], "ventricular flutter") */
  public static final String VentricularFlutter = "D.3-VFLT\\SCPECG[1.3]";

  /** (D.3-VIC, SCPECG[1.3], "ventricular interpolated complexes") */
  public static final String VentricularInterpolatedComplexes = "D.3-VIC\\SCPECG[1.3]";

  /** (D.3-VPARA, SCPECG[1.3], "ventricular parasystole") */
  public static final String VentricularParasystole = "D.3-VPARA\\SCPECG[1.3]";

  /** (D.3-VPC, SCPECG[1.3], "ventricular premature complex") */
  public static final String VentricularPrematureComplex = "D.3-VPC\\SCPECG[1.3]";

  /** (D.3-PVC, SCPECG[1.3], "ventricular premature complex") */
  public static final String VentricularPrematureComplex2 = "D.3-PVC\\SCPECG[1.3]";

  /** (D.3-VQUAG, SCPECG[1.3], "ventricular quadrigeminy") */
  public static final String VentricularQuadrigeminy = "D.3-VQUAG\\SCPECG[1.3]";

  /** (D.3-VRATE, SCPECG[1.3], "ventricular rate") */
  public static final String VentricularRate = "D.3-VRATE\\SCPECG[1.3]";

  /** (D.3-VRHYT, SCPECG[1.3], "ventricular rhythm") */
  public static final String VentricularRhythm = "D.3-VRHYT\\SCPECG[1.3]";

  /** (D.3-VTACH, SCPECG[1.3], "ventricular tachycardia") */
  public static final String VentricularTachycardia = "D.3-VTACH\\SCPECG[1.3]";

  /** (D.3-VTRIG, SCPECG[1.3], "ventricular trigeminy") */
  public static final String VentricularTrigeminy = "D.3-VTRIG\\SCPECG[1.3]";

  /** (D.3-VABL, SCPECG[1.3], "ventriculo-atrial block") */
  public static final String VentriculoAtrialBlock = "D.3-VABL\\SCPECG[1.3]";

  /** (D.3-VCLVH, SCPECG[1.3], "voltage criteria (QRS) for left ventricular hypertrophy") */
  public static final String VoltageCriteriaQRSForLeftVentricularHypertrophy = "D.3-VCLVH\\SCPECG[1.3]";

  /** (D.3-VCRVH, SCPECG[1.3], "voltage criteria (QRS) for right ventricular hypertrophy") */
  public static final String VoltageCriteriaQRSForRightVentricularHypertrophy = "D.3-VCRVH\\SCPECG[1.3]";

  /** (D.3-PAVVI, SCPECG[1.3], "VVI pacemaker") */
  public static final String VVIPacemaker = "D.3-PAVVI\\SCPECG[1.3]";

  /** (D.3-WANDP, SCPECG[1.3], "wandering pacemaker") */
  public static final String WanderingPacemaker = "D.3-WANDP\\SCPECG[1.3]";

  /** (D.3-WENCK, SCPECG[1.3], "Wenckebach phenomenon") */
  public static final String WenckebachPhenomenon = "D.3-WENCK\\SCPECG[1.3]";

  /** (D.3-WQTAC, SCPECG[1.3], "wide QRS tachycardia") */
  public static final String WideQRSTachycardia = "D.3-WQTAC\\SCPECG[1.3]";

  /** (D.3-WRV, SCPECG[1.3], "wide rate variation") */
  public static final String WideRateVariation = "D.3-WRV\\SCPECG[1.3]";

  /** (D.3-WPWA, SCPECG[1.3], "Wolf-Parkinson type A") */
  public static final String WolfParkinsonTypeA = "D.3-WPWA\\SCPECG[1.3]";

  /** (D.3-WPWB, SCPECG[1.3], "Wolf-Parkinson type B") */
  public static final String WolfParkinsonTypeB = "D.3-WPWB\\SCPECG[1.3]";

  /** (D.3-WPW, SCPECG[1.3], "Wolf-Parkinson-White syndrome") */
  public static final String WolfParkinsonWhiteSyndrome = "D.3-WPW\\SCPECG[1.3]";
}
