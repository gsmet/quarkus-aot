package fr.spacefox.perftests.quarkus.core.service894;

import fr.spacefox.perftests.quarkus.core.port.data.Entity894DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service894.model.Model894;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service894 {

    private final Entity894DatasourcePort datasource;

    public Service894(Entity894DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model894 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
