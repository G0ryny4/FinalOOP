import java.io.Serializable;
import java.util.List;

public class Controller<T extends LiveBeing<T>> {
    FamilyTree<T> familyTree;
    FamilyTreeView<T> familyTreeView;

    public Controller(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
        this.familyTreeView = new FamilyTreeView<>(familyTree);
    }

    void start() {
        List<T> list = null;
        while (true) {
            String line = null;
            familyTreeView.menu();
            int value = familyTreeView.getValue();
            switch (value) {
                case 1:
                    familyTreeView.EptyLineBefore();
                    list = familyTree.getLiveBeings();
                    familyTreeView.showAllInConsole(list);
                    familyTreeView.EptyLineAfter();
                    break;
                case 2:
                    familyTreeView.EptyLineBefore();
                    list = familyTree.sortByName();
                    familyTreeView.showAllInConsole(list);
                    familyTreeView.EptyLineAfter();
                    break;
                case 3:
                    familyTreeView.EptyLineBefore();
                    list = familyTree.sortByDate();
                    familyTreeView.showAllInConsole(list);
                    familyTreeView.EptyLineAfter();
                    break;
                case 4:
                    familyTreeView.EptyLineBefore();
                    line = familyTreeView.getName();
                    System.out.println(familyTree.findByName(line));
                    familyTreeView.EptyLineAfter();
                    break;
                case 5:
                    familyTreeView.EptyLineBefore();
                    line = familyTreeView.getName();
                    System.out.println(familyTree.findAllByName(line));
                    familyTreeView.EptyLineAfter();
                    break;
                case 6:
                    familyTreeView.EptyLineBefore();
                    familyTreeView.showSaveTreeTitle();
                    InputOutputBin saveInBin = new InputOutputBin();
                    saveInBin.saveAs(familyTree, "liveBeingsList.bin");
                    familyTreeView.EptyLineAfter();
                    break;
                case 7:
                    familyTreeView.EptyLineBefore();
                    familyTreeView.showLoadTreeTitle();
                    InputOutputBin loadFromBin = new InputOutputBin();
                    Serializable restore = loadFromBin.readFrom("liveBeingsList.bin");
                    FamilyTree<T> restoreHumanFamilyTree = (FamilyTree) restore;
                    System.out.println(restoreHumanFamilyTree.getLiveBeings());
                    familyTreeView.EptyLineAfter();
                    break;
                case 8:

                    break;
                case 0:
                    familyTreeView.exit();
                    System.exit(0);
                    break;
                default:

                    break;
            }
        }
    }
}