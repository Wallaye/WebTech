package by.bsuir.server.main;

import by.bsuir.server.service.ServerLogic;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerLogic serverLogic = new ServerLogic();
        serverLogic.startConnection();
    }

}
