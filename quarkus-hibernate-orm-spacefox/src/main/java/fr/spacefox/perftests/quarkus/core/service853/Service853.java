package fr.spacefox.perftests.quarkus.core.service853;

import fr.spacefox.perftests.quarkus.core.port.data.Entity853DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service853.model.Model853;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service853 {

    private final Entity853DatasourcePort datasource;

    public Service853(Entity853DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model853 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
