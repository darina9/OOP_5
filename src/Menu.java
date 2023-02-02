import java.util.Scanner;
import java.util.logging.*;

public class Menu {
    public static void mainMenu(){
        Logger logger1 = Logger.getLogger(Filemanager.class.getName());
        ConsoleHandler ch1 = new ConsoleHandler();
        SimpleFormatter sf1 = new SimpleFormatter();
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Отобразить справочник");
        System.out.println("2 - Выгрузить данные");
        System.out.println("3 - Загрузить данные");
        System.out.println(". ".repeat(15)+".");
        System.out.print("Выберите действие: ");
        int input = in.nextInt();
        logger1.info("Действие выполнено.");

        Filemanager run = new Filemanager();
        Addressbook phones = new Addressbook();
        phones.Addressbook();

        switch (input) {
            case 1:
                phones.showAddressBook();
                break;
            case 2:
                phones.Addressbook();
                run.fileExport(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                phones.Addressbook();
                run.fileImport(phones.pb);
                phones.showAddressBook();
                break;
        }
    }

//    public void subMenu(){
//
//    }
}