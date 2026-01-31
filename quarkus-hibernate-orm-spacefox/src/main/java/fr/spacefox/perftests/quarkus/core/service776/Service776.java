package fr.spacefox.perftests.quarkus.core.service776;

import fr.spacefox.perftests.quarkus.core.port.data.Entity776DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service776.model.Model776;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service776 {

    private final Entity776DatasourcePort datasource;

    public Service776(Entity776DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model776 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
