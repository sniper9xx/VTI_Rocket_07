
public abstract class Phone implements VuKhi {
	abstract void nghe();

	abstract void goi();

	abstract void guiTinNhan();

	abstract void nhanTinNhan();

	@Override
	public void tanCong() {
		System.out.println("Tấn công");
	}

}
