package textExcel;

public class EmptyCell implements Cell {

    @Override
    public String abbreviatedCellText() {
        return "          ";    // 10 spaces - the size of a cell
    }

    @Override
    public String fullCellText() {
        return "";
    }
}
