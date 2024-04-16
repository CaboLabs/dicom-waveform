# dicom-waveform

>
> Author: Pablo Pazos <pablo.pazos@cabolabs.com>
>
> License: do whatever you want, just keep attribution of original author
>

![](resources/dcm1.jpeg)

Glossary:

- ECG = Electrocardiogram or Electrocardiography


## The problem

We were working with a client on cardiac rehabilitation of patients that had heart problems and treatments like surgeries. Rehabilitation consisted on providing physical therapy to patients, alongside with monitoring. Monitoring was done during physical therapy sessions, and the therapist could monitor the patient's heart in real time by using a custom built app on an Android tablet. Initially the device used for monitoring was a one lead wearable ECG, with the possibility of switching to a 12 lead device in the future, for a more complete view of the heart functioning during therapy.

The problem was the device output was a raw custom series of data, an even if the mobile app could just display the data for the clinician, our client wanted to store that data in the clinic/hospital for future reference, and the storage should be standard, not in a custom format defined by the device vendor.

We suggested to use DICOM Waveform, since that format is an international standard and specialized on ECG data. Now the problem was to translate the raw format we got from the device into a valid DICOM Waveform object.

For this, we analyzed the DICOM standard and some samples of DICOM Waveform files (note that these files could contain other types of data that are also waveforms, like sound). Then we created a template in XML format that we can use to manipulate the DICOM object in memory and then encode as a DICOM binary object (DICOM objects are binary, but it's more complex to handle binary objects in memory than using a common text format like XML).


## The solution

We created three scripts in Groovy for this to work.

![](resources/ecg3.jpeg)


### AnalyzeDCM

Reads a DICOM Waveform example and prints out it's internal structure by module (DICOM organizes information in modules using tags).

This script is to help understand the internal strucrure and the tags used for a DICOM Waveform file.

By default it will read the file: `resources/Example.dcm`

Execute:

`$ groovy -cp "./dcm4che-2.0.29/lib/*" src/dicom_waveforms/AnalyzeDCM.groovy`


### DataTransform

This script has all the logic to transform data from the raw format into data that can be added to the final DICOM file. Basically, this takes the specs from the device vendor about how data is represented in the raw format, and it transforms to the correct ranges and units that DICOM can take.

The script read the file `resources/temp_1540393629742` that contains a series of raw data, line by line, it's transformed to the correct values and units and printed out on the terminal.

Execute:

`$ groovy -cp "./dcm4che-2.0.29/lib/*" src/dicom_waveforms/DataTransform.groovy`


### CalmToDicomXml

This script takes a raw file as input and outputs a valid DICOM object in XML with all the raw data transformed to the right ranges and units. The DCM4CHE tool xml2dcm is then used to generate the final binary DICOM object.

Note that the whole process can be automated, since the xml2dcm tool can be executed from code instead of from the terminal by a human.

Execute:

`$ groovy -cp "./dcm4che-2.0.29/lib/*" src/dicom_waveforms/CalmToDicomXml.groovy resources/temp_1540393629742 out-dicom.xml`

Finally:

`$ ./dcm4che-2.0.29/bin/xml2dcm -x out-dicom.xml -o out.dcm`


Requirements:

1. [Groovy Lang](https://groovy-lang.org/)
2. DCM4CHEE (included in the repo)

There is no need to compile the scripts to run them, since they run directly from the groovy command. Though, if you want to reuse the code, you might want to compile so you can use the .jar in your project.
