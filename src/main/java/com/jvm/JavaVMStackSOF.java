package com.jvm;

public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF stackSOF = new JavaVMStackSOF();

        try {
            stackSOF.stackLeak();
        }catch (Throwable e) {
            System.out.println("stackLength: " + stackSOF.stackLength);
            throw e;
        }


    }
}
