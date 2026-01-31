package fr.spacefox.perftests.quarkus.core.service392;

import fr.spacefox.perftests.quarkus.core.port.data.Entity392DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service392.model.Model392;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service392 {

    private final Entity392DatasourcePort datasource;

    public Service392(Entity392DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model392 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
