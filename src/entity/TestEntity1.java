package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "prefix$MyEntity_entity_name")
@Table(name = "\"prefix$MyEntity\"")
@NamedQuery(name = "My.Test1", query = "SELECT e FROM prefix$MyEntity_entity_name e ")
@NamedNativeQueries({
        @NamedNativeQuery(
                name = "My.Test2",
                query = "select * from \"prefix$MyEntity\" where \"prefix$MyEntity\".\"prefix$column\" = 1",
                resultClass = JavaSequenceGenerator.class
        )
})
public class TestEntity1 {
    private int eid;
    private String enumber;
    private int prefixTest;

    @Id
    @Column(name = "EID", nullable = false)
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Basic
    @Column(name = "ENUMBER", nullable = true, length = 255)
    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber;
    }

    @Basic
    @Column(name = "\"prefix$MyEntity1\"", nullable = true, length = 255)
    public int getPrefixTest() {
        return prefixTest;
    }

    public void setPrefixTest(int prefixTest) {
        this.prefixTest = prefixTest;
    }

//select a from prefix$MyEntity1_entity_name a where a.prefixTest = a.eid

}
