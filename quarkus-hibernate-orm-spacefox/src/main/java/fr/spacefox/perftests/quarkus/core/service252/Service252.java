package fr.spacefox.perftests.quarkus.core.service252;

import fr.spacefox.perftests.quarkus.core.port.data.Entity252DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service252.model.Model252;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service252 {

    private final Entity252DatasourcePort datasource;

    public Service252(Entity252DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model252 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
