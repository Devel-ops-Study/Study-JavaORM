package devlee.learn.springormstudy.Bangjang.Chapter8.bangjang.proxy;

public class MemberProxy {
    Member target = null;

    public String getName() {
        if (target == null) {
            this.target = target;
        }

        return target.getUsername();
    }
}
