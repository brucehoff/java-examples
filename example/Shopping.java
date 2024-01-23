
import java.util.*;


public class Shopping {
	

	public static void main(String[] args) {


		ArrayList<Items> AvailableItems = new ArrayList<>();

		ArrayList<Items> ShoppingList = new ArrayList<>();

		int option = 0;

		while(option != 7) {


			//prompts the user with the various options for both the shopping and available items list

			System.out.println("Shopping List\n------------------------------");

			System.out.println("1) Add to Shopping List");

			System.out.println("2) Remove from Shopping List");

			System.out.println("3) Print Shopping List\n");

			System.out.println("Available Items\n------------------------------");

			System.out.println("4) Add to Available Items");

			System.out.println("5) Remove from Available Items");

			System.out.println("6) Print Available Items\n");

			System.out.println("7) Exit Program");

			System.out.print("Select Option: ");

			option = (new Scanner(System.in)).nextInt();


			//add an item to the shopping list from the available items ArrayList

			if(option == 1) {

				System.out.println();

				int userOption;

				System.out.println("Items in Available Items:");

				if(AvailableItems.size() == 0) {

					System.out.println("Available Items is empty.");

				} else {

					for(int i=0; i<AvailableItems.size(); i++) {

						System.out.println(i+1 + ") " + AvailableItems.get(i).getName() + ", " + AvailableItems.get(i).getAmount() + " - " + AvailableItems.get(i).getDepartment() + " - " + AvailableItems.get(i).getCost());

					}

				}

				System.out.print("Please enter the number option you would like to add: ");

				userOption = (new Scanner(System.in)).nextInt();

				ShoppingList.add(AvailableItems.get(userOption-1));

			}


			//removes an item from the shopping list

			if(option == 2) {

				System.out.println();

				String userOption;

				System.out.print("Please enter the item you would like to remove: ");

				userOption = (new Scanner(System.in)).next();

				for(int i=0; i<ShoppingList.size(); i++) {

					if(ShoppingList.get(i).getName().equals(userOption)) {

						ShoppingList.remove(ShoppingList.get(i));

					}

				}

				System.out.println();

			}


			//prints the shopping list

			if(option == 3) {

				System.out.println();

				System.out.println("Items in Shopping List:");

				if(ShoppingList.size() == 0) {

					System.out.println("Shopping List is empty.");

				} else {

					for(int i=0; i<ShoppingList.size(); i++) {

						System.out.println(i+1 + ") " + ShoppingList.get(i).getName() + ", " + ShoppingList.get(i).getAmount() + " - " + ShoppingList.get(i).getDepartment() + " - " + ShoppingList.get(i).getCost());

					}

				}

				System.out.println();

			}


			//adds an item to the available items ArrayList

			if(option == 4) {

				System.out.println();

				Items item = new Items();

				String itemName;

				String itemAmount;

				String itemDepartment;

				float itemCost;

				System.out.print("Please enter the name of the item you would like to add: ");

				itemName = (new Scanner(System.in)).next();

				System.out.print("Please enter the amount of the item (Dozen, 2 lbs, Gallon, etc): ");

				itemAmount = (new Scanner(System.in)).nextLine();

				System.out.print("Please enter the department of the item (Dairy, Produce, Sea Food, etc): ");

				itemDepartment = (new Scanner(System.in)).nextLine();

				System.out.print("Please enter the cost of the item: ");

				itemCost = (new Scanner(System.in)).nextFloat();

				item.setName(itemName);

				item.setAmount(itemAmount);

				item.setDepartment(itemDepartment);

				item.setCost(itemCost);

				AvailableItems.add(item);

			}


			//removes an item from the available items list

			if(option == 5) {

				System.out.println();

				String userOption;

				System.out.print("Please enter the item you would like to remove: ");

				userOption = (new Scanner(System.in)).next();

				for(int i=0; i<AvailableItems.size(); i++) {

					if(AvailableItems.get(i).getName().equals(userOption)) {

						AvailableItems.remove(AvailableItems.get(i));

					}

				}

				System.out.println();

			}
		}
	}
}
