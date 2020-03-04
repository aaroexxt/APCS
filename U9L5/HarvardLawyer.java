public class HarvardLawyer extends Lawyer {
    public HarvardLawyer() {
        super();
        super.setSalary(super.showSalary()*1.2);
        super.setVacation(super.showVacation()+3);
        String form = super.applyForVacation();
        String finalForm = "";
        for (int i=0; i<4; i++) {
            finalForm+=form;
        }
        super.setForm(finalForm);
    }
}