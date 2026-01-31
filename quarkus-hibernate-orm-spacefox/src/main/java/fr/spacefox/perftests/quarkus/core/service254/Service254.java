package fr.spacefox.perftests.quarkus.core.service254;

import fr.spacefox.perftests.quarkus.core.port.data.Entity254DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service254.model.Model254;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service254 {

    private final Entity254DatasourcePort datasource;

    public Service254(Entity254DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model254 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
