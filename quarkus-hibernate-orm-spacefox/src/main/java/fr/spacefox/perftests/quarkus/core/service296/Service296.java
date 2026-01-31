package fr.spacefox.perftests.quarkus.core.service296;

import fr.spacefox.perftests.quarkus.core.port.data.Entity296DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service296.model.Model296;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service296 {

    private final Entity296DatasourcePort datasource;

    public Service296(Entity296DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model296 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
