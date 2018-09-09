package com.abin.lee.pattern.mode.agent;

/**
 * Created by abin on 2018/9/9.
 */
public class Agent implements Task {
    Origin origin;

    public Agent(Origin origin) {
        this.origin = origin;
    }

    public void run(String param) {
        origin.run(param);
    }


    public static void main(String[] args) {
        Origin origin = new Origin();
        Task agent = new Agent(origin);
        agent.run("agent mode");
    }
}
