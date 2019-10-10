public class NegyAzonosSzam {

	public static boolean isConsecutiveFour(int[] values) {
		boolean van = false;
		if (values.length < 4) {
			return false;
		}
		int db = 1;
		for (int i = 0; i < values.length - 1; ++i) {
			if (values[i] == values[i + 1]) {
				db++;
			}
			if (values[i] != values[i + 1]) {
				if (db > 3) {
					van = true;

				}
				db = 1;
			}
		}
		if (db > 3) {
			van = true;
		}
		return van;
	}

	public static void main(String[] args) {
		int[] values = {6, 6, 6, 6 };

		System.out.println(isConsecutiveFour(values));

	}

}
