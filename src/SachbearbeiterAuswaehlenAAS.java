public class SachbearbeiterAuswaehlenAAS {
    private final SachbearbeiterAuswaehlenK saK;
    public SachbearbeiterAuswaehlenAAS() {
        saK = new SachbearbeiterAuswaehlenK();
    }
    public String oeffnen() {
        preasentiereSachbearbeiterNamen();
        return selektiereSachbearbeiter();
    }
    private void preasentiereSachbearbeiterNamen() {
        System.out.println("Die Namen der Sachbearbeiter sind: ");
        String[] s = saK.gibSachbearbeiterNamen();
        for(String text : s) {
            System.out.println(text);
        }
    }
    public String selektiereSachbearbeiter() {
        return Auswaehlen.waehleAus(saK.gibSachbearbeiterNamen());
    }
}
