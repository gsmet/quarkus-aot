package fr.spacefox.perftests.quarkus.core.service521;

import fr.spacefox.perftests.quarkus.core.port.data.Entity521DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service521.model.Model521;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service521 {

    private final Entity521DatasourcePort datasource;

    public Service521(Entity521DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model521 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
