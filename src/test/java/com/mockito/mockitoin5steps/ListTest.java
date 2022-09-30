package com.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListTest {

	@Mock
	private List listMock;

	@Test
	void test() {
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}

	@Test
	void testSize_MultipleReturns() {
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}

	@Test
	void testGet_SpecificParameter() {
		when(listMock.get(0)).thenReturn("Some String");
		assertEquals("Some String", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

	@Test
	void testGet_GenericParameter() {
		when(listMock.get(anyInt())).thenReturn("Some String");
		assertEquals("Some String", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

}
