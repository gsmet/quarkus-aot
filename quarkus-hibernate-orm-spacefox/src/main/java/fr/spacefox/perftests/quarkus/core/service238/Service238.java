package fr.spacefox.perftests.quarkus.core.service238;

import fr.spacefox.perftests.quarkus.core.port.data.Entity238DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service238.model.Model238;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service238 {

    private final Entity238DatasourcePort datasource;

    public Service238(Entity238DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model238 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
