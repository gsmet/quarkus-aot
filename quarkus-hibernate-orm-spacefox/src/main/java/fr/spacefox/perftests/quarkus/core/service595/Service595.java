package fr.spacefox.perftests.quarkus.core.service595;

import fr.spacefox.perftests.quarkus.core.port.data.Entity595DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service595.model.Model595;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service595 {

    private final Entity595DatasourcePort datasource;

    public Service595(Entity595DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model595 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
