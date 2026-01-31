package fr.spacefox.perftests.quarkus.core.service626;

import fr.spacefox.perftests.quarkus.core.port.data.Entity626DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service626.model.Model626;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service626 {

    private final Entity626DatasourcePort datasource;

    public Service626(Entity626DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model626 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
