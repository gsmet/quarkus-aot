package fr.spacefox.perftests.quarkus.core.service488;

import fr.spacefox.perftests.quarkus.core.port.data.Entity488DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service488.model.Model488;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service488 {

    private final Entity488DatasourcePort datasource;

    public Service488(Entity488DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model488 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
