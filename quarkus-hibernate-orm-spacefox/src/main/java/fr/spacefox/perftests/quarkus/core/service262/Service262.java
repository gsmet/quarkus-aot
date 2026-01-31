package fr.spacefox.perftests.quarkus.core.service262;

import fr.spacefox.perftests.quarkus.core.port.data.Entity262DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service262.model.Model262;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service262 {

    private final Entity262DatasourcePort datasource;

    public Service262(Entity262DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model262 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
