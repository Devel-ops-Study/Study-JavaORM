package valueType.Embedded;

import org.graalvm.compiler.lir.LIRInstruction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class embeddedMember {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    embeddedPeriod workPeriod;
    @Embedded
    embeddedAddress homeAddress;

}
