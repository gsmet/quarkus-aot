package fr.spacefox.perftests.quarkus.core.service116;

import fr.spacefox.perftests.quarkus.core.port.data.Entity116DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service116.model.Model116;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service116 {

    private final Entity116DatasourcePort datasource;

    public Service116(Entity116DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model116 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
