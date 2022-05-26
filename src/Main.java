import utils.SuperList;

public class Main {
    public static void main(String[] args) {

        SuperList<Integer> list = new SuperList<>();

        for (int i = 0; i < 10; i++) {
            list.addElement(i);
        }
        System.out.println("ANTES DE BORRAR LOS ELEMENTOS");
        list.showElements();
        System.out.println("----lista reversa abajo----");
        list.showReversedElements();

        list.removeElement(3);

        System.out.println("DESPUES DE BORRAR LOS ELEMENTOS");
        list.showElements();
        System.out.println("----lista reversa abajo----");
        list.showReversedElements();

    }
}
