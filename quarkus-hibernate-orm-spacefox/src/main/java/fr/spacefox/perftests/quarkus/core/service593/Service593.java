package fr.spacefox.perftests.quarkus.core.service593;

import fr.spacefox.perftests.quarkus.core.port.data.Entity593DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service593.model.Model593;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service593 {

    private final Entity593DatasourcePort datasource;

    public Service593(Entity593DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model593 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
