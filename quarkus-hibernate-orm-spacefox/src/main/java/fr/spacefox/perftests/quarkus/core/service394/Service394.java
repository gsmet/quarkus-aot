package fr.spacefox.perftests.quarkus.core.service394;

import fr.spacefox.perftests.quarkus.core.port.data.Entity394DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service394.model.Model394;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service394 {

    private final Entity394DatasourcePort datasource;

    public Service394(Entity394DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model394 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
