package tj.sse.playItems.specification;

import tj.sse.playItems.utils.Gender;
import tj.sse.playItems.utils.Visitor;
/**
 * @author Mocha
 * @param <T> 进行规约的类
 *
 * 规约进行链式操作 not 后产生的规约
 */
public class NotSpecification<T> extends CompositeSpecification<T> {

    private final Specification<T> spec;

    public NotSpecification(Specification<T> spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        boolean res = !spec.isSatisfiedBy(t);

        if (t instanceof Visitor) {
            String msg = res ?
                    ((Visitor) t).getName() + "通过 NotSpecification" :
                    ((Visitor) t).getName() + "未通过 NotSpecification";
        }

        return res;
    }
}
