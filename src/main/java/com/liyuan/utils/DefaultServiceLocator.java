package com.liyuan.utils;

import com.liyuan.service.AccountService;
import com.liyuan.service.ClientService;
import com.liyuan.service.HelloService;
import com.liyuan.service.impl.AccountServiceImpl;
import com.liyuan.service.impl.ClientServiceImpl;

public class DefaultServiceLocator {
    private ClientService clientService = new ClientServiceImpl();

    private AccountService accountService = new AccountServiceImpl();


    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}
