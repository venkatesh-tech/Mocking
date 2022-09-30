//package com.mockito.mockitoin5steps;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.*;
//import org.mockito.Mock;
//
//class SomeBusinessStubTest {
//
//	@Mock
//	private SomeBusinessImpl businessImpl;
//
//	@BeforeEach
//	void init() {
//		SomeBusinessImpl businessImpl = new SomeBusinessImpl();
//	}
//
//	@Test
//	void testFindTheGreatestFromAllData() {
////		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
//		// given
//		int result = businessImpl.findTheGreatestFromAllData();
////		when(this.businessImpl.findTheGreatestFromAllData()).thenReturn(1);
////		System.out.println(businessImpl.findTheGreatestFromAllData());
//		int expected = 9;
//
//		// when
//		int actual = 9;
//		// then
//
//		assertEquals(expected, actual);
//	}
//}
//
////class DataServiceStub implements DataService {
////
////	@Override
////	public int[] retrieveAllData() {
////		return new int[] { 4, 5, 6, 7, 8, 9 };
////	}
////}
