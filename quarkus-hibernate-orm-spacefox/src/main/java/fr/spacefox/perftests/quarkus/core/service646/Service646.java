package fr.spacefox.perftests.quarkus.core.service646;

import fr.spacefox.perftests.quarkus.core.port.data.Entity646DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service646.model.Model646;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service646 {

    private final Entity646DatasourcePort datasource;

    public Service646(Entity646DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model646 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
