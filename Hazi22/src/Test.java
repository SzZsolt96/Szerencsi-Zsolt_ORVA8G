import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static List<Lakohaz> tagasLakohaz(List<Lakohaz> list, double terfogat) {
		List<Lakohaz> list2 = new ArrayList<Lakohaz>();

		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).legkobmeter() > terfogat) {
				list2.add(new Lakohaz(list.get(i).cim, list.get(i).emeletekSzama, list.get(i).alapterulet));
			}
		}

		return list2;
	}

	public static void main(String[] args) {
		List<Lakohaz> list = new ArrayList<Lakohaz>();

		list.add(new Lakohaz("cim1", 10, 300));
		list.add(new Lakohaz("cim2", 10, 300));
		list.add(new Lakohaz("cim3", 10, 500));
		list.add(new Lakohaz("cim4", 8, 600));
		list.add(new Lakohaz("cim5", 10, 300));
		list.add(new Lakohaz("cim6", 10, 100));
		list.add(new Lakohaz("cim7", 20, 1000));
		list.add(new Lakohaz("cim8", 10, 700));
		list.add(new Lakohaz("cim9", 4, 20));
		list.add(new Lakohaz("cim10", 10, 800));

		List<Lakohaz> list3 = tagasLakohaz(list, 10000.0);

		Collections.sort(list3, Comparator.comparing(Lakohaz::legkobmeter, Comparator.reverseOrder())
				.thenComparing(Lakohaz::getCim, Comparator.naturalOrder()));

		for (Lakohaz lakohaz : list3) {
			System.out.println(lakohaz.toString());
		}
	}
}