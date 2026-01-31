package fr.spacefox.perftests.quarkus.core.service969;

import fr.spacefox.perftests.quarkus.core.port.data.Entity969DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service969.model.Model969;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service969 {

    private final Entity969DatasourcePort datasource;

    public Service969(Entity969DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model969 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
