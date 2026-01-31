package fr.spacefox.perftests.quarkus.core.service63;

import fr.spacefox.perftests.quarkus.core.port.data.Entity63DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service63.model.Model63;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service63 {

    private final Entity63DatasourcePort datasource;

    public Service63(Entity63DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model63 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
