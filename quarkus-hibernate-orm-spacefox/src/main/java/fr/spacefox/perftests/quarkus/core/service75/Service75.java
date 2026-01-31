package fr.spacefox.perftests.quarkus.core.service75;

import fr.spacefox.perftests.quarkus.core.port.data.Entity75DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service75.model.Model75;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service75 {

    private final Entity75DatasourcePort datasource;

    public Service75(Entity75DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model75 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
