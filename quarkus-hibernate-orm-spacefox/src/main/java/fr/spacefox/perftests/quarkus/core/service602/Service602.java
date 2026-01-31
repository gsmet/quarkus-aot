package fr.spacefox.perftests.quarkus.core.service602;

import fr.spacefox.perftests.quarkus.core.port.data.Entity602DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service602.model.Model602;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service602 {

    private final Entity602DatasourcePort datasource;

    public Service602(Entity602DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model602 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
