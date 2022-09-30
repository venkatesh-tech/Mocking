package com.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationsTest {

	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Mock
	private DataService dataServiceMock;

	@Test
	void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5, 8, 9 });
//		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int actual = 9;
		assertEquals(businessImpl.findTheGreatestFromAllData(), actual);

	}

	@Test
	void testFindTheGreatestFromAllDataForOne() {
		// given
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5 });

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

		// when
		int actual = 5;
		// then
		assertEquals(businessImpl.findTheGreatestFromAllData(), actual);

	}

}
