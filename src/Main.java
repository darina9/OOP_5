import java.util.logging.*;

//Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
//  под форматами понимаем структуру файлов, например:
//  - в файле на одной строке хранится одна часть записи, пустая строка - разделитель
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);


//        Main run = new Main();
//        run.ExportFile(ArrayList<Phonebook> pb);
//        Filemanager run = new Filemanager();
//        Addressbook phones = new Addressbook();
//        phones.Addressbook();
////        run.ExportFile(phones.pb);
////        System.out.println(phones.pb);
//        run.ImportFile(phones.pb);
//        System.out.println("****************");
//        phones.showAddressBook();

        Menu.mainMenu();
        logger.info("Программа выполнена.");


    }


}