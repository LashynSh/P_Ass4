
package Exercise3;

public class Wall implements Cloneable {
    @Override
    public Wall clone() {
        return new Wall();
    }
}