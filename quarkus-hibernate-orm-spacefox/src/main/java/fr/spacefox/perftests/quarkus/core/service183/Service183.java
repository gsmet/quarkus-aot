package fr.spacefox.perftests.quarkus.core.service183;

import fr.spacefox.perftests.quarkus.core.port.data.Entity183DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service183.model.Model183;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service183 {

    private final Entity183DatasourcePort datasource;

    public Service183(Entity183DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model183 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
