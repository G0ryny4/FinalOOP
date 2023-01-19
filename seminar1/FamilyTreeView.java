import java.util.List;
import java.util.Scanner;

public class FamilyTreeView<T extends LiveBeing<T>> {
    FamilyTree<T> familyTree;
    T liveBeing;

    public FamilyTreeView(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
    }

    public void menu() {
        System.out.println(
                "Выберите нужное действие с генеалогическим деревом. Для выбора введите соответсвующую цифру:\n1 - Показать все объекты дерева\n2 - Сортировать по имени и показать\n3 - Сортировать по дате и показать\n4 - Найти объект по имени и показать первое найденное\n5 - Найти объекты по имени и показать все найденные\n0 - Для выхода.");
    }

    public void showAllInConsole(List<T> liveBeings) {
        for (T liveBeing : liveBeings) {
            System.out.println(liveBeing.toString());
        }
    }

    public int getValue() {
        int value = 0;
        Scanner iScanner = new Scanner(System.in, "Cp866");
        try {
            value = iScanner.nextInt();
        } catch (Exception e) {
            errorMessage(e);
        }
        return value;
    }

    public String getName() {
        String line = null;
        Scanner iScanner = new Scanner(System.in, "Cp866");
        try {
            System.out.println("Введите имя для поиска:");
            line = iScanner.nextLine();
        } catch (Exception e) {
            errorMessage(e);
        }
        return line;
    }

    public void showSaveTreeTitle() {
        System.out.println("SAVE LIVEBEING TREE:");
    }

    public void showLoadTreeTitle() {
        System.out.println("LOAD LIVEBEING TREE:");
    }

    public void EptyLineBefore() {
        System.out.println();
        System.out.println("--------------------");
    }

    public void EptyLineAfter() {
        System.out.println("--------------------");
        System.out.println();
    }

    public void exit() {
        System.out.println("Выходим...");
    }

    

    private void errorMessage(Exception e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
        System.out.println("Повторите ввод, пожалуйста.\n");
    }
}