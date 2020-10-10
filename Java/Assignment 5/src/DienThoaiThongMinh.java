
public class DienThoaiThongMinh extends Phone {
	public void chupHinh(){
		System.out.println("Chup Hinh");
	}
	
	public void dung3G(){
		System.out.println("Su dung 3G");
	}
	@Override
	void nghe() {		
		System.out.println("Điện thoại thông minh nghe");
	}

	@Override
	void goi() {
		System.out.println("Điện thoại thông minh gọi");		
	}

	@Override
	void guiTinNhan() {
		System.out.println("Điện thoại thông minh gửi tin nhắn");	
	}

	@Override
	void nhanTinNhan() {		
		System.out.println("Điện thoại thông minh nhận tin nhắn");	
	}

	@Override
	public void tanCong() {
		System.out.println("Điện thoại thông minh tấn công");	
	}
	
}
