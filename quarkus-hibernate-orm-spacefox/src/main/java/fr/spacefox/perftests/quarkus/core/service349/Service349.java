package fr.spacefox.perftests.quarkus.core.service349;

import fr.spacefox.perftests.quarkus.core.port.data.Entity349DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service349.model.Model349;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service349 {

    private final Entity349DatasourcePort datasource;

    public Service349(Entity349DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model349 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
