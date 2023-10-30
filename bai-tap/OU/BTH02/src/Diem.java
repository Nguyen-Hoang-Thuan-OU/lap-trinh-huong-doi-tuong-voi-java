

public class Diem
{
	private double tungDo;
	private double hoanhDo;
	
	Diem(){};
	Diem(double hoanhDo, double tungDo)
	{
		this.hoanhDo = hoanhDo;
		this.tungDo = tungDo;
	}

	public double getTungDo()
	{
		return tungDo;
	}

	public void setTungDo(double tungDo)
	{
		this.tungDo = tungDo;
	}

	public double getHoanhDo()
	{
		return hoanhDo;
	}

	public void setHoanhDo(double hoanhDo)
	{
		this.hoanhDo = hoanhDo;
	}
	
	public String hienThi()
	{
		return "(" + hoanhDo + ", " + tungDo + ")";
	}
	
	public double tinhKhoangCach (Diem a)
	{
		return Math.sqrt(Math.pow(hoanhDo - a.hoanhDo, 2) + Math.pow(tungDo - a.tungDo, 2));
	}

}
