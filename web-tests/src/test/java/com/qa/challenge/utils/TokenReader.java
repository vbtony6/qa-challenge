package com.qa.challenge.utils;

import org.json.JSONTokener;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;

public class TokenReader {
    public static JSONObject readToken() throws Exception {
        String json = Files.readString(Paths.get("token.json"));
        return new JSONObject(new JSONTokener(json));
    }
}