package fr.spacefox.perftests.quarkus.core.service469;

import fr.spacefox.perftests.quarkus.core.port.data.Entity469DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service469.model.Model469;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service469 {

    private final Entity469DatasourcePort datasource;

    public Service469(Entity469DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model469 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
