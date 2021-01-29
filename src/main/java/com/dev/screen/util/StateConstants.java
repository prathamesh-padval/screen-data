package com.dev.screen.util;

public class StateConstants {

	public static String[] stateA = { "", "", "Screen Number", "Good Read Next State Number", "Error Screen Number",
			"Read Condition 1", "Read Condition 2", "Read Condition 3", "Card Return Flag",
			"No FIT Match Next State Number" };

	public static String[] stateB = { "", "", "Screen Number", "Time-Out Next State Number", "Cancel Next State Number",
			"Local Pin Check Good PIN Next State Number", "Local Pin Check Maximum Bad PINs Next State Number",
			"Local Pin Check Error Screen Number", "Remote PIN Check Next State Number",
			"Remote PIN Check Maximum PIN retries" };

	public static String[] stateC = { "", "", "Screen Number", "Next State Number", "Must be 000", "Must be 000",
			"Must be 000", "Must be 000", "Must be 000", "Must be 000" };

	public static String[] stateD = { "", "", "Next State Number", "Clear Mask", "'A' Pre-set Mask", "'B' Pre-set Mask",
			"'C' Pre-set Mask", "'D' Pre-set Mask", "Must be 000", "Extension State Number" };

	public static String[] stateE = { "", "", "Screen Number", "Time-Out Next State Number", "Cancel Next State Number",
			"FDK 'A'(or 'I') Next State Number", "FDK 'B'(or 'H') Next State Number",
			"FDK 'C'(or 'G') Next State Number", "FDK 'D'(or 'F') Next State Number", "Buffer Location" };

	public static String[] stateF = { "", "", "Screen Number", "Time-Out Next State Number", "Cancel Next State Number",
			"FDK 'A'(or 'I') Next State Number", "FDK 'B'(or 'H') Next State Number",
			"FDK 'C'(or 'G') Next State Number", "FDK 'D'(or 'F') Next State Number", "Amount Display Number" };

	public static String[] stateG = { "", "", "Amount Check Condition True Next State Number",
			"Amount Check Condition False Next State Number", "Buffer to be Checked", "Integer Multiple Value",
			"Number of Decimal Places", "Currency Type", "Amount Check Condition" };

	public static String[] stateH = { "", "", "Screen Number", "Time-Out Next State Number", "Cancel Next State Number",
			"FDK 'A'(or 'I') Next State Number", "FDK 'B'(or 'H') Next State Number",
			"FDK 'C'(or 'G') Next State Number", "FDK 'D'(or 'F') Next State Number", "Buffer and Display Parameters" };

	public static String[] stateI = { "", "", "Screen Number", "Central Response Timeout Next State Number",
			"Send Track 2 Data", "Send Track 1 and/or Track 3 Data", "Send Operation Code Data", "Send Amount Data",
			"Send PIN Buffer(Buffer A) Data/Select Extended Format",
			"Send General Purpose Buffer B and/or C OR Extension State Number" };

	public static String[] stateJ = { "", "", "Receipt Delivered Screen Number", "Next State Number",
			"No Receipt Delivered Screen Number", "Card Retained Screen Number", "Statement Delivered Screen Number",
			"Must be 000", "BNA Notes Returned Screen Number", "Extension State Number" };
}
