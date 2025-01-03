package hust.soict.dsai.aims.media;

import java.util.Comparator;
public class MediaComparatorByTitleCost implements Comparator<Media> {
	 public int compare(Media o1, Media o2) {
	        return Comparator.comparing(Media::getTitle).thenComparing(Comparator.comparingDouble(Media::getCost).reversed()).compare(o1, o2);
	    }
}
