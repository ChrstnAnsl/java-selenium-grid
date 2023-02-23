package com.chrstnnsl.test;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.chrstnnsl.Base.Remote;

public class RemoteTest {

    @Test
    public void test() throws MalformedURLException {
        Remote remote = new Remote();
        
        remote.test();
    }
}
