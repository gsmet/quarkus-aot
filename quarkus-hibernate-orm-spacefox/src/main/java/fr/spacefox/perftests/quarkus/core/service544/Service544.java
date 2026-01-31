package fr.spacefox.perftests.quarkus.core.service544;

import fr.spacefox.perftests.quarkus.core.port.data.Entity544DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service544.model.Model544;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service544 {

    private final Entity544DatasourcePort datasource;

    public Service544(Entity544DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model544 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
