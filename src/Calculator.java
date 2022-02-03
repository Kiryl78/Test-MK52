public class Calculator {

    public static int Operation (int op1, int op2, char ops) {
      int IntRes = 0;
      switch (ops) {
          case '+':
              IntRes = op1 + op2;
              break;
          case '-' :
              IntRes = op1 - op2;
              break;
          case '*':
              IntRes = op1 * op2;
              break;
          case '/':
              IntRes = op1 / op2;
              break;
          default:
              System.out.println("MK52: Reserved for * task!");
      }
    return IntRes;
  }

  public static boolean AreYouIdiotOperand (int Op, char Ops) {
      boolean LocalIdiot;
      if (Ops == '/' && Op == 0 )   {
          System.out.println("MK52: You couldn't divide on 0 !");
          LocalIdiot = true;
      } else LocalIdiot = false;
      return LocalIdiot;
  }

  public static boolean AreYouIdiotOperation (char Ops) {
         boolean LocalIdiot;
         if (Ops == '/' ||  Ops == '+' || Ops == '-' || Ops == '*' ) {
             LocalIdiot = false;
          } else {
             System.out.println("MK52: I do not know this operation!");
             LocalIdiot = true;
         }
         return LocalIdiot;
    }


}
