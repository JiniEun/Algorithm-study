package leetcode.kidsWithCandies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class KidsWithCandiesTest {

	@Test
	void testAll() {
		assertAll(
			() -> test(new int[]{2, 3, 5, 1, 3}, 3, List.of(true, true, true, false, true)),
			() -> test(new int[]{4, 2, 1, 1, 2}, 1, List.of(true, false, false, false, false)),
			() -> test(new int[]{12, 1, 12}, 10, List.of(true, false, true))
		);
	}

	private void test(int[] candies, int extraCandies, List<Boolean> expected) {

		KidsWithCandies solution = new KidsWithCandies();
		List<Boolean> actual = solution.kidsWithCandies(candies, extraCandies);

		assertEquals(expected, actual);
	}
}