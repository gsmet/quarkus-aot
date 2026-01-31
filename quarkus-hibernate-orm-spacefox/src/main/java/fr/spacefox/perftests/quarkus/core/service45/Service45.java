package fr.spacefox.perftests.quarkus.core.service45;

import fr.spacefox.perftests.quarkus.core.port.data.Entity45DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service45.model.Model45;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service45 {

    private final Entity45DatasourcePort datasource;

    public Service45(Entity45DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model45 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
