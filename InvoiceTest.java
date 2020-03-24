public class InvoiceTest {

	public static void main(String[] args) {

		
		
		Invoice invoice1 = new Invoice("P000001", "Part Number 1", 5, 4.99);
		System.out.println("Standard Functionality Test.  Total Invoice should be 24.95");
		printInvoiceMessage(invoice1);
		
		
		Invoice invoice2 = new Invoice("P000002", "Part Number 2", 0, 4.99);
		System.out.println("Testing 0 Quantity.  Total Invoice should be 0");
		printInvoiceMessage(invoice2);
		
		
		Invoice invoice3 = new Invoice("P000003", "Part Number 3", -2, 4.99);
		System.out.println("Testing negative Quanity.  Total Invoice should be 0");
		printInvoiceMessage(invoice3);
		
		
		Invoice invoice4 = new Invoice("P000004", "Part Number 4", 5, -4.99);
		System.out.println("Testing Negative Price.  Total Invoice should be 0");
		printInvoiceMessage(invoice4);
		
		
		Invoice invoice5 = new Invoice("P000005", "Part Number 5", 72, 187.65);
		System.out.println("Standard Functionality Test with some larger numbers.  Total Invoice should be 13510.80");
		printInvoiceMessage(invoice5);
		
		
		Invoice invoice6 = new Invoice();
		invoice6.setPartNumber("P00006");
		invoice6.setPartDescription("Part Number 6");
		invoice6.setQuantity(20);
		invoice6.setPricePerItem(22.99);
		System.out.println("Testing Bean setters.  Total Invoice should be 459.80");
		printInvoiceMessage(invoice6);
		
		invoice6.setQuantity(-33);
		System.out.println("Testing Bean setters with negative Quantity.  Total Invoice should be 0");
		printInvoiceMessage(invoice6);
		
		
		invoice6.setQuantity(20); 
		invoice6.setPricePerItem(-33.98);
		System.out.println("Testing Bean setters with negative Price Per Item.  Total Invoice should be 0");
		printInvoiceMessage(invoice6);
	}
	
	public static void printInvoiceMessage(Invoice invoice){

		System.out.printf("Invoice for Part: %s \t", invoice.getPartNumber() );
		System.out.printf("Part Description: %s \t", invoice.getPartDescription() );
		System.out.printf("Quantity: %s \t", invoice.getQuantity() );
		System.out.printf("Price Per Item: %.2f \n", invoice.getPricePerItem());
		System.out.printf("Total Invoice Amount: %.2f \n", invoice.getInvoiceAmount() );
		System.out.println("***************************************************");
		System.out.println();
	}

}