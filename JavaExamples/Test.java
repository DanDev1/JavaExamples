package knowingjava;
class Test {
	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat () {
		System.out.println("ding ding da-ding");
	}
}

class DrumKitTestDrive {
	public static void main(String[] args) {
		Test d = new Test();
		d.playSnare();
		d.playTopHat();
		
		d.snare = false;
		
		if (d.snare == true) {
			d.playSnare();
		}

		if (d.snare == true) {
			d.playTopHat();
		}
	}
}