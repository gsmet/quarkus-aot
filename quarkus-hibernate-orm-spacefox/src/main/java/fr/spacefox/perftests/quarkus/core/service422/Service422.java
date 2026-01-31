package fr.spacefox.perftests.quarkus.core.service422;

import fr.spacefox.perftests.quarkus.core.port.data.Entity422DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service422.model.Model422;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service422 {

    private final Entity422DatasourcePort datasource;

    public Service422(Entity422DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model422 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
