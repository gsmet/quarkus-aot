package fr.spacefox.perftests.quarkus.core.service825;

import fr.spacefox.perftests.quarkus.core.port.data.Entity825DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service825.model.Model825;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service825 {

    private final Entity825DatasourcePort datasource;

    public Service825(Entity825DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model825 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
