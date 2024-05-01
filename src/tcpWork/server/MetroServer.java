package tcpWork.server;

import tcpWork.MetroCardBank;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MetroServer implements Runnable{
    private MetroCardBank bank;
    private ServerSocket server;
    private int port;

    public MetroServer(int port) {
        this.bank = new MetroCardBank();
        this.port = port;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            server = new ServerSocket(port);
            System.out.println("Server is started");

            while (true){
                System.out.println("Waiting new client...");
                Socket client = server.accept();
                System.out.println("New client:" + client);
                new ClientHandler(bank,client);

                System.out.println(bank);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MetroServer server = new MetroServer(7891);
    }
}