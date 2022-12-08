package by.bsuir.server.service;

import by.bsuir.server.console.MessagePrinter;
import by.bsuir.server.console.MessageReader;
import by.bsuir.server.entity.criteria.Criteria;
import by.bsuir.server.entity.criteria.SearchCriteria;
import by.bsuir.server.entity.info.ClientInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerLogic {
    private Criteria criteria;
    private Criteria studentCriteria;
    private MessagePrinter messagePrinter;
    private ClientInfo clientInfo;
    private Server server;
    private boolean work;
    private List<Thread> threads;

    public ServerLogic(){
        criteria = new Criteria(SearchCriteria.Client.getCriteriaName());
        studentCriteria = new Criteria(SearchCriteria.Student.getCriteriaName());
        threads = new ArrayList<Thread>();
        server = new Server(this);
        Thread consoleReader = new MessageReader(this);
        consoleReader.start();
        messagePrinter = new MessagePrinter();
    }

    public void startConnection() throws InterruptedException, IOException {
        clientInfo = new ClientInfo();
        clientInfo.setName("");
        clientInfo.setAllowance("");
        boolean isConnect = false;
        while (!isConnect){
            isConnect = server.makeConnection();
        }
        sendData("Please, Login\n");
        work = true;
        while (work){
            String command = server.getCommand();
            Thread newCommand = new CommandHandler(command, this);
            newCommand.start();
            if (!command.equals("EXIT")){
                threads.add(newCommand);
            }
        }
        server.close();
        System.out.println("STOPPED");
    }

    public void stopConnection() throws InterruptedException, IOException {
        for (Thread thread: threads){
            thread.join();
        }
        work = false;
        server.sendClose();
    }

    public void sendData(String data) throws IOException, InterruptedException {
        server.sendData(data);
    }

    public Criteria getClientCriteria(){
        return criteria;
    }

    public ClientInfo getClientInfo(){return clientInfo; }

    public Criteria getStudentCriteria(){return studentCriteria;}
    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }
}