package com.hkg.test.multicatch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javax.naming.ConfigurationException;
import javax.security.auth.login.Configuration;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	getConfigOld("Test");
		getConfigNew("Test");
	}

	public static Configuration getConfigOld(String fileName) {
		Configuration cfg = null;
		try {
			String fileText = getFile(fileName);
			cfg = verifyConfig(parseConfig(fileText));
		} catch (FileNotFoundException fnfx) {
			System.err.println("Config file '" + fileName + "' is missing");
		} catch (IOException e) {
			System.err
					.println("Error while processing file '" + fileName + "'");
		} catch (ConfigurationException e) {
			System.err.println("Config file '" + fileName
					+ "' is not consistent");
		} catch (ParseException e) {
			System.err.println("Config file '" + fileName + "' is malformed");
		}
		return cfg;
	}

	private static Configuration verifyConfig(Object parseConfig)
			throws ParseException {
		return null;
	}

	private static Object parseConfig(String fileText)
			throws ConfigurationException {
		throw new ConfigurationException();

	}

	public static Configuration getConfigNew(String fileName) {
		Configuration cfg = null;
		try {
			String fileText = getFile(fileName);
			cfg = verifyConfig(parseConfig(fileText));
		} catch (FileNotFoundException | ParseException
				| ConfigurationException e) {
			System.err.println("Config file '" + fileName
					+ "' is missing or malformed");
		} catch (IOException iox) {
			System.err
					.println("Error while processing file '" + fileName + "'");
		}
		return cfg;
	}

	public static String getFile(String fileName) throws IOException {
		throw new IOException();
	}

}
