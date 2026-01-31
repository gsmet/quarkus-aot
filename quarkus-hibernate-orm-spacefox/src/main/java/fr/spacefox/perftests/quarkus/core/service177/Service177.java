package fr.spacefox.perftests.quarkus.core.service177;

import fr.spacefox.perftests.quarkus.core.port.data.Entity177DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service177.model.Model177;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service177 {

    private final Entity177DatasourcePort datasource;

    public Service177(Entity177DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model177 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
