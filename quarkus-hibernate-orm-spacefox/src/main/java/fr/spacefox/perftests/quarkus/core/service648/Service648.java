package fr.spacefox.perftests.quarkus.core.service648;

import fr.spacefox.perftests.quarkus.core.port.data.Entity648DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service648.model.Model648;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service648 {

    private final Entity648DatasourcePort datasource;

    public Service648(Entity648DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model648 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
