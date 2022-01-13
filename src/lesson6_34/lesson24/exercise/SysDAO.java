package lesson6_34.lesson24.exercise;

public class SysDAO {
    private Sys[] syst=new Sys[5];

    public Sys save(Sys sys) {
        int index = 0;
        for (Sys el : syst) {
            if (el == null) {
                syst[index] = sys;
                return syst[index];
            }
            index++;
        }
        return null;
    }
}
