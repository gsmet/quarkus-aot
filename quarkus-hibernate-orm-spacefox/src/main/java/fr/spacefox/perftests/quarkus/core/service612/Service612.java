package fr.spacefox.perftests.quarkus.core.service612;

import fr.spacefox.perftests.quarkus.core.port.data.Entity612DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service612.model.Model612;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service612 {

    private final Entity612DatasourcePort datasource;

    public Service612(Entity612DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model612 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
