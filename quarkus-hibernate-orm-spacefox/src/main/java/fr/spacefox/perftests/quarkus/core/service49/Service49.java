package fr.spacefox.perftests.quarkus.core.service49;

import fr.spacefox.perftests.quarkus.core.port.data.Entity49DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service49.model.Model49;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service49 {

    private final Entity49DatasourcePort datasource;

    public Service49(Entity49DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model49 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
