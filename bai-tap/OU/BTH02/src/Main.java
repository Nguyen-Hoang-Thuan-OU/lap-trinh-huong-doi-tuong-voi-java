
public class Main
{

	public static void main(String[] args)
	{
		Diem c = new Diem (2, 3);
		Diem f = new Diem (3, 4);
		System.out.print(c.hienThi());
		System.out.print(f.hienThi());
		System.out.print(c.tinhKhoangCach(f));
	}
}
