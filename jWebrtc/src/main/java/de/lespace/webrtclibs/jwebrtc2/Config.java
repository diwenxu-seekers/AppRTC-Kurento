/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lespace.webrtclibs.jwebrtc2;

/**
 *
 * @author nico
 */
public class Config {
    
    public static String default_KMS_WS_URI = "ws://192.168.43.251:8888/kurento";
    public static String serverUrl = "192.168.43.251:8080/jWebrtc";
    public static String turn = "{\n" +
                    "	\"username\": \"akashionata\",\n" +
                    "	\"password\": \"silkroad2015\",\n" +
                    "	\"uris\": [\n" +
                    "		\"turn:5.9.154.226:3478\",\n" +
                    "		\"turn:5.9.154.226:3478?transport=udp\",\n" +
                    "		\"turn:5.9.154.226:3478?transport=tcp\"\n" +
                    "	]\n" +
                    "}";
    
}