package entity;

public class SinhVien {
	private String masv;
    private String hodem;
    private String tensv;
    private String telsv;
    private String emailsv;

	public SinhVien(String masv, String hodem, String tensv, String telsv, String emailsv) {
		super();
		this.masv = masv;
		this.hodem = hodem;
		this.tensv = tensv;
		this.telsv = telsv;
		this.emailsv = emailsv;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHodem() {
		return hodem;
	}

	public void setHodem(String hodem) {
		this.hodem = hodem;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public String getTelsv() {
		return telsv;
	}

	public void setTelsv(String telsv) {
		this.telsv = telsv;
	}

	public String getEmailsv() {
		return emailsv;
	}

	public void setEmailsv(String emailsv) {
		this.emailsv = emailsv;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hodem=" + hodem + ", tensv=" + tensv + ", telsv=" + telsv + ", emailsv="
				+ emailsv + "]";
	}
    
    
}
