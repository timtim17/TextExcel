package textExcel;

public class EmptyCell implements Cell {
    private static final String EMPTY = "";

    @Override
    public String abbreviatedCellText() {
        return EMPTY;
    }

    @Override
    public String fullCellText() {
        return EMPTY;
    }
}
