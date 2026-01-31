package fr.spacefox.perftests.quarkus.core.service235;

import fr.spacefox.perftests.quarkus.core.port.data.Entity235DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service235.model.Model235;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service235 {

    private final Entity235DatasourcePort datasource;

    public Service235(Entity235DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model235 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
