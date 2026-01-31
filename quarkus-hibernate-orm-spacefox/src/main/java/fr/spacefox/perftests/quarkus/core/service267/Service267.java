package fr.spacefox.perftests.quarkus.core.service267;

import fr.spacefox.perftests.quarkus.core.port.data.Entity267DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service267.model.Model267;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service267 {

    private final Entity267DatasourcePort datasource;

    public Service267(Entity267DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model267 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
