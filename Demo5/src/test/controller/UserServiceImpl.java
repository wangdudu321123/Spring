package test.controller;

interface UserServiceBo {
    String sayHello(String name);
    String sayHello2(String name);
}
public class UserServiceImpl implements UserServiceBo{

    @Override
    public String sayHello(String name) {

        return name;
    }

    @Override
    public String sayHello2(String name) {

        return name;
    }
}