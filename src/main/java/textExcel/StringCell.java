package textExcel;

public class StringCell implements Cell {
    private final String value;

    public StringCell(String value) {
        this.value = value;
    }

    @Override
    public String abbreviatedCellText() {
        String s = value;
        if (s.length() > 10) return s.substring(0, 10);
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            for (int i = s.length(); i < 10; i++)
                sb.append(" ");
            return sb.toString();
        }
    }

    @Override
    public String fullCellText() {
        return "\"" + value + "\"";
    }
}
