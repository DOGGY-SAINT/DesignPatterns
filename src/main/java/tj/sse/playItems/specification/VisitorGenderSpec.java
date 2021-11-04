package tj.sse.playItems.specification;


import tj.sse.playItems.utils.Gender;
import tj.sse.playItems.utils.Visitor;

/**
 * @author Mocha
 *
 * 判断游客身性别是否为 gender 的规约
 */
public class VisitorGenderSpec extends CompositeSpecification<Visitor> {
    private Gender gender;

    public VisitorGenderSpec(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {

        boolean res = visitor.getGender() == gender;

        String msg = res ?
                visitor.getName() + "通过 VisitorGenderSpec, " + visitor.getName() + "性别为" + gender :
                visitor.getName() + "未通过 VisitorGenderSpec, " + visitor.getName() + "性别为" + gender;


        return res;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
