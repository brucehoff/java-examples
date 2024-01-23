
abstract public class Barcode {
	
	class UpcBarcode extends Barcode {
	    public int[] upc = new int[4];		
	    
	    boolean match(Barcode other) {
	    	UpcBarcode otherUpcBarcode = (UpcBarcode)other;
	    	return otherUpcBarcode.upc[0] % 2 == 0 && otherUpcBarcode.upc[2] % 2 == 0 && otherUpcBarcode.upc[3] % 2 == 0;
	    }
	}
	
	class QrCodeBarcode extends Barcode {
		public String qrCode;
		
		boolean match(Barcode other) {
			QrCodeBarcode otheQrCodeBarcode = (QrCodeBarcode)other;
			 return otheQrCodeBarcode.qrCode.length() % 2 == 0;
		}
	}
	

	private Barcode() {
	}
	
	abstract boolean match(Barcode other);

}
