package com.aspose.imaging.examples.dicom;

import com.aspose.imaging.examples.Utils;

public class FlipDICOMImage {
	public static void main(String... args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FlipDICOMImage.class);
		String inputFile = dataDir + "image.dcm";
		String outputFile = "rotate180FlipNone.bmp";

		com.aspose.imaging.fileformats.dicom.DicomImage image = new com.aspose.imaging.fileformats.dicom.DicomImage(
				inputFile);

		image.rotateFlip(com.aspose.imaging.RotateFlipType.Rotate180FlipNone);
		image.save(outputFile, new com.aspose.imaging.imageoptions.BmpOptions());
	}

}
