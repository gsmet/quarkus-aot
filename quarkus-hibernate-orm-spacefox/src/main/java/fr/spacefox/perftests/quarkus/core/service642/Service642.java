package fr.spacefox.perftests.quarkus.core.service642;

import fr.spacefox.perftests.quarkus.core.port.data.Entity642DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service642.model.Model642;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service642 {

    private final Entity642DatasourcePort datasource;

    public Service642(Entity642DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model642 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
