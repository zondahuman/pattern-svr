package com.abin.lee.pattern.mode.agent;

/**
 * Created by abin on 2018/9/9.
 */
public class Agent implements Task {

    public void run(String param) {
        Origin origin = new Origin();
        origin.run(param);
    }


    public static void main(String[] args) {
        Task agent = new Agent();
        agent.run("agent mode");
    }


}
