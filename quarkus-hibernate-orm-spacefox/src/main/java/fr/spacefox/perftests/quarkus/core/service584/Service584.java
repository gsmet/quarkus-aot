package fr.spacefox.perftests.quarkus.core.service584;

import fr.spacefox.perftests.quarkus.core.port.data.Entity584DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service584.model.Model584;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service584 {

    private final Entity584DatasourcePort datasource;

    public Service584(Entity584DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model584 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
