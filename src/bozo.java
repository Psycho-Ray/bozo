public class bozo {

	public static void main(String[] args) {

		RolaDados rola = new RolaDados(6);

		int[] aux = rola.rolar();
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", aux[i]);
		}
		System.out.printf("\n");
		
		System.out.println(rola);

	}
}