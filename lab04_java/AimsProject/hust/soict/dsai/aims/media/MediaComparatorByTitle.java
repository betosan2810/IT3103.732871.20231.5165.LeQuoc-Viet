package hust.soict.dsai.aims.media;

import java.util.Comparator;
public class MediaComparatorByTitle implements Comparator<media> {
	public int compare(media o1, media o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}