package fr.spacefox.perftests.quarkus.core.service723;

import fr.spacefox.perftests.quarkus.core.port.data.Entity723DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service723.model.Model723;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service723 {

    private final Entity723DatasourcePort datasource;

    public Service723(Entity723DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model723 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
