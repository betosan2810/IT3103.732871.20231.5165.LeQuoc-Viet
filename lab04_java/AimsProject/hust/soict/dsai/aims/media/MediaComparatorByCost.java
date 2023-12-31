package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCost implements Comparator<media>{
	public int compare(media o1, media o2) {
		if (Float.floatToIntBits(o1.getCost()) > Float.floatToIntBits(o2.getCost()))
			return -1;
		if (Float.floatToIntBits(o1.getCost()) == Float.floatToIntBits(o2.getCost()))
			return 0;
		return 1;
    }
}