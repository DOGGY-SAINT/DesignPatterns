package tj.sse.playItems.specification;


import tj.sse.playItems.utils.Visitor;

/**
 * @author Mocha
 *
 * 判断游客身高是否低于 height 的规约
 */
public class VisitorHeightLessThanSpec extends  CompositeSpecification<Visitor> {
    private double height;

    public VisitorHeightLessThanSpec(double height) {
        this.height = height;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = visitor.getHeight() < height;

        String msg = res ?
                visitor.getName() + "通过 VisitorHeightLessThanSpec, " + visitor.getName() + "身高小于" + height :
                visitor.getName() + "未通过 VisitorHeightLessThanSpec, " + visitor.getName() + "身高大于等于" + height;

        return res;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
