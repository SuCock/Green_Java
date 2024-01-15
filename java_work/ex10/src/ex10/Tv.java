package ex10;

public class Tv {
	public String color;
	public boolean power;
	public int channel;

	public void power() {
		System.out.println("power 버튼 누름");
		power = !power;
	}

	public void channelUp() {
		++channel;
		System.out.println("채널 올리기");
		System.out.printf("현재 체널은 %d 입니다.", channel);
		System.out.println();
	}

	public void channelDown() {
		--channel;
		if (channel == -1) {
			System.out.println("채널이 음수라서 초기화 합니다.");
			System.out.printf("현재 체널은 %d 입니다.", channel);
			System.out.println();
			channel = 0;
		} else {
			System.out.println("채널 내리기");
			System.out.printf("현재 체널은 %d 입니다.", channel);
			System.out.println();
		}
	}
}
