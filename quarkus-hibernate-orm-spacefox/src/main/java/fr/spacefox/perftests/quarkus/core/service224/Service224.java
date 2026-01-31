package fr.spacefox.perftests.quarkus.core.service224;

import fr.spacefox.perftests.quarkus.core.port.data.Entity224DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service224.model.Model224;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service224 {

    private final Entity224DatasourcePort datasource;

    public Service224(Entity224DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model224 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
