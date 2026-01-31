package fr.spacefox.perftests.quarkus.core.service53;

import fr.spacefox.perftests.quarkus.core.port.data.Entity53DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service53.model.Model53;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service53 {

    private final Entity53DatasourcePort datasource;

    public Service53(Entity53DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model53 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
