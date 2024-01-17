package parentPackage;

public class ParentClass {
	// public 접근 제한자를 사용한 필드
	public String publicField;
	
	// protected 접근 제한자를 사용한 필드
	protected String protectedField;
	
	public ParentClass() {
		this.protectedField = "Public Field";
	}
	
	public void protectedMethod() {
		System.out.println("This is a public method");
	}
}
