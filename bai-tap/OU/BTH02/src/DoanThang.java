
public class DoanThang
{
	private Diem diemDau;
	private Diem diemCuoi;
	
	DoanThang(){};
	DoanThang(Diem diemDau, Diem diemCuoi)
	{
		this.diemDau = diemDau;
		this.diemCuoi = diemCuoi;
	}
	public Diem getDiemDau()
	{
		return diemDau;
	}
	
	public void setDiemDau(Diem diemDau)
	{
		this.diemDau = diemDau;
	}
	
	public Diem getDiemCuoi()
	{
		return diemCuoi;
	}
	
	public void setDiemCuoi(Diem diemCuoi)
	{
		this.diemCuoi = diemCuoi;
	}
	
	public String ThongTinDT()
	{
		return "[(" + diemDau.getHoanhDo() + ", " + diemDau.getTungDo()")"
	}
	
	public double tinhDoDaiDT()
	{
		return diemDau.tinhKhoangCach(diemCuoi);
	}
	
	public Diem tinhTrungDiem()
	{
		Diem h = new Diem(diemDau.getHoanhDo() + diemCuoi.getHoanhDo()) / 2, (diemDau.getTungDo() + diemDCuoi.getTungDo()/2);
	}
	
	public boolean kiemTra(DoanThang ab)
	{
		double veTrai = (diemDau.getHoanhDo() - diemCuoi.getHoanhDo()) / (diemDau.getTungDo() - diemCuoi.getTungDo());
		double vePhai = (ab.diemDau.getHoanhDo() - ab.diemCuoi.getHoanhDo()) / (ab.diemDau.getTungDo() - ab.diemCuoi.getTungDo());
		if (veTrai == vePhai)
		{
			return true;
		}
		else
			return false;
	}
}
