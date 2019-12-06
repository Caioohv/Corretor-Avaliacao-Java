package corretor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class MyBarcodeReader {

	public static String readQRCode(String filePath) throws FileNotFoundException, IOException, NotFoundException {

		BinaryBitmap binaryBitmap = new BinaryBitmap(
				new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(new FileInputStream(filePath)))));
		Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap);
		return qrCodeResult.getText();
	}

	public static String readBarCode(String filePath) throws FileNotFoundException, IOException, NotFoundException {
		
	    Hashtable hints = new Hashtable();
	    hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
	    hints.put(BarcodeFormat.CODE_128, Boolean.TRUE);
	    hints.put(BarcodeFormat.CODE_39, Boolean.TRUE);
	    hints.put(BarcodeFormat.CODE_93, Boolean.TRUE);
	    hints.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
	    
		BinaryBitmap binaryBitmap = new BinaryBitmap(
				new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(new FileInputStream(filePath)))));
		MultiFormatReader reader = new MultiFormatReader();
		//reader.setHints(hints);
		Result qrCodeResult = reader.decode(binaryBitmap);
		return qrCodeResult.getText();
	}



}
