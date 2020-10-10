
public class DienThoaiCoDien extends Phone {
	public void ngheRadio(){
		System.out.println("Nghe radio");
	}
	@Override
	void nghe() {
		System.out.println("Điện thoại cổ điển nghe");
		
	}

	@Override
	void goi() {
		System.out.println("Điện thoại cổ điển gọi");
	}

	@Override
	void guiTinNhan() {
		System.out.println("Điện thoại cổ điển gửi tin nhắn");
	}

	@Override
	void nhanTinNhan() {
		System.out.println("Điện thoại cổ điển nhận tin nhắn");
	}
	
	@Override
	public void tanCong() {
		System.out.println("Điện thoại cổ điển tấn công");	
	}

}
