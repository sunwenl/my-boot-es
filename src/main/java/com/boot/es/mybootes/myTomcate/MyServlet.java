package com.boot.es.mybootes.myTomcate;

public abstract class MyServlet {
    protected abstract void doGet(MyRequest request, MyResponse response);

    protected abstract void doPost(MyRequest request, MyResponse response);

    public void service(MyRequest request, MyResponse response) throws NoSuchMethodException {
        if (request.getMethod().equalsIgnoreCase("POST")) {
            doPost(request, response);
        } else if (request.getMethod().equalsIgnoreCase("GET")) {
            doGet(request, response);
        } else {
            throw new NoSuchMethodException("not support");
        }
    }
}