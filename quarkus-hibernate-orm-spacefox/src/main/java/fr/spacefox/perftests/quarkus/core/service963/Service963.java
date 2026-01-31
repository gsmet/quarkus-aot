package fr.spacefox.perftests.quarkus.core.service963;

import fr.spacefox.perftests.quarkus.core.port.data.Entity963DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service963.model.Model963;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service963 {

    private final Entity963DatasourcePort datasource;

    public Service963(Entity963DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model963 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
