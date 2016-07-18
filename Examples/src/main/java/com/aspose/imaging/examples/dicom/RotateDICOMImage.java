package com.aspose.imaging.examples.dicom;

import com.aspose.imaging.examples.Utils;

public class RotateDICOMImage {
	public static void main(String... args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RotateDICOMImage.class);
		String inputFile = dataDir + "image.dcm";
		String outputFile = dataDir + "rotate.bmp";

		com.aspose.imaging.fileformats.dicom.DicomImage image = new com.aspose.imaging.fileformats.dicom.DicomImage(
				inputFile);

		image.rotate(10);
		image.save(outputFile, new com.aspose.imaging.imageoptions.BmpOptions());
	}

}
