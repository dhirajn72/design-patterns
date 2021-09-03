package com.facade;
public class Client {
	public static void main(String[] args) {
		CarEngineFacade carEngineFacade =new CarEngineFacade();
		carEngineFacade.startEngine();
		carEngineFacade.stopEngine();
	}
}
