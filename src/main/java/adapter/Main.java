package adapter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(new GregorianCalendar(1990, Calendar.JUNE, 15).getTime());

        DataSource adapter = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(adapter);

    }
}
