package fr.spacefox.perftests.quarkus.core.service924;

import fr.spacefox.perftests.quarkus.core.port.data.Entity924DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service924.model.Model924;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service924 {

    private final Entity924DatasourcePort datasource;

    public Service924(Entity924DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model924 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
