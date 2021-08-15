
public class Calculator { 
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int bigone = Math.max(num1, num2);
        System.out.println("bigger one:" +  bigone);


        int score = 70;
        int reward;
        if(score >= 60) {
            reward = score * 2;
        } else {
            reward = 0;
        }
	

	int reward2 = score>=66 ? score*3 : 0;
        System.out.println("Reward: " + reward2 + " : " + reward);
        
    }
}
