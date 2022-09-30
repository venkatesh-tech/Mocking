package com.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessTest2 {

	private SomeBusinessImpl businessImpl;

	@Mock
	private DataService dataServiceMock;

	@Test
	void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5, 8, 9 });
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();

		int actual = 9;

		assertEquals(result, actual);

	}

	void testFindTheGreatestFromAllDataForOne() {
		// given
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5 }); // First come from last where input should
																				// be taken
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock); // then pass it to the class instance
																				// //beacuse we are using constructor in
																				// SomeBusinessImpl we are passing it
																				// like this
		int result = businessImpl.findTheGreatestFromAllData(); // then call the outer method
		// when
		int actual = 5;
		// then
		assertEquals(result, actual);

	}

}
