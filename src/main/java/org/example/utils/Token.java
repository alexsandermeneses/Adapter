package org.example.utils;

public class Token {
    private String token;

    public Token(){
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9." +
                "eyJuYW1lIjoiSm9obiBEb2UiLCJpYXQiOjE1MTYyMzkwMjJ9." +
                "MB0aQEfFDNUEEfMUtprbyYhuBcXVw734P81CG1103oM";
    }

    public String getToken(){
        return token;
    }
}
