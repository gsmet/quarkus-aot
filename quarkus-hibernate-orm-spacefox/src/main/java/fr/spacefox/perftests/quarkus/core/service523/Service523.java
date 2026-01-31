package fr.spacefox.perftests.quarkus.core.service523;

import fr.spacefox.perftests.quarkus.core.port.data.Entity523DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service523.model.Model523;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service523 {

    private final Entity523DatasourcePort datasource;

    public Service523(Entity523DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model523 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
