package fr.spacefox.perftests.quarkus.core.service429;

import fr.spacefox.perftests.quarkus.core.port.data.Entity429DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service429.model.Model429;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service429 {

    private final Entity429DatasourcePort datasource;

    public Service429(Entity429DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model429 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
