// Класс пульта управления
public class RemoteControl {
    private Command[] buttons;

    public RemoteControl() {
        buttons = new Command[6]; // 6 кнопок на пульте
    }

    // Установка команды на определенную кнопку
    public void setCommand(int buttonIndex, Command command) {
        buttons[buttonIndex] = command;
    }

    // Нажатие кнопки
    public void pressButton(int buttonIndex) {
        if (buttons[buttonIndex] != null) {
            buttons[buttonIndex].execute();
        } else {
            System.out.println("Кнопка не запрограммирована.");
        }
    }
}

//
//import java.util.HashMap;
//import java.util.Map;
//
//// Класс пульта дистанционного управления.
//// Позволяет добавлять команды и выполнять их по идентификатору.
//public class RemoteControl {
//    private final Map<String, Command> commands = new HashMap<>();
//
//    // Метод для добавления команды.
//    public void addCommand(String name, Command command) {
//        commands.put(name, command);
//    }
//
//    // Выполняет команду по указанному идентификатору кнопки.
//    public void pressButton(String name) {
//        Command command = commands.get(name);
//        if (command != null) {
//            command.execute();
//        } else {
//            System.out.println("Command '" + name + "' not found.");
//        }
//    }
//}