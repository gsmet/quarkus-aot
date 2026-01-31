package fr.spacefox.perftests.quarkus.core.service798;

import fr.spacefox.perftests.quarkus.core.port.data.Entity798DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service798.model.Model798;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service798 {

    private final Entity798DatasourcePort datasource;

    public Service798(Entity798DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model798 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
