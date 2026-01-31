package fr.spacefox.perftests.quarkus.core.service710;

import fr.spacefox.perftests.quarkus.core.port.data.Entity710DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service710.model.Model710;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service710 {

    private final Entity710DatasourcePort datasource;

    public Service710(Entity710DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model710 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
