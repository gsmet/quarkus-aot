package fr.spacefox.perftests.quarkus.core.service368;

import fr.spacefox.perftests.quarkus.core.port.data.Entity368DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service368.model.Model368;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service368 {

    private final Entity368DatasourcePort datasource;

    public Service368(Entity368DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model368 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
