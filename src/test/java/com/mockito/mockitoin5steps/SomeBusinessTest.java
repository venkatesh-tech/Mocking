package com.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessTest {

	private SomeBusinessImpl businessImpl;

	@Mock
	private DataService dataServiceMock;

	@Test
	void testFindTheGreatestFromAllData() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5, 8, 9 });
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		int expected = 9;

		// when
		int actual = 9;
		// then

		assertEquals(result, actual);
	}
}

//class DataServiceStub implements DataService {
//
//	@Override
//	public int[] retrieveAllData() {
//		return new int[] { 4, 5, 6, 7, 8, 9 };
//	}
//}
