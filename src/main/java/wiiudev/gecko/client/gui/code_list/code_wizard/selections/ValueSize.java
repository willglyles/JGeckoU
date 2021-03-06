package wiiudev.gecko.client.gui.code_list.code_wizard.selections;

import wiiudev.gecko.client.connector.utilities.Hexadecimal;

public enum ValueSize
{
	eight_bit(0x00, "8-Bit"), sixteen_bit(0x01, "16-Bit"), thirty_two_bit(0x02, "32-Bit");

	private short value;
	private String text;

	ValueSize(int value, String text)
	{
		this.value = (short) value;
		this.text = text;
	}

	public String getValue()
	{
		return new Hexadecimal(value, 1).toString();
	}

	public static ValueSize get(String valueSize)
	{
		for (ValueSize currentValueSize : values())
		{
			if (currentValueSize.toString().equals(valueSize))
			{
				return currentValueSize;
			}
		}

		return null;
	}

	@Override
	public String toString()
	{
		return text;
	}
}
