package springframework.spfpet_clinic.model;

import java.io.Serializable;

public class baseEntity  implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
