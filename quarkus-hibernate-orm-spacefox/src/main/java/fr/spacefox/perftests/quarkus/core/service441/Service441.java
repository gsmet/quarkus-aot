package fr.spacefox.perftests.quarkus.core.service441;

import fr.spacefox.perftests.quarkus.core.port.data.Entity441DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service441.model.Model441;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service441 {

    private final Entity441DatasourcePort datasource;

    public Service441(Entity441DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model441 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
