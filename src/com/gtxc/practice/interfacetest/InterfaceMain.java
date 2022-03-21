package com.gtxc.practice.interfacetest;

/*
    Created by gt at 2:46 PM on Friday, March 04, 2022.
    Project: practice, Package: com.gtxc.practice.interfacetest.
*/

public class InterfaceMain {
    public static void main(String[] args) {
        CommonInterface commonInterfaceUser = new UserMessage();
        CommonInterface commonInterfaceOperator = new OperatorMessage();

        commonInterfaceUser.getMessage("message user");
        commonInterfaceOperator.getMessage("message operator");
    }
}
