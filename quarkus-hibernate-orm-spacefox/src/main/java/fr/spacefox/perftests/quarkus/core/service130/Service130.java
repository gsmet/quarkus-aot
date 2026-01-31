package fr.spacefox.perftests.quarkus.core.service130;

import fr.spacefox.perftests.quarkus.core.port.data.Entity130DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service130.model.Model130;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service130 {

    private final Entity130DatasourcePort datasource;

    public Service130(Entity130DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model130 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
