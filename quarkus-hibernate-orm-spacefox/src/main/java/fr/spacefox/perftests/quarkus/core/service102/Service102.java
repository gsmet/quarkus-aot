package fr.spacefox.perftests.quarkus.core.service102;

import fr.spacefox.perftests.quarkus.core.port.data.Entity102DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service102.model.Model102;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service102 {

    private final Entity102DatasourcePort datasource;

    public Service102(Entity102DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model102 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
