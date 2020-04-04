import java.util.ArrayList;
import java.util.Random;
/**
 * A class that plays Bulgarian Solitare.
 * Version 3: Complete the isDone method.
*/
public class Piles
{
   private ArrayList<Integer> piles;

    /**
      Checks whether the game is done.
      @return true when the piles have size
      1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order.
   */
   public boolean isDone()
   {
     int e=1;
     if (piles.size() != 9)
         return false;
     for (int p : piles)
     {
         if (p!=e)
            return false;
         e+=1;
        }
     return true;
   }

  
   /**
      Sets up the game randomly with some number of piles of random
      size. The pile sizes add up to 45.
   */
   public Piles(Random generator)
   {
      piles = new ArrayList<Integer>();
      /* randomly divide up the deck into piles */
      int TOTAL_SIZE = 45;  // number of cards in a deck
      int numCards = TOTAL_SIZE;
      while (numCards > 0)
      {
         int pile = generator.nextInt(numCards) + 1;
         piles.add(pile);
         numCards -= pile;
      }
   }

   /**
      Set up a pile with a known (non-random) configuration for testing.
      @param pileSizes an array of numbers whose sum is 45
   */
   public Piles(int[] pileSizes)
   {
      piles = new ArrayList<>();
      for (int s : pileSizes)
         piles.add(s);
   }

   /**
    * Return the string representation of the piles.
    * @return the string representation of the piles.
    */
   public String toString()
   {
      return piles.toString();
   }

   /**
      Play one round of the game.
   */
   public void playRound()
   {
       int n=piles.size();
       for ( int i=0; i<piles.size(); i++)
       {
           if (piles.get(i)>1)
                piles.set(i, (piles.get(i)-1));
           else
                piles.remove(i);
        }
       piles.add(n);
   }
}
