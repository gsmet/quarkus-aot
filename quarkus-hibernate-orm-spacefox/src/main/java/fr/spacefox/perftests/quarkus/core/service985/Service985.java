package fr.spacefox.perftests.quarkus.core.service985;

import fr.spacefox.perftests.quarkus.core.port.data.Entity985DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service985.model.Model985;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service985 {

    private final Entity985DatasourcePort datasource;

    public Service985(Entity985DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model985 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
