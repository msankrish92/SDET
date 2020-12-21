package ls.list;

import java.util.Iterator;
import java.util.LinkedList;

public class DoublyLinkedList {

	public static void main(String[] args) {

		LinkedList<String> team = new LinkedList<>();

		team.add("Sanjay");
		team.add("Nataraj");
		team.add("Muralee");
		team.add("Adhi");

		Iterator<String> iterator = team.iterator();
		int indexOf = team.indexOf("Nataraj");
		System.out.println(team.listIterator(indexOf+1).next());
		while (iterator.hasNext()) {
			if (iterator.next().equals("Nataraj")) {
				System.out.println(iterator.next());
				break;
			}
		}
		team.remove(0);
		System.out.println(team);

		Iterator<String> iterator2 = team.iterator();
		while (iterator2.hasNext()) {
			if (iterator2.next() == "Adhi") {
				System.out.println("found");
				break;
			}
		}
	}

}
