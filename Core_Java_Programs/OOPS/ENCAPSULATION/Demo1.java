 class Student{
	private int rollno;
	private int mark;

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}

}

class Demo1{
	public static void main(String[] args) {
		Student ob = new Student();

		//System.out.println(ob.mark);
		//System.out.println(ob.rollno);
		//ob.mark = 20;
		//ob.rollno = 1111;

		System.out.println("mark:"+ob.getMark());
		ob.setMark(88);
		System.out.println("mark:"+ob.getMark());

		System.out.println("Roll:"+ob.getRollno());
		ob.setRollno(102);
		System.out.println("Roll:"+ob.getRollno());
	}
}
