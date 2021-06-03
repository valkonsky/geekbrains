public class DogRunning implements RunBehavior{
    @Override
    public void run(int distance) {
        if (distance<=500){
            System.out.println("i'm running on " + distance + " meters");
        }else{
            System.out.println("i can't eun on this distance");
        }
    }
}
