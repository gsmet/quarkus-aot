package fr.spacefox.perftests.quarkus.core.service259;

import fr.spacefox.perftests.quarkus.core.port.data.Entity259DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service259.model.Model259;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service259 {

    private final Entity259DatasourcePort datasource;

    public Service259(Entity259DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model259 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
