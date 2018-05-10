package com.bdd.entry;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String[] arguments = {"--tag", "@login", "--glue", "com.bdd.stepDefinitions", "src/test/resources" };
	    cucumber.api.cli.Main.main(arguments);
	}

}
