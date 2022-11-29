package org.example;

import demo.UserAccessGrpc.UserAccessImplBase;
import demo.UserRequests.UserRequestResponse;
import demo.UserRequests.LoginRequest;
import demo.UserRequests.LogoutRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class UserService extends UserAccessImplBase {
    @Override
    public void login(LoginRequest request, StreamObserver<UserRequestResponse> responseObserver) {
         UserRequestResponse.Builder response = UserRequestResponse.newBuilder();

         if(request.getUserName().equalsIgnoreCase("jay") && request.getPassword().equals("jayp")){
             response.setResponseCode(200).setResponseMessage("login success");
         }
         else {
             response.setResponseCode(401).setResponseMessage("wrong username or password");
         }
         responseObserver.onNext(response.build());
         responseObserver.onCompleted();
    }

    @Override
    public void logout(LogoutRequest request, StreamObserver<UserRequestResponse> responseObserver) {
        UserRequestResponse.Builder response = UserRequestResponse.newBuilder();
        if(!request.getUsername().equals("jay")){
            response.setResponseCode(403).setResponseMessage("unknown user");
        }
        else
            response.setResponseCode(200).setResponseMessage("logged out");

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
