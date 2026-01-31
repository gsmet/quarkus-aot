package fr.spacefox.perftests.quarkus.core.service934;

import fr.spacefox.perftests.quarkus.core.port.data.Entity934DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service934.model.Model934;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service934 {

    private final Entity934DatasourcePort datasource;

    public Service934(Entity934DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model934 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
