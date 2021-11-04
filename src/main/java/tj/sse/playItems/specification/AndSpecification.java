package tj.sse.playItems.specification;

import tj.sse.playItems.utils.Gender;
import tj.sse.playItems.utils.Visitor;

/**
 * @param <T> 进行规约的类
 *            <p>
 *            两个规约进行链式操作 and 后产生的规约
 * @author Mocha
 */
public class AndSpecification<T> extends CompositeSpecification<T> {

    private final Specification<T> spec1;

    private final Specification<T> spec2;

    public AndSpecification(Specification<T> spec1, Specification<T> spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        boolean res = spec1.isSatisfiedBy(t) && spec2.isSatisfiedBy(t);

        if (t instanceof Visitor) {
            String msg = res ?
                    ((Visitor) t).getName() + "通过 AndSpecification" :
                    ((Visitor) t).getName() + "未通过 AndSpecification";


        }

        return res;
    }
}
