package fr.spacefox.perftests.quarkus.core.service999;

import fr.spacefox.perftests.quarkus.core.port.data.Entity999DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service999.model.Model999;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service999 {

    private final Entity999DatasourcePort datasource;

    public Service999(Entity999DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model999 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
