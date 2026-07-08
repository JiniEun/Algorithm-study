package leetcode.kidsWithCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int maxCandy = -1;

		for (int c : candies) {
			maxCandy = Math.max(maxCandy, c);
		}

		List<Boolean> result = new ArrayList<>();
		for (int c : candies) {
			result.add(c + extraCandies >= maxCandy);
		}
		return result;
	}
}
