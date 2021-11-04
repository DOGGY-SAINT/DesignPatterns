package tj.sse.playItems.specification;

import tj.sse.playItems.utils.Gender;
import tj.sse.playItems.utils.Visitor;

/**
 * @author Mocha
 *
 * 判断游客年龄是否小于 age 的规约
 */
public class VisitorAgeLessThanSpec extends CompositeSpecification<Visitor> {
    private int age;

    public VisitorAgeLessThanSpec(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {

        boolean res = visitor.getAge() < age;

        String msg = res ?
                visitor.getName() + "通过 VisitorAgeLessThanSpec, " + visitor.getName() + "年龄小于" + age :
                visitor.getName() + "未通过 VisitorAgeLessThanSpec, " + visitor.getName() + "年龄大于等于" + age;
        return res;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
