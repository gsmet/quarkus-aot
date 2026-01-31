package fr.spacefox.perftests.quarkus.core.service378;

import fr.spacefox.perftests.quarkus.core.port.data.Entity378DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service378.model.Model378;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service378 {

    private final Entity378DatasourcePort datasource;

    public Service378(Entity378DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model378 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
