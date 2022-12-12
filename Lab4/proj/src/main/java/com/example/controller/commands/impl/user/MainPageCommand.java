package com.example.controller.commands.impl.user;


import com.example.controller.commands.Command;
import com.example.controller.commands.CommandResult;
import com.example.entity.impl.RoomEntity;
import com.example.exceptions.ServiceException;
import com.example.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MainPageCommand implements Command {

    private static final String MAIN_PAGE = "/WEB-INF/pages/makeOrder.jsp";
    private static final String ROOM_LIST = "roomList";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, ServiceException {
        RoomService roomService = new RoomService();
        List<RoomEntity> freeRoomList = roomService.findFree();
        request.setAttribute(ROOM_LIST, freeRoomList);
        return CommandResult.forward(MAIN_PAGE);
    }
}
