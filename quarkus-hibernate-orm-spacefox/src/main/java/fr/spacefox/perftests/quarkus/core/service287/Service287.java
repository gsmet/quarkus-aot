package fr.spacefox.perftests.quarkus.core.service287;

import fr.spacefox.perftests.quarkus.core.port.data.Entity287DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service287.model.Model287;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service287 {

    private final Entity287DatasourcePort datasource;

    public Service287(Entity287DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model287 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
