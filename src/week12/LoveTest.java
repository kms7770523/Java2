package week12;

public class LoveTest { //무형(신용도,사랑,인기)    유형(자동차,고양이)

	public static void main(String[] args) {
		Love love1 = new Love("카리나",2024,"남이섬가서 사랑을 고백하고 종교때문에 헤어짐",1,10);
		Love love2 = new Love("honey",2014,"동네 꼬마때 친구",3,2);
        love1.print();
        love2.print();
	}

}
class Love{
	
	String name;
	int year;
	String story;
	int period;
	int level;
	public Love(String name, int year, String story, int period, int level) {
		this.name = name;
		this.year = year;
		this.story = story;
		this.period = period;
		this.level = level;
	}
	public void talking() {
		//내용을 프로그래밍한다.
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void print() {
		System.out.println( "Love [name=" + name + ", year=" + year + ", story=" + story + ", period=" + period + ", level=" + level
				+ "]");
	}
	
}