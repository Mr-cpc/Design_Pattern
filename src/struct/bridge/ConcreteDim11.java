package struct.bridge;

/**
 * Created by waiting on 2018/3/29.
 */
public class ConcreteDim11 implements Dim1{
    Dim2 dim2;

    @Override
    public void action() {

    }

    public ConcreteDim11(Dim2 dim2) {
        this.dim2 = dim2;
    }

    public void setDim2(Dim2 dim2) {
        this.dim2 = dim2;
    }
}
