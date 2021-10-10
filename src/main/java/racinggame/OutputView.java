package racinggame;

import java.util.List;
import java.util.Map;

public class OutputView {
	
	public static void printWinner(String winnerName) {
		System.out.println("최종 우승자는 "+winnerName+" 입니다.");
	}
	
	public static void printError(String msg) {
		System.out.println("[ERROR] : "+msg);
	}
	
	public static void printCarNameInstruction() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
	}
	
	public static void printAttemptCountInstruction() {
		System.out.println("시도할 회수는 몇회인가요?");
	}
	
	public static void printExcuteResultInstruction() {
		System.out.println("실행 결과");
	}
	
	
	public static void printResultPerAttempt(String carName, int moveDistance) {
		System.out.print(carName+" : ");
		for(int i=0;i<moveDistance;i++) {
			System.out.print("-");
		}		
	}

	public static void printRoundResult(List<Map<String, Integer>> roundResult) {
		for(Map<String, Integer> carResults : roundResult) {
			for(String carName : carResults.keySet()) {			
				OutputView.printResultPerAttempt(carName, carResults.get(carName));
				System.out.println();	
			}					
		}	
		System.out.println("");		
	}
	
	
}
