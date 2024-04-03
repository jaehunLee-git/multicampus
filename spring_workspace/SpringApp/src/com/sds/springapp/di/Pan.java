package com.sds.springapp.di;

//has a 관계에서 부품이 될 객체 자료형을 너무 정확한 하위 자료형으로 개발을 하면
//서로 의존성이 강하게 되어 즉 결합도가 강해지므로, 추후 특정 객체가 변경될때, 다른 객체가
//영향을 받게되면서 유지보수성이 떨어지게 된다.따라서 has a 관계 의 부품이 되는 객체는 
//상위 개념의 객체일 수록 코드가 유연해질 수 있다.(즉 영향을 서로 덜 받게 된다)
public interface Pan {
	public void boil();
}
