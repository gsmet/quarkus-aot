package fr.spacefox.perftests.quarkus.core.service452;

import fr.spacefox.perftests.quarkus.core.port.data.Entity452DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service452.model.Model452;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service452 {

    private final Entity452DatasourcePort datasource;

    public Service452(Entity452DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model452 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
