package fr.spacefox.perftests.quarkus.core.service283;

import fr.spacefox.perftests.quarkus.core.port.data.Entity283DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service283.model.Model283;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service283 {

    private final Entity283DatasourcePort datasource;

    public Service283(Entity283DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model283 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
