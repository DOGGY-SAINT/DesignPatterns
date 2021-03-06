package tj.sse.playItems.specification;

import tj.sse.playItems.utils.Visitor;
/**
 * @author Mocha
 * @param <T> 进行规约的类
 *
 * 两个规约进行链式操作 or 后产生的规约
 */
public class OrSpecification<T> extends CompositeSpecification<T> {

    private final Specification<T> spec1;

    private final Specification<T> spec2;

    public OrSpecification(Specification<T> spec1, Specification<T> spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfiedBy(T t) {

        boolean res = spec1.isSatisfiedBy(t) || spec2.isSatisfiedBy(t);

        if (t instanceof Visitor) {
            String msg = res ?
                    ((Visitor) t).getName() + "通过 OrSpecification" :
                    ((Visitor) t).getName() + "未通过 OrSpecification";
        }

        return res;
    }
}
