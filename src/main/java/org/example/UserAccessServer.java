package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class UserAccessServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // build a server for the UserAccess
        Server server = ServerBuilder.forPort(9000).addService(new UserService()).build();
        server.start();
        System.out.println("UserAccess server started on port " + server.getPort());

        server.awaitTermination();
    }
}
