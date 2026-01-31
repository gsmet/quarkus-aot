package fr.spacefox.perftests.quarkus.core.service629;

import fr.spacefox.perftests.quarkus.core.port.data.Entity629DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service629.model.Model629;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service629 {

    private final Entity629DatasourcePort datasource;

    public Service629(Entity629DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model629 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
