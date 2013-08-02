import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class FitToBudgetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NavigableSet<LineItem> items = new TreeSet<LineItem>();

		items.add(new LineItem(new Product("First", .04, 10000), 1));
		items.add(new LineItem(new Product("Second", .04, 2000), 2));
		items.add(new LineItem(new Product("Third", .15, 1000), 5));
		items.add(new LineItem(new Product("Fourth", .04, 1000), 5));

		System.out.println("The Input cart has " + items);
		System.out.println("The Output cart has "+fitToBudget(items, 18000));
		
	}

	public static NavigableSet<LineItem> fitToBudget(NavigableSet<LineItem> inCart, int budget) {
		NavigableSet<LineItem> outCart = new TreeSet<LineItem>();
		int currentTotal=0;
		for (Iterator<LineItem> iterator = inCart.iterator(); iterator.hasNext();) {
			LineItem lineItem = (LineItem) iterator.next();
			currentTotal +=lineItem.quantity * lineItem.getProduct().getPrice();			
		}
		System.out.println("The Input cart total price: "+currentTotal+ " and budget is: "+budget );
		Iterator<LineItem> descIterator = inCart.descendingIterator();
		int outTotal =0;
		int remainingBudget = budget - outTotal;
		while (descIterator.hasNext()){
			
			LineItem currentItem = (LineItem) descIterator.next();
			int currentPrice = currentItem.getProduct().getPrice();
			int currentProductQuantity = currentItem.getQuantity();
			int canBeAdded = remainingBudget/currentPrice;
			//System.out.println("Can be added "+canBeAdded);
			if  (canBeAdded !=0){
				if (canBeAdded >= currentProductQuantity ){
					outCart.add(currentItem);
					outTotal +=  currentPrice*currentProductQuantity;
					remainingBudget = budget - outTotal;
					
				}else{
					currentItem.setQuantity(canBeAdded);
					outTotal +=  currentPrice*canBeAdded;
					remainingBudget = budget - outTotal;
					outCart.add(currentItem);
				}
			}else {
				break;
			}	
			
		}
		System.out.println("The Output cart total price: "+outTotal);
		return outCart;
	}

}

class LineItem implements Comparable<LineItem> {

	private Product product;
	int quantity;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LineItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public int compareTo(LineItem a) {
		if (this.getProduct().getProfitability() > a.getProduct()
				.getProfitability()) {
			return 1;
		} else if (this.getProduct().getProfitability() == a.getProduct()
				.getProfitability()){
			if( this.getProduct().getPrice() < this.getProduct().getPrice() ){
				return 1;
			}else {
				return -1;
			}			
		}		
		else {
			return -1;
		}
	}

	public String toString() {
		return "[ Product: " + this.product + ", Product Quantity: " + this.quantity+" ]";
	}

}

class Product {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProfitability() {
		return profitability;
	}

	public void setProfitability(double profitability) {
		this.profitability = profitability;
	}

	double profitability;
	int price;

	public Product(String name, double profitability, int price) {
		super();
		this.name = name;
		this.profitability = profitability;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return " [Name: " + this.name + ", Price: " + this.price
				+ ", Profitability: " + this.profitability+" ]";
	}
}
