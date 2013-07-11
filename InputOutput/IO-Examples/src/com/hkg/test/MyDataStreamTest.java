package com.hkg.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyDataStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataOutputStream out = null;
		DataInputStream in = null;
		try {
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(dataFile)));
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream(dataFile)));
			for (int i = 0; i < prices.length; i++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}
			System.out.println("Data stored in file.");

			double price;
			int unit;
			String desc;
			double total = 0.0;
			System.out.println("Start Data recieving.");
			while (true) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.println("price is :" +price);
				System.out.println("Data recieved from file.");
				System.out.format("You ordered %d" + " units of %s at $%.2f%n",
						unit, desc, price);
				total += unit * price;
			}
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt", "Java Mug",
			"Duke Juggling Dolls", "Java Pin", "Java Key Chain" };

}
