package vo;
//강사/과정이력
public class RecordBean {
	private int Record_Num;//'이력번호',
	private String Teacher_ID;//'강사_아이디',
	private int EDC_Num;//'교육과정_번호',
	public int getRecord_Num() {
		return Record_Num;
	}
	public void setRecord_Num(int record_Num) {
		Record_Num = record_Num;
	}
	public String getTeacher_ID() {
		return Teacher_ID;
	}
	public void setTeacher_ID(String teacher_ID) {
		Teacher_ID = teacher_ID;
	}
	public int getEDC_Num() {
		return EDC_Num;
	}
	public void setEDC_Num(int eDC_Num) {
		EDC_Num = eDC_Num;
	}
	
	
}
