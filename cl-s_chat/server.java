package server;

import User.User;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) throws Exception {

        ArrayList<Socket> clients = new ArrayList<>();
        Socket socket = null;
        String userNickname;

        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("INFO: Сервер запущен");

            while (true){
                socket = serverSocket.accept(); // Ожидаем клиента
                DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                System.out.println("Клиент подключился");
                out.writeUTF("Кликуху, быстро!");
                userNickname = in.readUTF();
                User user = new User(userNickname, socket);
                clients.add(socket); //Добавляем клиента в список
                System.out.println(user + " подключился");

                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
                            while (true){
                                System.out.println("Ожидаем сообщение...");
                                String request = in.readUTF();
                                String userName = user.getName();
//
                                System.out.println(userName + " прислал сообщение: " + request);
                                for (Socket socket: clients) { // Перебираем список клиентов
                                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                                    out.writeUTF(userName + " отправил сообщение: "+ request);
                                }
                            }
                        }catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });

                thread.start();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
