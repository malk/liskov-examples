package newCrafts.Bordeaux;

public interface OperationArith {
    int doIt(int a, int b);

    class Sum implements OperationArith {
        @Override
        public int doIt(int a, int b) {
            return a+b;
        }
    }

}
