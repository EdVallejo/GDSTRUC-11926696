package com.edgarvallejo;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random rand = new Random();
        int matchmaking = 7;
        int gameCounter = 0;

        ArrayQueue queue = new ArrayQueue(5);

        while(gameCounter < 10)
        {
            int matchmakingRand = rand.nextInt(matchmaking);
            if (matchmakingRand > 4)
            {
                gameCounter++;
                for (int i = 0; i < matchmakingRand; i++)
                {
                    queue.add(new Player("Player " + i));

                    if (i + 1 == matchmakingRand)
                    {
                        System.out.println("\nGame: " + gameCounter);
                        for (int j = 0; j < 5; j++)
                        {
                            System.out.println(queue.peek());
                            queue.remove();
                        }
                    }
                }
            }
        }
    }
}

